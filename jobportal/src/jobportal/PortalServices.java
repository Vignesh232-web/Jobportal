package jobportal;
import java.util.*;

public class PortalServices {


        private JobDAO jobDAO=new JobDAO();
        private ApplicationDAO appDAO=new ApplicationDAO();
        public void showJobs() throws Exception {
            List<Job> jobs=jobDAO.getAllJobs();
            for(Job j:jobs) {
                System.out.println(j.getId()+" - "+j.getTitle()+" - "+j.getCompany()+" - "+j.getSalary());
            }
        }
    public void apply(int userId,int jobId) throws Exception {

        if(!jobDAO.jobExists(jobId)) {
            System.out.println("Invalid Job ID");
            return;
        }
        if(appDAO.alreadyApplied(userId, jobId)) {
            System.out.println("Already applied!");
            return;
        }
        appDAO.applyJob(userId, jobId);
        System.out.println("Applied successfully!");
    }
    }

