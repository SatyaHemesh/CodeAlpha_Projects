import java.util.*;

public class Hotel {
    private List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
        rooms.add(new Room(101, "Standard", 200));
        rooms.add(new Room(102, "Standard", 200));
        rooms.add(new Room(201, "Deluxe", 350));
        rooms.add(new Room(301, "Suite", 500));
    }

    public void showAvailableRooms() {
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println(room);
            }
        }
    }

    public Room getAvailableRoom(String type) {
        for (Room room : rooms) {
            if (room.getType().equalsIgnoreCase(type) && room.isAvailable()) {
                return room;
            }
        }
        return null;
    }

    public void bookRoom(Room room) {
        room.setAvailable(false);
    }

    public void cancelRoom(int roomId) {
        for (Room room : rooms) {
            if (room.getId() == roomId) {
                room.setAvailable(true);
                break;
            }
        }
    }
}
