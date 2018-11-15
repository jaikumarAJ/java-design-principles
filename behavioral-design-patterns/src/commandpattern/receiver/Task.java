package commandpattern.receiver;

public class Task
{
    private int taskId;

    public Task(int taskId)
    {
        this.taskId = taskId;
    }

    public void solveTask()
    {
        System.out.println("Solving the task with task id : " + taskId);
    }
}
