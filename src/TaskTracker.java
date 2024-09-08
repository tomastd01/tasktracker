import java.util.ArrayList;
import java.time.LocalDateTime;

public class TaskTracker {
    private final ArrayList<Task> tasks;
    private int idCounter;

    public TaskTracker() {
        tasks = new ArrayList<>();
        idCounter = 0;
    }

    int addTask(String desc) {
        Task task = new Task(++idCounter, desc, LocalDateTime.now());
        tasks.add(task);
        return idCounter;
    }

    ArrayList<Task> getAllTasks() {
        return tasks;
    }

    ArrayList<Task> getAllTasks(String status) {
        ArrayList<Task> filtered = new ArrayList<>();

        for (Task t : tasks) {
            if (t.getStatus().equals(status)) {
                filtered.add(t);
            }
        }

        return filtered;
    }
}
