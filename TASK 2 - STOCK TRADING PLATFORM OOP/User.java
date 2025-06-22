import java.util.*;

public class User {
    private String name;
    private double balance;
    private Map<String, Integer> portfolio;

    public User(String name) {
        this.name = name;
        this.balance = 10000.0;
        this.portfolio = new HashMap<>();
    }

    public void buyStock(Stock stock, int quantity) {
        double cost = stock.getPrice() * quantity;
        if (balance >= cost) {
            balance -= cost;
            portfolio.put(stock.getSymbol(), portfolio.getOrDefault(stock.getSymbol(), 0) + quantity);
            System.out.println("Bought " + quantity + " shares of " + stock.getSymbol());
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void sellStock(Stock stock, int quantity) {
        String symbol = stock.getSymbol();
        if (portfolio.getOrDefault(symbol, 0) >= quantity) {
            portfolio.put(symbol, portfolio.get(symbol) - quantity);
            balance += stock.getPrice() * quantity;
            System.out.println("Sold " + quantity + " shares of " + symbol);
        } else {
            System.out.println("Not enough shares!");
        }
    }

    public void viewPortfolio(Market market) {
        double totalValue = balance;
        System.out.println("\n" + name + "'s Portfolio:");
        for (Map.Entry<String, Integer> entry : portfolio.entrySet()) {
            Stock stock = market.getStock(entry.getKey());
            double value = stock.getPrice() * entry.getValue();
            System.out.printf("%s: %d shares at $%.2f = $%.2f\n",
                    stock.getSymbol(), entry.getValue(), stock.getPrice(), value);
            totalValue += value;
        }
        System.out.printf("Cash: $%.2f\nTotal Portfolio Value: $%.2f\n\n", balance, totalValue);
    }

    public double getBalance() { return balance; }
    public String getName() { return name; }
    public Map<String, Integer> getPortfolio() { return portfolio; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setPortfolio(Map<String, Integer> portfolio) { this.portfolio = portfolio; }
}
