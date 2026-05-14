package jobportal;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        UserDAO userDAO=new UserDAO();
        PortalServices service=new PortalServices();
        System.out.println("enter email:");
        String email=sc.next();
        System.out.println("Enter Password:");
        String pass=sc.next();
        User user=userDAO.login(email,pass);
        if (user==null) {
            System.out.println("Invalid login");
            return;
        }
        System.out.println("Welcome " + user.getRole());
        while(true) {
            System.out.println("1. View Jobs");
            System.out.println("2. Apply Job");
            System.out.println("3. Exit");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    service.showJobs();
                    break;
                case 2:
                    System.out.print("Enter Job ID: ");
                    int jobId = sc.nextInt();
                    service.apply(user.getId(), jobId);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}

