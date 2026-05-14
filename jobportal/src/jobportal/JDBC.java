package jobportal;
import java.sql.*;
public class JDBC {
    private static final String url="jdbc:mysql://localhost:3306/Job_Portal";
    private static final String user="root";
    private static final String password="your_pass";

    public static Connection getconnection() throws Exception{
        return DriverManager.getConnection(url,user,password);

    }

}
