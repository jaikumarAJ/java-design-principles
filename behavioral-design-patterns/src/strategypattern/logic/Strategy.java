package strategypattern.logic;

public interface Strategy<T extends Number>
{
    double performOperation(T o1, T o2);
}
