import java.util.Scanner;

public class TradingPlatform {
    public static void main(String[] args) {
        Market market = new Market();
        User user = Utils.loadUser("portfolio.json", "Satya Hemesh");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            market.updatePrices();
            market.displayMarket();
            user.viewPortfolio(market);

            System.out.println("Options: 1) Buy  2) Sell  3) Save  4) Exit");
            System.out.print("Choose an action: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter stock symbol to buy: ");
                    String buySymbol = scanner.nextLine();
                    System.out.print("Quantity: ");
                    int buyQty = Integer.parseInt(scanner.nextLine());
                    Stock buyStock = market.getStock(buySymbol);
                    if (buyStock != null) user.buyStock(buyStock, buyQty);
                    break;
                case "2":
                    System.out.print("Enter stock symbol to sell: ");
                    String sellSymbol = scanner.nextLine();
                    System.out.print("Quantity: ");
                    int sellQty = Integer.parseInt(scanner.nextLine());
                    Stock sellStock = market.getStock(sellSymbol);
                    if (sellStock != null) user.sellStock(sellStock, sellQty);
                    break;
                case "3":
                    Utils.saveUser("portfolio.json", user);
                    break;
                case "4":
                    Utils.saveUser("portfolio.json", user);
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
