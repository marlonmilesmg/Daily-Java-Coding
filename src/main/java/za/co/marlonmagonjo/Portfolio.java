package za.co.marlonmagonjo;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    List<Stock> stocks = new ArrayList<>();

    public void printPortfolio(){
        stocks.forEach(System.out::println);
    }
    public void add(Stock symbol) {
        stocks.add(symbol);
    }
    public double totalValue() {
        if(stocks.isEmpty()){
            return 0;
        }
        return stocks.stream()
                .mapToDouble(Stock::totalValue)
                .sum();
    }

}
