import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Task t = new Task(1, "Call my girlfriend today at 21pm", LocalDateTime.now());
        System.out.println(t);
    }

}