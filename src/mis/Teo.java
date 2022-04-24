
package mis;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Teo extends User{
   
    private String department;
    
    public Teo(String user_id, String first_name, String last_name, String email, String contact_no, String dob, String address,String department) {
        super(user_id, first_name, last_name, email, contact_no, dob, address);
        this.department = department;
    }
   
    
     public void set_department(String department){
        this.department = department;
    }
    
     public String get_department(){
        return this.department;
    }
    
     
    
     
    public ResultSet get_all_students(){
    
        ResultSet res = null;
        
         String get_stuQ = "SELECT `user_id` FROM `user` WHERE `post` = 'stu' ";
            
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(get_stuQ);      
            res = qstate.executeQuery();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    
        return res;
    }
     
     
    
    public ResultSet get_all_subjects(){
    
        ResultSet res = null;
        
         String get_subQ = "SELECT `sub_code` FROM `subject`";
            
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(get_subQ);      
            res = qstate.executeQuery();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    
        return res;
    }
     
     
    
    public boolean add_attendance(String selected_stu_id, String selected_subject, String str_adate, int theory, int Practical){
    
        boolean added = false;
    
        String add_attendanceQ = "INSERT INTO `attendance`(`a_stu_id`, `a_sub_id`, `a_date`, `a_theory`, `a_practical`) VALUES ('"+selected_stu_id+"','"+selected_subject+"','"+str_adate+"','"+theory+"','"+Practical+"')";
        
        
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(add_attendanceQ);      
            qstate.execute();
            
            added = true;
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return added;
    }
    
    
    public ResultSet get_attendance(String sub_id, String date){
    
        ResultSet res =  null;
    
        String get_aQ = "SELECT `a_stu_id` as `Student ID`, `a_theory` as `Theory`, `a_practical` as `Practical` FROM `attendance` WHERE  `a_sub_id`= '"+sub_id+"' AND `a_date`= '"+date+"'";
        
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(get_aQ);      
            res = qstate.executeQuery();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
       
        return res;
    }
    
    
    
     public ResultSet get_one_student_attend(String stu_id,String sub_id, String date){
    
        ResultSet res =  null;
    
        String get_aQ = "SELECT `a_theory` , `a_practical`  FROM `attendance` WHERE `a_stu_id`='"+stu_id+"' AND `a_sub_id`= '"+sub_id+"' AND `a_date`= '"+date+"'";
        
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(get_aQ);      
            res = qstate.executeQuery();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
       
        return res;
    }
    
    
     
     public boolean update_attendance(String stu_id,String sub_id, String date, int t, int p){
     
         boolean updated = false;
         
          String update_aQ = "UPDATE `attendance` SET `a_theory`= " + t + ",`a_practical`= " + p + " WHERE  `a_stu_id`='"+stu_id+"' AND `a_sub_id`= '"+sub_id+"' AND `a_date`= '"+date+"'";
          
          System.out.println(update_aQ);
          
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(update_aQ);      
            qstate.execute();
            updated = true;
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
     
         return updated;
     }
     

     
      public boolean delete_attendance(String stu_id,String sub_id, String date){
     
         boolean delete = false;
         
          String update_aQ = "DELETE FROM `attendance` WHERE  `a_stu_id`='"+stu_id+"' AND `a_sub_id`= '"+sub_id+"' AND `a_date`= '"+date+"'";
          
          System.out.println(update_aQ);
          
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(update_aQ);      
            qstate.execute();
            delete = true;
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
     
         return delete;
     }
     
     
     
      
      public boolean add_medical(String selected_stu_id, String selected_subject, String str_adate, int theory, int Practical){
    
        boolean added = false;
    
        String add_attendanceQ = "INSERT INTO `medical` (`m_stu_id`, `m_sub_id`, `m_date`, `m_theory`, `m_practical`) VALUES ('"+selected_stu_id+"','"+selected_subject+"','"+str_adate+"','"+theory+"','"+Practical+"')";
        
        
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(add_attendanceQ);      
            qstate.execute();
            
            added = true;
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return added;
    }
    
      
      
     public ResultSet get_medicals(String search){
     
         ResultSet res = null;
         String get_mQ;
         
            if (!"".equals(search))
                get_mQ = "SELECT `m_stu_id` as `Student ID`, `m_sub_id` as `Subject ID`, `m_date` as `Date`, `m_theory` as `Theory`, `m_practical` as `Practical` FROM `medical` WHERE `m_stu_id` LIKE '%"+search+"%' OR `m_sub_id` LIKE '%"+search+"%' OR `m_date` LIKE '%"+search+"%'";
            else
                get_mQ = "SELECT `m_stu_id` as `Student ID`, `m_sub_id` as `Subject ID`, `m_date` as `Date`, `m_theory` as `Theory`, `m_practical` as `Practical` FROM `medical`";
            
        
            PreparedStatement qstate;
            try {

                qstate = (PreparedStatement) con.prepareStatement(get_mQ);      
                res = qstate.executeQuery();

            } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
            }
         
         return res;
     }
      
      
     
    public boolean delete_medical(String stu_id,String sub_id, String date){
    
        boolean deleted = false;
        
         String update_aQ = "DELETE FROM `medical` WHERE  `m_stu_id`='"+stu_id+"' AND `m_sub_id`= '"+sub_id+"' AND `m_date`= '"+date+"'";
          
          System.out.println(update_aQ);
          
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(update_aQ);      
            qstate.execute();
            deleted = true;
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return deleted;
    }
     
}
