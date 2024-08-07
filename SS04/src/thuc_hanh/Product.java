package thuc_hanh;

public class Product {
    int productId;
    String productName;
    int productPrice;
    Category category;

    public Product() {
    }

    public Product(int productId, String productName, int productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public void displayProduct(){
        System.out.println("Product Id : " + productId + "\n"
                        + "Product Name : " + productName + "\n"
                        + "Product Price : " + productPrice + "\n"
                        + "Category : " + category.categoryName + "\n"
        );
        ;
    }
}
