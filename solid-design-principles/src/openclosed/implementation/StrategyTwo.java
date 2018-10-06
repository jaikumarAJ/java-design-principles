package openclosed.implementation;

import openclosed.logic.Strategy;

public class StrategyTwo implements Strategy
{
    @Override
    public void executeStrategy()
    {
        System.out.println("Execute strategy two.");
    }
}
