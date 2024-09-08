import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Task t = new Task(1, "Call my girlfriend today at 21pm", LocalDateTime.now());
        System.out.println(t);

        var tm = new TaskTracker();
        int id = tm.addTask("Program something");
        System.out.println(tm.tasks.getFirst() + " id: "+id);
    }

}