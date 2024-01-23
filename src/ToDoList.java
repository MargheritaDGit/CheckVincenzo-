import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<Task> toDoList = new ArrayList<>();

    public void addToDoList (Task task) {
        toDoList.add(task);
    }

    public void removeToDoList (Task task) {
        toDoList.remove(task);
    }

    public void visualToDoList() {
        System.out.println("Elenco dei compiti + ");
        for (Task element : toDoList)
            System.out.println(element);
    }

    public void completedTask(Task task){
      toDoList.remove(task);
      task.setCompleted(true);
      toDoList.add (task);
    }

}
