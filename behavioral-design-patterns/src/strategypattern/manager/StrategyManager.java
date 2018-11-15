package strategypattern.manager;

import strategypattern.logic.Strategy;

public class StrategyManager implements Strategy
{
    private Strategy strategy;

    public Strategy getStrategy()
    {
        return strategy;
    }

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }


    @Override
    public double performOperation(Number o1, Number o2)
    {
        return this.strategy.performOperation(o1, o2);
    }
}
