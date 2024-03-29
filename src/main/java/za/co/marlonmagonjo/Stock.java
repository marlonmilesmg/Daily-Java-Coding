package za.co.marlonmagonjo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Stock {
    String symbol;
    int qty;
    double px;

    public Stock(String symbol, int qty, double px) {
        this.symbol = symbol;
        this.qty = qty;
        this.px = px;
    }

    public double totalValue() {
        return qty * px;
    }

    @Override
    public String toString(){
        return String.format("{ %s | Qty: %s | Px: %s | Value: %s}", symbol, qty, px, qty * px);
    }

}
