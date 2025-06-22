import com.google.gson.Gson;
import java.io.*;
import java.util.*;

public class Utils {
    public static void saveReservations(String filename, User user) {
        try (Writer writer = new FileWriter(filename)) {
            new Gson().toJson(user, writer);
            System.out.println("Booking saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User loadReservations(String filename, String username) {
        try (Reader reader = new FileReader(filename)) {
            return new Gson().fromJson(reader, User.class);
        } catch (IOException e) {
            System.out.println("Starting new session for: " + username);
            return new User(username);
        }
    }
}
