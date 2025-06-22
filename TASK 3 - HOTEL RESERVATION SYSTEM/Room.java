public class Room {
    private int id;
    private String type; // Standard, Deluxe, Suite
    private double price;
    private boolean available;

    public Room(int id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.available = true;
    }

    public int getId() { return id; }
    public String getType() { return type; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return "Room " + id + " (" + type + ") - $" + price + " - " + (available ? "Available" : "Booked");
    }
}
