import java.util.ArrayList;

/**
 * Proof-of-concept for a TaskManager component.
 *
 * @author Jeremiah Odugbesan
 */
public class TaskManagerProofOfConcept {

    /**
     * Representation of the tasks.
     */
    private ArrayList<String> tasks;

    /**
     * Constructor.
     */
    public TaskManagerProofOfConcept() {
        this.tasks = new ArrayList<String>();
    }

    /**
     * Adds a task.
     *
     * @param task
     *            task to add
     */
    public void addTask(String task) {
        this.tasks.add(task);
    }

    /**
     * Removes and returns the first task.
     *
     * @return removed task
     */
    public String removeTask() {
        return this.tasks.remove(0);
    }

    /**
     * Reports whether there are tasks.
     *
     * @return true if there are tasks
     */
    public boolean hasTasks() {
        return this.tasks.size() > 0;
    }

    /**
     * Reports the number of tasks.
     *
     * @return number of tasks
     */
    public int size() {
        return this.tasks.size();
    }

    /**
     * Reports whether a task exists.
     *
     * @param task
     *            task to check
     * @return true if task exists
     */
    public boolean containsTask(String task) {
        return this.tasks.contains(task);
    }

    /**
     * Clears all tasks.
     */
    public void clearAllTasks() {
        this.tasks.clear();
    }

    /**
     * Returns a string version of the task manager.
     *
     * @return string of tasks
     */
    @Override
    public String toString() {
        return this.tasks.toString();
    }

    /**
     * Main method showing the component in action.
     *
     * @param args
     *            command-line arguments
     */
    public static void main(String[] args) {
        TaskManagerProofOfConcept manager = new TaskManagerProofOfConcept();

        manager.addTask("Finish portfolio project");
        manager.addTask("Study Java components");
        manager.addTask("Submit assignment on Carmen");

        System.out.println("Current tasks: " + manager);
        System.out.println("Number of tasks: " + manager.size());
        System.out.println("Has tasks? " + manager.hasTasks());
        System.out.println("Contains 'Study Java components'? "
                + manager.containsTask("Study Java components"));

        String completedTask = manager.removeTask();
        System.out.println("Completed task: " + completedTask);
        System.out.println("Tasks after completing one: " + manager);

        manager.clearAllTasks();
        System.out.println("Tasks after clearing: " + manager);
        System.out.println("Has tasks now? " + manager.hasTasks());
    }
}