package dependencyinversion.persistence;

import dependencyinversion.template.Database;

public class SQLDatabase implements Database
{
    @Override
    public void connectToDatabase()
    {
        System.out.println("Connected to SQL database.");
    }

    @Override
    public void disconnectFromDatabase()
    {
        System.out.println("Disconnected from SQL database.");
    }
}
