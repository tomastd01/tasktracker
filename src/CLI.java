import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    private final TaskTracker manager;
    private Data data;

    public CLI() {
        data = new Data("tasks.json");
        ArrayList<Task> initialTasks = data.load();

        if(initialTasks.isEmpty()) {
            manager = new TaskTracker();
        } else {
            manager = new TaskTracker(initialTasks);
        }
    }

    public void start(String[] args) {
        String command = args[0];

        switch (command) {
            case "add":
                handleAdd(args);
                break;

            case "update":
                handleUpdate(args);
                break;

            case "delete":
                handleDelete(args);
                break;

            case "mark-in-progress":
                handleMark(args,"in-progress");
                break;

            case "mark-done":
                handleMark(args,"done");
                break;

            case "list":
                handleList(args);
                break;

            default:
                System.out.println("Unknown command, please try again.");
        }
    }

    private void handleAdd(String[] args) {
        if(args.length != 2) {
            System.out.println("Please provide task description.");
            return;
        }
        int id = manager.addTask(args[1]);
        System.out.println("Task added successfully - ID: "+id);

        handleSave();
    }

    private void handleUpdate(String[] args) {
        if(args.length != 3 && !isNumber(args[1])) {
            System.out.println("Please enter valid update command.");
            return;
        }

        int id = manager.updateTask(Integer.parseInt(args[1]), args[2]);
        System.out.println("Task updated successfully - ID: "+id);

        handleSave();
    }

    private void handleDelete(String[] args) {
        if(args.length != 2 && !isNumber(args[1])) {
            System.out.println("Please enter valid id.");
            return;
        }
        int id = manager.deleteTask(Integer.parseInt(args[1]));
        System.out.println("Task "+id+" deleted.");

        handleSave();
    }

    private void handleMark(String[] args, String status) {
        if(args.length != 2 && !isNumber(args[1])) {
            System.out.println("Please enter valid id.");
            return;
        }
        int id = manager.markTask(Integer.parseInt(args[1]), status);
        System.out.println("Task "+id+" is marked as "+status+".");

        handleSave();
    }

    private void handleList(String[] args) {
        if(args.length == 2 &&
                (args[1].equals("done") ||
                        args[1].equals("in-progress") ||
                        args[1].equals("todo"))) {
            System.out.println(manager.getAllTasks(args[1]));
        }
        System.out.println(manager.getAllTasks());

        handleSave();
    }

    private boolean isNumber(String num) {
        try {
            int n = Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void handleSave() {
        data.save(manager.getAllTasks());
    }
}
