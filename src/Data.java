import com.google.gson.Gson;

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
        try(FileWriter fin = new FileWriter(filename)) {

        String json = gson.toJson(tasks);
        fin.write(json);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
