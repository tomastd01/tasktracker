import java.time.LocalDateTime;

public class Task {
    int id;
    String description;
    String status;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    public Task(int id, String description, String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this. description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //create new task
    public Task(int id, String description, LocalDateTime createdAt) {
        this.id = id;
        this. description = description;
        this.status = "todo";
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "* TASK " +id+ ": \"" + description +"\"\n\t* STATUS: "+status+ "\n\t  (added at: "+createdAt.toLocalDate()+")";
    }
}


