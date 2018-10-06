package dependencyinversion.persistence;

import dependencyinversion.template.Database;

public class OracleDatabase implements Database
{
    @Override
    public void connectToDatabase()
    {
        System.out.println("Connected to Oracle database.");
    }

    @Override
    public void disconnectFromDatabase()
    {
        System.out.println("Disconnected from Oracle database.");
    }
}
