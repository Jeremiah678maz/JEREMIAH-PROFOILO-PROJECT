/**
 * Enhanced interface for TaskManager.
 */
public interface TaskManager extends TaskManagerKernel {

    /**
     * Returns number of tasks.
     *
     * @return size of task list
     * @ensures size = number of tasks in this
     */
    int size();

    /**
     * Checks if a task exists.
     *
     * @param task
     *            task to check
     * @return true if task exists
     * @ensures containsTask = (task is in this)
     */
    boolean containsTask(String task);

    /**
     * Clears all tasks.
     *
     * @updates this
     * @ensures this has no tasks
     */
    void clearAllTasks();
}