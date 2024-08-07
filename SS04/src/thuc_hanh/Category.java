package thuc_hanh;

public class Category {
    int categoryId;
    String categoryName;

    public Category() {
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public void displayCategory() {
        System.out.println("Category mane: " + categoryName
                    + "\nCategory id: " + categoryId);
    }
}
