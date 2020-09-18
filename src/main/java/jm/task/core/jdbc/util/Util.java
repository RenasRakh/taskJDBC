package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest?autoReconnect=true&useSSL=false&useUnicode=true&serverTimezone=Europe/Moscow";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "sql4*vjyjkbn3*sS";

    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            return connection;
        }catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException");
        }catch (SQLException e) {
            System.err.println("Не удалось загрузить драйвер");
            e.printStackTrace();
        }
        return null;
    }
}
