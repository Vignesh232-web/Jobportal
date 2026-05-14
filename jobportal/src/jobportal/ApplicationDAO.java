package jobportal;
import java.sql.*;

public class ApplicationDAO {
        public void applyJob(int userId, int jobId) throws Exception {
            Connection con=JDBC.getconnection();
            String sql="insert into applications(userid,jobid,status)values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,userId);
            ps.setInt(2,jobId);
            ps.setString(3, "APPLIED");
            ps.executeUpdate();
        }
    public boolean alreadyApplied(int userId,int jobId) throws Exception {
        Connection con = JDBC.getconnection();
        String sql="Select * from applications where userid= ? and jobid= ?";
        PreparedStatement ps=con.prepareStatement(sql);

        ps.setInt(1,userId);
        ps.setInt(2,jobId);

        ResultSet rs=ps.executeQuery();
        return rs.next();
    }

}
