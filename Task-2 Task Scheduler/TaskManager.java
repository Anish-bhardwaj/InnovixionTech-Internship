import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;



class Task {
    private String name;
    private String description;
    private Date dueDate;
    private Priority priority;
    

    public Task(String name, String description, Date dueDate, Priority priority) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\nDue Date: " + dueDate + "\nPriority: " + priority;
    }
}
enum Priority{
 LOW,
 MEDIUM,
 HIGH
}
public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private Date parseDate(String dateInput) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
            return null;
        }
    }

    public void addTask() {
        System.out.println("------------------------------");
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dateInput = scanner.nextLine();

    // Parse the date string into a Date object
        Date dueDate = parseDate(dateInput);
        System.out.print("Enter priority : High/Medium/Low ");
        String priorityStr = scanner.nextLine().toLowerCase();
        Priority priority;
        if(priorityStr.equals("high")){
             priority= Priority.HIGH;
        }else if(priorityStr.equals("medium")){
             priority= Priority.MEDIUM;
        }else{
            priority= Priority.LOW;
        }
        
       

        Task task = new Task(name, description, dueDate, priority);
        tasks.add(task);
        System.out.println("Task added successfully!");
        System.out.println("------------------------------");
    }

    public void listTasks() {
        if(tasks.size()==0){System.out.println("------------------------------");System.out.println("No element to List");return; }
        Collections.sort(tasks, (t1, t2) -> t1.getDueDate().compareTo(t2.getDueDate()));
        for (Task task : tasks) {
            System.out.println("------------------------------");
            System.out.println(task);
            System.out.println("------------------------------");
        }
    }
    public void deleteExceedTasks(){

        if(tasks.size()!=0){
                for(int i=0;i<tasks.size();i++){
                    Date currentDate =new Date(); 
                    if(tasks.get(i).getDueDate().before(currentDate)){
                        System.out.println("------------------------------");
                        System.out.println("Deleting  task ");
                        System.out.println(tasks.get(i));
                        tasks.remove(i);
                        System.out.println("Removed succesfully");
                        System.out.println("------------------------------");
                    
                    }
                }
            }
        else{
            System.out.println("------------------------------");
            System.out.println("No element to delete");
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            if(tasks.size()!=0){
                for(int i=0;i<tasks.size();i++){
                    Date currentDate =new Date(); 
                    if(tasks.get(i).getDueDate().before(currentDate)){
                        System.out.println("------------------------------");
                        System.out.println("Deadling for task is over");
                        System.out.println(tasks.get(i));
                        System.out.println("------------------------------");
                    
                    }
                }
            }
            System.out.println("------------------------------");
            System.out.println("Task Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Delete Deadline Exceed tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
    
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
    
            switch (choice) {
                case 1:
                    taskManager.addTask();
                    break;
                case 2:
                    taskManager.listTasks();
                    break;
                case 3:
                    taskManager.deleteExceedTasks();
                    break;
                case 4:
                    System.out.println("------------------------------");
                    System.out.println("Exiting Task Manager. Goodbye!");
                    System.out.println("------------------------------");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}