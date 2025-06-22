public class Reservation {
    private int roomId;
    private String customerName;
    private String checkInDate;
    private String checkOutDate;
    private double totalAmount;

    public Reservation(int roomId, String customerName, String checkIn, String checkOut, double totalAmount) {
        this.roomId = roomId;
        this.customerName = customerName;
        this.checkInDate = checkIn;
        this.checkOutDate = checkOut;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Room " + roomId + " | Name: " + customerName +
                " | Check-in: " + checkInDate + " | Check-out: " + checkOutDate +
                " | Total: $" + totalAmount;
    }
}
