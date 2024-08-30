package db;

import model.Task;

import java.util.ArrayList;
import java.util.List;

public class DataBaseConnector {
    private static DataBaseConnector instance;
    private List<Task>connection;

    private DataBaseConnector(){
        connection=new ArrayList<>();
    }
    public List<Task> getConnection(){
        return connection;
    }

    public static DataBaseConnector getInstance(){
        return null == instance ? instance = new DataBaseConnector() : instance;
    }


}
