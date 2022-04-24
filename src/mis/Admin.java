
package mis;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Admin extends User {
    
    public Admin(String user_id, String first_name, String last_name, String email, String contact_no, String dob, String address) {
        super(user_id, first_name, last_name, email, contact_no, dob, address);
    }
    
    
    /* Add new user */
    
    public boolean add_user(String user_id, String post, String department, String first_name, String last_name, String email, String phone, String address, String dob, byte[] password){

        Encrypt e = new Encrypt();
        String encrypted_pwd = e.MD5(password, "md5");
        
        
        String insertQ = "INSERT INTO `user`(`user_id`, `post`, `department`, `first_name`, `last_name`, `email`, `phone`, `address`, `dob`, `password`)"
                + " VALUES ( '" + user_id + "' , '" + post + "' , " + department + ", '" + first_name + "', '" + last_name + "' , '" + email + "' , '" + phone + "' , '" + address + "' , '" + dob + "' , '" + encrypted_pwd + "')"  ;
        
       
        
        PreparedStatement qstate;
       
        boolean returnval = false;
        try {
           qstate = (PreparedStatement) con.prepareStatement(insertQ);      
           
           /*Confirm and added one row*/
           qstate.execute();
                JOptionPane.showMessageDialog(null,"Successfully added one user.");
                returnval = true;
           
                  
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
       }

        return returnval;
    }
    
    
    /* View users */
    
    public ResultSet view_users(int type, String dept, String search){
    
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
        
        /* Filter by User type */
        
        if(type==1){
           t = "`post`='admin'";
           d = "1";
        }else if(type==2){
            t = "`post`='lec'";
        }else if(type==3){
            t = "`post`='teo'";
        }else if(type==4){
            t = "`post`='stu'";
        }else{
            t = "1";
        }
        
        if(!"".equals(search)){
            viewQ = "SELECT `user_id` as `User ID`, `post` as `Post`, `department` as `Department`, `first_name` as `First name`, `last_name` as `Last name`, `email` as `Email`, `phone` as `Phone`, `address` as `Address`, `dob` as `Birthday` FROM `user` WHERE " + t + " AND  " + d + " AND first_name LIKE '%" + search + "%' OR last_name LIKE '%" + search + "%' OR user_id LIKE '%" + search + "%' " ;
        }
        else{
            viewQ = "SELECT `user_id` as `User ID`, `post` as `Post`, `department` as `Department`, `first_name` as `First name`, `last_name` as `Last name`, `email` as `Email`, `phone` as `Phone`, `address` as `Address`, `dob` as `Birthday`   FROM `user` WHERE " + t + " AND  " + d + " ";
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
    
    
    /* Delete user */
    
    public boolean delete_user(String user_id){
        
        String deleteQ = " DELETE FROM `user` WHERE user_id='" + user_id +"'";
        //System.out.println(deleteQ);
        
        PreparedStatement qstate;
        
        boolean returnval = false;
        try {
           qstate = (PreparedStatement) con.prepareStatement(deleteQ);      
           
            int confirm = JOptionPane.showConfirmDialog(null, "Are you Sure want to delete this row.");

            /*Confirm and delete one row*/
            if(confirm==0){
                qstate.execute();
                returnval = true;
            }
            
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
       }
    
       return returnval;
    }
    
    
    /*Get selected user for update*/
    
    public ResultSet get_selected_user_info(String user_id){
        
        ResultSet res = null;
        
        String user_infoQ = "SELECT `user_id`, `post`, `department`, `first_name`, `last_name`, `email`, `phone`, `address`, `dob` FROM `user` WHERE `user_id` = '" + user_id + "'";
            
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(user_infoQ);      
            res = qstate.executeQuery();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return res;
    }
    
    
    
    /*Update user*/
    public boolean update_user(String uui,int upst,String ud, String ufn, String uln, String uphn, String umail, String uadrs, String udob, String upwd){
    
        boolean updated=false;
        String update_userQ;
        String udept;
        
        if(upst==0)
            udept = "NULL";
        else
            udept = "'"+ud+"'";
        
        if(!"".equals(upwd)){
            
            /*Convert to bytes*/
            byte[] byte_pwd = upwd.getBytes();
            /*Encrypt pwd*/
            Encrypt e = new Encrypt();
            String uencrypted_pwd = e.MD5(byte_pwd, "md5");
            
            update_userQ = "UPDATE `user` SET `department`=" + udept + " ,`first_name`='"+ufn+"',`last_name`='"+uln+"',`email`='"+umail+"',`phone`='"+uphn+"',`address`='"+uadrs+"',`dob`='"+udob+"',`password`='"+uencrypted_pwd+"' WHERE `user_id` = '"+uui+"'";
        }else
            update_userQ = "UPDATE `user` SET `department`=" + udept + " ,`first_name`='"+ufn+"',`last_name`='"+uln+"',`email`='"+umail+"',`phone`='"+uphn+"',`address`='"+uadrs+"',`dob`='"+udob+"' WHERE `user_id` = '"+uui+"'";
        
        
        
         PreparedStatement qstate;
         
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(update_userQ);      
            qstate.execute();
            updated=true;
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return updated;
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
   
   
    public boolean add_subject(String s_code, String s_name, String s_dept, float s_credit, String s_lec,int t,int p){
    
        boolean added = false;
    
        
        String add_subQ = "INSERT INTO `subject`(`sub_code`, `sub_name`, `sub_dept`, `conducting_by`, `credit`, `theory`, `practical`) VALUES ('"+s_code+"','"+s_name+"','"+s_dept+"','"+s_lec+"',"+s_credit+","+t+","+p+")";
        
        //System.out.println(add_subQ);
        
        PreparedStatement qstate;
       
        try {
           qstate = (PreparedStatement) con.prepareStatement(add_subQ);      
           
           /*Confirm and added one row*/
           qstate.execute();
                JOptionPane.showMessageDialog(null,"Successfully added one subject.");
                added = true;
           
                  
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
       }
        
        return added;
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
    
    
    
    public boolean update_subject(String s_code, String s_name, String s_dept, float s_credit, String s_lec,int t,int p){
    
        boolean updated = false;
        
        String update_subQ = "UPDATE `subject` SET `sub_code`='"+s_code+"',`sub_name`='"+s_name+"',`sub_dept`='"+s_dept+"',`conducting_by`= '"+s_lec+"',`credit`="+s_credit+",`theory`= "+t+" ,`practical`= "+p+" WHERE `sub_code` = '"+s_code+"'";
   
        PreparedStatement qstate;
         
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(update_subQ);      
            qstate.execute();
            updated=true;
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    
        return updated;
    }
    
    
    public boolean delete_subject(String sub_id){
    
        boolean deleted = false;
        
        String delete_subQ = "DELETE FROM `subject` WHERE `sub_code` = '"+sub_id+"'";
        
        PreparedStatement qstate;
         
        try {
            
            int del = JOptionPane.showConfirmDialog(null,"Are you sure want to delete this.");
            
            if(del==0){

                qstate = (PreparedStatement) con.prepareStatement(delete_subQ);      
                qstate.execute();
                deleted=true;
            }
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
                
        return deleted; 
    }
    
    
    public boolean create_notice(String n_topic, String n_date, String n_notice){
    
        boolean uploaded = false;
        
        String create_notice = "INSERT INTO `notice`( `topic`, `date`, `notice`) VALUES ('"+n_topic+"','"+n_date+"','"+n_notice+"')";
        
        PreparedStatement qstate;
       
        try {
           qstate = (PreparedStatement) con.prepareStatement(create_notice);      
           
           /*Upload new notice */
           qstate.execute();
                JOptionPane.showMessageDialog(null,"Successfully Uploaded notice.");
                uploaded = true;
           
                  
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
       }
        
        return uploaded;
    }
    
    
    public boolean delete_notice(int n_id){
    
        boolean deleted = false;
       
           
        String delete_notjceQ = "DELETE FROM `notice` WHERE `notice_id` = "+ n_id+ "";
        
        PreparedStatement qstate;
         
        try {
            
            int del = JOptionPane.showConfirmDialog(null,"Are you sure want to delete this notice.");
            
            if(del==0){

                qstate = (PreparedStatement) con.prepareStatement(delete_notjceQ);      
                qstate.execute();
                deleted=true;
            }
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        return deleted;
    }
 
    
    public boolean create_new_time_table(String name, String dept, String tt[][]){
        
        boolean created = false; 
    
        String create_ttQ = "CREATE TABLE `"+name+"`(time_period varchar(100), mon varchar(255), tue varchar(255), wen varchar(255), thu varchar(255), fri varchar(255))";
        
        PreparedStatement qstate;
         
        try {

            qstate = (PreparedStatement) con.prepareStatement(create_ttQ);      
            qstate.execute();
            
            
            try{
                
                for(int row = 0; row<9; row++){
                   
                    String insert_tQ = "INSERT INTO `"+name+"` (`time_period`, `mon`, `tue`, `wen`, `thu`, `fri`) VALUES ('"+ tt[row][0] + "','"+ tt[row][1] + "','"+ tt[row][2] + "','"+ tt[row][3] + "','"+ tt[row][4] + "','"+ tt[row][5] + "')" ;
                
                    qstate = (PreparedStatement) con.prepareStatement(insert_tQ);      
                    qstate.execute();
                }
                
                String insert_new_ttQ = "INSERT INTO `time_tables`(`department`, `t_name`) VALUES ('"+dept+"','"+name+"')";
                qstate = (PreparedStatement) con.prepareStatement(insert_new_ttQ);      
                qstate.execute();
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
    
       return created;
    }
    
    
    
    
    public ResultSet get_saved_timetables(){
    
        ResultSet tt_result = null;
    
            String get_ttQ = "SELECT `t_name` FROM `time_tables`";
            
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(get_ttQ);      
            tt_result = qstate.executeQuery();

        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return tt_result;
    }
    
    
    
    public ResultSet get_selected_timetable(String name){
    
        ResultSet res = null;
    
                String get_ttQ = "SELECT * FROM `"+name+"`";
            
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(get_ttQ);      
            res = qstate.executeQuery();

        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return res;
    }
    
    
}
  
