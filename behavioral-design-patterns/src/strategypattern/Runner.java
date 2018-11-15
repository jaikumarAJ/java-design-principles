package strategypattern;

import strategypattern.implementation.Adder;
import strategypattern.implementation.Multiplier;
import strategypattern.logic.Strategy;
import strategypattern.manager.StrategyManager;

public class Runner
{
    public static void main(String[] args)
    {
        Strategy adder = new Adder();
        Strategy multiplier = new Multiplier();

        Strategy<Integer> strategyManager = new StrategyManager();

        ((StrategyManager) strategyManager).setStrategy(adder);
        Number resultOfAddOperation = strategyManager.performOperation(57, 98);

        ((StrategyManager) strategyManager).setStrategy(multiplier);
        Number resultOfMultiplyOperation = strategyManager.performOperation(57, 98);

        System.out.println(resultOfAddOperation);
        System.out.println(resultOfMultiplyOperation);
    }
}
