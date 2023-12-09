import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.marlonmagonjo.Portfolio;
import za.co.marlonmagonjo.Stock;

public class PortfolioTest {

    @Test
    public void emptyPortfolio_hasZeroValue(){
        var portfolio = new Portfolio();
        Assertions.assertEquals(0, portfolio.totalValue());
    }

    @Test
    void portfolioWithOneStock_calculatesTotalValue(){
        int qty = 10;
        double px = 260;
        double value = qty * px;

        var portfolio = new Portfolio();
        portfolio.add(new Stock("MSFT", qty, px));
        Assertions.assertEquals(value, portfolio.totalValue());
    }

    @Test
    void portfolioWithMultipleStocks_calculateTotalValue(){

        // Stock 1
        int microsoftQty = 10;
        double microsoftPx = 260;
        double microsoftValue = microsoftQty * microsoftPx;

        // Stock 2
        int appleQty = 1;
        double applePx = 150;
        double appleValue = appleQty * applePx;

        var portfolio = new Portfolio();
        portfolio.add(new Stock("MSFT", microsoftQty, microsoftPx));
        portfolio.add(new Stock("APPL", appleQty, applePx));

        Assertions.assertEquals(microsoftValue + appleValue, portfolio.totalValue());
    }

    @Test
    void portfolioWithAddedStockAtDifferentPrice_calculateTotalValue(){

        // Stock - first entry
        int appleQty_1 = 1;
        double applePx_1 = 260;
        double appleValue_1 = appleQty_1 * applePx_1;

        // Stock - second entry
        int appleQty_2 = 1;
        double applePx_2 = 290;
        double appleValue_2 = appleQty_2 * applePx_2;

        var portfolio = new Portfolio();
        portfolio.add(new Stock("APPL", appleQty_1, applePx_1));
        portfolio.add(new Stock("APPL", appleQty_2, applePx_2));

        Assertions.assertEquals(appleValue_1 + appleValue_2, portfolio.totalValue());
    }
}
