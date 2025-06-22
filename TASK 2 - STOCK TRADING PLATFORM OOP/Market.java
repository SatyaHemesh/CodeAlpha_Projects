import java.util.*;

public class Market {
    private Map<String, Stock> stocks;

    public Market() {
        stocks = new HashMap<>();
        stocks.put("AAPL", new Stock("AAPL", "Apple Inc.", 170.00));
        stocks.put("GOOG", new Stock("GOOG", "Alphabet Inc.", 2850.00));
        stocks.put("TSLA", new Stock("TSLA", "Tesla Inc.", 750.00));
    }

    public void updatePrices() {
        for (Stock stock : stocks.values()) {
            stock.updatePrice();
        }
    }

    public void displayMarket() {
        System.out.println("Market Prices:");
        for (Stock stock : stocks.values()) {
            System.out.println(stock);
        }
    }

    public Stock getStock(String symbol) {
        return stocks.get(symbol.toUpperCase());
    }
}
