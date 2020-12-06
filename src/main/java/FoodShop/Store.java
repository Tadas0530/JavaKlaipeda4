package FoodShop;

public class Store {
    private Product[] products;
    private Cart cart;
    private int productCount;

    public Store(int productCount) {
        this.productCount = productCount;
        this.cart = new Cart();
        this.products = new Product[productCount];
    }

    public void addProduct(String productName, float price) {
        Product product = new Product(productName, price);
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    public void listProducts() {
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i].description());
        }
    }

    public void addToCart(int index) {
        if (index <= products.length && index > 0) {
            cart.addProduct(products[index - 1]);
            System.out.println("Product " + products[index - 1].getName() + " added");
        } else {
            System.out.println("Product doesn't exist");
        }
    }

    public void pay() {
        System.out.println("You have to pay: " + cart.getTotalSum() + " EU");
    }
}
