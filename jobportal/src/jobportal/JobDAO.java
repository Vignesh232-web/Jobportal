package jobportal;
import java.sql.*;
import java.util.*;

public class JobDAO {

        public void addJob(Job job) throws Exception {
            Connection con = JDBC.getconnection();
            String sql = "insert into jobs(title, company, salary)values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, job.getTitle());
            ps.setString(2, job.getCompany());
            ps.setDouble(3, job.getSalary());
            ps.executeUpdate();
        }
        public List<Job> getAllJobs() throws Exception {
            List<Job> list=new ArrayList<>();
            Connection con=JDBC.getconnection();
            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("Select * from jobs");
            while(rs.next()) {
                list.add(new Job(rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("company"),
                        rs.getDouble("salary")));
            }

            return list;
        }
    public boolean jobExists(int jobId) throws Exception {
        Connection con = JDBC.getconnection();
        String sql="select * from jobs where id= ?";
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setInt(1,jobId);
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }

}
