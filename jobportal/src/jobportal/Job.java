package jobportal;

public class Job {
    private int id;
    private String title;
    private String company;
    private double salary;
    public Job(int id,String title,String company,double salary){
        this.id=id;
        this.title=title;
        this.company=company;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getCompany(){
        return company;
    }
    public Double getSalary(){
        return salary;
    }
}
