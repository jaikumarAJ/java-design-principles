package iteratorpattern;

import iteratorpattern.logic.Iterator;
import iteratorpattern.repository.NameRepository;

public class Runner
{
    public static void main(String[] args)
    {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); /*do nothing*/)
        {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
