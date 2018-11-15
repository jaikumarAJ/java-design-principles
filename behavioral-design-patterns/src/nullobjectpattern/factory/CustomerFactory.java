package nullobjectpattern.factory;

import nullobjectpattern.entity.AbstractCustomer;
import nullobjectpattern.entity.NullCustomer;
import nullobjectpattern.entity.RealCustomer;
import nullobjectpattern.repository.Database;

public class CustomerFactory
{

    private Database database;

    public CustomerFactory()
    {
        this.database = new Database();
    }

    public AbstractCustomer getCustomer(String name)
    {
        if (checkName(name))
        {
            return new RealCustomer(name);
        }
        return new NullCustomer();
    }

    private boolean checkName(String name)
    {
        return database.doesCustomerExistByName(name);
    }

}
