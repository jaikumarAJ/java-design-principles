package commandpattern.invoker;

import commandpattern.command.Command;
import commandpattern.command.TaskSolver;
import commandpattern.receiver.Task;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class AlgorithmExecutor
{
    private BlockingQueue<Command> commands;
    private static final int NUM_COMMANDS = 10;

    public AlgorithmExecutor()
    {
        this.commands = new ArrayBlockingQueue<>(NUM_COMMANDS);
    }

    public void produce()
    {
        try
        {
            for (int i = 0; i < NUM_COMMANDS; i++)
            {
                commands.put(new TaskSolver(new Task(i + 1)));
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public void consume()
    {
        try
        {
            for (int i = 0; i < NUM_COMMANDS; i++)
            {
                Thread.sleep(1000);
                commands.take().execute();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
