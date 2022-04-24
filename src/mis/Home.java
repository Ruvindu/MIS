
package mis;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Home extends javax.swing.JFrame {

   public Login login_form;
   
   /* Initializ db connection and variables*/
   public Connection con = null;
   
   private String selected_user = null;
   private String selected_subject = null;
   
   /*Var for attendance*/
   private String now_showing_subid = null;
   private String now_showing_strdate = null;
   
    /*Var for medicals*/
   private String now_selected_subid = null;
   private String now_selected_strdate = null;
   
   
   /* Initializ users */
   public String my_id = null;
   public String user_post = null;
   
   public Admin admin_class = null;
   public Lec lec_class = null;
   public Teo teo_class = null;
  
    
   public Home(){
       initComponents();
       
       /*If user not found exit from system */
      JOptionPane.showMessageDialog(null, "User not found, System is going to exit.", "Error", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
   }
   
   
    public Home(String user_id,String user_post) {
        initComponents();
        
        init_user(user_id,user_post);
        
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        dynamic_2.add(user_profile);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        load_profile();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        dynamic_2 = new javax.swing.JPanel();
        user_profile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        user_id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        post = new javax.swing.JLabel();
        department = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        edit_profile = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        edit_ln = new javax.swing.JTextField();
        edit_fn = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        edit_email = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        edit_address = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        edit_phone = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        apply = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        edit_dob = new com.toedter.calendar.JDateChooser();
        create_user = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        Post_ComboBox = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        UserId_back_TextField = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        F_name_TextField = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        L_name_TextField = new javax.swing.JTextField();
        Phone_TextField = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Address_TextField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        Create_an_user = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        pwd_PasswordField = new javax.swing.JPasswordField();
        jLabel38 = new javax.swing.JLabel();
        Email_Text_Field = new javax.swing.JTextField();
        Department_ComboBox = new javax.swing.JComboBox<>();
        UserId_front_TextField = new javax.swing.JTextField();
        Dob_DateChooser = new com.toedter.calendar.JDateChooser();
        view_users = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        Search_TextField = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        User_Table = new javax.swing.JTable();
        Delete_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        UType_ComboBox = new javax.swing.JComboBox<>();
        Dept_ComboBox = new javax.swing.JComboBox<>();
        update_user = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        UPost_ComboBox = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        UUser_id_TextField = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        UFirst_name_TextField = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        UlLast_name_TextField = new javax.swing.JTextField();
        UPhone_TextField = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        UAddress_TextField = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        UPWD_PasswordField = new javax.swing.JPasswordField();
        jLabel81 = new javax.swing.JLabel();
        UEmail_TextField = new javax.swing.JTextField();
        UDepartment_ComboBox = new javax.swing.JComboBox<>();
        Back1 = new javax.swing.JButton();
        UDob_DateChooser = new com.toedter.calendar.JDateChooser();
        UReset_pwd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        create_subject = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        sub_code = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        credits = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        sub_dept = new javax.swing.JComboBox<>();
        sub_name = new javax.swing.JTextField();
        theory_check = new javax.swing.JCheckBox();
        practical_check = new javax.swing.JCheckBox();
        create_a_course = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        con_lec_id = new javax.swing.JComboBox<>();
        view_subjects = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        subject_search_bar = new javax.swing.JTextField();
        search_sub = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Subject_Table = new javax.swing.JTable();
        delete_sub = new javax.swing.JButton();
        edit_sub = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        sub_department = new javax.swing.JComboBox<>();
        edit_subject = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        e_sub_code = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        e_credits = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        e_sub_dept = new javax.swing.JComboBox<>();
        e_sub_name = new javax.swing.JTextField();
        e_theory = new javax.swing.JCheckBox();
        e_practical = new javax.swing.JCheckBox();
        save_subject = new javax.swing.JButton();
        back_to_view_sub = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        e_con_lec = new javax.swing.JComboBox<>();
        change_image = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        save_image = new javax.swing.JButton();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        display_picture = new javax.swing.JLabel();
        change_pwd = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        current_pwd = new javax.swing.JPasswordField();
        new_pwd = new javax.swing.JPasswordField();
        confirm_pwd = new javax.swing.JPasswordField();
        apply_pwd = new javax.swing.JButton();
        jLabel160 = new javax.swing.JLabel();
        create_notice = new javax.swing.JPanel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        submit_notice = new javax.swing.JButton();
        jLabel165 = new javax.swing.JLabel();
        notice_dateChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        notices_TextArea = new javax.swing.JTextArea();
        notice_topic = new javax.swing.JTextField();
        view_notice = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        view_notice_DateChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        view_notice_TextArea = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        notices_table = new javax.swing.JTable();
        delete_notice = new javax.swing.JButton();
        view_notice_topic = new javax.swing.JTextField();
        about = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        create_timetable = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        t_tabel_name = new javax.swing.JTextField();
        t_table_department = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        new_time_table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        view_timetable = new javax.swing.JPanel();
        jLabel187 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        view_time_table = new javax.swing.JTable();
        jLabel196 = new javax.swing.JLabel();
        select_tt = new javax.swing.JComboBox<>();
        mark_attendance = new javax.swing.JPanel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sub_idComboBox = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        a_date = new com.toedter.calendar.JDateChooser();
        attendance_add = new javax.swing.JButton();
        stu_idComboBox = new javax.swing.JComboBox<>();
        theory_CheckBox = new javax.swing.JCheckBox();
        practical_CheckBox = new javax.swing.JCheckBox();
        update_attendance = new javax.swing.JPanel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        attendance_update = new javax.swing.JButton();
        update_theoryCheckBox = new javax.swing.JCheckBox();
        update_practicalCheckBox = new javax.swing.JCheckBox();
        back_to_view_attendance = new javax.swing.JButton();
        update_attendance_stuid = new javax.swing.JTextField();
        update_attendance_subid = new javax.swing.JTextField();
        update_attendance_date = new javax.swing.JTextField();
        view_attendance = new javax.swing.JPanel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        a_date_for_view = new com.toedter.calendar.JDateChooser();
        sub_id_for_viewComboBox = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        view_attendance_table = new javax.swing.JTable();
        edit_attendance = new javax.swing.JButton();
        view_attend = new javax.swing.JButton();
        delete_attendance = new javax.swing.JButton();
        current_attendance = new javax.swing.JLabel();
        submit_medicals = new javax.swing.JPanel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        sub_id_for_medical = new javax.swing.JComboBox();
        jLabel119 = new javax.swing.JLabel();
        m_date = new com.toedter.calendar.JDateChooser();
        submit_medical = new javax.swing.JButton();
        stu_id_for_medical = new javax.swing.JComboBox<>();
        m_theory = new javax.swing.JCheckBox();
        m_practical = new javax.swing.JCheckBox();
        view_medicals = new javax.swing.JPanel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        view_medical_table = new javax.swing.JTable();
        delete_medical = new javax.swing.JButton();
        search_medicalTextbox = new javax.swing.JTextField();
        search_medical = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        profile_menu = new javax.swing.JMenu();
        view_profile_sm = new javax.swing.JMenuItem();
        edit_myprofile_sm = new javax.swing.JMenuItem();
        change_dp_sm = new javax.swing.JMenuItem();
        change_mypwd_sm = new javax.swing.JMenuItem();
        user_menu = new javax.swing.JMenu();
        create_an_user_sm = new javax.swing.JMenuItem();
        view_user_sm = new javax.swing.JMenuItem();
        course_menu = new javax.swing.JMenu();
        create_course_sm = new javax.swing.JMenuItem();
        maintain_cource_sm = new javax.swing.JMenuItem();
        attendance_menu = new javax.swing.JMenu();
        mark_attendance_sm = new javax.swing.JMenuItem();
        view_attendance_sm = new javax.swing.JMenuItem();
        medicals_menu = new javax.swing.JMenu();
        submit_medicals_sm = new javax.swing.JMenuItem();
        view_edit_medicals_sm = new javax.swing.JMenuItem();
        marks_menu = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        timetable_menu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        notice_menu = new javax.swing.JMenu();
        upload_notice_sm = new javax.swing.JMenuItem();
        view_and_maintain_notice_sm = new javax.swing.JMenuItem();
        more_menu = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();

        jMenu10.setText("File");
        jMenuBar2.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar2.add(jMenu11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management Information System");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        dynamic_2.setBackground(new java.awt.Color(255, 255, 255));
        dynamic_2.setLayout(new java.awt.CardLayout());

        user_profile.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel3.setText("Management Information System");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Faculty Of Technology");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("University Of Ruhuna");

        dp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("User ID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Post");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Department");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Phone");

        user_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_id.setForeground(new java.awt.Color(102, 102, 102));
        user_id.setText(" ");
        user_id.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                user_idAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText(" ");

        post.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        post.setForeground(new java.awt.Color(102, 102, 102));
        post.setText(" ");

        department.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        department.setForeground(new java.awt.Color(102, 102, 102));
        department.setText(" ");

        phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(102, 102, 102));
        phone.setText(" ");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setText("Email");

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText(" ");

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel116.setText("Birth day");

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel117.setText("Address");

        dob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dob.setForeground(new java.awt.Color(102, 102, 102));
        dob.setText(" ");

        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address.setForeground(new java.awt.Color(102, 102, 102));
        address.setText(" ");

        javax.swing.GroupLayout user_profileLayout = new javax.swing.GroupLayout(user_profile);
        user_profile.setLayout(user_profileLayout);
        user_profileLayout.setHorizontalGroup(
            user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_profileLayout.createSequentialGroup()
                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(user_profileLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(dp))
                    .addGroup(user_profileLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel117, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(user_profileLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)))
                            .addGroup(user_profileLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(user_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(post, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(department, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                    .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        user_profileLayout.setVerticalGroup(
            user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_profileLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(user_profileLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)))
                .addGap(37, 37, 37)
                .addComponent(dp)
                .addGap(28, 28, 28)
                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(user_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(post))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(department))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(dob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(user_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(address))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(user_profile, "card2");

        edit_profile.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel18.setText("Management Information System");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Faculty Of Technology");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("University Of Ruhuna");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("First name");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Last name");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Email");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Address");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Phone");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Birthday");

        apply.setText("Apply changes");
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("Edit Profile");

        javax.swing.GroupLayout edit_profileLayout = new javax.swing.GroupLayout(edit_profile);
        edit_profile.setLayout(edit_profileLayout);
        edit_profileLayout.setHorizontalGroup(
            edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_profileLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_profileLayout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(edit_profileLayout.createSequentialGroup()
                        .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(edit_profileLayout.createSequentialGroup()
                                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edit_phone)
                                    .addComponent(edit_address)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_profileLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(edit_email, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edit_ln)
                                    .addComponent(edit_fn)
                                    .addComponent(edit_dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
                            .addGroup(edit_profileLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))))
                        .addGap(94, 94, 94)))
                .addComponent(jLabel36))
        );
        edit_profileLayout.setVerticalGroup(
            edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_profileLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(edit_profileLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel19)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel20)))
                .addGap(34, 34, 34)
                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(jLabel21))
                .addGap(25, 25, 25)
                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(edit_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(edit_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(edit_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(edit_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apply)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(edit_profile, "card3");

        create_user.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel52.setText("Management Information System");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("Faculty Of Technology");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setText("University Of Ruhuna");

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR2.png"))); // NOI18N

        Post_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Lecture", "Technical officer", "Student" }));
        Post_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Post_ComboBoxActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("User ID");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Department");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Frist name");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Last name");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Phone");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Address");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Birthday");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("Create an user");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Post");

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add User.png"))); // NOI18N

        Create_an_user.setText("Create");
        Create_an_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_an_userActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Passsword");

        pwd_PasswordField.setText("12345");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Email");

        Department_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "ET", "BST" }));

        UserId_front_TextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserId_front_TextField.setText("admin");
        UserId_front_TextField.setEnabled(false);

        Dob_DateChooser.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout create_userLayout = new javax.swing.GroupLayout(create_user);
        create_user.setLayout(create_userLayout);
        create_userLayout.setHorizontalGroup(
            create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, create_userLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_userLayout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54))
                        .addGap(356, 356, 356))
                    .addGroup(create_userLayout.createSequentialGroup()
                        .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(create_userLayout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel43)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(create_userLayout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(Post_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UserId_front_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserId_back_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(create_userLayout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(273, 273, 273)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Address_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(create_userLayout.createSequentialGroup()
                                .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(create_userLayout.createSequentialGroup()
                                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31)
                                            .addComponent(L_name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(create_userLayout.createSequentialGroup()
                                            .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(31, 31, 31)
                                            .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Email_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Phone_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(create_userLayout.createSequentialGroup()
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Department_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(F_name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(26, 26, 26)
                                .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pwd_PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(Create_an_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Dob_DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        create_userLayout.setVerticalGroup(
            create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_userLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addGroup(create_userLayout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel53)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel54)))
                .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(create_userLayout.createSequentialGroup()
                        .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(create_userLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(create_userLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43)))
                        .addGap(18, 18, 18)
                        .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Post_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel42))
                            .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(UserId_back_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel44)
                                .addComponent(UserId_front_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(jLabel49)
                            .addComponent(Address_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Department_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(F_name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)
                            .addComponent(jLabel50)))
                    .addGroup(create_userLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dob_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel37)
                    .addComponent(pwd_PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Email_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Create_an_user))
                    .addComponent(jLabel38))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(create_user, "card3");

        view_users.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel58.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel58.setText("Management Information System");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 102, 102));
        jLabel59.setText("Faculty Of Technology");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setText("University Of Ruhuna");

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR2.png"))); // NOI18N

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel69.setText("Maintain users");

        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        User_Table.setForeground(new java.awt.Color(102, 102, 102));
        User_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Department", "First name", "Last name", "Email", "Phone", "Address", "Date of birth"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        User_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        User_Table.setGridColor(new java.awt.Color(204, 204, 204));
        User_Table.setName(""); // NOI18N
        User_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        User_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                User_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(User_Table);

        Delete_Button.setText("Delete");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        Update_Button.setText("Update");
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Filter by user type");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Filter by department");

        UType_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Admins", "Lecturers", "Technical officers", "Students" }));
        UType_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UType_ComboBoxActionPerformed(evt);
            }
        });

        Dept_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "ICT", "ET", "BST" }));
        Dept_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dept_ComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout view_usersLayout = new javax.swing.GroupLayout(view_users);
        view_users.setLayout(view_usersLayout);
        view_usersLayout.setHorizontalGroup(
            view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, view_usersLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(view_usersLayout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(view_usersLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(view_usersLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel60)))
                        .addGap(348, 348, 348))
                    .addGroup(view_usersLayout.createSequentialGroup()
                        .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(view_usersLayout.createSequentialGroup()
                                    .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(135, 135, 135)
                                    .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(view_usersLayout.createSequentialGroup()
                                    .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel40))
                                    .addGap(18, 18, 18)
                                    .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Dept_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UType_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        view_usersLayout.setVerticalGroup(
            view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_usersLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addGroup(view_usersLayout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel59)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel60)))
                .addGap(29, 29, 29)
                .addComponent(jLabel69)
                .addGap(28, 28, 28)
                .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn)
                    .addComponent(Delete_Button)
                    .addComponent(Update_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(UType_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(Dept_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(view_users, "card3");

        update_user.setBackground(new java.awt.Color(255, 255, 255));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel62.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel62.setText("Management Information System");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 102, 102));
        jLabel63.setText("Faculty Of Technology");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 102, 102));
        jLabel64.setText("University Of Ruhuna");

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR2.png"))); // NOI18N

        UPost_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Lecture", "Technical officer", "Student" }));
        UPost_ComboBox.setEnabled(false);

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("User ID");

        UUser_id_TextField.setEditable(false);
        UUser_id_TextField.setEnabled(false);

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("Department");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setText("Frist name");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setText("Last name");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel74.setText("Phone");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("Address");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Birthday");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel77.setText("Update user");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setText("Post");

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Update User.png"))); // NOI18N

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Passsword");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel81.setText("Email");

        UDepartment_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "ET", "BST" }));

        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        UReset_pwd.setText("Restet to default");
        UReset_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UReset_pwdActionPerformed(evt);
            }
        });

        jButton1.setText("Undo reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout update_userLayout = new javax.swing.GroupLayout(update_user);
        update_user.setLayout(update_userLayout);
        update_userLayout.setHorizontalGroup(
            update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_userLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_userLayout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel62)
                            .addComponent(jLabel64))
                        .addGap(309, 309, 309))
                    .addGroup(update_userLayout.createSequentialGroup()
                        .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(update_userLayout.createSequentialGroup()
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(UPost_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UUser_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(update_userLayout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel79)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(update_userLayout.createSequentialGroup()
                                .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(update_userLayout.createSequentialGroup()
                                        .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(update_userLayout.createSequentialGroup()
                                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(31, 31, 31)
                                                    .addComponent(UlLast_name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(update_userLayout.createSequentialGroup()
                                                    .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel81))
                                                    .addGap(31, 31, 31)
                                                    .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(UEmail_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(UPhone_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(update_userLayout.createSequentialGroup()
                                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(UDepartment_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(UFirst_name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(26, 26, 26)
                                        .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(update_userLayout.createSequentialGroup()
                                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(273, 273, 273)
                                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_userLayout.createSequentialGroup()
                                            .addComponent(Back1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(update_userLayout.createSequentialGroup()
                                            .addComponent(UReset_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                                        .addComponent(UPWD_PasswordField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(UDob_DateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(UAddress_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        update_userLayout.setVerticalGroup(
            update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_userLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addGroup(update_userLayout.createSequentialGroup()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel63)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel64)))
                .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(update_userLayout.createSequentialGroup()
                        .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(update_userLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(update_userLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel79)))
                        .addGap(18, 18, 18)
                        .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(UPost_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel78))
                            .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(UUser_id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel66)))
                        .addGap(18, 18, 18)
                        .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jLabel75)
                            .addComponent(UAddress_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UDepartment_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UFirst_name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68)
                            .addComponent(jLabel76)))
                    .addGroup(update_userLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UDob_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UlLast_name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel80)
                    .addComponent(UPWD_PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPhone_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(UReset_pwd)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(update_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(UEmail_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update)
                    .addComponent(Back1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(update_user, "card3");

        create_subject.setBackground(new java.awt.Color(255, 255, 255));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel83.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel83.setText("Management Information System");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 102, 102));
        jLabel84.setText("Faculty Of Technology");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 102, 102));
        jLabel85.setText("University Of Ruhuna");

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel89.setText("Subject name");

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel90.setText("Subject code");

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setText("Creadits");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel92.setText("Subject type");

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel95.setText("Create subject");

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel96.setText("Department");

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Subject.png"))); // NOI18N

        sub_dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "ET", "BST", "COMMON" }));

        theory_check.setBackground(new java.awt.Color(255, 255, 255));
        theory_check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        theory_check.setText("Theory");

        practical_check.setBackground(new java.awt.Color(255, 255, 255));
        practical_check.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        practical_check.setText("Practical");

        create_a_course.setText("Create");
        create_a_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_a_courseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Conducting by ");

        javax.swing.GroupLayout create_subjectLayout = new javax.swing.GroupLayout(create_subject);
        create_subject.setLayout(create_subjectLayout);
        create_subjectLayout.setHorizontalGroup(
            create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, create_subjectLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_subjectLayout.createSequentialGroup()
                        .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel85)
                            .addComponent(jLabel84)
                            .addComponent(jLabel83))
                        .addGap(94, 94, 94))
                    .addGroup(create_subjectLayout.createSequentialGroup()
                        .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(create_a_course, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(create_subjectLayout.createSequentialGroup()
                                    .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31)
                                    .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(create_subjectLayout.createSequentialGroup()
                                            .addComponent(theory_check, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(practical_check, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(sub_dept, 0, 216, Short.MAX_VALUE)
                                        .addComponent(sub_name, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                        .addComponent(sub_code, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                        .addComponent(credits, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                        .addComponent(con_lec_id, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(create_subjectLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel97))
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel86))
        );
        create_subjectLayout.setVerticalGroup(
            create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_subjectLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82)
                    .addGroup(create_subjectLayout.createSequentialGroup()
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel84)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel85)))
                .addGap(29, 29, 29)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addGap(18, 18, 18)
                .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(sub_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(sub_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(credits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(con_lec_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel92)
                    .addGroup(create_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(theory_check)
                        .addComponent(practical_check)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(create_a_course)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(create_subject, "card3");

        view_subjects.setBackground(new java.awt.Color(255, 255, 255));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel88.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel88.setText("Management Information System");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(102, 102, 102));
        jLabel93.setText("Faculty Of Technology");

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(102, 102, 102));
        jLabel94.setText("University Of Ruhuna");

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR2.png"))); // NOI18N

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel99.setText("Maintain subjects");

        search_sub.setText("Search");
        search_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_subActionPerformed(evt);
            }
        });

        Subject_Table.setForeground(new java.awt.Color(102, 102, 102));
        Subject_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Subject code", "Department", "Subject name", "Credits", "Theory", "Practical"
            }
        ));
        Subject_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Subject_Table.setGridColor(new java.awt.Color(204, 204, 204));
        Subject_Table.setName(""); // NOI18N
        Subject_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Subject_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Subject_Table);

        delete_sub.setText("Delete");
        delete_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_subActionPerformed(evt);
            }
        });

        edit_sub.setText("Edit");
        edit_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_subActionPerformed(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setText("Filter by department");

        sub_department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "ICT", "ET", "BST", "COMMON" }));
        sub_department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_departmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout view_subjectsLayout = new javax.swing.GroupLayout(view_subjects);
        view_subjects.setLayout(view_subjectsLayout);
        view_subjectsLayout.setHorizontalGroup(
            view_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, view_subjectsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(view_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(view_subjectsLayout.createSequentialGroup()
                        .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(view_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel93)
                            .addComponent(jLabel88)
                            .addComponent(jLabel94))
                        .addGap(348, 348, 348))
                    .addGroup(view_subjectsLayout.createSequentialGroup()
                        .addGroup(view_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(view_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(view_subjectsLayout.createSequentialGroup()
                                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(541, 541, 541))
                                .addGroup(view_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(view_subjectsLayout.createSequentialGroup()
                                        .addComponent(subject_search_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(search_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(135, 135, 135)
                                        .addComponent(edit_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(delete_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(view_subjectsLayout.createSequentialGroup()
                                        .addGroup(view_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel100)
                                            .addComponent(jLabel101))
                                        .addGap(18, 18, 18)
                                        .addComponent(sub_department, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        view_subjectsLayout.setVerticalGroup(
            view_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_subjectsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(view_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel87)
                    .addGroup(view_subjectsLayout.createSequentialGroup()
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel93)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel94)))
                .addGap(29, 29, 29)
                .addComponent(jLabel99)
                .addGap(28, 28, 28)
                .addGroup(view_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject_search_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_sub)
                    .addComponent(delete_sub)
                    .addComponent(edit_sub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(view_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(view_subjects, "card3");

        edit_subject.setBackground(new java.awt.Color(255, 255, 255));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel103.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel103.setText("Management Information System");

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(102, 102, 102));
        jLabel104.setText("Faculty Of Technology");

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(102, 102, 102));
        jLabel105.setText("University Of Ruhuna");

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setText("Subject name");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setText("Subject code");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setText("Credits");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel110.setText("Subject type");

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel111.setText("Edit subject");

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel112.setText("Department");

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit_Subject.png"))); // NOI18N

        e_sub_dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "ET", "BST", "COMMON" }));

        e_theory.setBackground(new java.awt.Color(255, 255, 255));
        e_theory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        e_theory.setText("Theory");

        e_practical.setBackground(new java.awt.Color(255, 255, 255));
        e_practical.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        e_practical.setText("Practical");

        save_subject.setText("Save");
        save_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_subjectActionPerformed(evt);
            }
        });

        back_to_view_sub.setText("Back");
        back_to_view_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_view_subActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Conducting by");

        javax.swing.GroupLayout edit_subjectLayout = new javax.swing.GroupLayout(edit_subject);
        edit_subject.setLayout(edit_subjectLayout);
        edit_subjectLayout.setHorizontalGroup(
            edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_subjectLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_subjectLayout.createSequentialGroup()
                        .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(jLabel104)
                            .addComponent(jLabel103))
                        .addGap(94, 94, 94))
                    .addGroup(edit_subjectLayout.createSequentialGroup()
                        .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_subjectLayout.createSequentialGroup()
                                    .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(edit_subjectLayout.createSequentialGroup()
                                            .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31)
                                            .addComponent(e_credits, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(edit_subjectLayout.createSequentialGroup()
                                            .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31)
                                            .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(edit_subjectLayout.createSequentialGroup()
                                                    .addComponent(back_to_view_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(save_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(edit_subjectLayout.createSequentialGroup()
                                                    .addComponent(e_theory, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(27, 27, 27)
                                                    .addComponent(e_practical, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(e_con_lec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGap(11, 11, 11))
                                .addGroup(edit_subjectLayout.createSequentialGroup()
                                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(e_sub_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(e_sub_code, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(e_sub_name, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(edit_subjectLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel113))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel106))
        );
        edit_subjectLayout.setVerticalGroup(
            edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_subjectLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102)
                    .addGroup(edit_subjectLayout.createSequentialGroup()
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel104)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel105)))
                .addGap(29, 29, 29)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel113)
                .addGap(18, 18, 18)
                .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(e_sub_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(e_sub_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e_sub_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e_credits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(e_con_lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e_practical)
                    .addComponent(e_theory)
                    .addComponent(jLabel110))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_subject)
                    .addComponent(back_to_view_sub))
                .addGap(26, 26, 26))
            .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(edit_subject, "card3");

        change_image.setBackground(new java.awt.Color(255, 255, 255));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel121.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel121.setText("Management Information System");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(102, 102, 102));
        jLabel122.setText("Faculty Of Technology");

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(102, 102, 102));
        jLabel123.setText("University Of Ruhuna");

        save_image.setText("Save");
        save_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_imageActionPerformed(evt);
            }
        });

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        jLabel140.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel140.setText("Change profile picture");

        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        jPanel1.setVerifyInputWhenFocusTarget(false);

        display_picture.setBackground(new java.awt.Color(255, 255, 255));
        display_picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(display_picture, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(display_picture, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout change_imageLayout = new javax.swing.GroupLayout(change_image);
        change_image.setLayout(change_imageLayout);
        change_imageLayout.setHorizontalGroup(
            change_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(change_imageLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(change_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(change_imageLayout.createSequentialGroup()
                        .addComponent(jLabel120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(change_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel121)
                            .addComponent(jLabel122)
                            .addComponent(jLabel123))
                        .addGap(94, 94, 94))
                    .addGroup(change_imageLayout.createSequentialGroup()
                        .addGroup(change_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel140)
                            .addGroup(change_imageLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(change_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(change_imageLayout.createSequentialGroup()
                                        .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(save_image, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel139))
        );
        change_imageLayout.setVerticalGroup(
            change_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(change_imageLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(change_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel120)
                    .addGroup(change_imageLayout.createSequentialGroup()
                        .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel122)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel123)))
                .addGap(34, 34, 34)
                .addComponent(jLabel140)
                .addGap(67, 67, 67)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(change_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_image)
                    .addComponent(browse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(change_image, "card3");

        change_pwd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel142.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel142.setText("Management Information System");

        jLabel143.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(102, 102, 102));
        jLabel143.setText("Faculty Of Technology");

        jLabel144.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(102, 102, 102));
        jLabel144.setText("University Of Ruhuna");

        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/key-label.png"))); // NOI18N

        jLabel156.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel156.setText("Change password");

        jLabel157.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel157.setText("Current password");

        jLabel158.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel158.setText("New password");

        jLabel159.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel159.setText("Confirm passsword");

        apply_pwd.setText("Change");
        apply_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apply_pwdActionPerformed(evt);
            }
        });

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        javax.swing.GroupLayout change_pwdLayout = new javax.swing.GroupLayout(change_pwd);
        change_pwd.setLayout(change_pwdLayout);
        change_pwdLayout.setHorizontalGroup(
            change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(change_pwdLayout.createSequentialGroup()
                .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(change_pwdLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(change_pwdLayout.createSequentialGroup()
                                .addComponent(jLabel141, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel142)
                                    .addComponent(jLabel143)
                                    .addComponent(jLabel144))
                                .addGap(94, 94, 94))
                            .addGroup(change_pwdLayout.createSequentialGroup()
                                .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel156)
                                    .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(apply_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(change_pwdLayout.createSequentialGroup()
                                            .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel159)
                                                .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel158, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel157, javax.swing.GroupLayout.Alignment.LEADING)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(new_pwd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                                .addComponent(current_pwd, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(confirm_pwd)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(change_pwdLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel145)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel160))
        );
        change_pwdLayout.setVerticalGroup(
            change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(change_pwdLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel141)
                    .addGroup(change_pwdLayout.createSequentialGroup()
                        .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel143)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel144)))
                .addGap(36, 36, 36)
                .addComponent(jLabel156)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel145)
                .addGap(37, 37, 37)
                .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel157)
                    .addComponent(current_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel158)
                    .addComponent(new_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(change_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel159)
                    .addComponent(confirm_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(apply_pwd)
                .addGap(84, 84, 84))
            .addComponent(jLabel160, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(change_pwd, "card3");

        create_notice.setBackground(new java.awt.Color(255, 255, 255));

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel147.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel147.setText("Management Information System");

        jLabel148.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(102, 102, 102));
        jLabel148.setText("Faculty Of Technology");

        jLabel149.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(102, 102, 102));
        jLabel149.setText("University Of Ruhuna");

        jLabel161.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel161.setText("Create notices");

        jLabel162.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel162.setText("Topic");

        jLabel163.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel163.setText("Date");

        jLabel164.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel164.setText("Notice");

        submit_notice.setText("Submit");
        submit_notice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_noticeActionPerformed(evt);
            }
        });

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        notices_TextArea.setColumns(20);
        notices_TextArea.setRows(5);
        jScrollPane3.setViewportView(notices_TextArea);

        javax.swing.GroupLayout create_noticeLayout = new javax.swing.GroupLayout(create_notice);
        create_notice.setLayout(create_noticeLayout);
        create_noticeLayout.setHorizontalGroup(
            create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_noticeLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_noticeLayout.createSequentialGroup()
                        .addComponent(jLabel146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel147)
                            .addComponent(jLabel148)
                            .addComponent(jLabel149))
                        .addGap(94, 94, 94))
                    .addGroup(create_noticeLayout.createSequentialGroup()
                        .addGroup(create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel161)
                            .addGroup(create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(submit_notice, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(create_noticeLayout.createSequentialGroup()
                                    .addGroup(create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel164, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                        .addComponent(jLabel163, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel162, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(31, 31, 31)
                                    .addGroup(create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(notice_dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                        .addComponent(notice_topic)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel165))
        );
        create_noticeLayout.setVerticalGroup(
            create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_noticeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel146)
                    .addGroup(create_noticeLayout.createSequentialGroup()
                        .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel148)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel149)))
                .addGap(36, 36, 36)
                .addComponent(jLabel161)
                .addGap(32, 32, 32)
                .addGroup(create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel162)
                    .addComponent(notice_topic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel163)
                    .addComponent(notice_dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(create_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel164)
                    .addGroup(create_noticeLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(submit_notice)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel165, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        dynamic_2.add(create_notice, "card3");

        view_notice.setBackground(new java.awt.Color(255, 255, 255));

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel151.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel151.setText("Management Information System");

        jLabel152.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(102, 102, 102));
        jLabel152.setText("Faculty Of Technology");

        jLabel153.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(102, 102, 102));
        jLabel153.setText("University Of Ruhuna");

        jLabel166.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel166.setText("View notices");

        jLabel167.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel167.setText("Topic");

        jLabel168.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel168.setText("Date");

        view_notice_TextArea.setColumns(20);
        view_notice_TextArea.setRows(5);
        jScrollPane4.setViewportView(view_notice_TextArea);

        notices_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        notices_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notices_tableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(notices_table);

        delete_notice.setText("Delete notices");
        delete_notice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_noticeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout view_noticeLayout = new javax.swing.GroupLayout(view_notice);
        view_notice.setLayout(view_noticeLayout);
        view_noticeLayout.setHorizontalGroup(
            view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_noticeLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(view_noticeLayout.createSequentialGroup()
                        .addGroup(view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_notice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(view_noticeLayout.createSequentialGroup()
                                .addGroup(view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(view_notice_DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                    .addComponent(view_notice_topic)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(view_noticeLayout.createSequentialGroup()
                        .addComponent(jLabel150, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel151)
                            .addComponent(jLabel152)
                            .addComponent(jLabel153))
                        .addGap(524, 524, 524))
                    .addGroup(view_noticeLayout.createSequentialGroup()
                        .addComponent(jLabel166)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        view_noticeLayout.setVerticalGroup(
            view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_noticeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel150)
                    .addGroup(view_noticeLayout.createSequentialGroup()
                        .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel152)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel153)))
                .addGap(36, 36, 36)
                .addComponent(jLabel166)
                .addGap(55, 55, 55)
                .addGroup(view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(view_noticeLayout.createSequentialGroup()
                        .addGroup(view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel167)
                            .addComponent(view_notice_topic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(view_noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(view_notice_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel168))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(view_noticeLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_notice)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        dynamic_2.add(view_notice, "card3");

        about.setBackground(new java.awt.Color(255, 255, 255));

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel155.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel155.setText("Management Information System");

        jLabel169.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(102, 102, 102));
        jLabel169.setText("Faculty Of Technology");

        jLabel170.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(102, 102, 102));
        jLabel170.setText("University Of Ruhuna");

        jLabel172.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel172.setText("About");

        jLabel173.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel173.setText("Version");

        jLabel174.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel174.setText("Developed by");

        jLabel175.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel175.setText("1.0v");

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        jLabel177.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel177.setText("H.D.R.M.S Kumara");

        jLabel178.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel178.setText("H.D.R.M.S Kumara");

        jLabel179.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel179.setText("H.D.R.M.S Kumara");

        jLabel180.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel180.setText("H.D.R.M.S Kumara");

        javax.swing.GroupLayout aboutLayout = new javax.swing.GroupLayout(about);
        about.setLayout(aboutLayout);
        aboutLayout.setHorizontalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutLayout.createSequentialGroup()
                        .addComponent(jLabel154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel155)
                            .addComponent(jLabel169)
                            .addComponent(jLabel170))
                        .addGap(94, 94, 94))
                    .addGroup(aboutLayout.createSequentialGroup()
                        .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel172)
                            .addGroup(aboutLayout.createSequentialGroup()
                                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel177, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(aboutLayout.createSequentialGroup()
                                        .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel178)
                                            .addComponent(jLabel175)
                                            .addComponent(jLabel179)
                                            .addComponent(jLabel180))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(307, 307, 307)))
                .addComponent(jLabel176))
        );
        aboutLayout.setVerticalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel154)
                    .addGroup(aboutLayout.createSequentialGroup()
                        .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel169)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel170)))
                .addGap(36, 36, 36)
                .addComponent(jLabel172)
                .addGap(46, 46, 46)
                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel173)
                    .addComponent(jLabel175))
                .addGap(18, 18, 18)
                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel174)
                    .addComponent(jLabel177))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel178)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel179)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel180)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel176, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        dynamic_2.add(about, "card3");

        create_timetable.setBackground(new java.awt.Color(255, 255, 255));

        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel181.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel181.setText("Management Information System");

        jLabel182.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(102, 102, 102));
        jLabel182.setText("Faculty Of Technology");

        jLabel183.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(102, 102, 102));
        jLabel183.setText("University Of Ruhuna");

        jLabel184.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel184.setText("Create time table");

        jLabel185.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel185.setText("Time tabel name");

        jLabel186.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel186.setText("Department");

        jLabel188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        t_table_department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "ET", "BST" }));

        new_time_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"8.00 - 9.00", null, null, null, null, null},
                {"9.00 - 10.00", null, null, null, null, null},
                {"10.00 - 11.00", null, null, null, null, null},
                {"11.00 - 12.00", null, null, null, null, null},
                {"Interval", null, null, null, null, null},
                {"1.00 - 2.00", null, null, null, null, null},
                {"2.00 - 3.00", null, null, null, null, null},
                {"3.00 - 4.00", null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Mon", "Tue", "Wen", "Thu", "Fri"
            }
        ));
        jScrollPane6.setViewportView(new_time_table);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout create_timetableLayout = new javax.swing.GroupLayout(create_timetable);
        create_timetable.setLayout(create_timetableLayout);
        create_timetableLayout.setHorizontalGroup(
            create_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_timetableLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(create_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_timetableLayout.createSequentialGroup()
                        .addComponent(jLabel171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(create_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel181)
                            .addComponent(jLabel182)
                            .addComponent(jLabel183))
                        .addGap(290, 290, 290))
                    .addGroup(create_timetableLayout.createSequentialGroup()
                        .addGroup(create_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(create_timetableLayout.createSequentialGroup()
                                .addGroup(create_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(create_timetableLayout.createSequentialGroup()
                                        .addGroup(create_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel185, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel186, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(create_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t_tabel_name, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t_table_department, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel184))
                                .addGap(145, 145, 145))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        create_timetableLayout.setVerticalGroup(
            create_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_timetableLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(create_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel171)
                    .addGroup(create_timetableLayout.createSequentialGroup()
                        .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel182)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel183)))
                .addGap(36, 36, 36)
                .addComponent(jLabel184)
                .addGap(30, 30, 30)
                .addGroup(create_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel185)
                    .addComponent(t_tabel_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(create_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel186)
                    .addComponent(t_table_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel188, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(create_timetable, "card15");

        view_timetable.setBackground(new java.awt.Color(255, 255, 255));

        jLabel187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel189.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel189.setText("Management Information System");

        jLabel190.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel190.setForeground(new java.awt.Color(102, 102, 102));
        jLabel190.setText("Faculty Of Technology");

        jLabel191.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel191.setForeground(new java.awt.Color(102, 102, 102));
        jLabel191.setText("University Of Ruhuna");

        jLabel192.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel192.setText("View time table");

        jLabel195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        view_time_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"8.00 - 9.00", null, null, null, null, null},
                {"9.00 - 10.00", null, null, null, null, null},
                {"10.00 - 11.00", null, null, null, null, null},
                {"11.00 - 12.00", null, null, null, null, null},
                {"Interval", null, null, null, null, null},
                {"1.00 - 2.00", null, null, null, null, null},
                {"2.00 - 3.00", null, null, null, null, null},
                {"3.00 - 4.00", null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Mon", "Tue", "Wen", "Thu", "Fri"
            }
        ));
        jScrollPane7.setViewportView(view_time_table);

        jLabel196.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel196.setText("Select time table");

        select_tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_ttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout view_timetableLayout = new javax.swing.GroupLayout(view_timetable);
        view_timetable.setLayout(view_timetableLayout);
        view_timetableLayout.setHorizontalGroup(
            view_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_timetableLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(view_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(view_timetableLayout.createSequentialGroup()
                        .addComponent(jLabel187, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(view_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel189)
                            .addComponent(jLabel190)
                            .addComponent(jLabel191))
                        .addGap(290, 290, 290))
                    .addGroup(view_timetableLayout.createSequentialGroup()
                        .addGroup(view_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel192)
                            .addGroup(view_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(view_timetableLayout.createSequentialGroup()
                                    .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(select_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(349, 349, 349))
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        view_timetableLayout.setVerticalGroup(
            view_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_timetableLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(view_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel187)
                    .addGroup(view_timetableLayout.createSequentialGroup()
                        .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel190)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel191)))
                .addGap(36, 36, 36)
                .addComponent(jLabel192)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(view_timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel196)
                    .addComponent(select_tt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addComponent(jLabel195, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        dynamic_2.add(view_timetable, "card15");

        mark_attendance.setBackground(new java.awt.Color(255, 255, 255));

        jLabel193.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel194.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel194.setText("Management Information System");

        jLabel197.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(102, 102, 102));
        jLabel197.setText("Faculty Of Technology");

        jLabel198.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel198.setForeground(new java.awt.Color(102, 102, 102));
        jLabel198.setText("University Of Ruhuna");

        jLabel199.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Mark Attendance");

        jLabel13.setText("Student ID");

        jLabel14.setText("Subject ID");

        jLabel15.setText("Date");

        attendance_add.setText("Add");
        attendance_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendance_addActionPerformed(evt);
            }
        });

        theory_CheckBox.setText("Theory");

        practical_CheckBox.setText("Practical");

        javax.swing.GroupLayout mark_attendanceLayout = new javax.swing.GroupLayout(mark_attendance);
        mark_attendance.setLayout(mark_attendanceLayout);
        mark_attendanceLayout.setHorizontalGroup(
            mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mark_attendanceLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mark_attendanceLayout.createSequentialGroup()
                        .addGroup(mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mark_attendanceLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(attendance_add, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mark_attendanceLayout.createSequentialGroup()
                                        .addGroup(mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(stu_idComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sub_idComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(a_date, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                            .addComponent(theory_CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(practical_CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mark_attendanceLayout.createSequentialGroup()
                        .addComponent(jLabel193, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel194)
                            .addComponent(jLabel197)
                            .addComponent(jLabel198))
                        .addGap(234, 234, 234)))
                .addComponent(jLabel199))
        );
        mark_attendanceLayout.setVerticalGroup(
            mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mark_attendanceLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel193)
                    .addGroup(mark_attendanceLayout.createSequentialGroup()
                        .addComponent(jLabel194, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel197)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel198)))
                .addGap(55, 55, 55)
                .addComponent(jLabel12)
                .addGap(35, 35, 35)
                .addGroup(mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(stu_idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(sub_idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mark_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(a_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(theory_CheckBox)
                .addGap(18, 18, 18)
                .addComponent(practical_CheckBox)
                .addGap(30, 30, 30)
                .addComponent(attendance_add)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel199, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(mark_attendance, "card12");

        update_attendance.setBackground(new java.awt.Color(255, 255, 255));

        jLabel200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel201.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel201.setText("Management Information System");

        jLabel202.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(102, 102, 102));
        jLabel202.setText("Faculty Of Technology");

        jLabel203.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(102, 102, 102));
        jLabel203.setText("University Of Ruhuna");

        jLabel204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Edit Attendance");

        jLabel26.setText("Student ID");

        jLabel27.setText("Subject ID");

        jLabel31.setText("Date");

        attendance_update.setText("Update");
        attendance_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendance_updateMouseClicked(evt);
            }
        });
        attendance_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendance_updateActionPerformed(evt);
            }
        });

        update_theoryCheckBox.setText("Theory");

        update_practicalCheckBox.setText("Practical");

        back_to_view_attendance.setText("Back");
        back_to_view_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_view_attendanceActionPerformed(evt);
            }
        });

        update_attendance_stuid.setEditable(false);

        update_attendance_subid.setEditable(false);

        update_attendance_date.setEditable(false);

        javax.swing.GroupLayout update_attendanceLayout = new javax.swing.GroupLayout(update_attendance);
        update_attendance.setLayout(update_attendanceLayout);
        update_attendanceLayout.setHorizontalGroup(
            update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_attendanceLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_attendanceLayout.createSequentialGroup()
                        .addGroup(update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(update_attendanceLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(update_practicalCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(update_attendance_stuid)
                                    .addComponent(update_attendance_subid)
                                    .addComponent(update_theoryCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(update_attendanceLayout.createSequentialGroup()
                                        .addComponent(back_to_view_attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(attendance_update, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(update_attendance_date))))
                        .addGap(300, 300, 300))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, update_attendanceLayout.createSequentialGroup()
                        .addComponent(jLabel200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel201)
                            .addComponent(jLabel202)
                            .addComponent(jLabel203))
                        .addGap(234, 234, 234)))
                .addComponent(jLabel204))
        );
        update_attendanceLayout.setVerticalGroup(
            update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_attendanceLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(update_attendanceLayout.createSequentialGroup()
                        .addGroup(update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel200)
                            .addGroup(update_attendanceLayout.createSequentialGroup()
                                .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel202)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel203)))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel25)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel26))
                    .addComponent(update_attendance_stuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(update_attendance_subid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(update_attendance_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(update_theoryCheckBox)
                .addGap(18, 18, 18)
                .addComponent(update_practicalCheckBox)
                .addGap(30, 30, 30)
                .addGroup(update_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attendance_update)
                    .addComponent(back_to_view_attendance))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel204, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(update_attendance, "card12");

        view_attendance.setBackground(new java.awt.Color(255, 255, 255));

        jLabel205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel206.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel206.setText("Management Information System");

        jLabel207.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(102, 102, 102));
        jLabel207.setText("Faculty Of Technology");

        jLabel208.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(102, 102, 102));
        jLabel208.setText("University Of Ruhuna");

        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("View Attendance");

        jLabel34.setText("Subject ID");

        jLabel35.setText("Date");

        view_attendance_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student ID", "Theory", "Practical"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        view_attendance_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_attendance_tableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(view_attendance_table);

        edit_attendance.setText("Edit");
        edit_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_attendanceActionPerformed(evt);
            }
        });

        view_attend.setText("View");
        view_attend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_attendActionPerformed(evt);
            }
        });

        delete_attendance.setText("Delete");
        delete_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_attendanceActionPerformed(evt);
            }
        });

        current_attendance.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout view_attendanceLayout = new javax.swing.GroupLayout(view_attendance);
        view_attendance.setLayout(view_attendanceLayout);
        view_attendanceLayout.setHorizontalGroup(
            view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_attendanceLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, view_attendanceLayout.createSequentialGroup()
                        .addComponent(jLabel205, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel206)
                            .addComponent(jLabel207)
                            .addComponent(jLabel208))
                        .addGap(234, 234, 234))
                    .addGroup(view_attendanceLayout.createSequentialGroup()
                        .addGroup(view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(view_attendanceLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(view_attendanceLayout.createSequentialGroup()
                                        .addGroup(view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addGroup(view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sub_id_for_viewComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(a_date_for_view, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                                        .addGap(29, 29, 29)
                                        .addGroup(view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(view_attendanceLayout.createSequentialGroup()
                                                .addComponent(edit_attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(delete_attendance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(view_attend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(current_attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel209))
        );
        view_attendanceLayout.setVerticalGroup(
            view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_attendanceLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel205)
                    .addGroup(view_attendanceLayout.createSequentialGroup()
                        .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel207)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel208)))
                .addGap(55, 55, 55)
                .addComponent(jLabel32)
                .addGap(34, 34, 34)
                .addGroup(view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub_id_for_viewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(edit_attendance)
                    .addComponent(delete_attendance))
                .addGap(18, 18, 18)
                .addGroup(view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(view_attendanceLayout.createSequentialGroup()
                        .addGroup(view_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(a_date_for_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(current_attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(view_attend))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel209, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(view_attendance, "card12");

        submit_medicals.setBackground(new java.awt.Color(255, 255, 255));

        jLabel210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel211.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel211.setText("Management Information System");

        jLabel212.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel212.setForeground(new java.awt.Color(102, 102, 102));
        jLabel212.setText("Faculty Of Technology");

        jLabel213.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel213.setForeground(new java.awt.Color(102, 102, 102));
        jLabel213.setText("University Of Ruhuna");

        jLabel214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Submit Medicals");

        jLabel115.setText("Student ID");

        jLabel118.setText("Subject ID");

        jLabel119.setText("Date");

        submit_medical.setText("Submit");
        submit_medical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_medicalActionPerformed(evt);
            }
        });

        m_theory.setText("Theory");

        m_practical.setText("Practical");

        javax.swing.GroupLayout submit_medicalsLayout = new javax.swing.GroupLayout(submit_medicals);
        submit_medicals.setLayout(submit_medicalsLayout);
        submit_medicalsLayout.setHorizontalGroup(
            submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submit_medicalsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(submit_medicalsLayout.createSequentialGroup()
                        .addGroup(submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(submit_medicalsLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(submit_medical, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(submit_medicalsLayout.createSequentialGroup()
                                        .addGroup(submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(stu_id_for_medical, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sub_id_for_medical, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(m_date, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                            .addComponent(m_theory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(m_practical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submit_medicalsLayout.createSequentialGroup()
                        .addComponent(jLabel210, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel211)
                            .addComponent(jLabel212)
                            .addComponent(jLabel213))
                        .addGap(234, 234, 234)))
                .addComponent(jLabel214))
        );
        submit_medicalsLayout.setVerticalGroup(
            submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submit_medicalsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel210)
                    .addGroup(submit_medicalsLayout.createSequentialGroup()
                        .addComponent(jLabel211, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel212)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel213)))
                .addGap(55, 55, 55)
                .addComponent(jLabel33)
                .addGap(35, 35, 35)
                .addGroup(submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel115)
                    .addComponent(stu_id_for_medical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(sub_id_for_medical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(submit_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel119)
                    .addComponent(m_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(m_theory)
                .addGap(18, 18, 18)
                .addComponent(m_practical)
                .addGap(30, 30, 30)
                .addComponent(submit_medical)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel214, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(submit_medicals, "card12");

        view_medicals.setBackground(new java.awt.Color(255, 255, 255));

        jLabel220.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N

        jLabel221.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel221.setText("Management Information System");

        jLabel222.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(102, 102, 102));
        jLabel222.setText("Faculty Of Technology");

        jLabel223.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel223.setForeground(new java.awt.Color(102, 102, 102));
        jLabel223.setText("University Of Ruhuna");

        jLabel224.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR.png"))); // NOI18N

        jLabel128.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel128.setText("View Medicals");

        jLabel129.setText("Search");

        view_medical_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Subject ID", "Date", "Theory", "Practical"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        view_medical_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_medical_tableMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(view_medical_table);

        delete_medical.setText("Delete");
        delete_medical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_medicalActionPerformed(evt);
            }
        });

        search_medical.setText("Search");
        search_medical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_medicalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout view_medicalsLayout = new javax.swing.GroupLayout(view_medicals);
        view_medicals.setLayout(view_medicalsLayout);
        view_medicalsLayout.setHorizontalGroup(
            view_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_medicalsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(view_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, view_medicalsLayout.createSequentialGroup()
                        .addComponent(jLabel220, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(view_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel221)
                            .addComponent(jLabel222)
                            .addComponent(jLabel223))
                        .addGap(234, 234, 234))
                    .addGroup(view_medicalsLayout.createSequentialGroup()
                        .addGroup(view_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(view_medicalsLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(view_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(view_medicalsLayout.createSequentialGroup()
                                        .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(search_medicalTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(search_medical)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(delete_medical)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel224))
        );
        view_medicalsLayout.setVerticalGroup(
            view_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_medicalsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(view_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel220)
                    .addGroup(view_medicalsLayout.createSequentialGroup()
                        .addComponent(jLabel221, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel222)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel223)))
                .addGap(55, 55, 55)
                .addComponent(jLabel128)
                .addGap(34, 34, 34)
                .addGroup(view_medicalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(delete_medical)
                    .addComponent(search_medicalTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_medical))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel224, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dynamic_2.add(view_medicals, "card12");

        getContentPane().add(dynamic_2);

        profile_menu.setText("Profile");

        view_profile_sm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        view_profile_sm.setText("View profile");
        view_profile_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_profile_smActionPerformed(evt);
            }
        });
        profile_menu.add(view_profile_sm);

        edit_myprofile_sm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        edit_myprofile_sm.setText("Edit Profile");
        edit_myprofile_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_myprofile_smActionPerformed(evt);
            }
        });
        profile_menu.add(edit_myprofile_sm);

        change_dp_sm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        change_dp_sm.setText("Change Profile picture");
        change_dp_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_dp_smActionPerformed(evt);
            }
        });
        profile_menu.add(change_dp_sm);

        change_mypwd_sm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        change_mypwd_sm.setText("Change Password");
        change_mypwd_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_mypwd_smActionPerformed(evt);
            }
        });
        profile_menu.add(change_mypwd_sm);

        jMenuBar1.add(profile_menu);

        user_menu.setText("Users");

        create_an_user_sm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        create_an_user_sm.setText("Create an user");
        create_an_user_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_an_user_smActionPerformed(evt);
            }
        });
        user_menu.add(create_an_user_sm);

        view_user_sm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        view_user_sm.setText("View users");
        view_user_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_user_smActionPerformed(evt);
            }
        });
        user_menu.add(view_user_sm);

        jMenuBar1.add(user_menu);

        course_menu.setText("Courses ");

        create_course_sm.setText("Create subject");
        create_course_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_course_smActionPerformed(evt);
            }
        });
        course_menu.add(create_course_sm);

        maintain_cource_sm.setText("Maintain subjects");
        maintain_cource_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintain_cource_smActionPerformed(evt);
            }
        });
        course_menu.add(maintain_cource_sm);

        jMenuBar1.add(course_menu);

        attendance_menu.setText("Attendance ");

        mark_attendance_sm.setText("Mark attendance");
        mark_attendance_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark_attendance_smActionPerformed(evt);
            }
        });
        attendance_menu.add(mark_attendance_sm);

        view_attendance_sm.setText("Veiw attendance");
        view_attendance_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_attendance_smActionPerformed(evt);
            }
        });
        attendance_menu.add(view_attendance_sm);

        jMenuBar1.add(attendance_menu);

        medicals_menu.setText("Medicals");

        submit_medicals_sm.setText("Submit medicals");
        submit_medicals_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_medicals_smActionPerformed(evt);
            }
        });
        medicals_menu.add(submit_medicals_sm);

        view_edit_medicals_sm.setText("View and maintain submited medicals");
        view_edit_medicals_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_edit_medicals_smActionPerformed(evt);
            }
        });
        medicals_menu.add(view_edit_medicals_sm);

        jMenuBar1.add(medicals_menu);

        marks_menu.setText("Marks");

        jMenuItem15.setText("Quizes");
        marks_menu.add(jMenuItem15);

        jMenuItem16.setText("Assessments");
        marks_menu.add(jMenuItem16);

        jMenuItem17.setText("Mid term");
        marks_menu.add(jMenuItem17);

        jMenuItem18.setText("End");
        marks_menu.add(jMenuItem18);

        jMenuItem19.setText("Final marks");
        marks_menu.add(jMenuItem19);

        jMenuBar1.add(marks_menu);

        timetable_menu.setText("Time table");

        jMenuItem1.setText("Create time table");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        timetable_menu.add(jMenuItem1);

        jMenuItem20.setText("Edit time table");
        timetable_menu.add(jMenuItem20);

        jMenuItem21.setText("View time table");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        timetable_menu.add(jMenuItem21);

        jMenuBar1.add(timetable_menu);

        notice_menu.setText("Notices ");

        upload_notice_sm.setText("Upload notice");
        upload_notice_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_notice_smActionPerformed(evt);
            }
        });
        notice_menu.add(upload_notice_sm);

        view_and_maintain_notice_sm.setText("View notice");
        view_and_maintain_notice_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_and_maintain_notice_smActionPerformed(evt);
            }
        });
        notice_menu.add(view_and_maintain_notice_sm);

        jMenuBar1.add(notice_menu);

        more_menu.setText("More");

        jMenuItem24.setText("Sign out");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        more_menu.add(jMenuItem24);

        jMenuItem7.setText("About");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        more_menu.add(jMenuItem7);

        jMenuItem25.setText("Exit");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        more_menu.add(jMenuItem25);

        jMenuBar1.add(more_menu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void init_user(String user_id,String user_post){
    
        /*Getting logged user details*/
        
       con = DBconnection.connect();
       
       String get_user_inforQ = "SELECT * FROM `user` WHERE user_id='" + user_id + "' LIMIT 1";    
       PreparedStatement qstate;
       
       try {
           qstate = (PreparedStatement) con.prepareStatement(get_user_inforQ);      
           ResultSet res = qstate.executeQuery();
           
           /*Separete to calsses logged user*/
           if(res.next()){ 
               this.my_id = user_id;
               separate_users(res);
               
           } 
           
                  
       } catch (SQLException ex) { 
           JOptionPane.showMessageDialog(null, "Database connection faild.", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }
    
    
    
    private void separate_users(ResultSet res){

        try {
        
            if("admin".equals(res.getString("post"))){
                
                admin_class = new Admin(res.getString("user_id"), res.getString("first_name"), res.getString("last_name"),res.getString("email") ,res.getString("phone") , res.getString("dob"), res.getString("address"));
                user_post = res.getString("post");
                
                
                /*Set permisions*/
                
                attendance_menu.setVisible(false);
                medicals_menu.setVisible(false);
                marks_menu.setVisible(false);
                
                
            }
            else if("lec".equals(res.getString("post"))){
                
                lec_class = new Lec(res.getString("user_id"), res.getString("first_name"), res.getString("last_name"),res.getString("email") ,res.getString("phone") , res.getString("dob"), res.getString("address"),res.getString("department"));
                user_post = res.getString("post");
                
                /*Set permisions*/
                
                create_an_user_sm.setVisible(false);
                mark_attendance_sm.setVisible(false);
                submit_medicals_sm.setVisible(false);
                upload_notice_sm.setVisible(false);
                
            }
            else if("teo".equals(res.getString("post"))){
                
                teo_class = new Teo(res.getString("user_id"), res.getString("first_name"), res.getString("last_name"),res.getString("email") ,res.getString("phone") , res.getString("dob"), res.getString("address"),res.getString("department"));
                user_post = res.getString("post");
                
                /*Set permisions*/
                
                user_menu.setVisible(false);
                course_menu.setVisible(false);
                marks_menu.setVisible(false);
                timetable_menu.setVisible(false);
                upload_notice_sm.setVisible(false);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not detect any user.System is going to exit.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        

}
    
    
    private void view_profile_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_profile_smActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        dynamic_2.add(user_profile);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        load_profile();
    }//GEN-LAST:event_view_profile_smActionPerformed

    private void load_profile(){
        
        if(admin_class!=null){
            user_id.setText(admin_class.get_id());
            name.setText(admin_class.get_f_name() + " " + admin_class.get_l_name());
            post.setText("Administrator");
            department.setText("");
            phone.setText(admin_class.get_phone());
            email.setText(admin_class.get_email());
            dob.setText(admin_class.get_dob());
            address.setText(admin_class.get_address());
            
            if(admin_class.get_image(my_id)!=null)
                dp.setIcon(admin_class.get_image(my_id));
        }
        else if(lec_class!=null){
            user_id.setText(lec_class.get_id());
            name.setText(lec_class.get_f_name() + " " + lec_class.get_l_name());
            post.setText("Lecturer");
            department.setText(lec_class.get_department());
            phone.setText(lec_class.get_phone());
            email.setText(lec_class.get_email());
            dob.setText(lec_class.get_dob());
            address.setText(lec_class.get_address());
            
            if(lec_class.get_image(my_id)!=null)
                dp.setIcon(lec_class.get_image(my_id));
        }
        else if(teo_class!=null){
            user_id.setText(teo_class.get_id());
            name.setText(teo_class.get_f_name() + " " + teo_class.get_l_name());
            post.setText("Technical officer");
            department.setText(teo_class.get_department());
            phone.setText(teo_class.get_phone());
            email.setText(teo_class.get_email());
            dob.setText(teo_class.get_dob());
            address.setText(teo_class.get_address());
            
            if(teo_class.get_image(my_id)!=null)
                dp.setIcon(teo_class.get_image(my_id));
        }
        
    
    }
    
    private void edit_myprofile_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_myprofile_smActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        dynamic_2.add(edit_profile);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        String Uid = null;
        String Fname = null;
        String Lname = null;
        String Email = null;
        String Phone = null;
        String Address = null;
        String Dob = null;
        boolean edited = false;
        
        if("admin".equals(user_post)){
            
            Uid = admin_class.get_id();
            Fname = admin_class.get_f_name();
            Lname = admin_class.get_l_name();
            Email = admin_class.get_email();
            Phone = admin_class.get_phone();
            Address = admin_class.get_address();
            Dob = admin_class.get_dob();
            
            /* Set values to edit*/
            edit_fn.setText(Fname);
            edit_ln.setText(Lname);
            edit_email.setText(Email);
            edit_phone.setText(Phone);
            edit_address.setText(Address);
                    
            try {  
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(Dob);
                edit_dob.setDate(date);
            } catch (ParseException ex) {}
      
        }
        
        else if("lec".equals(user_post)){
            
            Uid = lec_class.get_id();
            Fname = lec_class.get_f_name();
            Lname = lec_class.get_l_name();
            Email = lec_class.get_email();
            Phone = lec_class.get_phone();
            Address = lec_class.get_address();
            Dob = lec_class.get_dob();
            
            /* Set values to edit*/
            edit_fn.setText(Fname);
            edit_ln.setText(Lname);
            edit_email.setText(Email);
            edit_phone.setText(Phone);
            edit_address.setText(Address);
                    
            try {  
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(Dob);
                edit_dob.setDate(date);
            } catch (ParseException ex) {}
      
        }
        else if("teo".equals(user_post)){
            
            Uid = teo_class.get_id();
            Fname = teo_class.get_f_name();
            Lname = teo_class.get_l_name();
            Email = teo_class.get_email();
            Phone = teo_class.get_phone();
            Address = teo_class.get_address();
            Dob = teo_class.get_dob();
            
            /* Set values to edit*/
            edit_fn.setText(Fname);
            edit_ln.setText(Lname);
            edit_email.setText(Email);
            edit_phone.setText(Phone);
            edit_address.setText(Address);
                    
            try {  
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(Dob);
                edit_dob.setDate(date);
            } catch (ParseException ex) {}
      
        }
        
    }//GEN-LAST:event_edit_myprofile_smActionPerformed

    private void create_an_user_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_an_user_smActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        dynamic_2.add(create_user);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        /* Disable post for admins on starting time */
        Department_ComboBox.disable();
        
        String sDate="1980-01-01";  
        try {  
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(sDate);
            Dob_DateChooser.setDate(date);
        } catch (ParseException ex) {}
    }//GEN-LAST:event_create_an_user_smActionPerformed

    private void view_user_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_user_smActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        dynamic_2.add(view_users);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        /* Disable update and delete before select the table row*/
        
        Update_Button.setEnabled(false);
        Delete_Button.setEnabled(false);
        
        /* load all users to table */
        
        refresh_user_table();
    }//GEN-LAST:event_view_user_smActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        dynamic_2.add(update_user);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        /*disable password field until press reset default pwd*/
        UPWD_PasswordField.setEnabled(false);
        
        /*get selected row for update*/
        
        if(selected_user!=null){
            
            ResultSet res;
            
            res = admin_class.get_selected_user_info(selected_user);
            
            try {
                if(res.next()){
                    
                    UUser_id_TextField.setText( res.getString("user_id") );
                   
                    /*Manage departmet field by user type*/
                    if("admin".equals(res.getString("post")))UDepartment_ComboBox.disable();
                    else{UDepartment_ComboBox.enable();}
                    
                    if("admin".equals(res.getString("post")))UPost_ComboBox.setSelectedIndex(0);
                    else if("lec".equals(res.getString("post")))UPost_ComboBox.setSelectedIndex(1);
                    else if("teo".equals(res.getString("post")))UPost_ComboBox.setSelectedIndex(2);
                    else if("stu".equals(res.getString("post")))UPost_ComboBox.setSelectedIndex(3);
                    
                    if("ICT".equals(res.getString("department")))UDepartment_ComboBox.setSelectedIndex(0);
                    else if("ET".equals(res.getString("department")))UDepartment_ComboBox.setSelectedIndex(1);
                    else if("BST".equals(res.getString("department")))UDepartment_ComboBox.setSelectedIndex(2);
                    
                    UFirst_name_TextField.setText( res.getString("first_name") );
                    UlLast_name_TextField.setText( res.getString("last_name") );
                    UPhone_TextField.setText( res.getString("first_name") );
                    UPhone_TextField.setText( res.getString("phone") );
                    UEmail_TextField.setText( res.getString("email") );
                    UAddress_TextField.setText( res.getString("address") );
                    UPWD_PasswordField.setText("");

                    String Sdate = res.getString("dob");
                    try { 
                        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(Sdate);
                        UDob_DateChooser.setDate(date);
                    } catch (ParseException ex) {}
   
                 }
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        dynamic_2.add(view_users);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        /*Disable update and delete*/
        
        Update_Button.setEnabled(false);
        Delete_Button.setEnabled(false);
    }//GEN-LAST:event_Back1ActionPerformed

    private void create_course_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_course_smActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        dynamic_2.add(create_subject);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        ResultSet res = null;
        
        if("admin".equals(user_post))
            res = admin_class.get_all_lec_for_conduct_cource();
        else if ("lec".equals(user_post))
            res = lec_class.get_all_lec_for_conduct_cource();
        
        
       try {
           con_lec_id.removeAllItems();
           while(res.next()){
                 con_lec_id.addItem(res.getString("user_id"));
           }
       } catch (SQLException ex) {}
                
    }//GEN-LAST:event_create_course_smActionPerformed

    private void edit_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_subActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        dynamic_2.add(edit_subject);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        /*Get selected subject code and conducting lecturers*/
        
        ResultSet res = null;
        ResultSet lec_res = null;
        
        if("admin".equals(user_post)){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
            res = admin_class.get_selected_subject_infor(selected_subject);
            lec_res = admin_class.get_all_lec_for_conduct_cource();
        }
        else if("lec".equals(user_post)){
            res = lec_class.get_selected_subject_infor(selected_subject);
            lec_res = lec_class.get_all_lec_for_conduct_cource();
        }
        
        
        /*Check for avalbile subjet to edit */
            
            try {
                
                if(res.next()){
                
                    e_sub_code.setText(res.getString("sub_code"));
                    e_sub_name.setText(res.getString("sub_name"));
                    e_credits.setText(res.getString("credit"));
                     
                    
                    try {
                         e_sub_dept.setSelectedItem(res.getString("sub_dept"));
                     } catch (Exception e) {
                         JOptionPane.showMessageDialog(null, "Department not found.", "Error", JOptionPane.ERROR_MESSAGE);
                     }

                     e_con_lec.removeAllItems();
                     while(lec_res.next()){
                           e_con_lec.addItem(lec_res.getString("user_id"));
                     }

                     try {
                         e_con_lec.setSelectedItem( res.getString("conducting_by"));
                     } catch (Exception e) {
                         JOptionPane.showMessageDialog(null, "Lecturer not found.", "Error", JOptionPane.ERROR_MESSAGE);
                     }

                     if(1==res.getInt("theory"))e_theory.setSelected(true);
                     if(1==res.getInt("practical"))e_practical.setSelected(true);


                }else{
                    JOptionPane.showMessageDialog(null, "Subject not available for edit.", "Error", JOptionPane.ERROR_MESSAGE);
                }    
                
            } catch (Exception e) {
                System.out.println("ress");
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        
        
    }//GEN-LAST:event_edit_subActionPerformed

    private void maintain_cource_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintain_cource_smActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        dynamic_2.add(view_subjects);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        /*update subject table */
       refresh_course_table();
        
        edit_sub.setEnabled(false);
        delete_sub.setEnabled(false);
    }//GEN-LAST:event_maintain_cource_smActionPerformed

    private void back_to_view_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_view_subActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        dynamic_2.add(view_subjects);
        dynamic_2.repaint();
        dynamic_2.revalidate();
    }//GEN-LAST:event_back_to_view_subActionPerformed

    private void Create_an_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_an_userActionPerformed
        
        /* Get Information for add an user */
        
        if("admin".equals(this.user_post)){
            
            
            int p_index = (int) Post_ComboBox.getSelectedIndex();
            String d = (String) Department_ComboBox.getSelectedItem();
            String fn = (String) F_name_TextField.getText().trim();
            String ln = (String) L_name_TextField.getText().trim();
            String phn = (String) Phone_TextField.getText().trim();
            String mail = (String) Email_Text_Field.getText().trim();
            String ui_f = (String) UserId_front_TextField.getText().trim();
            String ui_b = (String) UserId_back_TextField.getText().trim();
            String adrs = (String) Address_TextField.getText().trim();
            String pwd =  pwd_PasswordField.getText();

            byte[] byte_pwd = pwd.getBytes();
            
            /* validate fields is empty*/
            if( (!"".equals(fn))&&(!"".equals(ln))&&(!"".equals(phn))&&(!"".equals(mail))&&(!"".equals(ui_b))&&(!"".equals(pwd)) ){
                
                   /* Prepareing birth day to before add user table*/
                    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                    Date bday = null;
                    String dob = null;

                    try {
                        bday =  Dob_DateChooser.getDate();
                        dob = dateformat.format(bday);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    
                    
                    String up=null;

                    switch (p_index) {
                        case 0:
                            up = "admin";
                            d = "NULL";
                            break;
                        case 1:
                            up = "lec";
                            d = "'"+d+"'";
                            break;
                        case 2:
                            up = "teo";
                            d = "'"+d+"'";
                            break;
                        case 3:
                            up = "stu";
                            d = "'"+d+"'";
                            break;
                        default:
                            break;
                    }

                    
                     boolean added = admin_class.add_user(ui_f + ui_b, up, d, fn, ln, mail, phn, adrs, dob , byte_pwd);
                
                     
                        /*Clear all data previous added*/
                       if(added){
                                Post_ComboBox.setSelectedIndex(0);
                                Department_ComboBox.setSelectedIndex(0);
                                F_name_TextField.setText("");
                                L_name_TextField.setText("");
                                Phone_TextField.setText("");
                                Email_Text_Field.setText("");
                                UserId_front_TextField.setText("");
                                UserId_back_TextField.setText("");
                                Address_TextField.setText("");
                                Dob_DateChooser.setDate(bday);
                                pwd_PasswordField.setText("12345");
                                
                                String sDate="1980-01-01";  
                                try {  
                                    Date date = new SimpleDateFormat("yyyy-MM-dd").parse(sDate);
                                    Dob_DateChooser.setDate(date);
                                } catch (ParseException ex) {}
                       }
                     
            }else{
                JOptionPane.showMessageDialog(null, "You have to fill all required fields.");
            }
       
        }
        else{
            JOptionPane.showMessageDialog(null, "You have no permission to create new users.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_Create_an_userActionPerformed

    private void Post_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Post_ComboBoxActionPerformed
        
        
        int p_index = (int) Post_ComboBox.getSelectedIndex();
        
       /* Filter user id by post */
       switch (p_index) {
           case 0:
               UserId_front_TextField.setText("admin");
               Department_ComboBox.disable();
               break;
           case 1:
               UserId_front_TextField.setText("lec");
               Department_ComboBox.enable();
               break;
           case 2:
               UserId_front_TextField.setText("teo");
               Department_ComboBox.enable();
               break;
           case 3:
               UserId_front_TextField.setText("stu");
               Department_ComboBox.enable();
               break;
           default:
               break;
       }
        
        
    }//GEN-LAST:event_Post_ComboBoxActionPerformed

    private void UType_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UType_ComboBoxActionPerformed
     
        int type = (int) UType_ComboBox.getSelectedIndex();   
        
        if(type==1){
            Dept_ComboBox.disable();
        }else{
            Dept_ComboBox.enable();
        }
        
        refresh_user_table();
    }//GEN-LAST:event_UType_ComboBoxActionPerformed

    private void Dept_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dept_ComboBoxActionPerformed
        refresh_user_table();
    }//GEN-LAST:event_Dept_ComboBoxActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        refresh_user_table();
    }//GEN-LAST:event_search_btnActionPerformed

    private void refresh_user_table(){
        
        ResultSet res = null;
        
        /* load all users to table */
        
        if("admin".equals(user_post)){
        
            int type = (int) UType_ComboBox.getSelectedIndex();
            String dept = (String) Dept_ComboBox.getSelectedItem();
            String srh = (String) Search_TextField.getText();
            
            res = admin_class.view_users(type, dept, srh);
            
        }
        else if("lec".equals(user_post)){
            
            UType_ComboBox.disable();
            UType_ComboBox.setSelectedIndex(4);
            String dept = (String) Dept_ComboBox.getSelectedItem();
            String srh = (String) Search_TextField.getText();
            
            res = lec_class.view_students(dept, srh);
        }
        
        
        
        /*update table */
        User_Table.setModel(DbUtils.resultSetToTableModel(res));
        
    }
    

    private void User_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User_TableMouseClicked
        
        /*Enable update and delete*/
        
        if("admin".equals(user_post)){
            Update_Button.setEnabled(true);
            Delete_Button.setEnabled(true);
        }
              
        DefaultTableModel model = (DefaultTableModel) User_Table.getModel();
        int selected_row_index = User_Table.getSelectedRow();
        
        /*Get selected user id*/
        String selected_uid = model.getValueAt(selected_row_index, 0).toString();
        //System.out.println(selected_uid);
        selected_user = selected_uid;
    }//GEN-LAST:event_User_TableMouseClicked

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        
        if("admin".equals(user_post)){
                
               boolean deleted;
            
               if (selected_user!=null) {
                   
                    deleted  = admin_class.delete_user(selected_user);

                    if (deleted) {
                         refresh_user_table(); 

                         /* Disable update and delete before select the table row*/

                         Update_Button.setEnabled(false);
                         Delete_Button.setEnabled(false);
                    }
               }
        }
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void UReset_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UReset_pwdActionPerformed
        UPWD_PasswordField.setEnabled(true);
        UPWD_PasswordField.setText("12345");
    }//GEN-LAST:event_UReset_pwdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UPWD_PasswordField.setEnabled(false);
        UPWD_PasswordField.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        
        String uui = UUser_id_TextField.getText();
        int upst = UPost_ComboBox.getSelectedIndex();
        String ud =  (String) UDepartment_ComboBox.getSelectedItem();
        String ufn = UFirst_name_TextField.getText();
        String uln = UlLast_name_TextField.getText();
        String uphn = UPhone_TextField.getText();
        String umail = UEmail_TextField.getText();
        String uadrs = UAddress_TextField.getText();
        String upwd = UPWD_PasswordField.getText();
        
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date ubday = null;
        String udob = null;

        try {
            ubday =  UDob_DateChooser.getDate();
            udob = dateformat.format(ubday);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        if ("admin".equals(user_post)) {
            System.out.println(udob);
           
            boolean updated = admin_class.update_user(uui,upst,ud,ufn,uln,uphn,umail,uadrs,udob,upwd);
            
            if(updated){
                JOptionPane.showMessageDialog(null, "Successfuly updated a user.");
                
                /*Load veiw users after updated*/
                dynamic_2.removeAll();
                dynamic_2.repaint();
                dynamic_2.revalidate();

                dynamic_2.add(view_users);
                dynamic_2.repaint();
                dynamic_2.revalidate();
                
                /*Refrase user table*/
                refresh_user_table();
            }
            
        }
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void change_dp_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_dp_smActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();

        dynamic_2.add(change_image);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        save_image.setEnabled(false);
    }//GEN-LAST:event_change_dp_smActionPerformed

    private void change_mypwd_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_mypwd_smActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();

        dynamic_2.add(change_pwd);
        dynamic_2.repaint();
        dynamic_2.revalidate();
    }//GEN-LAST:event_change_mypwd_smActionPerformed

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyActionPerformed
        
        String Uid = null;
        String Fname = null;
        String Lname = null;
        String Email = null;
        String Phone = null;
        String Address = null;
        String Dob = null;
        boolean edited = false;
        
         /* Get values to edit*/
            Fname = edit_fn.getText();
            Lname = edit_ln.getText();
            Email = edit_email.getText();
            Phone = edit_phone.getText();
            Address = edit_address.getText();
                    
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            Date ebday = null;
            String edob = null;

            try {
                ebday =  edit_dob.getDate();
                Dob = dateformat.format(ebday);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
            
        if("admin".equals(user_post)){
                
                /* call for edit*/
                edited = admin_class.edit_profile(my_id,Fname,Lname,Email,Phone, Address,Dob);
                        
                if(edited){
                     JOptionPane.showMessageDialog(null, "Changes are applied.");

                     admin_class.set_f_name(Fname);
                     admin_class.set_l_name(Lname);
                     admin_class.set_email(Email);
                     admin_class.set_phone(Phone);
                     admin_class.set_address(Address);
                     admin_class.set_dob(Dob);
                }else{
                    JOptionPane.showMessageDialog(null, "Changes are not applied. somthing went wrong");
                }
        
        }
        else if("lec".equals(user_post)){
               
                /* call for edit*/
                edited = lec_class.edit_profile(my_id,Fname,Lname,Email,Phone, Address,Dob);
                        
                if(edited){
                     JOptionPane.showMessageDialog(null, "Changes are applied.");

                     lec_class.set_f_name(Fname);
                     lec_class.set_l_name(Lname);
                     lec_class.set_email(Email);
                     lec_class.set_phone(Phone);
                     lec_class.set_address(Address);
                     lec_class.set_dob(Dob);
                }else{
                    JOptionPane.showMessageDialog(null, "Changes are not applied. somthing went wrong");
                }
        
        }
        else if("teo".equals(user_post)){
               
                /* call for edit*/
                edited = teo_class.edit_profile(my_id,Fname,Lname,Email,Phone, Address,Dob);
                        
                if(edited){
                     JOptionPane.showMessageDialog(null, "Changes are applied.");

                     teo_class.set_f_name(Fname);
                     teo_class.set_l_name(Lname);
                     teo_class.set_email(Email);
                     teo_class.set_phone(Phone);
                     teo_class.set_address(Address);
                     teo_class.set_dob(Dob);
                }else{
                    JOptionPane.showMessageDialog(null, "Changes are not applied. somthing went wrong");
                }
        
        }
            
         
        
    }//GEN-LAST:event_applyActionPerformed

    private void apply_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apply_pwdActionPerformed
        
        boolean changed;
        
        String Current = current_pwd.getText();
        String New = new_pwd.getText();
        String Confirm = confirm_pwd.getText();
        
        byte[] byte_current = Current.getBytes();
        byte[] byte_New = New.getBytes();
        

        Encrypt e = new Encrypt();
        String enctrypted_current_pwd = e.MD5(byte_current, "md5");
        String encrypted_new_pwd = e.MD5(byte_New, "md5");
        
        if(!"".equals(Current) && !"".equals(New) && !"".equals(Confirm)){
        
                if(New.equals(Confirm)){
                    if("admin".equals(user_post)){
                          changed = admin_class.change_pwd(admin_class.get_id(),enctrypted_current_pwd, encrypted_new_pwd);
                          
                          if(changed){
                              JOptionPane.showMessageDialog(null,"Password changed.");
                              current_pwd.setText("");
                              new_pwd.setText("");
                              confirm_pwd.setText(""); 
                          }
                    }else if("lec".equals(user_post)) {
                          changed = lec_class.change_pwd(lec_class.get_id(),enctrypted_current_pwd, encrypted_new_pwd);
                          
                          if(changed){
                              JOptionPane.showMessageDialog(null,"Password changed.");
                              current_pwd.setText("");
                              new_pwd.setText("");
                              confirm_pwd.setText(""); 
                          }
                    }else if("teo".equals(user_post)){
                           changed = teo_class.change_pwd(teo_class.get_id(),enctrypted_current_pwd, encrypted_new_pwd);
                          
                          if(changed){
                              JOptionPane.showMessageDialog(null,"Password changed.");
                              current_pwd.setText("");
                              new_pwd.setText("");
                              confirm_pwd.setText(""); 
                          }
                    }
                }else{
                     JOptionPane.showMessageDialog(null, "Password confirm faild.", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }else{
            JOptionPane.showMessageDialog(null, "Password fields are empty.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_apply_pwdActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        
       /*try {
           String usrname = InetAddress.getLocalHost().getHostName();
       } catch (UnknownHostException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       }*/
       String usrname = System.getProperty("user.name");
        
        JFileChooser open  = new JFileChooser();
        open.setCurrentDirectory(new java.io.File("C:/Users/"+usrname+"/Pictures"));
        open.setDialogTitle("Choose an image");
        open.setFileSelectionMode(JFileChooser.FILES_ONLY);
        open.addChoosableFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png"));
        open.setAcceptAllFileFilterUsed(false);
        
        if(open.showOpenDialog(browse)==JFileChooser.APPROVE_OPTION){
        
            System.out.println(open.getSelectedFile().getAbsolutePath());
            String imgpath = open.getSelectedFile().getAbsolutePath();
            
            /*Crop the image*/
            
            javaxt.io.Image image = new javaxt.io.Image(imgpath);
            //System.out.println(image.getWidth() + "x" + image.getHeight());
            image.resize(140, 140);
            //System.out.println(image.getWidth() + "x" + image.getHeight());
            
            /* Create new folder for keap imag temporary */
            
            File f = new File("C:/Users/"+usrname+"/Documents/Tmp_profiles/");
            f.mkdir();
            
            /*Sate to */
            String tmpimgpath = "C:/Users/"+usrname+"/Documents/Tmp_profiles/"+this.my_id+".jpg";
             /*Save croped image temporary*/
            image.saveAs(tmpimgpath);
     
            display_picture.setIcon(new ImageIcon(tmpimgpath));
            
            
            /* Enable save button*/
            save_image.setEnabled(true);
               
            
        }
        
        
    }//GEN-LAST:event_browseActionPerformed

    private void save_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_imageActionPerformed
        
        String usrname = System.getProperty("user.name");
         
        boolean changed = false;
        
        try {
               InputStream imgfile = new FileInputStream(new File("C:/Users/"+usrname+"/Documents/Tmp_profiles/"+this.my_id+".jpg"));
               
               if("admin".equals(user_post)){
                   if(admin_class.change_profile_image(my_id, (FileInputStream) imgfile))save_image.setEnabled(false);
               }
               else if("lec".equals(user_post)){
                   if(lec_class.change_profile_image(my_id, (FileInputStream) imgfile))save_image.setEnabled(false);
               }
               else if("teo".equals(user_post)){//admin_class.change_profile_image(my_id, (FileInputStream) imgfile);
                   if(teo_class.change_profile_image(my_id, (FileInputStream) imgfile))save_image.setEnabled(false);
               }
               
           } catch (FileNotFoundException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           }
 
        
    }//GEN-LAST:event_save_imageActionPerformed

    private void create_a_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_a_courseActionPerformed
        
        String s_dept = (String) sub_dept.getSelectedItem();
        String s_code = sub_code.getText();
        String s_name = sub_name.getText();
        String s_lec = (String) con_lec_id.getSelectedItem();
        int t;
        int p;
        try {
            float s_credit = Float.parseFloat(credits.getText());
            
            t = (theory_check.isSelected())? 1 : 0;
            p = (practical_check.isSelected())? 1 : 0;
            
            if(p==1 || t==1){
                if(admin_class.add_subject(s_code,s_name,s_dept,s_credit,s_lec,t,p)){

                    sub_dept.setSelectedIndex(0);
                    sub_code.setText("");
                    sub_name.setText("");
                    credits.setText("");
                    con_lec_id.setSelectedIndex(0);
                    theory_check.setSelected(false);
                    practical_check.setSelected(false);

                }
            }else{
                JOptionPane.showMessageDialog(null,"Select subject type.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_create_a_courseActionPerformed

    private void sub_departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_departmentActionPerformed
        refresh_course_table();
    }//GEN-LAST:event_sub_departmentActionPerformed

    private void search_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_subActionPerformed
        refresh_course_table();
    }//GEN-LAST:event_search_subActionPerformed

    private void Subject_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Subject_TableMouseClicked
        edit_sub.setEnabled(true);
        delete_sub.setEnabled(true);
        
        DefaultTableModel model = (DefaultTableModel) Subject_Table.getModel();
        int selected_row_index = Subject_Table.getSelectedRow();
        
        /*Get selected subject id*/
        String selected_sid = model.getValueAt(selected_row_index, 0).toString();
       
        selected_subject = selected_sid;
    }//GEN-LAST:event_Subject_TableMouseClicked

    private void save_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_subjectActionPerformed
        
        String u_sub_code = e_sub_code.getText();
        String u_sub_name = e_sub_name.getText();
        String u_sub_dept = (String) e_sub_dept.getSelectedItem();
        String u_con_lec = (String) e_con_lec.getSelectedItem();
        
        float u_credits = Float.parseFloat(e_credits.getText());
        int u_theory = (e_theory.isSelected())? 1 : 0;
        int u_practical = (e_practical.isSelected())? 1 : 0;
        
        boolean updated = false;
        
        if("admin".equals(user_post)){
            updated = admin_class.update_subject(u_sub_code, u_sub_name, u_sub_dept, u_credits, u_con_lec, u_theory, u_practical);
        }else if("lec".equals(user_post)){
            //updated = lec_class.update_subject(u_sub_code, u_sub_name, u_sub_dept, u_credits, u_con_lec, u_theory, u_practical);
        }
        
        if(updated){
            JOptionPane.showMessageDialog(null, "Subject succsessfuly updated.");
            
            dynamic_2.removeAll();
            dynamic_2.repaint();
            dynamic_2.revalidate();

            dynamic_2.add(view_subjects);
            dynamic_2.repaint();
            dynamic_2.revalidate();

            /*update subject table */
            refresh_course_table();

            edit_sub.setEnabled(false);
            delete_sub.setEnabled(false);
        }
        
    }//GEN-LAST:event_save_subjectActionPerformed

    private void delete_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_subActionPerformed
        
        boolean deleted;
        
        if("admin".equals(user_post)){
                
               if (selected_subject!=null) {
                   
                    deleted  = admin_class.delete_subject(selected_subject);

                    if (deleted) {
                         refresh_course_table();

                         /* Disable update_sub and delete_sub before select the table row*/

                         edit_sub.setEnabled(false);
                         delete_sub.setEnabled(false);
                    }
               }
        }
        
    }//GEN-LAST:event_delete_subActionPerformed

    private void submit_noticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_noticeActionPerformed
        
        String n_topic = notice_topic.getText();
        String notice = notices_TextArea.getText();
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
        Date ndate = null;
        String str_ndate = null;

        try {
            ndate =  notice_dateChooser.getDate();
            str_ndate = dateformat.format(ndate);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        boolean uploaded = false;
        
        if("admin".equals(user_post)){
            
            if(!"".equals(n_topic) && !"".equals(notice) && str_ndate!=null)
                uploaded = admin_class.create_notice(n_topic,str_ndate,notice);
            else
                JOptionPane.showMessageDialog(null, "Fill required feilds.");
            
            
            if(uploaded){
                notice_topic.setText("");
                notices_TextArea.setText("");
                
                String sDate=java.time.LocalDate.now().toString();  
                try {  
                    Date date = new SimpleDateFormat("yyyy-MM-dd").parse(sDate);
                    notice_dateChooser.setDate(date);
                } catch (ParseException ex) {}
            }
            
        }else{
              JOptionPane.showMessageDialog(null, "You have no permision to create notice.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_submit_noticeActionPerformed

    private void upload_notice_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_notice_smActionPerformed
            dynamic_2.removeAll();
            dynamic_2.repaint();
            dynamic_2.revalidate();

            dynamic_2.add(create_notice);
            dynamic_2.repaint();
            dynamic_2.revalidate();
    }//GEN-LAST:event_upload_notice_smActionPerformed

    private void view_and_maintain_notice_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_and_maintain_notice_smActionPerformed
            dynamic_2.removeAll();
            dynamic_2.repaint();
            dynamic_2.revalidate();

            dynamic_2.add(view_notice);
            dynamic_2.repaint();
            dynamic_2.revalidate();
            
            delete_notice.setEnabled(false);
            
            /*Load All Notices to table*/
            update_notice_table();
    }//GEN-LAST:event_view_and_maintain_notice_smActionPerformed

    private void notices_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notices_tableMouseClicked
       
        if("admin".equals(user_post))
            delete_notice.setEnabled(true);
        
        DefaultTableModel model = (DefaultTableModel) notices_table.getModel();
        int selected_row_index = notices_table.getSelectedRow();
        
        /*view selected notice*/
        view_notice_topic.setText(model.getValueAt(selected_row_index, 1).toString());
        view_notice_TextArea.setText(model.getValueAt(selected_row_index, 3).toString());
        
        String sDate=model.getValueAt(selected_row_index, 2).toString();  
        try {  
              Date date = new SimpleDateFormat("yyyy-MM-dd").parse(sDate);
              view_notice_DateChooser.setDate(date);
        } catch (ParseException ex) {}
        
    }//GEN-LAST:event_notices_tableMouseClicked

    private void delete_noticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_noticeActionPerformed
        
        boolean deleted = false;
        
       DefaultTableModel model = (DefaultTableModel) notices_table.getModel();
       int selected_row_index = notices_table.getSelectedRow();
        
       /*get selected notice id*/
       deleted = admin_class.delete_notice(Integer.parseInt(model.getValueAt(selected_row_index, 0).toString()));
       
       if(deleted)update_notice_table();
        
    }//GEN-LAST:event_delete_noticeActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
 
        admin_class = null;
        lec_class = null ;
        teo_class = null;
        
        Login signout = new Login();
        signout.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        admin_class = null;
        lec_class = null ;
        teo_class = null;
        
        System.exit(0);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();

        dynamic_2.add(about);
        dynamic_2.repaint();
        dynamic_2.revalidate();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String timetable_name = t_tabel_name.getText();
        String timetable_dept = t_table_department.getSelectedItem().toString();
        
       DefaultTableModel model = (DefaultTableModel) new_time_table.getModel();
       int selected_row_index = new_time_table.getSelectedRow();
       
       String timetable_data[][] = new String[9][6];
       
       for(int row = 0; row<9; row++){
           for(int col = 0; col<6; col++)
               
               if(model.getValueAt(row, col)!=null)
                   timetable_data[row][col] = model.getValueAt(row, col).toString();
               else
                   timetable_data[row][col] = "";
       }  
       
       admin_class.create_new_time_table(timetable_name, timetable_dept, timetable_data);
        
       /*for(int row = 0; row<9; row++){
           for(int col = 0; col<6; col++)
               System.out.println(timetable_data[row][col]);
       }*/
       
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();

        dynamic_2.add(create_timetable);
        dynamic_2.repaint();
        dynamic_2.revalidate();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void select_ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_ttActionPerformed
        
        /*set selected time table to show */
        
       String selected_tt = select_tt.getSelectedItem().toString();
       
       ResultSet res;
      
       res = admin_class.get_selected_timetable(selected_tt);
       if(res!=null)view_time_table.setModel(DbUtils.resultSetToTableModel(res));
        
    }//GEN-LAST:event_select_ttActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();

        dynamic_2.add(view_timetable);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        ResultSet res;
        
        res = admin_class.get_saved_timetables();
      
        try {
            select_tt.removeAllItems();
            while(res.next()){
                  select_tt.addItem(res.getString("t_name"));
            }
        } catch (SQLException ex) {}

    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void attendance_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendance_updateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendance_updateMouseClicked

    private void mark_attendance_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark_attendance_smActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();

        dynamic_2.add(mark_attendance);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        /* set avalible students and subjects to combobox*/
        
        ResultSet res;
        
        res = teo_class.get_all_students();
      
        try {
            stu_idComboBox.removeAllItems();
            while(res.next()){
                  stu_idComboBox.addItem(res.getString("user_id"));
            }
        } catch (SQLException ex) {}
        
        /*----*/
        
        res = teo_class.get_all_subjects();
        
        try {
            sub_idComboBox.removeAllItems();
            while(res.next()){
                  sub_idComboBox.addItem(res.getString("sub_code"));
            }
        } catch (SQLException ex) {}
        
       
        
         SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
         String sDate=java.time.LocalDate.now().toString();  
         
         try {  
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(sDate);
            a_date.setDate(date);
         } catch (ParseException ex) {}
         
    
    }//GEN-LAST:event_mark_attendance_smActionPerformed

    private void attendance_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendance_addActionPerformed
        
        String selected_stu_id = stu_idComboBox.getSelectedItem().toString();
        String selected_subject = sub_idComboBox.getSelectedItem().toString();
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
        Date adate = null;
        String str_adate = null;

        try {
            adate =  a_date.getDate();
            str_adate = dateformat.format(adate);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        
        int theory = 0;
        int practical = 0;
        
        if(theory_CheckBox.isSelected()){
            theory = 1;
        }
        if(practical_CheckBox.isSelected()){
            practical = 1;
        }
        
        boolean added = false;
        
        added = teo_class.add_attendance(selected_stu_id, selected_subject, str_adate, theory, practical);
            
        if (added) 
            JOptionPane.showMessageDialog(null, "One row added.");
        else
            JOptionPane.showMessageDialog(null, "Couldn't add attendance.", "Error", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_attendance_addActionPerformed

    private void view_attendance_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_attendance_smActionPerformed
        
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();

        dynamic_2.add(view_attendance);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        /**/
        edit_attendance.setEnabled(false);
        delete_attendance.setEnabled(false);
        
        ResultSet res;
        
        res = teo_class.get_all_subjects();
        
        try {
            sub_id_for_viewComboBox.removeAllItems();
            while(res.next()){
                  sub_id_for_viewComboBox.addItem(res.getString("sub_code"));
            }
        } catch (SQLException ex) {}
       
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
         String sDate=java.time.LocalDate.now().toString();  
         
         try {  
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(sDate);
            a_date_for_view.setDate(date);
         } catch (ParseException ex) {}
        
         

         refresh_attendance_table();
      
    }//GEN-LAST:event_view_attendance_smActionPerformed

    
   
    
    private void view_attendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_attendActionPerformed
        refresh_attendance_table();
    }//GEN-LAST:event_view_attendActionPerformed

    private void view_attendance_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_attendance_tableMouseClicked
         
        
        if("teo".equals(user_post)){
            edit_attendance.setEnabled(true);
            delete_attendance.setEnabled(true);
        }
              
        DefaultTableModel model = (DefaultTableModel) view_attendance_table.getModel();
        int selected_row_index = view_attendance_table.getSelectedRow();
        
        /*Get selected user id*/
        String selected_uid = model.getValueAt(selected_row_index, 0).toString();
        
        //System.out.println(selected_uid);
        this.selected_user = selected_uid;

    }//GEN-LAST:event_view_attendance_tableMouseClicked

    private void edit_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_attendanceActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();

        dynamic_2.add(update_attendance);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        
        update_attendance_stuid.setText(selected_user);
        update_attendance_subid.setText(now_showing_subid);
        update_attendance_date.setText(now_showing_strdate);
        
        /* Reset attendace to inteface for update */
        
        ResultSet res;
        
        res = teo_class.get_one_student_attend(selected_user,now_showing_subid,now_showing_strdate);
        
       try {
           res.next();
           if(res.getInt("a_theory")==1) update_theoryCheckBox.setSelected(true);
           if(res.getInt("a_practical")==1) update_practicalCheckBox.setSelected(true);
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
       }
        
    }//GEN-LAST:event_edit_attendanceActionPerformed

    private void back_to_view_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_view_attendanceActionPerformed

        update_theoryCheckBox.setSelected(false);
        update_practicalCheckBox.setSelected(false);
        
        refresh_attendance_table();
        
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();

        dynamic_2.add(view_attendance);
        dynamic_2.repaint();
        dynamic_2.revalidate();
    }//GEN-LAST:event_back_to_view_attendanceActionPerformed

    private void attendance_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendance_updateActionPerformed
       
        boolean updated;
        
        int t = 0;
        int p = 0;
        
        if(update_theoryCheckBox.isSelected()) t = 1;
        if(update_practicalCheckBox.isSelected()) p = 1;
        
        updated = teo_class.update_attendance(selected_user, now_showing_subid, now_showing_strdate, t, p);
        
        if(updated) JOptionPane.showMessageDialog(null, "One row successfuly updated.") ;
        
    }//GEN-LAST:event_attendance_updateActionPerformed

    private void delete_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_attendanceActionPerformed
        
        boolean deleted = false;

        deleted = teo_class.delete_attendance(selected_user, now_showing_subid, now_showing_strdate);
        
        if(deleted) JOptionPane.showMessageDialog(null, "One row successfuly deleted.") ;
        
        refresh_attendance_table();
    }//GEN-LAST:event_delete_attendanceActionPerformed

    private void submit_medicals_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_medicals_smActionPerformed
        
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();

        dynamic_2.add(submit_medicals);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        /* set avalible students and subjects to combobox*/
        
        ResultSet res;
        
        res = teo_class.get_all_students();
      
        try {
            stu_id_for_medical.removeAllItems();
            while(res.next()){
                  stu_id_for_medical.addItem(res.getString("user_id"));
            }
        } catch (SQLException ex) {}
        
        /*----*/
        
        res = teo_class.get_all_subjects();
        
        try {
            sub_id_for_medical.removeAllItems();
            while(res.next()){
                  sub_id_for_medical.addItem(res.getString("sub_code"));
            }
        } catch (SQLException ex) {}
        
       
        
         SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
         String sDate=java.time.LocalDate.now().toString();  
         
         try {  
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(sDate);
            m_date.setDate(date);
         } catch (ParseException ex) {}
        
    }//GEN-LAST:event_submit_medicals_smActionPerformed

    private void submit_medicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_medicalActionPerformed
        
        
        String selected_stu_id = stu_id_for_medical.getSelectedItem().toString();
        String selected_subject = sub_id_for_medical.getSelectedItem().toString();
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
        Date adate = null;
        String str_adate = null;

        try {
            adate =  m_date.getDate();
            str_adate = dateformat.format(adate);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        
        int theory = 0;
        int practical = 0;
        
        if(m_theory.isSelected()){
            theory = 1;
        }
        if(m_practical.isSelected()){
            practical = 1;
        }
        
        boolean added = false;
        
        added = teo_class.add_medical(selected_stu_id, selected_subject, str_adate, theory, practical);
            
        if (added) 
            JOptionPane.showMessageDialog(null, "One row added.");
        else
            JOptionPane.showMessageDialog(null, "Couldn't add medical.", "Error", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_submit_medicalActionPerformed

    private void view_edit_medicals_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_edit_medicals_smActionPerformed
        dynamic_2.removeAll();
        dynamic_2.repaint();
        dynamic_2.revalidate();

        dynamic_2.add(view_medicals);
        dynamic_2.repaint();
        dynamic_2.revalidate();
        
        delete_medical.setEnabled(false);
        
        refresh_medical_table();
    }//GEN-LAST:event_view_edit_medicals_smActionPerformed

    private void search_medicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_medicalActionPerformed
        refresh_medical_table();
    }//GEN-LAST:event_search_medicalActionPerformed

    private void delete_medicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_medicalActionPerformed
        
        boolean deleted = false;
        
        deleted = teo_class.delete_medical(selected_user,now_selected_subid,now_showing_strdate);
        
        if(deleted) JOptionPane.showMessageDialog(null, "One row successfuly deleted.") ;
        
        refresh_medical_table();
    }//GEN-LAST:event_delete_medicalActionPerformed

    private void view_medical_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_medical_tableMouseClicked
       
        if("teo".equals(user_post)){
            delete_medical.setEnabled(true);
        }
              
        DefaultTableModel model = (DefaultTableModel) view_medical_table.getModel();
        int selected_row_index = view_medical_table.getSelectedRow();
        
        /*Get selected user id*/
        String selected_uid = model.getValueAt(selected_row_index, 0).toString();
        String selected_sub_id = model.getValueAt(selected_row_index, 1).toString();
        String selected_sdate = model.getValueAt(selected_row_index, 2).toString();
        
        //System.out.println(selected_uid);
        this.selected_user = selected_uid;
        this.now_selected_subid = selected_sub_id;
        this.now_showing_strdate = selected_sdate;
    }//GEN-LAST:event_view_medical_tableMouseClicked

    private void user_idAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_user_idAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_user_idAncestorAdded

    

    
    
    
    
    public void refresh_medical_table(){
    
        String search_medical = search_medicalTextbox.getText();

        
        ResultSet res=null;
        
        res = teo_class.get_medicals(search_medical);
        
        if(res!=null){
            view_medical_table.setModel(DbUtils.resultSetToTableModel(res));
            
        }

    }
    
    
    public void refresh_attendance_table(){
    
        String selected_subject = sub_id_for_viewComboBox.getSelectedItem().toString();
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
        Date adate = null;
        String str_adate = null;

        try {
            adate =  a_date_for_view.getDate();
            str_adate = dateformat.format(adate);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        ResultSet res=null;
        
        res = teo_class.get_attendance(selected_subject, str_adate);
        
        if(res!=null){
            view_attendance_table.setModel(DbUtils.resultSetToTableModel(res));
            
            /*set now showing values*/
            
            now_showing_subid = selected_subject;
            now_showing_strdate = str_adate;
            
            current_attendance.setText(now_showing_subid + " of " + now_showing_strdate);
            
        }

    }
    
    
    
    
    
    public void update_notice_table(){
    
        ResultSet res;

        if("admin".equals(user_post)){
            res = admin_class.view_notice();
            if(res!=null)notices_table.setModel(DbUtils.resultSetToTableModel(res));
        }
        else if("lec".equals(user_post)){
            res = lec_class.view_notice();
            if(res!=null)notices_table.setModel(DbUtils.resultSetToTableModel(res));
        }
        else if("teo".equals(user_post)){
            res = teo_class.view_notice();
            if(res!=null)notices_table.setModel(DbUtils.resultSetToTableModel(res));
        }
        
    }
    
   
    public void refresh_course_table(){
    
        String search_res = subject_search_bar.getText();
        String sub_d = (String) sub_department.getSelectedItem();
        
        ResultSet res;
        
        if("admin".equals(user_post)){
            res = admin_class.view_subject(sub_d,search_res);
            if(res!=null)Subject_Table.setModel(DbUtils.resultSetToTableModel(res));
        }
        else if("lec".equals(user_post)){
            res = lec_class.view_subject(sub_d,search_res);
            if(res!=null)Subject_Table.setModel(DbUtils.resultSetToTableModel(res));
        }else{
            JOptionPane.showMessageDialog(null, "You have no permision to maintain and view subjects.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address_TextField;
    private javax.swing.JButton Back1;
    private javax.swing.JButton Create_an_user;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JComboBox<String> Department_ComboBox;
    private javax.swing.JComboBox<String> Dept_ComboBox;
    private com.toedter.calendar.JDateChooser Dob_DateChooser;
    private javax.swing.JTextField Email_Text_Field;
    private javax.swing.JTextField F_name_TextField;
    private javax.swing.JTextField L_name_TextField;
    private javax.swing.JTextField Phone_TextField;
    private javax.swing.JComboBox<String> Post_ComboBox;
    private javax.swing.JTextField Search_TextField;
    private javax.swing.JTable Subject_Table;
    private javax.swing.JTextField UAddress_TextField;
    private javax.swing.JComboBox<String> UDepartment_ComboBox;
    private com.toedter.calendar.JDateChooser UDob_DateChooser;
    private javax.swing.JTextField UEmail_TextField;
    private javax.swing.JTextField UFirst_name_TextField;
    private javax.swing.JPasswordField UPWD_PasswordField;
    private javax.swing.JTextField UPhone_TextField;
    private javax.swing.JComboBox<String> UPost_ComboBox;
    private javax.swing.JButton UReset_pwd;
    private javax.swing.JComboBox<String> UType_ComboBox;
    private javax.swing.JTextField UUser_id_TextField;
    private javax.swing.JTextField UlLast_name_TextField;
    private javax.swing.JButton Update;
    private javax.swing.JButton Update_Button;
    private javax.swing.JTextField UserId_back_TextField;
    private javax.swing.JTextField UserId_front_TextField;
    private javax.swing.JTable User_Table;
    private com.toedter.calendar.JDateChooser a_date;
    private com.toedter.calendar.JDateChooser a_date_for_view;
    private javax.swing.JPanel about;
    private javax.swing.JLabel address;
    private javax.swing.JButton apply;
    private javax.swing.JButton apply_pwd;
    private javax.swing.JButton attendance_add;
    private javax.swing.JMenu attendance_menu;
    private javax.swing.JButton attendance_update;
    private javax.swing.JButton back_to_view_attendance;
    private javax.swing.JButton back_to_view_sub;
    private javax.swing.JButton browse;
    private javax.swing.JMenuItem change_dp_sm;
    private javax.swing.JPanel change_image;
    private javax.swing.JMenuItem change_mypwd_sm;
    private javax.swing.JPanel change_pwd;
    private javax.swing.JComboBox<String> con_lec_id;
    private javax.swing.JPasswordField confirm_pwd;
    private javax.swing.JMenu course_menu;
    private javax.swing.JButton create_a_course;
    private javax.swing.JMenuItem create_an_user_sm;
    private javax.swing.JMenuItem create_course_sm;
    private javax.swing.JPanel create_notice;
    private javax.swing.JPanel create_subject;
    private javax.swing.JPanel create_timetable;
    private javax.swing.JPanel create_user;
    private javax.swing.JTextField credits;
    private javax.swing.JLabel current_attendance;
    private javax.swing.JPasswordField current_pwd;
    private javax.swing.JButton delete_attendance;
    private javax.swing.JButton delete_medical;
    private javax.swing.JButton delete_notice;
    private javax.swing.JButton delete_sub;
    private javax.swing.JLabel department;
    private javax.swing.JLabel display_picture;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel dp;
    private javax.swing.JPanel dynamic_2;
    private javax.swing.JComboBox<String> e_con_lec;
    private javax.swing.JTextField e_credits;
    private javax.swing.JCheckBox e_practical;
    private javax.swing.JTextField e_sub_code;
    private javax.swing.JComboBox<String> e_sub_dept;
    private javax.swing.JTextField e_sub_name;
    private javax.swing.JCheckBox e_theory;
    private javax.swing.JTextField edit_address;
    private javax.swing.JButton edit_attendance;
    private com.toedter.calendar.JDateChooser edit_dob;
    private javax.swing.JTextField edit_email;
    private javax.swing.JTextField edit_fn;
    private javax.swing.JTextField edit_ln;
    private javax.swing.JMenuItem edit_myprofile_sm;
    private javax.swing.JTextField edit_phone;
    private javax.swing.JPanel edit_profile;
    private javax.swing.JButton edit_sub;
    private javax.swing.JPanel edit_subject;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private com.toedter.calendar.JDateChooser m_date;
    private javax.swing.JCheckBox m_practical;
    private javax.swing.JCheckBox m_theory;
    private javax.swing.JMenuItem maintain_cource_sm;
    private javax.swing.JPanel mark_attendance;
    private javax.swing.JMenuItem mark_attendance_sm;
    private javax.swing.JMenu marks_menu;
    private javax.swing.JMenu medicals_menu;
    private javax.swing.JMenu more_menu;
    private javax.swing.JLabel name;
    private javax.swing.JPasswordField new_pwd;
    private javax.swing.JTable new_time_table;
    private com.toedter.calendar.JDateChooser notice_dateChooser;
    private javax.swing.JMenu notice_menu;
    private javax.swing.JTextField notice_topic;
    private javax.swing.JTextArea notices_TextArea;
    private javax.swing.JTable notices_table;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel post;
    private javax.swing.JCheckBox practical_CheckBox;
    private javax.swing.JCheckBox practical_check;
    private javax.swing.JMenu profile_menu;
    private javax.swing.JPasswordField pwd_PasswordField;
    private javax.swing.JButton save_image;
    private javax.swing.JButton save_subject;
    private javax.swing.JButton search_btn;
    private javax.swing.JButton search_medical;
    private javax.swing.JTextField search_medicalTextbox;
    private javax.swing.JButton search_sub;
    private javax.swing.JComboBox<String> select_tt;
    private javax.swing.JComboBox<String> stu_idComboBox;
    private javax.swing.JComboBox<String> stu_id_for_medical;
    private javax.swing.JTextField sub_code;
    private javax.swing.JComboBox<String> sub_department;
    private javax.swing.JComboBox<String> sub_dept;
    private javax.swing.JComboBox sub_idComboBox;
    private javax.swing.JComboBox sub_id_for_medical;
    private javax.swing.JComboBox<String> sub_id_for_viewComboBox;
    private javax.swing.JTextField sub_name;
    private javax.swing.JTextField subject_search_bar;
    private javax.swing.JButton submit_medical;
    private javax.swing.JPanel submit_medicals;
    private javax.swing.JMenuItem submit_medicals_sm;
    private javax.swing.JButton submit_notice;
    private javax.swing.JTextField t_tabel_name;
    private javax.swing.JComboBox<String> t_table_department;
    private javax.swing.JCheckBox theory_CheckBox;
    private javax.swing.JCheckBox theory_check;
    private javax.swing.JMenu timetable_menu;
    private javax.swing.JPanel update_attendance;
    private javax.swing.JTextField update_attendance_date;
    private javax.swing.JTextField update_attendance_stuid;
    private javax.swing.JTextField update_attendance_subid;
    private javax.swing.JCheckBox update_practicalCheckBox;
    private javax.swing.JCheckBox update_theoryCheckBox;
    private javax.swing.JPanel update_user;
    private javax.swing.JMenuItem upload_notice_sm;
    private javax.swing.JLabel user_id;
    private javax.swing.JMenu user_menu;
    private javax.swing.JPanel user_profile;
    private javax.swing.JMenuItem view_and_maintain_notice_sm;
    private javax.swing.JButton view_attend;
    private javax.swing.JPanel view_attendance;
    private javax.swing.JMenuItem view_attendance_sm;
    private javax.swing.JTable view_attendance_table;
    private javax.swing.JMenuItem view_edit_medicals_sm;
    private javax.swing.JTable view_medical_table;
    private javax.swing.JPanel view_medicals;
    private javax.swing.JPanel view_notice;
    private com.toedter.calendar.JDateChooser view_notice_DateChooser;
    private javax.swing.JTextArea view_notice_TextArea;
    private javax.swing.JTextField view_notice_topic;
    private javax.swing.JMenuItem view_profile_sm;
    private javax.swing.JPanel view_subjects;
    private javax.swing.JTable view_time_table;
    private javax.swing.JPanel view_timetable;
    private javax.swing.JMenuItem view_user_sm;
    private javax.swing.JPanel view_users;
    // End of variables declaration//GEN-END:variables
}
