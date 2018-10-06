package openclosed;

import openclosed.implementation.StrategyExecutor;
import openclosed.implementation.StrategyOne;
import openclosed.implementation.StrategyTwo;
import openclosed.implementation.sort.InsertionSorter;
import openclosed.implementation.sort.MergeSorter;
import openclosed.implementation.sort.SorterExecutor;
import openclosed.logic.Strategy;
import openclosed.logic.sort.Sorter;

public class Runner
{
    public static void main(String[] args)
    {
        StrategyExecutor strategyExecutor = new StrategyExecutor();

        Strategy strategyOne = new StrategyOne();
        Strategy strategyTwo = new StrategyTwo();

        strategyExecutor.executeStrategy(strategyOne);
        strategyExecutor.executeStrategy(strategyTwo);

        SorterExecutor sorterExecutor = new SorterExecutor();

        Sorter insertionSorter = new InsertionSorter();
        Sorter mergeSorter = new MergeSorter();

        sorterExecutor.sort(insertionSorter);
        sorterExecutor.sort(mergeSorter);
    }
}
