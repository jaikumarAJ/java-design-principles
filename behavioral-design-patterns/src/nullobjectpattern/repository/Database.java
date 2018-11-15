package nullobjectpattern.repository;

import java.util.ArrayList;
import java.util.List;

public class Database
{

    private List<String> customerNames;

    public Database()
    {
        customerNames = new ArrayList<>();
        customerNames.add("Alex");
        customerNames.add("Bill");
        customerNames.add("Cathy");
        customerNames.add("Derek");
    }

    public boolean doesCustomerExistByName(String customerName)
    {
        for (String name : customerNames)
        {
            if (name.equalsIgnoreCase(customerName))
            {
                return true;
            }
        }
        return false;
    }

}
