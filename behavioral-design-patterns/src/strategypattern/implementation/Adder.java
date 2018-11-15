package strategypattern.implementation;

import strategypattern.logic.Strategy;

public class Adder implements Strategy
{

    @Override
    public double performOperation(Number o1, Number o2)
    {
        return o1.doubleValue() + o2.doubleValue();
    }
}
