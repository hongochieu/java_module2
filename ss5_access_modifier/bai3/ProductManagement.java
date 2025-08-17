package ss5_access_modifier.bai3;

public class ProductManagement {
    private Product[] products = new Product[100];

    public void add(Product product){
        for (int i = 0; i < products.length; i++){
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    public void display() {
        for (Product product : products){
            if (product != null ){
                System.out.println(product);
            }
        }
    }
    public void delete(int id) {
        for (int i = 0; i < products.length; i++){
            if (products[i] != null && products[i].getId() == id){
                products[i] = null;
                System.out.println("Xóa thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm để xóa.");
    }

    public void search (String name){
        boolean found = false;
        for (Product product : products) {
            if (product != null && product.getName().equalsIgnoreCase(name)){
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }
    public void update(int id, String newName, double newPrice){
        for (Product product : products){
            if (product != null && product.getId() == id){
                product.setName(newName);
                product.setPrice(newPrice);
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm để cập nhật");
    }
}
