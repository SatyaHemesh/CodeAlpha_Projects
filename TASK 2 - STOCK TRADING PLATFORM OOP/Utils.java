import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class Utils {
    public static void saveUser(String filename, User user) {
        try (Writer writer = new FileWriter(filename)) {
            Gson gson = new Gson();
            gson.toJson(user, writer);
            System.out.println("Portfolio saved.");
        } catch (IOException e) {
            System.out.println("Failed to save user.");
        }
    }

    public static User loadUser(String filename, String defaultName) {
        try (Reader reader = new FileReader(filename)) {
            Gson gson = new Gson();
            return gson.fromJson(reader, User.class);
        } catch (IOException e) {
            System.out.println("No existing portfolio. Creating new user.");
            return new User(defaultName);
        }
    }
}
