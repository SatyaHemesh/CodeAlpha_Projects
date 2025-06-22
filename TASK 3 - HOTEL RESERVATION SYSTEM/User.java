import java.util.*;

public class User {
    private String name;
    private List<Reservation> reservations;

    public User(String name) {
        this.name = name;
        this.reservations = new ArrayList<>();
    }

    public String getName() { return name; }
    public List<Reservation> getReservations() { return reservations; }

    public void addReservation(Reservation res) {
        reservations.add(res);
    }

    public void cancelReservation(int roomId) {
        reservations.removeIf(r -> r.toString().contains("Room " + roomId));
    }
}
