package commandpattern;

import commandpattern.command.Command;
import commandpattern.command.LightTurnOffCommand;
import commandpattern.command.LightTurnOnCommand;
import commandpattern.invoker.AlgorithmExecutor;
import commandpattern.invoker.Switcher;
import commandpattern.receiver.Light;

public class Runner
{
    public static void main(String[] args)
    {
        Switcher switcher = new Switcher();
        Light light = new Light();

        Command turnOffCommand = new LightTurnOffCommand(light);
        Command turnOnCommand = new LightTurnOnCommand(light);

        switcher.addCommand(turnOffCommand);
        switcher.addCommand(turnOnCommand);

        switcher.executeCommands();

        final AlgorithmExecutor algorithmExecutor = new AlgorithmExecutor();

        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                algorithmExecutor.produce();
            }
        });

        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                algorithmExecutor.consume();
            }
        });

        t1.start();
        t2.start();

    }
}
