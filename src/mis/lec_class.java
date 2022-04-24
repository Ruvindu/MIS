
package mis;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
//import mis.Inte.main;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SAMPATH
 */
public class lec_class {
    
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        
    void pwd_chg(String current_pwd,String new_pwd_1,String new_pwd_2,String id){
        
        /*byte[] byte_current = current_pwd.getBytes();
        byte[] byte_New = new_pwd_2.getBytes();
        
        Encrypt e = new Encrypt();
        String enctrypted_current_pwd = e.MD5(byte_current, "md5");
        String encrypted_new_pwd = e.MD5(byte_New, "md5");*/
        
        conn=DBconnection.connect();
        try{
            st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * from user where user_id='"+id+"'");
            if(rs.next()){
                String pwd=rs.getString("password");

                if(current_pwd.equals(pwd)){
                    if(new_pwd_1.equals(new_pwd_2)){
                        st.executeUpdate("UPDATE user set password='"+new_pwd_1+"' WHERE user_id='"+id+"'");
                        JOptionPane.showMessageDialog(null, "PASSWORD UPDATE SUCCESSFUL");
                    }else{
                        JOptionPane.showMessageDialog(null,"New Password not match");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid current Password");
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void edit_p(String N_name,String N_email,String phone_nu,String id){
        conn=DBconnection.connect();
        try{
             st=conn.createStatement();
            String sql="UPDATE user set first_name='"+N_name+"', email='"+N_email+"',phone='"+phone_nu+"'  WHERE user_id='"+id+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Update Successfully");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    void add_ass_mark(String sub,int Ass_no,String st_id,int mark){
        conn=DBconnection.connect();
        if(null != sub){

            switch (sub) {
                case "ICT12": sub="a_ict12";
                break;
                case "ICT13":sub="a_ict13";
                break;
                default:
                break;
            }
        }
        
        //assing tbale name
        String tb=null;
        switch (Ass_no) {
            case 1:tb="A2";
            break;
            case 2: tb="A3";
            break;
            default:
            break;
        }
        
        if(!"".equals(st_id)){
            if(Ass_no==0){
                try {
                    st=conn.createStatement();
                    String ass_mark_add="INSERT INTO " + sub + " (st_id,A1) VALUES ('"+st_id+"','"+mark+"')";
                    st.executeUpdate(ass_mark_add);
                    JOptionPane.showMessageDialog(null,"Mark Addded Success");
                    /*a_st_id.setText("");
                    ass_mark.setText("");*/

                } catch (SQLException ex) {
                    //Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"Errorrrrrrrrr");
                }
            }else{
                try {
                    st=conn.createStatement();
                    String ass_mark_add="UPDATE " + sub + " set " + tb + "='"+mark+"' where st_id='"+st_id+"'";
                    st.executeUpdate(ass_mark_add);
                    JOptionPane.showMessageDialog(null,"Mark Addded Success");
                    /*a_st_id.setText("");
                    ass_mark.setText("");*/
                } catch (SQLException ex) {
                     //Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    //JOptionPane.showMessageDialog(null,"Error");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Enter details");
        }
    }
    
    void add_quze_mark(String sub,int q_no,String st_id,int mark){
        conn=DBconnection.connect();
        
        if(sub=="ICT22"){
             switch (sub){
                 case "ICT22":sub="q_ict22";
                    break;
                default:break;
        }
        String tb=null;
        switch (q_no) {
            case 1:tb="Q2";
            break;
            case 2:tb="Q3";
            break;
            case 3:tb="Q4";
            break;
            default:
            // throw new AssertionError();
            System.out.println("er");
        }
          
        if(q_no==0){
            String sql="INSERT INTO " + sub + " (st_id,Q1) VALUES ('"+st_id+"','"+mark+"')";
            try {
                st=conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Mark Add Success");
                /*q_mark2.setText("");
                st_id_q2.setText("");*/
            } catch (SQLException ex) {
                
            }
        }else{
            
            try {
                st=conn.createStatement();
                String insert_q_mark="UPDATE " + sub + " set " + tb + "='"+mark+"' where st_id='"+st_id+"' ";
                st.executeUpdate(insert_q_mark);
                JOptionPane.showMessageDialog(null,"Mark Addded Success");
                /*st_id_q2.setText("");
                q_mark2.setText("");*/
            } catch (SQLException ex) {
                
            }
        }
       }else{
           switch (sub){
            case "ICT12":sub="q_ict12";
            break;
            case "ICT13":sub="q_ict13";
            break;
            case "ICT14":sub="q_ict14";
            break;
            case "ET11":sub="q_et11";
            break;
            case "ET12":sub="q_et12";
            break;
        }
        String tb=null;
        switch (q_no) {
            case 1:tb="Q2";
            break;
            case 2:tb="Q3";
            break;
            default:
            //throw new AssertionError();
        }
        if(q_no == 0){
            try {
                 st=conn.createStatement();
                String insert_q_mark="INSERT INTO " + sub + " (st_id,Q1) VALUES('"+st_id+"','"+mark+"')";
                st.executeUpdate(insert_q_mark);
                JOptionPane.showMessageDialog(null,"Mark Addded Success");
                /*st_id_q1.setText("");
                mark_q1.setText("");*/
            } catch (SQLException ex) {
                //Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erro");
            }
        }else{
            try {
                 st=conn.createStatement();
                String insert_q_mark="UPDATE " + sub + " set " + tb + "='"+mark+"' where st_id='"+st_id+"' ";
                st.executeUpdate(insert_q_mark);
                JOptionPane.showMessageDialog(null,"Mark Addded Success");
                /*st_id_q1.setText("");
                mark_q1.setText("");*/
            } catch (SQLException ex) {
               
            }
        }
        }
    }
    
    void add_mid_mark(String sub,int mark_p,String s_id, int mark){
        conn=DBconnection.connect();
        if(!"".equals(s_id)&&(!"".equals(mark))&&(!"".equals(mark_p))){
            try {
                switch (sub) {
                    case "ICT14":sub="m_ict14";
                    break;
                    case "ICT22":sub="m_ict22";
                    break;
                    case "ET12":sub="m_et12";
                    break;
                    default:
                    throw new AssertionError();
                }
                st=conn.createStatement();
                String insert_mid_mark="INSERT INTO " + sub + " (st_id,m_mark,m_p_mark) VALUES ('"+s_id+"','"+mark+"','"+mark_p+"')";
                st.executeUpdate(insert_mid_mark);
                JOptionPane.showMessageDialog(null,"Mark Add success.");
               /* st_id_5.setText("");
                m_mark.setText("");
                m_mark_p.setText("");*/
            } catch (SQLException ex) {
               
            }

        }else{
            JOptionPane.showMessageDialog(null,"Invalide data");
        }
    }
    
    void add_final_mark(String sub,int mark,String st_id){
        conn=DBconnection.connect();
        if(!"".equals(st_id)&&(!"".equals(mark))){
            try {
                switch (sub) {
                    case "ICT12 Theory":sub="final_t_ict12";
                    break;
                    case "ICT13 Theory":sub="final_t_ict13";
                    break;
                    case "ICT14 Theory":sub="final_t_ict14";
                    break;
                    case "ICT22 Theory":sub="final_t_ict22";
                    break;
                    case "ET12 Theory":sub="final_t_et12";
                    break;
                    case "ET11 Theory":sub="final_t_et11";
                    break;
                    case "ICT12 Practicle":sub="final_p_ict12";
                    break;
                    case "ICT13 Practicle":sub="final_p_ict13";
                    break;
                    case "ICT14 Practicle":sub="final_p_ict14";
                    break;
                    case "ET12 Practicle":sub="final_p_et12";
                    break;
                    case "ET11 Practicle":sub="final_p_et11";
                    break;
                    default:
                    throw new AssertionError();
                }
                st=conn.createStatement();
                String insert_final_mark="INSERT INTO " + sub + " (st_id,f_mark) VALUES('"+st_id+"','"+mark+"')";
                st.executeUpdate(insert_final_mark);
                JOptionPane.showMessageDialog(null,"Mark Add success.");
                /*f_st_id.setText("");
                f_mark.setText("");*/
            } catch (SQLException ex) {
               
            }
        }
    }
    
    
}