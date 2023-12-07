package za.co.marlonmagonjo;

public class Portfolio {
    double totalValue;
    Stock symbol;

    public void add(Stock symbol) {
        this.symbol = symbol;
    }
    public double totalValue() {
        if(symbol == null){
            return 0;
        }
        return symbol.totalValue();
    }

}
