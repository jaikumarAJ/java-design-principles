package dependencyinversion;

import dependencyinversion.template.Database;
import dependencyinversion.manager.DatabaseManager;
import dependencyinversion.persistence.OracleDatabase;
import dependencyinversion.persistence.SQLDatabase;

public class Runner
{
    public static void main(String[] args)
    {
        Database sqlDatabase    = new SQLDatabase();
        Database oracleDatabase = new OracleDatabase();

        DatabaseManager databaseManager = new DatabaseManager();

        databaseManager.connectToDatabase(sqlDatabase);
        databaseManager.connectToDatabase(oracleDatabase);
        databaseManager.disconnectFromDatabase(sqlDatabase);
        databaseManager.disconnectFromDatabase(oracleDatabase);
    }
}
