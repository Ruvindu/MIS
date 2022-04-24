
package mis;


public class Stu extends User{
    
    private String department;
    
    
    public Stu(String user_id, String first_name, String last_name, String email, String contact_no, String dob, String address,String department) {
        super(user_id, first_name, last_name, email, contact_no, dob, address);
        this.department = department;
    }
    
    
    public void set_department(String depatment){
        this.department = depatment;
    }
    
     public String get_department(){
        return this.department;
    }
    
}
