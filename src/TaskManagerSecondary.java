public abstract class TaskManagerSecondary implements TaskManager {

    @Override
    public int size() {
        int count = 0;

        TaskManager temp = this.newInstance();

        while (this.hasTasks()) {
            String t = this.removeTask();
            temp.addTask(t);
            count++;
        }

        this.transferFrom(temp);
        return count;
    }

    @Override
    public boolean containsTask(String task) {
        boolean found = false;

        TaskManager temp = this.newInstance();

        while (this.hasTasks()) {
            String t = this.removeTask();
            if (t.equals(task)) {
                found = true;
            }
            temp.addTask(t);
        }

        this.transferFrom(temp);
        return found;
    }

    @Override
    public void clearAllTasks() {
        while (this.hasTasks()) {
            this.removeTask();
        }
    }

    @Override
    public String toString() {
        String result = "[";
        TaskManager temp = this.newInstance();

        while (this.hasTasks()) {
            String t = this.removeTask();
            result += t + ", ";
            temp.addTask(t);
        }

        this.transferFrom(temp);

        if (result.length() > 1) {
            result = result.substring(0, result.length() - 2);
        }

        return result + "]";
    }

    protected abstract TaskManager newInstance();

    protected abstract void transferFrom(TaskManager temp);

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TaskManager)) {
            return false;
        }

        TaskManager other = (TaskManager) obj;
        return this.toString().equals(other.toString());
    }

    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }
}