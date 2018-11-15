package nullobjectpattern.entity;

public class NullCustomer extends AbstractCustomer
{
    @Override
    public boolean isNull()
    {
        return true;
    }

    @Override
    public String getPersonName()
    {
        return "No customer which such a name exists";
    }
}
