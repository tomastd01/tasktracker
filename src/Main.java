import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // initialize tasks file and task manager
        //var db = new Data("tasks.json");
        var tracker = new TaskTracker();

        // add tasks
        tracker.addTask("Program something new");
        tracker.addTask("Listen to Tommy Richman's new album");
        tracker.addTask("Buy flowers for my mom <3");
        tracker.addTask("Study derivatives");
        tracker.addTask("Read an Agatha Christie book");

    }

}