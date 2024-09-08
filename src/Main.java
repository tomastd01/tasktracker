import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        var tm = new TaskTracker();
        int id = tm.addTask("Call my girlfriend");
        int id2 = tm.addTask("Program something");
        int id3 = tm.addTask("Prepare some coffee");
        System.out.println(tm.getAllTasks("todo"));


        Task taskFound = tm.getTask(3);
        System.out.println(taskFound != null ? taskFound : "Task does not  exist.");

        tm.deleteTask(1);
        System.out.println(tm.getAllTasks());

        int res = tm.markTask(1, "done");
        System.out.println(res != -1 ? "Task "+res+" updated." : "Task not found.");
        System.out.println(tm.getAllTasks());
    }

}