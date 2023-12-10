import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.marlonmagonjo.PortfolioOne;
import za.co.marlonmagonjo.Position;
import za.co.marlonmagonjo.StockOne;

public class PortfolioTestOne {

    @Test
    public void emptyPortfolio_zeroPositions(){

        var portfolio = new PortfolioOne();
        Assertions.assertEquals(0, portfolio.getAllPositions().size());
    }

    @Test
    void portfolioWithOnePosition_ReturnsThatPosition(){

        var portfolio = new PortfolioOne();

        String symbol = "MSFT";

        portfolio.add(new Position(new StockOne(symbol), 10, 260));
        Assertions.assertEquals(1, portfolio.getAllPositions().size());

        Assertions.assertEquals(10, portfolio.getPosition(symbol).getQty());
        Assertions.assertEquals(260, portfolio.getPosition(symbol).getPx());
        Assertions.assertEquals(2600, portfolio.getPosition(symbol).getValue());
    }
}
