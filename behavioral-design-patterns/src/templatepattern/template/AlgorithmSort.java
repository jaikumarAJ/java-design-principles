package templatepattern.template;

public abstract class AlgorithmSort
{
    public abstract void initialize();
    public abstract void sort();
    public abstract void printResult();

    public void sortBySteps()
    {
        initialize();
        sort();
        printResult();
    }
}
