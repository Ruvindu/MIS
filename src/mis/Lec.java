
package mis;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Lec extends User{
    
    private String department;
    
    public Lec(String user_id, String first_name, String last_name, String email, String contact_no, String dob, String address,String department) {
        super(user_id, first_name, last_name, email, contact_no, dob, address);
        this.department = department;
    }
    
    
    public void set_department(String depatment){
        this.department = depatment;
    }
    
     public String get_department(){
        return this.department;
    }
     
     
     /* View users */
    
    public ResultSet view_students(String dept, String search){
    
        ResultSet res = null;
        String viewQ;
        
        String t;
        String d;
       
        /* Filter by department */
       
       if("All".equals(dept)){
           d = "1";
       }else{
           d = "department = '" + dept + "'";
       }
        

        if(!"".equals(search)){
            viewQ = "SELECT `user_id` as `User ID`, `post` as `Post`, `department` as `Department`, `first_name` as `First name`, `last_name` as `Last name`, `email` as `Email`, `phone` as `Phone`, `address` as `Address`, `dob` as `Birthday` FROM `user` WHERE `post` = 'stu' AND  " + d + " AND first_name LIKE '%" + search + "%' OR last_name LIKE '%" + search + "%' OR user_id LIKE '%" + search + "%' " ;
        }
        else{
            viewQ = "SELECT `user_id` as `User ID`, `post` as `Post`, `department` as `Department`, `first_name` as `First name`, `last_name` as `Last name`, `email` as `Email`, `phone` as `Phone`, `address` as `Address`, `dob` as `Birthday`   FROM `user` WHERE `post` = 'stu' AND  " + d + " ";
        }
        
        //System.out.println(viewQ);
        
        
        /* Execute query */
        
        //con = DBconnection.connect();  
        PreparedStatement qstate;
       
       try {
           qstate = (PreparedStatement) con.prepareStatement(viewQ);      
           res = qstate.executeQuery();
                    
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Database connection faild.", "Error", JOptionPane.ERROR_MESSAGE);
       }
      
        return res;
    }
     
     
    public ResultSet get_all_lec_for_conduct_cource(){
   
       ResultSet res = null;

            
        String get_all_lecQ = "SELECT `user_id` FROM `user` WHERE `post` = 'lec'";
            
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(get_all_lecQ);      
            res = qstate.executeQuery();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
           
      
       return res;
   }
 
     
       
    public ResultSet get_selected_subject_infor(String sub_id){
    
        ResultSet res = null;
    
        String get_subQ = "SELECT `sub_code`, `sub_name`, `sub_dept`, `conducting_by`, `credit`, `theory`, `practical` FROM `subject` WHERE `sub_code` = '"+sub_id+"'";
        
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(get_subQ);      
            res = qstate.executeQuery();

        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
       
        return res;        
    }
    
     
    
       public ResultSet view_subject(String dept, String search_res){
    
        ResultSet retrieved = null;
        
        String d;
        String get_all_lecQ;
         
         /* Filter by department */
       
       if("All".equals(dept)){
           d = "1";
       }else{
           d = "sub_dept = '" + dept + "'";
       }
        
        if(!"".equals(search_res))
            get_all_lecQ = "SELECT `sub_code` as `Subject code`, `sub_name` as `Name`, `sub_dept` as `Department`, `conducting_by` as `Conducting by`, `credit` as `Credits`, `theory` as `Theory`, `practical` as `Practical` FROM `subject` WHERE "+d+" AND sub_code LIKE '%" + search_res + "%' OR sub_name LIKE '%" + search_res + "%' OR conducting_by LIKE '%" + search_res + "%' ";
        else{
            get_all_lecQ = "SELECT `sub_code` as `Subject code`, `sub_name` as `Name`, `sub_dept` as `Department`, `conducting_by` as `Conducting by`, `credit` as `Credits`, `theory` as `Theory`, `practical` as `Practical` FROM `subject` WHERE "+d+"";
        }
            
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(get_all_lecQ);      
            retrieved = qstate.executeQuery();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        
        return retrieved;
    } 
    
       
}