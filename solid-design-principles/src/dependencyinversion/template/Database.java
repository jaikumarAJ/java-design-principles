package dependencyinversion.template;

public interface Database
{
    void connectToDatabase();
    void disconnectFromDatabase();
}
