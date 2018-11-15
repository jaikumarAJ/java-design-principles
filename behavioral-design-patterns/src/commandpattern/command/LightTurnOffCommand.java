package commandpattern.command;

import commandpattern.receiver.Light;

public class LightTurnOffCommand implements Command
{
    private Light light;

    public LightTurnOffCommand(Light light)
    {
        this.light = light;
    }


    @Override
    public void execute()
    {
        this.light.turnOffLight();
    }
}
