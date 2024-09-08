import java.time.LocalDateTime;

public class Task {
    private final int id;
    private String description;
    private String status;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

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

    //getters
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public String getStatus() {
        return status;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    //setters

    public void setDescription(String description) {
        this.description = description;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}


