package jobportal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
    public User login(String email,String password)throws Exception{
        Connection con=JDBC.getconnection();
        String sql="SELECT * FROM users WHERE email=? AND password=?";
        PreparedStatement p=con.prepareStatement(sql);
        p.setString(1,email);
        p.setString(2,password);
        ResultSet s=p.executeQuery();
        if(s.next()) {
            return new User(s.getInt("id"),
                    s.getString("name"),
                    s.getString("email"),
                    s.getString("password"),
                    s.getString("role"),
                    s.getString("gender"));
            }
        return null;
        }

    }

