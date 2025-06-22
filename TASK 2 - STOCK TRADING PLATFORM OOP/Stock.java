public class Stock {
    private String symbol;
    private String name;
    private double price;

    public Stock(String symbol, String name, double price) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }

    public void updatePrice() {
        double change = (Math.random() * 0.1) - 0.05;
        price += price * change;
        price = Math.round(price * 100.0) / 100.0;
    }

    public String getSymbol() { return symbol; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return symbol + " - " + name + ": $" + price;
    }
}
