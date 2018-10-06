package dependencyinversion.manager;

import dependencyinversion.template.Database;

public class DatabaseManager
{
    public void connectToDatabase(Database databaseHandler)
    {
        databaseHandler.connectToDatabase();
    }

    public void disconnectFromDatabase(Database databaseHandler)
    {
        databaseHandler.disconnectFromDatabase();
    }

}
