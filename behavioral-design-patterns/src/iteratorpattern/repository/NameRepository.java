package iteratorpattern.repository;

import iteratorpattern.implementation.NameIterator;
import iteratorpattern.logic.Iterator;

public class NameRepository
{
    private String[] names = {"Adam", "Ben", "Chloe", "Derek", "Ethan", "Frank", "Gabriel", "Harvey", "Lannister"};

    public Iterator getIterator()
    {
        return new NameIterator(names);
    }

}
