import java.time.LocalDate;

public class Task {
    private String description;
    private boolean completed;
    private LocalDate expiration;


public Task(String description, boolean completed, LocalDate expiration){
this.description = description;
this.completed = completed;
this.expiration = expiration;
}

public String getDescription(){
    return description;}

    public void setDescription(String description){
    this.description = description; }


    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }


    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", completed=" + completed +
                ", expiration=" + expiration +
                '}';
    }
}



