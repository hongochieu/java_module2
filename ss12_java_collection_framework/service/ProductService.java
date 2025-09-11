package ss12_java_collection_framework.service;
import ss12_java_collection_framework.entity.Product;
import ss12_java_collection_framework.repository.ProductRepository;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class ProductService {
    private ProductRepository repository = new ProductRepository();

    public void add(Product p) {
        repository.add(p);
    }

    public boolean update(int id, String newName, double newPrice) {
        Product p = repository.findById(id);
        if (p != null) {
            p.setName(newName);
            p.setPrice(newPrice);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        Product p = repository.findById(id);
        if (p != null) {
            repository.delete(id);
            return true;
        }
        return false;
    }

    public List<Product> findAll() { return repository.getAll(); }

    public List<Product> search(String keyword) {
        return repository.getAll().stream()
                .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void sortByPrice(boolean ascending) {
        List<Product> list = repository.getAll();
        list.sort(ascending ?
                Comparator.comparingDouble(Product::getPrice)
                : Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
