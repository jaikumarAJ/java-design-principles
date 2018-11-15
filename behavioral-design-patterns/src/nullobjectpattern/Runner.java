package nullobjectpattern;

import nullobjectpattern.factory.CustomerFactory;

public class Runner
{
    public static void main(String[] args)
    {
        CustomerFactory customerFactory = new CustomerFactory();

        System.out.println(customerFactory.getCustomer("Alex"));
        System.out.println(customerFactory.getCustomer("Joshua"));
    }
}
