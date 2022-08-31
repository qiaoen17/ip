package duke;

public class Task {

    private boolean isDone;
    private String taskDescription;
    private int index;

    /**
     * A constructor to initialize a task object.
     *
     * @param isDone A boolean to indicate if the task is completed.
     * @param taskDescription A string to detail the task.
     * @param index A integer to indicate position of the task in list of tasks.
     */
    public Task(boolean isDone, String taskDescription, int index) {
        this.isDone = isDone;
        this.taskDescription = taskDescription;
        this.index = index;
    }

    /**
     * Return if the task is done or not.
     *
     * @return The boolean to indicate if task is done.
     */
    public boolean getStatus() {
        return isDone;
    }

    /**
     * Return the task description.
     *
     * @return A String description of the task.
     */
    public String getDescription() {
        return taskDescription;
    }

    /**
     * Return integer index of the task in the list of tasks.
     *
     * @return The integer index of the task in list of tasks.
     */
    public int getIndex() {
        return index;
    }

    /**
     * Change the task from undone to done. Output in the console
     * details of the task done to inform the user about the change.
     */
    public void markDone() {

        this.isDone = true;

        System.out.println(Ui.straightLine + "\n  Good Job! You're Killing It!\n  [X] " + taskDescription
                + "\n" + Ui.straightLine + "\n");
    }

    /**
     * Change the task from done to undone. Output in the console
     * details of the task undone to inform user about the change.
     */
    public void markUndone() {

        this.isDone = false;

        System.out.println(Ui.straightLine + "\n  AAaaa please get it done soon...\n  [ ] " + taskDescription
                + "\n" + Ui.straightLine + "\n");
    }

    /**
     * Update the index of the task in the list of tasks.
     *
     * @param newIndex The most current integer index of the task.
     */
    public void setIndex(int newIndex) {

        this.index = newIndex;

    }

    /**
     * Output in the console the task added to the list of tasks.
     */
    public void printAdded() {
        System.out.println(Ui.straightLine + "\n added: " + taskDescription + "\n" + Ui.straightLine + "\n\n");
    }

    /**
     * Output in the console the full details of the task.
     */
    public void printTask() {
        if (!isDone) {
            System.out.println("  " + index + ".[ ] " + taskDescription);
        } else {
            System.out.println("  " + index + ".[X] " + taskDescription);
        }

    }

    /**
     * Return a string representation of the duke.Task.
     *
     * @return string describing the task.
     */
    public String toString() {
        if (!isDone) {
            return "  " + index + ".[ ] " + taskDescription;
        } else {
            return "  " + index + ".[X] " + taskDescription;
        }
    }

    /**
     * Return a string to be saved in the hard disk.
     *
     * @return A string representation of task to be saved in the hard disk.
     */
    public String savedString() {
        if (!isDone) {
            return "GN<" + taskDescription + ">";
        } else {
            return "GY<" + taskDescription + ">";
        }
    }

    /**
     * Output in the console the task deleted from the list of tasks.
     */
    public void printDeleted() {
        System.out.println(Ui.straightLine + "\n  duke.Task deleted!\n" + Ui.straightLine + "\n");
    }

}
