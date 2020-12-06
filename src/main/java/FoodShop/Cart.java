package FoodShop;

public class Cart {
    private float sum;

    public void addProduct(Product product) {
        sum += product.getPrice();
    }

    public float getTotalSum() {
        return sum;
    }
}
