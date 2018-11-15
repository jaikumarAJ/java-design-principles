package templatepattern.implementation;

import templatepattern.template.AlgorithmSort;

public class InsertionSort extends AlgorithmSort
{


    private int[] numbers;

    public InsertionSort(int[] numbers)
    {
        this.numbers = numbers;
    }


    @Override
    public void initialize()
    {
        System.out.println("Starting insertion sort : ");
    }

    @Override
    public void sort()
    {

    }

    @Override
    public void printResult()
    {
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}
