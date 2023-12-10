package za.co.marlonmagonjo;

public class Position {

    StockOne stock;
    int qty;
    double px;

    public Position(StockOne stock, int qty, double px) {
        this.stock = stock;
        this.qty = qty;
        this.px = px;
    }

    public StockOne getStock() {
        return stock;
    }

    public int getQty() {
        return qty;
    }

    public double getPx() {
        return px;
    }

    public double getValue(){
        return qty * px;
    }
}
