import java.util.ArrayList;
import java.time.LocalDateTime;

public class TaskTracker {
    ArrayList<Task> tasks;
    int idCounter;

    public TaskTracker() {
        tasks = new ArrayList<>();
        idCounter = 0;
    }

    int addTask(String desc) {
        Task task = new Task(++idCounter, desc, LocalDateTime.now());
        tasks.add(task);
        return idCounter;
    }
}
