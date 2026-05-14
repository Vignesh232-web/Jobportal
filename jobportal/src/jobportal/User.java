package jobportal;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String role;
    private String gender;
    public User(int id,String name,String email,String password,String role,String gender){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.role=role;
        this.gender=gender;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getRole(){
        return role;
    }

    public int getId() {
        return id;
    }
}
