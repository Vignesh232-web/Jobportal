package jobportal;

public class Application {
    private int id;
    private String userId;
    private String jobId;
    private String status;
    public Application(int id,String userId,String jobId,String status) {
        this.id = id;
        this.userId=userId;
        this.jobId=jobId;
        this.status=status;
    }
}
