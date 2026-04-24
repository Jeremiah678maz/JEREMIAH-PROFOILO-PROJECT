
/**
 * Kernel interface for TaskManager.
 */
public interface TaskManagerKernel {

    /**
     * Adds a task to the manager.
     *
     * @param task
     *            the task to add
     * @updates this
     * @requires task is not null
     * @ensures task is added to this
     */
    void addTask(String task);

    /**
     * Removes and returns a task.
     *
     * @return the removed task
     * @updates this
     * @requires this has at least one task
     * @ensures a task is removed from this
     */
    String removeTask();

    /**
     * Reports whether there are tasks.
     *
     * @return true if tasks exist
     * @ensures isEmpty = (this has no tasks)
     */
    boolean hasTasks();
}