import java.util.LinkedList;
import java.util.Queue;

/**
 * Kernel implementation of TaskManager.
 *
 * @convention $this.tasks is not null and every task in $this.tasks is not null
 * @correspondence this = sequence of task strings stored in $this.tasks from
 *                 front to back
 */
public class TaskManager1L extends TaskManagerSecondary {

    /**
     * Representation of this.
     */
    private Queue<String> tasks;

    /**
     * Creates initial representation.
     */
    private void createNewRep() {
        this.tasks = new LinkedList<String>();
    }

    /**
     * No-argument constructor.
     */
    public TaskManager1L() {
        this.createNewRep();
    }

    @Override
    public void addTask(String task) {
        assert task != null : "Violation of: task is not null";
        this.tasks.add(task);
    }

    @Override
    public String removeTask() {
        assert this.hasTasks() : "Violation of: this has at least one task";
        return this.tasks.remove();
    }

    @Override
    public boolean hasTasks() {
        return !this.tasks.isEmpty();
    }

    @Override
    public void clear() {
        this.createNewRep();
    }

    @Override
    public TaskManager newInstance() {
        return new TaskManager1L();
    }

    @Override
    public void transferFrom(TaskManager source) {
        assert source != null : "Violation of: source is not null";
        assert source instanceof TaskManager1L
                : "Violation of: source is same dynamic type as this";

        TaskManager1L localSource = (TaskManager1L) source;
        this.tasks = localSource.tasks;
        localSource.createNewRep();
    }
}
