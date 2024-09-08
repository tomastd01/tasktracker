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

    Task getTask(int id) {
        if(id > idCounter || id < 0) return null;

        for (Task t : tasks) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    int deleteTask(int id) {
        Task t = getTask(id);

        if(t != null) {
            tasks.remove(t);
            return id;
        }
        return -1;
    }

    int markTask(int id, String status) {
        Task t = getTask(id);
        if(t != null) {
            t.setStatus(status);
            t.setUpdatedAt(LocalDateTime.now());
            return id;
        }
        return -1;
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
