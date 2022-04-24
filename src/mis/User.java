
package mis;

import com.mysql.jdbc.PreparedStatement;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class User {
    
    private String user_id;
    private String ﬁrst_name;
    private String last_name;
    private String email;
    private String contact_no;
    private String dob;
    private String address;
    //private String password;
    //private ImageIcon image;
    
    public Connection con = null;
    
    
    User(String user_id, String first_name, String last_name, String email, String contact_no, String dob, String address){
        this.user_id = user_id; 
        this.ﬁrst_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.contact_no = contact_no;
        this.dob = dob;
        this.address = address;
        //this.password = password;
        //this.image = image;
        
        this.con = DBconnection.connect();
    }
    
    /* Set data*/
    
    public void set_f_name(String first_name){
        this.ﬁrst_name = first_name;
    }
    
    public void set_l_name(String last_name){
        this.last_name = last_name;
    }
    
    public void set_email(String email){
        this.email = email;
    }
    
    public void set_phone(String phone){
        this.contact_no = phone;
    }
    
    public void set_dob(String dob){
        this.dob = dob;
    }
    
    public void set_address(String address){
        this.address = address;
    }
    
    /* void set_password(String password){
        this.password = password;
    }*/
     
    /*public void set_img(ImageIcon image){
        this.image = image;
    }*/
     
     /* Get data */ 
    
    public String get_id(){
        return this.user_id;
    }
     
    public String get_f_name(){
        return this.ﬁrst_name;
    }
    
    public String get_l_name(){
        return this.last_name;
    }
    
    public String get_email(){
        return this.email;
    }
    
    public String get_phone(){
        return this.contact_no;
    }
    
    public String get_dob(){
        return this.dob;
    }
    
    public String get_address(){
        return this.address;
    }
    
    /*String get_password(){
        return this.password;
    }*/
     
    /*public String get_img(){
        return this.image;
    }*/
    
  public boolean edit_profile(String ui,String fn, String ln, String email, String phn, String address, String dob){
  
    boolean edited = false;
  
    String edit_userQ = "UPDATE `user` SET `first_name`='"+fn+"',`last_name`='"+ln+"',`email`='"+email+"',`phone`='"+phn+"',`address`='"+address+"',`dob`='"+dob+"' WHERE `user_id` = '"+ui+"'";
        
        PreparedStatement qstate; 
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(edit_userQ);      
            qstate.execute();
            edited=true;
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    
    return edited;
  }   
   
  
  public boolean change_pwd(String Uid, String enc_current_pwd, String enc_new_pwd){
      
      boolean changed = false;
  
        String get_current_pwdQ = "SELECT password FROM `user` WHERE user_id = '"+Uid+"'";
        
        
        PreparedStatement qstate;
        ResultSet res=null;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(get_current_pwdQ);      
            res = qstate.executeQuery();
            
             /*Check current pwd is valid of not*/
            if(res.next()){
                
                if(enc_current_pwd.equals(res.getString("password"))){
                    
                    /*Set new password*/
                    String Update_pwdQ = "UPDATE `user` SET `password`='"+enc_new_pwd+"' WHERE user_id='"+Uid+"'";
                    
                   // PreparedStatement qstate; 
                    try {

                        qstate = (PreparedStatement) con.prepareStatement(Update_pwdQ);      
                        qstate.execute();
                        changed=true;

                    } catch (Exception e) {
                       JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid current password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
      
      return changed;
  }
  
   
  
  
  public boolean change_profile_image(String Uid,FileInputStream img){
  
      boolean changed = false;
      
      //InputStream img = FileInputStream(new File(tmpimgpath));
      
      
      String chng_imgQ = "UPDATE `user` SET `image`= ? WHERE `user_id` = ?";
      
       PreparedStatement qstate; 
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(chng_imgQ);
            qstate.setBlob(1, img);
            qstate.setString(2, Uid);
            qstate.execute();
            changed=true;
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
  
      
      return changed;
  } 
     
     
  
  public ImageIcon get_image(String Uid){
  
        ImageIcon ico = null;
        ResultSet res=null;
        
        String get_imgQ = "SELECT `image` FROM `user` WHERE `user_id` = '"+Uid+"'";
          
        PreparedStatement qstate;
        
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(get_imgQ);      
            res = qstate.executeQuery();
            
            if(res.next()){
               
                byte[] bimg = res.getBytes("image");
                ImageIcon image = new ImageIcon(bimg);
                
                if(bimg.length!=0)
                    ico = image;
                else
                    ico = null;

            }
        }catch(Exception e){
            
        }
        return ico;
  }
  
  
  
   public ResultSet view_notice(){
        
        ResultSet res=null;
    
        String view_noticeQ = "SELECT `notice_id`, `topic`, `date`, `notice` FROM `notice`";
        
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(view_noticeQ);      
            res = qstate.executeQuery();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return res;
    }
    
   
  
}
 