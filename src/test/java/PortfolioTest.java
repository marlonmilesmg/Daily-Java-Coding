import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.marlonmagonjo.Portfolio;

public class PortfolioTest {

    @Test
    public void emptyPortfolio_hasZeroValue(){
        var portfolio = new Portfolio();
        Assertions.assertEquals(0, portfolio.totalValue());
    }
}
