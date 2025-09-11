package ss12_java_collection_framework.repository;
import ss12_java_collection_framework.entity.Product;
import java.util.ArrayList;
import java.util.List;
public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public List<Product> getAll() {
        return products;
    }

    public void add (Product product){
        products.add(product);
    }

    public Product findById(int id){
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public void delete(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}