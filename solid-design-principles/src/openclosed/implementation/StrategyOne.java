package openclosed.implementation;

import openclosed.logic.Strategy;

public class StrategyOne implements Strategy
{
    @Override
    public void executeStrategy()
    {
        System.out.println("Execute strategy one.");
    }
}
