import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Data {
    private final String filename;
    private final Gson gson;

    public Data(String fn) {
        filename = fn;
        gson = new Gson();
    }

    public void save(ArrayList<Task> tasks) {
        try(FileWriter fo = new FileWriter(filename)) {

        String json = gson.toJson(tasks);
        fo.write(json);
        System.out.println("Tasks successfully saved.");

        } catch (IOException e) {
            System.out.println("Failed at saving tasks:\n" + e.getMessage());
        }
    }

    public ArrayList<Task> load() {
        try(BufferedReader fin = new BufferedReader(new FileReader(filename))) {

            String json = fin.readLine();
            TypeToken<ArrayList<Task>> listType = new TypeToken<ArrayList<Task>>(){};

            return gson.fromJson(json, listType);

        } catch (IOException e) {
            System.out.println("Failed at reading tasks file:\n" + e.getMessage());
        }
        return new ArrayList<>();
    }

}
