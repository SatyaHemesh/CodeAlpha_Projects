import java.util.Scanner;

public class HotelSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        User user = Utils.loadReservations("booking.json", "Satya Hemesh");

        while (true) {
            System.out.println("\n--- HOTEL MENU ---");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. View My Bookings");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    hotel.showAvailableRooms();
                    break;
                case "2":
                    System.out.print("Room Type (Standard/Deluxe/Suite): ");
                    String type = sc.nextLine();
                    Room room = hotel.getAvailableRoom(type);
                    if (room != null) {
                        System.out.print("Check-in Date: ");
                        String in = sc.nextLine();
                        System.out.print("Check-out Date: ");
                        String out = sc.nextLine();
                        double total = room.getPrice() * 1; // Simulate 1-day rate
                        Reservation res = new Reservation(room.getId(), user.getName(), in, out, total);
                        hotel.bookRoom(room);
                        user.addReservation(res);
                        System.out.println("Payment successful. Booking confirmed.");
                    } else {
                        System.out.println("No available rooms of type: " + type);
                    }
                    break;
                case "3":
                    System.out.print("Enter Room ID to cancel: ");
                    int cancelId = Integer.parseInt(sc.nextLine());
                    hotel.cancelRoom(cancelId);
                    user.cancelReservation(cancelId);
                    System.out.println("Booking cancelled.");
                    break;
                case "4":
                    for (Reservation r : user.getReservations()) {
                        System.out.println(r);
                    }
                    break;
                case "5":
                    Utils.saveReservations("booking.json", user);
                    System.out.println("Thank you. Visit again!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
