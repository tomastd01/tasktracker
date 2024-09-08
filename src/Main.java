import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Task t = new Task(1, "Call my girlfriend today at 21pm", LocalDateTime.now());
        System.out.println(t);

        var tm = new TaskTracker();
        int id = tm.addTask("Program something");
        int id2 = tm.addTask("Prepare some coffee");
        System.out.println(tm.getAllTasks());
        System.out.println(tm.getAllTasks("todo"));
    }

}