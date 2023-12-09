package za.co.marlonmagonjo;

public class PortfolioTestDrive {
    public static void main(String[] args) {

        var portfolio = new Portfolio();
        portfolio.add(new Stock("APPL", 1, 140));
        portfolio.add(new Stock("APPL", 1, 120));
        portfolio.add(new Stock("MSFT", 1, 200));

        portfolio.printPortfolio();

        System.out.println("===================================");
        System.out.println(portfolio.totalValue());
    }
}
