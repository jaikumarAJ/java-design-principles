package commandpattern.invoker;

import commandpattern.command.Command;

import java.util.ArrayList;
import java.util.List;

public class Switcher
{
    private List<Command> commands;

    public Switcher()
    {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command)
    {
        this.commands.add(command);
    }

    public void executeCommands()
    {
        for (Command command : commands)
        {
            command.execute();
        }
    }
}
