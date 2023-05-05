package za.co.marlonmagonjo;

/**
 * Problem Statement - Sample Shopping Cart
 *
 *  - Design a class CartItem with fields (itemCode, quantity) with the mandatory constructor to initialize the CartItem
 *  - Design a class ShoppingCart with following operations
 *          - Fields
 *              - CartItem items[]
 *              - size
 *              - itemsCount
 *
 *           - Constructors
 *              - ShoppingCart() - initialize items with size 10
 *              - ShoppingCart(int size) - initialize items array with given size
 *
 *           - Methods
 *              - addToCart(CartItem) - add item to the items array
 *              - order() - print the ordered items
 *
 */


class CartItem {
    private String itemCode;
    private int quantity;

    public CartItem(String itemCode, int quantity){
        this.itemCode = itemCode;
        this.quantity = quantity;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    private CartItem [] items;
    private int size;
    private int itemsCount;
    private static final int DEFAULT_SIZE = 10;

    public ShoppingCart() {
        initializeCart(DEFAULT_SIZE);
    }

    public ShoppingCart(int size){
        initializeCart(size);
    }

    private void initializeCart(int size){
        this.items = new CartItem[size];
        this.size = size;
    }

    public void addToCart(CartItem item){
        if(itemsCount <= size){
            items[itemsCount++] = item;
        }
    }

    public void order(){
        System.out.println("Items in the cart");
        for (int i = 0; i < itemsCount; i++){
            System.out.printf(" %s   %d \n", items[i].getItemCode(), items[i].getQuantity());
        }
    }
}

public class SampleShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(3);
        cart.addToCart(new CartItem("a", 10));
        cart.addToCart(new CartItem("b", 20));
        cart.order();
    }
}
