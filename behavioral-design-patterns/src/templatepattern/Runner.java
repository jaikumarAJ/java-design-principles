package templatepattern;

import templatepattern.implementation.BubbleSort;
import templatepattern.implementation.InsertionSort;
import templatepattern.template.AlgorithmSort;

public class Runner
{
    public static void main(String[] args)
    {
        int[] numbers = {-2, 1, 4, 5, 6};

        AlgorithmSort sort = new BubbleSort(numbers);
        sort.sortBySteps();

        sort = new InsertionSort(numbers);
        sort.sortBySteps();
    }
}
