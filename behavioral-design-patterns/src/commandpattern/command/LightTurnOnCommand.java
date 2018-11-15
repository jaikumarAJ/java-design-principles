package commandpattern.command;

import commandpattern.receiver.Light;

public class LightTurnOnCommand implements Command
{

    Light light;

    public LightTurnOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        this.light.turnOnLight();
    }
}
