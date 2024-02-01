package za.co.marlonmagonjo;

public class Item {
    int weight;
    int value;
    double ratio; // value-to-weight ratio

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.ratio = (double) value / weight;
    }
}
