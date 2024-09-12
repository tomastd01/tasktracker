import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // initialize tasks file and task manager
        var db = new Data("tasks.json");
        TaskTracker tracker;

        ArrayList<Task> initialTasks = db.load();
        if(initialTasks.isEmpty()) {
            tracker = new TaskTracker();
        } else {
            tracker = new TaskTracker(initialTasks);
        }

        /*// add tasks
        tracker.addTask("Program something new");
        tracker.addTask("Listen to Tommy Richman's new album");
        tracker.addTask("Buy flowers for my mom <3");
        tracker.addTask("Study derivatives");
        tracker.addTask("Read an Agatha Christie book");*/

        System.out.println(tracker.getAllTasks());

        // save all tasks from the task manager
        //db.save(tracker.getAllTasks());

    }

}