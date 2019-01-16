package project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;   
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.io.File;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import net.proteanit.sql.DbUtils;
import java.awt.print.*;
import static javax.swing.JOptionPane.OK_OPTION;
import javax.swing.JPasswordField;
import javax.swing.JTable;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class HomePanel extends javax.swing.JFrame {

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
        initComponents();
        Theme_set();
        DoConnect();
        view();
        
    }
    
    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst=null;
    
    public void Theme_set()
    {
        jPanel1.setBackground(Color.WHITE);
        jPanel2.setBackground(Color.WHITE);
        jScrollPane1.setBackground(Color.WHITE);
        viewtable.setBackground(Color.WHITE);
        
        jTextField2_view.setBackground(Color.WHITE);
        jTextField3_view.setBackground(Color.WHITE);
        jTextField4_view.setBackground(Color.WHITE);
        jTextField5_view.setBackground(Color.WHITE);
        jTextField6_view.setBackground(Color.WHITE);
        d.setBackground(Color.WHITE);
        jTextArea1_view.setBackground(Color.WHITE);
        jTextArea1_Path_show.setBackground(Color.WHITE);
        
  
        jTextField2_insert.setBackground(Color.WHITE);
        jTextField3_insert.setBackground(Color.WHITE);
        jTextField4_insert.setBackground(Color.WHITE);
        jDateChooser1.setBackground(Color.WHITE);
        jTextField6_insert.setBackground(Color.WHITE);
        jComboBox1.setBackground(Color.WHITE);
        jTextField8_insert.setBackground(Color.WHITE);
         jTextArea1_Path_show1.setVisible(false);
          jTextArea1_Path_show2.setVisible(false);
          jTextArea1_Path_show3.setVisible(false);
          jTextArea1_Path_show4.setVisible(false);
          jTextArea1_Path_show5.setVisible(false);
          jTextArea1_Path_show6.setVisible(false);
          jTextArea1_Path_show7.setVisible(false);
          jTextArea1_Path_show8.setVisible(false);
          jTextArea1_Path_show9.setVisible(false);
          jTextArea1_Path_show10.setVisible(false);
          jTextArea1_Path_show11.setVisible(false);
          jTextArea1_Path_show12.setVisible(false);
          jTextArea1_Path_show13.setVisible(false);
          jTextArea1_Path_show14.setVisible(false);
          jTextArea1_Path_show15.setVisible(false);
          jTextArea1_Path_show16.setVisible(false);
          jTextArea1_Path_show17.setVisible(false);
          jTextArea1_Path_show18.setVisible(false);
          jTextArea1_Path_show19.setVisible(false);
          jTextArea1_Path_show20.setVisible(false);
          jTextArea1_Path_show21.setVisible(false);
          jTextArea1_Path_show22.setVisible(false);
          jTextArea1_Path_show23.setVisible(false);
          jTextArea1_Path_show24.setVisible(false);
          jTextArea1_Path_show25.setVisible(false);
          jTextArea1_Path_show26.setVisible(false);
          jTextArea1_Path_show27.setVisible(false);
          jTextArea1_Path_show28.setVisible(false);
          jTextArea1_Path_show29.setVisible(false);
          jTextArea1_Path_show30.setVisible(false);
          jTextArea1_Path_show31.setVisible(false);
          jTextArea1_Path_show32.setVisible(false);
          jTextArea1_Path_show33.setVisible(false);
          jTextArea1_Path_show34.setVisible(false);
          jTextArea1_Path_show35.setVisible(false);
          jTextArea1_Path_show36.setVisible(false);
          jTextArea1_Path_show37.setVisible(false);
          jTextArea1_Path_show38.setVisible(false);
          jTextArea1_Path_show39.setVisible(false);
          jTextArea1_Path_show40.setVisible(false);
          jTextArea1_Path_show41.setVisible(false);
          jTextArea1_Path_show42.setVisible(false);
          jTextArea1_Path_show43.setVisible(false);
          jTextArea1_Path_show44.setVisible(false);
          jTextArea1_Path_show45.setVisible(false);
          jTextArea1_Path_show46.setVisible(false);
          jTextArea1_Path_show47.setVisible(false);
          jTextArea1_Path_show48.setVisible(false);
          jTextArea1_Path_show49.setVisible(false);
          jTextArea1_Path_show.setVisible(false);
           Path_show.setVisible(false);
            Path_show1.setVisible(false);
            Path_show2.setVisible(false);
            Path_show3.setVisible(false);
            Path_show4.setVisible(false);
            Path_show5.setVisible(false);
            Path_show6.setVisible(false);
            Path_show7.setVisible(false);
            Path_show8.setVisible(false);
            Path_show9.setVisible(false);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            
            
            
        

    } 

    public void DoConnect()
    {
        try 
        {  String host="jdbc:mysql://localhost:3306/datarecord?zeroDateTimeBehavior=convertToNull";
            String user="root";
            String pass="";
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HomePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            con=DriverManager.getConnection(host, user, pass);
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        //  String sql="select * from information";
        //  rs=stmt.executeQuery(sql);
        //  rs.next();
        } 
        catch (SQLException err_con) 
        {
            JOptionPane.showMessageDialog(null," Error "+err_con.getMessage(),"Error",JOptionPane.ERROR);
        }  
        
        jTextField2_view.setEnabled( false );
        jTextField3_view.setEnabled( false );
        jTextField4_view.setEnabled( false );
        jTextField5_view.setEnabled( false );
        jTextField6_view.setEnabled( false );
        d.setEnabled( false );
        jTextArea1_Path_show.setEnabled( false );
        jTextArea1_view.setEnabled( false );
        jTextArea_allot.setEnabled( false );
        jTextArea_td.setEnabled( false );
        d.setEnabled( false );
        c.setEnabled( false );
        jTextField2_view_name.setEnabled( false );
        
    }
    
    private boolean validate(String password) 
    {
        try 
        {          
              String mydbcon="jdbc:mysql://localhost:3306/datarecord?zeroDateTimeBehavior=convertToNull";
              String usrname="root";
              String passwd="";   
              Connection mycon = DriverManager.getConnection(mydbcon,usrname,passwd);
              PreparedStatement pst = mycon.prepareStatement("Select * from pass where password=?");
             
              pst.setString(1, password);
              ResultSet rs = pst.executeQuery();                        
              if(rs.next())            
                   return true;    
              else
                   return false;            
        }
        catch(Exception e){
           
            //JOptionPane.showMessageDialog(this,"Incorrect Login Credentials","Not Successfully",JOptionPane.INFORMATION_MESSAGE);
            e.getMessage();
            return false;
        }      
    }
    ResultSet rs_table_view=null;
    PreparedStatement pst_table_view=null;

    private void view()
    {
        try
        {
            String sql_table_view="Select Sr_No,Reciet_No,MemberShip_No,Plot_No,Name_Of_Transfer,Allotment_Details,Transfer_Details,Date_Of_Transfer  from information";
            pst_table_view=con.prepareStatement(sql_table_view);
            rs_table_view=pst_table_view.executeQuery();
            viewtable.setModel(DbUtils.resultSetToTableModel(rs_table_view));    
        }
        catch(SQLException err_table_view)
        {
           JOptionPane.showMessageDialog(null," Error "+err_table_view.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    
     
        try
        {String sql_table_view="Select Sr_No,Name,Reciet_No,MemberShip_No,Plot_No,Name_Of_Transfer,Date_Of_Transfer from information";
            
            pst_table_view=con.prepareStatement(sql_table_view);
            rs_table_view=pst_table_view.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs_table_view));    
        }
        catch(SQLException err_table_view)
        {
           JOptionPane.showMessageDialog(null," Error "+err_table_view.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
           try
        {
            
            String sql_table_view="Select Sr_No,Name,Address from information";
            pst_table_view=con.prepareStatement(sql_table_view);
            rs_table_view=pst_table_view.executeQuery();
            jTable3.setModel(DbUtils.resultSetToTableModel(rs_table_view));    
        }
        catch(SQLException err_table_view)
        {
           JOptionPane.showMessageDialog(null," Error "+err_table_view.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
  
    ResultSet rs_table_mouse_click_data_view=null;
    PreparedStatement pst_table_mouse_click_data_view=null;

    ResultSet rs_search=null;
    PreparedStatement pst_search=null;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1_view = new javax.swing.JLabel();
        jLabel2_view = new javax.swing.JLabel();
        jLabel3_view = new javax.swing.JLabel();
        jLabel4_view = new javax.swing.JLabel();
        jLabel5_view = new javax.swing.JLabel();
        jLabel6_view = new javax.swing.JLabel();
        jLabel8_view = new javax.swing.JLabel();
        jTextField2_view = new javax.swing.JTextField();
        jTextField3_view = new javax.swing.JTextField();
        jTextField4_view = new javax.swing.JTextField();
        jTextField5_view = new javax.swing.JTextField();
        jTextField6_view = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        Button_Delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1_view = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Labe2 = new javax.swing.JLabel();
        jTextArea1_Path_show1 = new javax.swing.JTextField();
        Labe3 = new javax.swing.JLabel();
        jTextArea1_Path_show2 = new javax.swing.JTextField();
        Labe5 = new javax.swing.JLabel();
        jTextArea1_Path_show3 = new javax.swing.JTextField();
        Labe4 = new javax.swing.JLabel();
        jTextArea1_Path_show4 = new javax.swing.JTextField();
        Labe6 = new javax.swing.JLabel();
        Labe7 = new javax.swing.JLabel();
        Labe8 = new javax.swing.JLabel();
        Labe14 = new javax.swing.JLabel();
        Labe15 = new javax.swing.JLabel();
        Labe9 = new javax.swing.JLabel();
        Labe10 = new javax.swing.JLabel();
        Labe12 = new javax.swing.JLabel();
        Labe11 = new javax.swing.JLabel();
        Labe13 = new javax.swing.JLabel();
        Labe21 = new javax.swing.JLabel();
        Labe22 = new javax.swing.JLabel();
        Labe16 = new javax.swing.JLabel();
        Labe28 = new javax.swing.JLabel();
        Labe29 = new javax.swing.JLabel();
        Labe17 = new javax.swing.JLabel();
        Labe23 = new javax.swing.JLabel();
        Labe24 = new javax.swing.JLabel();
        Labe19 = new javax.swing.JLabel();
        Labe26 = new javax.swing.JLabel();
        Labe25 = new javax.swing.JLabel();
        Labe18 = new javax.swing.JLabel();
        Labe27 = new javax.swing.JLabel();
        Labe20 = new javax.swing.JLabel();
        Labe50 = new javax.swing.JLabel();
        Labe44 = new javax.swing.JLabel();
        Labe30 = new javax.swing.JLabel();
        Labe45 = new javax.swing.JLabel();
        Labe31 = new javax.swing.JLabel();
        Labe33 = new javax.swing.JLabel();
        Labe47 = new javax.swing.JLabel();
        Labe32 = new javax.swing.JLabel();
        Labe34 = new javax.swing.JLabel();
        Labe46 = new javax.swing.JLabel();
        Labe35 = new javax.swing.JLabel();
        Labe48 = new javax.swing.JLabel();
        Labe36 = new javax.swing.JLabel();
        Labe42 = new javax.swing.JLabel();
        Labe43 = new javax.swing.JLabel();
        Labe37 = new javax.swing.JLabel();
        Labe38 = new javax.swing.JLabel();
        Labe40 = new javax.swing.JLabel();
        Labe39 = new javax.swing.JLabel();
        Labe41 = new javax.swing.JLabel();
        Labe49 = new javax.swing.JLabel();
        jTextArea1_Path_show5 = new javax.swing.JTextField();
        jTextArea1_Path_show6 = new javax.swing.JTextField();
        jTextArea1_Path_show7 = new javax.swing.JTextField();
        jTextArea1_Path_show8 = new javax.swing.JTextField();
        jTextArea1_Path_show9 = new javax.swing.JTextField();
        jTextArea1_Path_show10 = new javax.swing.JTextField();
        jTextArea1_Path_show11 = new javax.swing.JTextField();
        jTextArea1_Path_show12 = new javax.swing.JTextField();
        jTextArea1_Path_show13 = new javax.swing.JTextField();
        jTextArea1_Path_show14 = new javax.swing.JTextField();
        jTextArea1_Path_show15 = new javax.swing.JTextField();
        jTextArea1_Path_show16 = new javax.swing.JTextField();
        jTextArea1_Path_show17 = new javax.swing.JTextField();
        jTextArea1_Path_show18 = new javax.swing.JTextField();
        jTextArea1_Path_show19 = new javax.swing.JTextField();
        jTextArea1_Path_show20 = new javax.swing.JTextField();
        jTextArea1_Path_show21 = new javax.swing.JTextField();
        jTextArea1_Path_show22 = new javax.swing.JTextField();
        jTextArea1_Path_show23 = new javax.swing.JTextField();
        jTextArea1_Path_show24 = new javax.swing.JTextField();
        jTextArea1_Path_show25 = new javax.swing.JTextField();
        jTextArea1_Path_show26 = new javax.swing.JTextField();
        jTextArea1_Path_show27 = new javax.swing.JTextField();
        jTextArea1_Path_show28 = new javax.swing.JTextField();
        jTextArea1_Path_show29 = new javax.swing.JTextField();
        jTextArea1_Path_show30 = new javax.swing.JTextField();
        jTextArea1_Path_show31 = new javax.swing.JTextField();
        jTextArea1_Path_show32 = new javax.swing.JTextField();
        jTextArea1_Path_show33 = new javax.swing.JTextField();
        jTextArea1_Path_show34 = new javax.swing.JTextField();
        jTextArea1_Path_show35 = new javax.swing.JTextField();
        jTextArea1_Path_show40 = new javax.swing.JTextField();
        jTextArea1_Path_show41 = new javax.swing.JTextField();
        jTextArea1_Path_show42 = new javax.swing.JTextField();
        jTextArea1_Path_show43 = new javax.swing.JTextField();
        jTextArea1_Path_show44 = new javax.swing.JTextField();
        jTextArea1_Path_show45 = new javax.swing.JTextField();
        jTextArea1_Path_show46 = new javax.swing.JTextField();
        jTextArea1_Path_show47 = new javax.swing.JTextField();
        jTextArea1_Path_show48 = new javax.swing.JTextField();
        jTextArea1_Path_show36 = new javax.swing.JTextField();
        jTextArea1_Path_show37 = new javax.swing.JTextField();
        jTextArea1_Path_show38 = new javax.swing.JTextField();
        jTextArea1_Path_show39 = new javax.swing.JTextField();
        jTextArea1_Path_show49 = new javax.swing.JTextField();
        jTextArea1_Path_show = new javax.swing.JTextField();
        Labe51 = new javax.swing.JLabel();
        jLabel2_view1 = new javax.swing.JLabel();
        jTextField2_view_name = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        jLabel6_view1 = new javax.swing.JLabel();
        jLabel6_view2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_allot = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea_td = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2_insert = new javax.swing.JLabel();
        jLabel3_insert = new javax.swing.JLabel();
        jLabel4_insert = new javax.swing.JLabel();
        jLabel5_insert = new javax.swing.JLabel();
        jLabel6_insert = new javax.swing.JLabel();
        jLabel8_insert = new javax.swing.JLabel();
        jTextField2_insert = new javax.swing.JTextField();
        jTextField3_insert = new javax.swing.JTextField();
        jTextField4_insert = new javax.swing.JTextField();
        jTextField6_insert = new javax.swing.JTextField();
        jTextField8_insert = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Button_Reset = new javax.swing.JButton();
        Button_Insert = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2_insertname = new javax.swing.JTextField();
        jLabel2_insert1 = new javax.swing.JLabel();
        jLabel2_insert2 = new javax.swing.JLabel();
        jtext_rname = new javax.swing.JTextField();
        jText_allot = new javax.swing.JTextField();
        jText_td = new javax.swing.JTextField();
        jLabel4_insert1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        Path_show = new javax.swing.JTextField();
        Path_show1 = new javax.swing.JTextField();
        Path_show2 = new javax.swing.JTextField();
        Path_show3 = new javax.swing.JTextField();
        Path_show4 = new javax.swing.JTextField();
        select_box = new javax.swing.JComboBox<>();
        Path_show5 = new javax.swing.JTextField();
        Path_show6 = new javax.swing.JTextField();
        Path_show7 = new javax.swing.JTextField();
        Path_show8 = new javax.swing.JTextField();
        Path_show9 = new javax.swing.JTextField();
        Path_show10 = new javax.swing.JTextField();
        Path_show11 = new javax.swing.JTextField();
        Path_show12 = new javax.swing.JTextField();
        Path_show13 = new javax.swing.JTextField();
        Path_show14 = new javax.swing.JTextField();
        Path_show15 = new javax.swing.JTextField();
        Path_show16 = new javax.swing.JTextField();
        Path_show17 = new javax.swing.JTextField();
        Path_show18 = new javax.swing.JTextField();
        Path_show19 = new javax.swing.JTextField();
        Path_show20 = new javax.swing.JTextField();
        Path_show21 = new javax.swing.JTextField();
        Path_show22 = new javax.swing.JTextField();
        Path_show23 = new javax.swing.JTextField();
        Path_show24 = new javax.swing.JTextField();
        Path_show25 = new javax.swing.JTextField();
        Path_show26 = new javax.swing.JTextField();
        Path_show27 = new javax.swing.JTextField();
        Path_show28 = new javax.swing.JTextField();
        Path_show29 = new javax.swing.JTextField();
        Path_show30 = new javax.swing.JTextField();
        Path_show31 = new javax.swing.JTextField();
        Path_show32 = new javax.swing.JTextField();
        Path_show33 = new javax.swing.JTextField();
        Path_show34 = new javax.swing.JTextField();
        Path_show35 = new javax.swing.JTextField();
        Path_show36 = new javax.swing.JTextField();
        Path_show37 = new javax.swing.JTextField();
        Path_show38 = new javax.swing.JTextField();
        Path_show39 = new javax.swing.JTextField();
        Path_show40 = new javax.swing.JTextField();
        Path_show41 = new javax.swing.JTextField();
        Path_show42 = new javax.swing.JTextField();
        Path_show43 = new javax.swing.JTextField();
        Path_show44 = new javax.swing.JTextField();
        Path_show45 = new javax.swing.JTextField();
        Path_show46 = new javax.swing.JTextField();
        Path_show47 = new javax.swing.JTextField();
        Path_show48 = new javax.swing.JTextField();
        Path_show49 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1_search = new javax.swing.JTextField();
        Button_Search = new javax.swing.JButton();
        Button_print1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Panel");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(52767, 52767));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1_view.setText("File / Picture / Doc :");

        jLabel2_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2_view.setText("Reciet No :");

        jLabel3_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3_view.setText("MemberShip No :");

        jLabel4_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4_view.setText("Plot No :");

        jLabel5_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5_view.setText("Date Of Transfer   :");

        jLabel6_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_view.setText("Name Of Transfer :");

        jLabel8_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8_view.setText("Address  :");

        jTextField2_view.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField2_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_viewActionPerformed(evt);
            }
        });

        jTextField3_view.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField3_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_viewActionPerformed(evt);
            }
        });

        jTextField4_view.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField4_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_viewActionPerformed(evt);
            }
        });

        jTextField5_view.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField5_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_viewActionPerformed(evt);
            }
        });

        jTextField6_view.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField6_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6_viewActionPerformed(evt);
            }
        });

        d.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        Button_Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/delete.png"))); // NOI18N
        Button_Delete.setText("     Record Delete");
        Button_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DeleteActionPerformed(evt);
            }
        });

        jTextArea1_view.setColumns(20);
        jTextArea1_view.setRows(5);
        jTextArea1_view.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTextArea1_view);

        Labe2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe2MouseClicked(evt);
            }
        });

        jTextArea1_Path_show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show1ActionPerformed(evt);
            }
        });

        Labe3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe3MousePressed(evt);
            }
        });

        jTextArea1_Path_show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show2ActionPerformed(evt);
            }
        });

        Labe5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe5MousePressed(evt);
            }
        });

        jTextArea1_Path_show3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show3ActionPerformed(evt);
            }
        });

        Labe4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe4MousePressed(evt);
            }
        });

        jTextArea1_Path_show4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show4ActionPerformed(evt);
            }
        });

        Labe6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe6MousePressed(evt);
            }
        });

        Labe7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe7MousePressed(evt);
            }
        });

        Labe8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe8MousePressed(evt);
            }
        });

        Labe14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe14MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe14MousePressed(evt);
            }
        });

        Labe15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe15MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe15MousePressed(evt);
            }
        });

        Labe9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe9MouseClicked(evt);
            }
        });

        Labe10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe10MousePressed(evt);
            }
        });

        Labe12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe12MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe12MousePressed(evt);
            }
        });

        Labe11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe11MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe11MousePressed(evt);
            }
        });

        Labe13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe13MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe13MousePressed(evt);
            }
        });

        Labe21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe21MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe21MousePressed(evt);
            }
        });

        Labe22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe22MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe22MousePressed(evt);
            }
        });

        Labe16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe16MouseClicked(evt);
            }
        });

        Labe28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe28MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe28MousePressed(evt);
            }
        });

        Labe29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe29MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe29MousePressed(evt);
            }
        });

        Labe17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe17MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe17MousePressed(evt);
            }
        });

        Labe23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe23MouseClicked(evt);
            }
        });

        Labe24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe24MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe24MousePressed(evt);
            }
        });

        Labe19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe19MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe19MousePressed(evt);
            }
        });

        Labe26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe26MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe26MousePressed(evt);
            }
        });

        Labe25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe25MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe25MousePressed(evt);
            }
        });

        Labe18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe18MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe18MousePressed(evt);
            }
        });

        Labe27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe27MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe27MousePressed(evt);
            }
        });

        Labe20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe20MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe20MousePressed(evt);
            }
        });

        Labe50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe50MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe50MousePressed(evt);
            }
        });

        Labe44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe44MouseClicked(evt);
            }
        });

        Labe30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe30MouseClicked(evt);
            }
        });

        Labe45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe45MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe45MousePressed(evt);
            }
        });

        Labe31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe31MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe31MousePressed(evt);
            }
        });

        Labe33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe33MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe33MousePressed(evt);
            }
        });

        Labe47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe47MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe47MousePressed(evt);
            }
        });

        Labe32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe32MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe32MousePressed(evt);
            }
        });

        Labe34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe34MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe34MousePressed(evt);
            }
        });

        Labe46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe46MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe46MousePressed(evt);
            }
        });

        Labe35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe35MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe35MousePressed(evt);
            }
        });

        Labe48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe48MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe48MousePressed(evt);
            }
        });

        Labe36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe36MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe36MousePressed(evt);
            }
        });

        Labe42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe42MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe42MousePressed(evt);
            }
        });

        Labe43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe43MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe43MousePressed(evt);
            }
        });

        Labe37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe37MouseClicked(evt);
            }
        });

        Labe38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe38MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe38MousePressed(evt);
            }
        });

        Labe40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe40MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe40MousePressed(evt);
            }
        });

        Labe39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe39MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe39MousePressed(evt);
            }
        });

        Labe41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe41MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe41MousePressed(evt);
            }
        });

        Labe49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe49MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe49MousePressed(evt);
            }
        });

        jTextArea1_Path_show5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show5ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show6ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show7ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show8ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show9ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show10ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show11ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show12ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show13ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show14ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show15ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show16ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show17ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show18ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show19ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show20ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show21ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show22ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show23ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show24ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show25ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show26ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show27ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show28ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show29ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show30ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show31ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show32ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show33ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show34ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show35ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show40ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show41ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show42ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show43ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show44ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show45ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show46ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show47ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show48ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show36ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show37ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show38ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show39ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_show49ActionPerformed(evt);
            }
        });

        jTextArea1_Path_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextArea1_Path_showActionPerformed(evt);
            }
        });

        Labe51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Labe51MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Labe51MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Labe30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(Labe37, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe38, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe39, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe40, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe41, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe42, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe43, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(Labe44, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe45, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe46, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe47, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Labe51, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(Labe48, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Labe49, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Labe50, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Labe2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Labe8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(Labe23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(Labe16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Labe22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(Labe9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Labe15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextArea1_Path_show36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show49, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextArea1_Path_show, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextArea1_Path_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1_Path_show34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextArea1_Path_show35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labe2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labe9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labe16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe19, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labe23, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe24, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe26, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe27, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe28, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe29, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labe30, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe31, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe32, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe33, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe34, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe35, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe36, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labe37, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe38, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe39, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe40, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe41, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe42, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe43, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labe44, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe45, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe46, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe47, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe48, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe49, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labe50, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Labe51, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArea1_Path_show1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArea1_Path_show36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea1_Path_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane4.setViewportView(jPanel4);

        jLabel2_view1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2_view1.setText("Name :");

        jTextField2_view_name.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        c.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel6_view1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_view1.setText("Transfer Details :");

        jLabel6_view2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_view2.setText("Allotment Details  :");

        jTextArea_allot.setColumns(20);
        jTextArea_allot.setRows(5);
        jTextArea_allot.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea_allot.setDoubleBuffered(true);
        jScrollPane5.setViewportView(jTextArea_allot);

        jTextArea_td.setColumns(20);
        jTextArea_td.setRows(5);
        jTextArea_td.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(jTextArea_td);

        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(d))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jTextField2_view_name))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6_view, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jTextField6_view))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6_view1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6_view2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5_view, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4_view, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3_view)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2_view, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(c)
                                        .addComponent(jLabel2_view1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2_view)
                                    .addComponent(jTextField5_view, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField4_view)
                                    .addComponent(jTextField3_view))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1_view, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8_view, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Button_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2_view1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2_view_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1_view, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8_view, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2_view, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2_view, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3_view, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3_view, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4_view, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4_view, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5_view, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5_view, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6_view, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6_view, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6_view2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6_view1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Record View", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2_insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2_insert.setText("Reciet No :");

        jLabel3_insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3_insert.setText("MemberShip No :");

        jLabel4_insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4_insert.setText("Transfer Details :");

        jLabel5_insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5_insert.setText("Date Of Transfer   :");

        jLabel6_insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6_insert.setText("Name Of Transfer :");

        jLabel8_insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8_insert.setText("Address :");

        jTextField2_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_insertActionPerformed(evt);
            }
        });

        jTextField3_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_insertActionPerformed(evt);
            }
        });

        jTextField4_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_insertActionPerformed(evt);
            }
        });

        Button_Reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/settings.png"))); // NOI18N
        Button_Reset.setText("     Reset");
        Button_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ResetActionPerformed(evt);
            }
        });

        Button_Insert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_Insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/insert-file.png"))); // NOI18N
        Button_Insert.setText("     Insert Record");
        Button_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_InsertActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S/o", "D/o", "W/o" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2_insert1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2_insert1.setText("Name :");

        jLabel2_insert2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2_insert2.setText("Allotment Details  :");

        jText_allot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_allotActionPerformed(evt);
            }
        });

        jLabel4_insert1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4_insert1.setText("Plot No :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_insert1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(Button_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                            .addComponent(Button_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2_insert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3_insert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(jLabel4_insert1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField3_insert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(jTextField2_insert, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField4_insert)
                                        .addComponent(jTextField2_insertname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jText_td))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel6_insert, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                                    .addComponent(jLabel5_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel2_insert2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField6_insert)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtext_rname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(183, 183, 183)
                                            .addComponent(jText_allot))))
                                .addComponent(jTextField8_insert)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_insert1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_insertname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtext_rname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2_insert2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4_insert1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_td, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jText_allot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Record Insert", jPanel2);

        Path_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_showMousePressed(evt);
            }
        });

        Path_show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Path_show1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show1MousePressed(evt);
            }
        });

        Path_show2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show2MousePressed(evt);
            }
        });
        Path_show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show2ActionPerformed(evt);
            }
        });

        Path_show3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show3MousePressed(evt);
            }
        });

        Path_show4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show4MousePressed(evt);
            }
        });

        select_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", " " }));
        select_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_boxActionPerformed(evt);
            }
        });

        Path_show5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show5MousePressed(evt);
            }
        });

        Path_show6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show6MousePressed(evt);
            }
        });

        Path_show7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show7MousePressed(evt);
            }
        });

        Path_show8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show8MousePressed(evt);
            }
        });
        Path_show8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show8ActionPerformed(evt);
            }
        });

        Path_show9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show9MousePressed(evt);
            }
        });

        Path_show10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show10MousePressed(evt);
            }
        });
        Path_show10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show10ActionPerformed(evt);
            }
        });

        Path_show11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show11MousePressed(evt);
            }
        });

        Path_show12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show12MousePressed(evt);
            }
        });
        Path_show12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show12ActionPerformed(evt);
            }
        });

        Path_show13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show13MousePressed(evt);
            }
        });

        Path_show14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show14MousePressed(evt);
            }
        });
        Path_show14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show14ActionPerformed(evt);
            }
        });

        Path_show15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show15MousePressed(evt);
            }
        });

        Path_show16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show16MousePressed(evt);
            }
        });
        Path_show16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show16ActionPerformed(evt);
            }
        });

        Path_show17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show17MousePressed(evt);
            }
        });

        Path_show18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show18MousePressed(evt);
            }
        });
        Path_show18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show18ActionPerformed(evt);
            }
        });

        Path_show19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show19MousePressed(evt);
            }
        });

        Path_show20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show20MousePressed(evt);
            }
        });
        Path_show20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show20ActionPerformed(evt);
            }
        });

        Path_show21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show21MousePressed(evt);
            }
        });

        Path_show22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show22MousePressed(evt);
            }
        });
        Path_show22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show22ActionPerformed(evt);
            }
        });

        Path_show23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show23MousePressed(evt);
            }
        });

        Path_show24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show24MousePressed(evt);
            }
        });
        Path_show24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show24ActionPerformed(evt);
            }
        });

        Path_show25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show25MousePressed(evt);
            }
        });

        Path_show26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show26MousePressed(evt);
            }
        });
        Path_show26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show26ActionPerformed(evt);
            }
        });

        Path_show27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show27MousePressed(evt);
            }
        });

        Path_show28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show28MousePressed(evt);
            }
        });
        Path_show28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show28ActionPerformed(evt);
            }
        });

        Path_show29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show29MousePressed(evt);
            }
        });

        Path_show30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show30MousePressed(evt);
            }
        });
        Path_show30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show30ActionPerformed(evt);
            }
        });

        Path_show31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show31MousePressed(evt);
            }
        });

        Path_show32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show32MousePressed(evt);
            }
        });
        Path_show32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show32ActionPerformed(evt);
            }
        });

        Path_show33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show33MousePressed(evt);
            }
        });

        Path_show34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show34MousePressed(evt);
            }
        });
        Path_show34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show34ActionPerformed(evt);
            }
        });

        Path_show35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show35MousePressed(evt);
            }
        });

        Path_show36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show36MousePressed(evt);
            }
        });
        Path_show36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show36ActionPerformed(evt);
            }
        });

        Path_show37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show37MousePressed(evt);
            }
        });

        Path_show38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show38MousePressed(evt);
            }
        });
        Path_show38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show38ActionPerformed(evt);
            }
        });

        Path_show39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show39MousePressed(evt);
            }
        });

        Path_show40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show40MousePressed(evt);
            }
        });
        Path_show40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show40ActionPerformed(evt);
            }
        });

        Path_show41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show41MousePressed(evt);
            }
        });

        Path_show42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show42MousePressed(evt);
            }
        });
        Path_show42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show42ActionPerformed(evt);
            }
        });

        Path_show43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show43MousePressed(evt);
            }
        });

        Path_show44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show44MousePressed(evt);
            }
        });
        Path_show44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show44ActionPerformed(evt);
            }
        });

        Path_show45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show45MousePressed(evt);
            }
        });

        Path_show46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show46MousePressed(evt);
            }
        });
        Path_show46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show46ActionPerformed(evt);
            }
        });

        Path_show47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show47MousePressed(evt);
            }
        });

        Path_show48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show48MousePressed(evt);
            }
        });
        Path_show48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path_show48ActionPerformed(evt);
            }
        });

        Path_show49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Path_show49MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Path_show, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Path_show4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(select_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Path_show36, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show37, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show38, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show39, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Path_show28, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show29, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show30, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show31, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Path_show32, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show33, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show34, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show35, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Path_show40, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show41, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show42, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show43, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Path_show44, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show45, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show46, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Path_show47, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Path_show24, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Path_show25, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Path_show20, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Path_show21, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Path_show16, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Path_show17, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Path_show12, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Path_show13, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Path_show8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Path_show9, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Path_show10, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Path_show11, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Path_show14, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Path_show15, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Path_show18, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Path_show19, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Path_show22, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Path_show23, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Path_show26, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Path_show27, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Path_show48, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Path_show49, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Path_show, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Path_show4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Path_show8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(Path_show9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Path_show12, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(Path_show13, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Path_show16, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(Path_show17, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Path_show20, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(Path_show21, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Path_show24, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(Path_show25, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Path_show10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(Path_show11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Path_show14, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(Path_show15, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Path_show18, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(Path_show19, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Path_show22, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(Path_show23, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Path_show26, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(Path_show27, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Path_show28, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show29, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show30, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show31, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Path_show32, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show33, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show34, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show35, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Path_show36, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show37, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show38, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show39, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Path_show40, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show41, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show42, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show43, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Path_show44, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show45, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show46, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show47, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Path_show48, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Path_show49, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        jScrollPane3.setViewportView(jPanel3);

        jTabbedPane1.addTab("Add Image", jScrollPane3);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMaxWidth(22);
        }

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(47, 47, 47))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(112, 112, 112)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Membership", jPanel5);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(22);
        }

        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Allotment", jPanel6);

        viewtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewtable.setRowHeight(25);
        viewtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewtable);
        if (viewtable.getColumnModel().getColumnCount() > 0) {
            viewtable.getColumnModel().getColumn(0).setMaxWidth(40);
            viewtable.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("                                       Capital Co-Operative Housing Society Pvt.Ltd.");

        Button_Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/magnifier-tool.png"))); // NOI18N
        Button_Search.setText("      Search");
        Button_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SearchActionPerformed(evt);
            }
        });

        Button_print1.setText("Print");
        Button_print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_print1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1_search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_print1)
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_print1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewtableMouseClicked
        // TODO add your handling code here:
        
        try
        {
            int row=viewtable.getSelectedRow();
            String TableClick=(viewtable.getModel().getValueAt(row,0).toString());
            int Table_Click_Row_No_Convert=Integer.parseInt(TableClick);
            String Sql_TableMouseClickDataView="select * from information where Sr_No="+Table_Click_Row_No_Convert+"";
            pst_table_mouse_click_data_view=con.prepareStatement(Sql_TableMouseClickDataView);
            rs_table_mouse_click_data_view=pst_table_mouse_click_data_view.executeQuery();
            if(rs_table_mouse_click_data_view.next())
            {
             
                String GetViewData_Name=rs_table_mouse_click_data_view.getString("Name");
                int GetViewData_Reciet_No=rs_table_mouse_click_data_view.getInt("Reciet_No");
                int GetViewData_MemberShip_No=rs_table_mouse_click_data_view.getInt("MemberShip_No");
                String GetViewData_Plot_No=rs_table_mouse_click_data_view.getString("Plot_No");
                String GetViewData_Date_Of_Transfer=rs_table_mouse_click_data_view.getString("Date_Of_Transfer");
                String GetViewData_Name_Of_Transfer=rs_table_mouse_click_data_view.getString("Name_Of_Transfer");
                String GetViewData_S_o_D_o_W_o=rs_table_mouse_click_data_view.getString("S_o_D_o_W_o");
                String GetViewData_Address=rs_table_mouse_click_data_view.getString("Address");
                String img= rs_table_mouse_click_data_view.getString("Path_Files1");
                String img1= rs_table_mouse_click_data_view.getString("Path_Files2");
                String img2= rs_table_mouse_click_data_view.getString("Path_Files3");
                 String img3= rs_table_mouse_click_data_view.getString("Path_Files4");
                String img4= rs_table_mouse_click_data_view.getString("Path_Files5");
                String img5= rs_table_mouse_click_data_view.getString("Path_Files6");
                String img6= rs_table_mouse_click_data_view.getString("Path_Files7");
               String img7= rs_table_mouse_click_data_view.getString("Path_Files8");
               String img8= rs_table_mouse_click_data_view.getString("Path_Files9");
            String img9= rs_table_mouse_click_data_view.getString("Path_Files10");
               String img10= rs_table_mouse_click_data_view.getString("Path_Files11");
                String img11= rs_table_mouse_click_data_view.getString("Path_Files12");
                   String img12= rs_table_mouse_click_data_view.getString("Path_Files13");
                  String img13= rs_table_mouse_click_data_view.getString("Path_Files14");
                 String img14= rs_table_mouse_click_data_view.getString("Path_Files15");
              String img15= rs_table_mouse_click_data_view.getString("Path_Files16");
               String img16= rs_table_mouse_click_data_view.getString("Path_Files17");
                String img17= rs_table_mouse_click_data_view.getString("Path_Files18");
                String img18= rs_table_mouse_click_data_view.getString("Path_Files19");
               String img19= rs_table_mouse_click_data_view.getString("Path_Files20");
                String img20= rs_table_mouse_click_data_view.getString("Path_Files21");
                String img21= rs_table_mouse_click_data_view.getString("Path_Files22");
               String img22= rs_table_mouse_click_data_view.getString("Path_Files23");
              String img23= rs_table_mouse_click_data_view.getString("Path_Files24");
                String img24= rs_table_mouse_click_data_view.getString("Path_Files25");
                 String img25= rs_table_mouse_click_data_view.getString("Path_Files26");
                  String img26= rs_table_mouse_click_data_view.getString("Path_Files27");
               String img27= rs_table_mouse_click_data_view.getString("Path_Files28");
               String img28= rs_table_mouse_click_data_view.getString("Path_Files29");
               String img29= rs_table_mouse_click_data_view.getString("Path_Files30");
               String img30= rs_table_mouse_click_data_view.getString("Path_Files31");
               String img31= rs_table_mouse_click_data_view.getString("Path_Files32");
                String img32= rs_table_mouse_click_data_view.getString("Path_Files33");
                 String img33= rs_table_mouse_click_data_view.getString("Path_Files34");
                 String img34= rs_table_mouse_click_data_view.getString("Path_Files35");
                  String img35= rs_table_mouse_click_data_view.getString("Path_Files36");
                   String img36= rs_table_mouse_click_data_view.getString("Path_Files37");
                   String img37= rs_table_mouse_click_data_view.getString("Path_Files38");
                     String img38= rs_table_mouse_click_data_view.getString("Path_Files39");
                String img39= rs_table_mouse_click_data_view.getString("Path_Files40");
                String img40= rs_table_mouse_click_data_view.getString("Path_Files41");
      String img41= rs_table_mouse_click_data_view.getString("Path_Files42");
             String img42= rs_table_mouse_click_data_view.getString("Path_Files43");
                    String img43= rs_table_mouse_click_data_view.getString("Path_Files44");
   String img44= rs_table_mouse_click_data_view.getString("Path_Files45");
               String img45= rs_table_mouse_click_data_view.getString("Path_Files46");
       String img46= rs_table_mouse_click_data_view.getString("Path_Files47");
         String img47= rs_table_mouse_click_data_view.getString("Path_Files48");
            String img48= rs_table_mouse_click_data_view.getString("Path_Files49");
  String img49= rs_table_mouse_click_data_view.getString("Path_Files50");
                String GetViewData_allot=rs_table_mouse_click_data_view.getString("Allotment_Details");
                String GetViewData_td=rs_table_mouse_click_data_view.getString("Transfer_Details");
                String GetViewData_rname=rs_table_mouse_click_data_view.getString("rname");
                
                
              
                
                String ConvertViewData_Reciet_No;
                ConvertViewData_Reciet_No = Integer.toString(GetViewData_Reciet_No);
                jTextField2_view.setText(ConvertViewData_Reciet_No);
                
                String ConvertViewData_MemberShip_No;
                ConvertViewData_MemberShip_No = Integer.toString(GetViewData_MemberShip_No);
                jTextField3_view.setText(ConvertViewData_MemberShip_No);
                
                jTextField4_view.setText(GetViewData_Plot_No);
                
                jTextField5_view.setText(GetViewData_Date_Of_Transfer);
                jTextField6_view.setText(GetViewData_Name_Of_Transfer);
                c.setText(GetViewData_S_o_D_o_W_o);
                jTextArea1_view.setText(GetViewData_Address);
                
                jTextArea1_Path_show.setText(img);
                jTextArea1_Path_show1.setText(img1);
                jTextArea1_Path_show2.setText(img2);
                jTextArea1_Path_show3.setText(img3);
                jTextArea1_Path_show4.setText(img4);
                jTextArea1_Path_show5.setText(img5);
                jTextArea1_Path_show6.setText(img6);
                jTextArea1_Path_show7.setText(img7);
                jTextArea1_Path_show8.setText(img8);
                jTextArea1_Path_show9.setText(img9);
                jTextArea1_Path_show10.setText(img10);
                jTextArea1_Path_show11.setText(img11);
                jTextArea1_Path_show12.setText(img12);
                jTextArea1_Path_show13.setText(img13);
                jTextArea1_Path_show14.setText(img14);
                jTextArea1_Path_show15.setText(img15);
                jTextArea1_Path_show16.setText(img16);
                jTextArea1_Path_show17.setText(img17);
                jTextArea1_Path_show18.setText(img18);
                jTextArea1_Path_show19.setText(img19);
                jTextArea1_Path_show20.setText(img20);
                jTextArea1_Path_show21.setText(img21);
                jTextArea1_Path_show22.setText(img22);
                jTextArea1_Path_show23.setText(img23);
                jTextArea1_Path_show24.setText(img24);
                jTextArea1_Path_show25.setText(img25);
                jTextArea1_Path_show26.setText(img26);
                jTextArea1_Path_show27.setText(img27);
                jTextArea1_Path_show28.setText(img28);
                jTextArea1_Path_show29.setText(img29);
                jTextArea1_Path_show30 .setText(img30);
                jTextArea1_Path_show31.setText(img31);
                jTextArea1_Path_show32.setText(img32);
                jTextArea1_Path_show33.setText(img33);
                jTextArea1_Path_show34.setText(img34);
                jTextArea1_Path_show35.setText(img35);
                jTextArea1_Path_show36.setText(img36);
                jTextArea1_Path_show37.setText(img37);
                jTextArea1_Path_show38.setText(img38);
                jTextArea1_Path_show39.setText(img39);
                jTextArea1_Path_show40.setText(img40);
                jTextArea1_Path_show41.setText(img41);
                jTextArea1_Path_show42.setText(img42);
                jTextArea1_Path_show43.setText(img43);
                jTextArea1_Path_show44.setText(img44);
                jTextArea1_Path_show45.setText(img45);
                jTextArea1_Path_show46.setText(img46);
                jTextArea1_Path_show47.setText(img47);
                jTextArea1_Path_show48.setText(img48);
                jTextArea1_Path_show49.setText(img49);
                
                
                jTextField2_view_name.setText(GetViewData_Name);
                jTextArea_allot.setText(GetViewData_allot);
                jTextArea_td.setText(GetViewData_td);
                d.setText(GetViewData_rname);
                
              
                     ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(Labe2.getWidth(), Labe2.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);
                    Labe2.setIcon(newImage);
                 ImageIcon image1 = new ImageIcon(img1);
                    Image im1 = image1.getImage();
                    Image myImg1 = im1.getScaledInstance(Labe3.getWidth(), Labe3.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage1 = new ImageIcon(myImg1);
                    Labe3.setIcon(newImage1);
                    ImageIcon image2 = new ImageIcon(img2);
                    Image im2 = image2.getImage();
                    Image myImg2 = im2.getScaledInstance(Labe4.getWidth(), Labe4.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage2 = new ImageIcon(myImg2);
                    Labe4.setIcon(newImage2);
                    ImageIcon image3 = new ImageIcon(img3);
                    Image im3 = image3.getImage();
                    Image myImg3 = im3.getScaledInstance(Labe5.getWidth(), Labe5.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage3 = new ImageIcon(myImg3);
                    Labe5.setIcon(newImage3);
                    ImageIcon image4 = new ImageIcon(img4);
                    Image im4 = image4.getImage();
                    Image myImg4 = im4.getScaledInstance(Labe6.getWidth(), Labe6.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage4 = new ImageIcon(myImg4);
                    Labe6.setIcon(newImage4);
                     ImageIcon image5 = new ImageIcon(img5);
                    Image im5 = image5.getImage();
                    Image myImg5 = im5.getScaledInstance(Labe7.getWidth(), Labe7.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage5 = new ImageIcon(myImg5);
                    Labe7.setIcon(newImage5);
                     ImageIcon image6 = new ImageIcon(img6);
                    Image im6 = image6.getImage();
                    Image myImg6 = im6.getScaledInstance(Labe8.getWidth(), Labe8.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage6 = new ImageIcon(myImg6);
                    Labe8.setIcon(newImage6);
                     ImageIcon image7 = new ImageIcon(img7);
                    Image im7 = image7.getImage();
                    Image myImg7 = im7.getScaledInstance(Labe9.getWidth(), Labe9.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage7 = new ImageIcon(myImg7);
                    Labe9.setIcon(newImage7);
                     ImageIcon image8 = new ImageIcon(img8);
                    Image im8 = image8.getImage();
                    Image myImg8 = im8.getScaledInstance(Labe10.getWidth(), Labe10.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage8 = new ImageIcon(myImg8);
                    Labe10.setIcon(newImage8);
                     ImageIcon image9 = new ImageIcon(img9);
                    Image im9 = image9.getImage();
                    Image myImg9 = im9.getScaledInstance(Labe11.getWidth(), Labe11.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage9 = new ImageIcon(myImg9);
                    Labe11.setIcon(newImage9);
                     ImageIcon image10 = new ImageIcon(img10);
                    Image im10 = image10.getImage();
                    Image myImg10 = im10.getScaledInstance(Labe12.getWidth(), Labe12.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage10 = new ImageIcon(myImg10);
                    Labe12.setIcon(newImage10);
                    ImageIcon image11 = new ImageIcon(img11);
                    Image im11 = image11.getImage();
                    Image myImg11 = im11.getScaledInstance(Labe13.getWidth(), Labe13.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage11 = new ImageIcon(myImg11);
                    Labe13.setIcon(newImage11);
                    ImageIcon image12 = new ImageIcon(img12);
                    Image im12 = image12.getImage();
                    Image myImg12 = im12.getScaledInstance(Labe14.getWidth(), Labe14.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage12 = new ImageIcon(myImg12);
                    Labe14.setIcon(newImage12);
                    ImageIcon image13 = new ImageIcon(img13);
                    Image im13 = image13.getImage();
                    Image myImg13 = im13.getScaledInstance(Labe15.getWidth(), Labe15.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage13 = new ImageIcon(myImg13);
                    Labe15.setIcon(newImage13);
                    ImageIcon image14 = new ImageIcon(img14);
                    Image im14 = image14.getImage();
                    Image myImg14 = im14.getScaledInstance(Labe16.getWidth(), Labe16.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage14 = new ImageIcon(myImg14);
                    Labe16.setIcon(newImage14);
                    ImageIcon image15 = new ImageIcon(img15);
                    Image im15 = image15.getImage();
                    Image myImg15 = im15.getScaledInstance(Labe17.getWidth(), Labe17.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage15 = new ImageIcon(myImg15);
                    Labe17.setIcon(newImage15);
                    ImageIcon image16 = new ImageIcon(img16);
                    Image im16 = image16.getImage();
                    Image myImg16 = im16.getScaledInstance(Labe18.getWidth(), Labe18.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage16 = new ImageIcon(myImg16);
                    Labe18.setIcon(newImage16);
                    ImageIcon image17 = new ImageIcon(img17);
                    Image im17 = image17.getImage();
                    Image myImg17 = im17.getScaledInstance(Labe19.getWidth(), Labe19.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage17 = new ImageIcon(myImg17);
                    Labe19.setIcon(newImage17);
                    ImageIcon image18 = new ImageIcon(img18);
                    Image im18 = image18.getImage();
                    Image myImg18 = im18.getScaledInstance(Labe20.getWidth(), Labe20.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage18 = new ImageIcon(myImg18);
                    Labe20.setIcon(newImage18);
                    ImageIcon image19 = new ImageIcon(img19);
                    Image im19 = image19.getImage();
                    Image myImg19 = im19.getScaledInstance(Labe21.getWidth(), Labe21.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage19 = new ImageIcon(myImg19);
                    Labe21.setIcon(newImage19);
                    ImageIcon image20 = new ImageIcon(img20);
                    Image im20 = image20.getImage();
                    Image myImg20 = im20.getScaledInstance(Labe22.getWidth(), Labe22.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage20 = new ImageIcon(myImg20);
                    Labe22.setIcon(newImage20);
                    ImageIcon image21 = new ImageIcon(img21);
                    Image im21 = image21.getImage();
                    Image myImg21 = im21.getScaledInstance(Labe23.getWidth(), Labe23.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage21 = new ImageIcon(myImg21);
                    Labe23.setIcon(newImage21);
                    ImageIcon image22 = new ImageIcon(img22);
                    Image im22 = image22.getImage();
                    Image myImg22 = im22.getScaledInstance(Labe24.getWidth(), Labe24.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage22 = new ImageIcon(myImg22);
                    Labe24.setIcon(newImage22);
                    ImageIcon image23 = new ImageIcon(img23);
                    Image im23 = image23.getImage();
                    Image myImg23 = im23.getScaledInstance(Labe25.getWidth(), Labe25.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage23 = new ImageIcon(myImg23);
                    Labe25.setIcon(newImage23);
                    ImageIcon image24 = new ImageIcon(img24);
                    Image im24 = image24.getImage();
                    Image myImg24 = im24.getScaledInstance(Labe26.getWidth(), Labe26.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage24 = new ImageIcon(myImg24);
                    Labe26.setIcon(newImage24);
                    ImageIcon image25 = new ImageIcon(img25);
                    Image im25 = image25.getImage();
                    Image myImg25 = im25.getScaledInstance(Labe27.getWidth(), Labe27.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage25 = new ImageIcon(myImg25);
                    Labe27.setIcon(newImage25);
                    ImageIcon image26 = new ImageIcon(img26);
                    Image im26 = image26.getImage();
                    Image myImg26 = im26.getScaledInstance(Labe28.getWidth(), Labe28.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage26 = new ImageIcon(myImg26);
                    Labe28.setIcon(newImage26);
                    ImageIcon image27 = new ImageIcon(img27);
                    Image im27 = image27.getImage();
                    Image myImg27 = im27.getScaledInstance(Labe29.getWidth(), Labe29.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage27 = new ImageIcon(myImg27);
                    Labe29.setIcon(newImage27);
                    ImageIcon image28 = new ImageIcon(img28);
                    Image im28 = image28.getImage();
                    Image myImg28 = im28.getScaledInstance(Labe30.getWidth(), Labe30.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage28 = new ImageIcon(myImg28);
                    Labe30.setIcon(newImage28);
                    ImageIcon image29 = new ImageIcon(img29);
                    Image im29 = image29.getImage();
                    Image myImg29 = im29.getScaledInstance(Labe31.getWidth(), Labe31.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage29 = new ImageIcon(myImg29);
                    Labe31.setIcon(newImage29);
                    ImageIcon image30 = new ImageIcon(img30);
                    Image im30 = image30.getImage();
                    Image myImg30 = im30.getScaledInstance(Labe32.getWidth(), Labe32.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage30 = new ImageIcon(myImg30);
                    Labe32.setIcon(newImage30);
                    ImageIcon image31 = new ImageIcon(img31);
                    Image im31 = image31.getImage();
                    Image myImg31 = im31.getScaledInstance(Labe33.getWidth(), Labe33.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage31 = new ImageIcon(myImg31);
                    Labe33.setIcon(newImage31);
                    ImageIcon image32 = new ImageIcon(img32);
                    Image im32 = image32.getImage();
                    Image myImg32 = im32.getScaledInstance(Labe34.getWidth(), Labe34.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage32 = new ImageIcon(myImg32);
                    Labe34.setIcon(newImage32);
                    ImageIcon image33 = new ImageIcon(img33);
                    Image im33 = image33.getImage();
                    Image myImg33 = im33.getScaledInstance(Labe35.getWidth(), Labe35.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage33 = new ImageIcon(myImg33);
                    Labe35.setIcon(newImage33);
                    ImageIcon image34 = new ImageIcon(img34);
                    Image im34 = image34.getImage();
                    Image myImg34 = im34.getScaledInstance(Labe36.getWidth(), Labe36.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage34 = new ImageIcon(myImg34);
                    Labe36.setIcon(newImage34);
                    ImageIcon image35 = new ImageIcon(img35);
                    Image im35 = image35.getImage();
                    Image myImg35 = im35.getScaledInstance(Labe37.getWidth(), Labe37.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage35 = new ImageIcon(myImg35);
                    Labe37.setIcon(newImage35);
                    ImageIcon image36 = new ImageIcon(img36);
                    Image im36 = image36.getImage();
                    Image myImg36 = im36.getScaledInstance(Labe38.getWidth(), Labe38.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage36 = new ImageIcon(myImg36);
                    Labe38.setIcon(newImage36);
                    ImageIcon image37 = new ImageIcon(img37);
                    Image im37 = image37.getImage();
                    Image myImg37 = im37.getScaledInstance(Labe39.getWidth(), Labe39.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage37 = new ImageIcon(myImg37);
                    Labe39.setIcon(newImage37);
                    ImageIcon image38 = new ImageIcon(img38);
                    Image im38 = image38.getImage();
                    Image myImg38 = im38.getScaledInstance(Labe40.getWidth(), Labe40.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage38 = new ImageIcon(myImg38);
                    Labe40.setIcon(newImage38);
                    ImageIcon image39 = new ImageIcon(img39);
                    Image im39 = image39.getImage();
                    Image myImg39 = im39.getScaledInstance(Labe41.getWidth(), Labe41.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage39 = new ImageIcon(myImg39);
                    Labe41.setIcon(newImage39);
                    ImageIcon image40 = new ImageIcon(img40);
                    Image im40 = image40.getImage();
                    Image myImg40 = im40.getScaledInstance(Labe42.getWidth(), Labe42.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage40 = new ImageIcon(myImg40);
                    Labe42.setIcon(newImage40);
                    ImageIcon image41 = new ImageIcon(img41);
                    Image im41 = image41.getImage();
                    Image myImg41 = im41.getScaledInstance(Labe43.getWidth(), Labe43.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage41 = new ImageIcon(myImg41);
                    Labe43.setIcon(newImage41);
                    ImageIcon image42 = new ImageIcon(img42);
                    Image im42 = image42.getImage();
                    Image myImg42 = im42.getScaledInstance(Labe44.getWidth(), Labe44.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage42 = new ImageIcon(myImg42);
                    Labe44.setIcon(newImage42);
                    ImageIcon image43 = new ImageIcon(img43);
                    Image im43 = image43.getImage();
                    Image myImg43 = im43.getScaledInstance(Labe45.getWidth(), Labe45.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage43 = new ImageIcon(myImg43);
                    Labe45.setIcon(newImage43);
                    ImageIcon image44 = new ImageIcon(img44);
                    Image im44 = image44.getImage();
                    Image myImg44 = im44.getScaledInstance(Labe46.getWidth(), Labe46.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage44 = new ImageIcon(myImg44);
                    Labe46.setIcon(newImage44);
                    ImageIcon image45 = new ImageIcon(img45);
                    Image im45 = image45.getImage();
                    Image myImg45 = im45.getScaledInstance(Labe47.getWidth(), Labe47.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage45 = new ImageIcon(myImg45);
                    Labe47.setIcon(newImage45);
                    ImageIcon image46 = new ImageIcon(img46);
                    Image im46 = image46.getImage();
                    Image myImg46 = im46.getScaledInstance(Labe48.getWidth(), Labe48.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage46 = new ImageIcon(myImg46);
                    Labe48.setIcon(newImage46);
                    ImageIcon image47 = new ImageIcon(img47);
                    Image im47 = image47.getImage();
                    Image myImg47 = im47.getScaledInstance(Labe49.getWidth(), Labe49.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage47 = new ImageIcon(myImg47);
                    Labe49.setIcon(newImage47);
                     ImageIcon image48 = new ImageIcon(img48);
                    Image im48 = image48.getImage();
                    Image myImg48 = im48.getScaledInstance(Labe50.getWidth(), Labe50.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage48 = new ImageIcon(myImg48);
                    Labe50.setIcon(newImage48);
                     ImageIcon image49 = new ImageIcon(img49);
                    Image im49 = image49.getImage();
                    Image myImg49 = im49.getScaledInstance(Labe12.getWidth(), Labe12.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage49 = new ImageIcon(myImg49);
                    Labe51.setIcon(newImage49);
                     
                rs_table_mouse_click_data_view.close();
                pst_table_mouse_click_data_view.close();
           }            
        }   
        catch(Exception err_table_mouse_click_data_view)
        {
            JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR_MESSAGE); 
        }  
      
    }//GEN-LAST:event_viewtableMouseClicked

    private void Button_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SearchActionPerformed
        // TODO add your handling code here:
        
    if(jTextField1_search.getText().equals(""))
    {
        JOptionPane.showMessageDialog(null,"Empty field detected ! Please fill up field","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
    }
    else
    {
        
       // String get_search_value=jTextField1_search.getText();
   
        
        String sql="select * from information where Plot_No=?";
        
        try
        {
            //pst_search=con.prepareStatement(sql_search);
            //rs_search=pst_search.executeQuery();
            pst_search=con.prepareStatement(sql);
            pst_search.setString(1,jTextField1_search.getText());
            rs_search=pst_search.executeQuery();
            if(rs_search.next())
            {
                
                int    GetViewData_Reciet_No=rs_search.getInt("Reciet_No");
                int    GetViewData_MemberShip_No=rs_search.getInt("MemberShip_No");
                String    GetViewData_Plot_No=rs_search.getString("Plot_No");
                String GetViewData_Date_Of_Transfer=rs_search.getString("Date_Of_Transfer");
                String GetViewData_Name_Of_Transfer=rs_search.getString("Name_Of_Transfer");
                String GetViewData_S_o_D_o_W_o=rs_search.getString("S_o_D_o_W_o");
                String GetViewData_Address=rs_search.getString("Address");
               String img= rs_search.getString("Path_Files1");
                String GetViewData_Name=rs_search.getString("Name");
                         
                String img1= rs_search.getString("Path_Files2");
                String img2= rs_search.getString("Path_Files3");
                 String img3= rs_search.getString("Path_Files4");
                String img4= rs_search.getString("Path_Files5");
                String img5= rs_search.getString("Path_Files6");
                String img6= rs_search.getString("Path_Files7");
               String img7= rs_search.getString("Path_Files8");
               String img8= rs_search.getString("Path_Files9");
            String img9= rs_search.getString("Path_Files10");
               String img10= rs_search.getString("Path_Files11");
                String img11= rs_search.getString("Path_Files12");
                   String img12= rs_search.getString("Path_Files13");
                  String img13= rs_search.getString("Path_Files14");
                 String img14= rs_search.getString("Path_Files15");
              String img15= rs_search.getString("Path_Files16");
               String img16= rs_search.getString("Path_Files17");
                String img17= rs_search.getString("Path_Files18");
                String img18= rs_search.getString("Path_Files19");
               String img19= rs_search.getString("Path_Files20");
                String img20= rs_search.getString("Path_Files21");
                String img21= rs_search.getString("Path_Files22");
               String img22= rs_search.getString("Path_Files23");
              String img23= rs_search.getString("Path_Files24");
                String img24= rs_search.getString("Path_Files25");
                 String img25= rs_search.getString("Path_Files26");
                  String img26= rs_search.getString("Path_Files27");
               String img27= rs_search.getString("Path_Files28");
               String img28= rs_search.getString("Path_Files29");
               String img29= rs_search.getString("Path_Files30");
               String img30= rs_search.getString("Path_Files31");
               String img31= rs_search.getString("Path_Files32");
                String img32= rs_search.getString("Path_Files33");
                 String img33= rs_search.getString("Path_Files34");
                 String img34= rs_search.getString("Path_Files35");
                  String img35= rs_search.getString("Path_Files36");
                   String img36= rs_search.getString("Path_Files37");
                   String img37= rs_search.getString("Path_Files38");
                     String img38= rs_search.getString("Path_Files39");
                String img39= rs_search.getString("Path_Files40");
                String img40= rs_search.getString("Path_Files41");
      String img41= rs_search.getString("Path_Files42");
             String img42= rs_search.getString("Path_Files43");
                    String img43= rs_search.getString("Path_Files44");
   String img44= rs_search.getString("Path_Files45");
               String img45= rs_search.getString("Path_Files46");
       String img46= rs_search.getString("Path_Files47");
         String img47= rs_search.getString("Path_Files48");
            String img48= rs_search.getString("Path_Files49");
  String img49= rs_search.getString("Path_Files50");

                String GetViewData_allot=rs_search.getString("Allotment_Details");
                String GetViewData_td=rs_search.getString("Transfer_Details");
                String GetViewData_rname=rs_search.getString("rname");
                       
                String ConvertViewData_Reciet_No;
                ConvertViewData_Reciet_No = Integer.toString(GetViewData_Reciet_No);
                jTextField2_view.setText(ConvertViewData_Reciet_No);
                
                String ConvertViewData_MemberShip_No;
                ConvertViewData_MemberShip_No = Integer.toString(GetViewData_MemberShip_No);
                jTextField3_view.setText(ConvertViewData_MemberShip_No);
                
               
                jTextField4_view.setText(GetViewData_Plot_No);
                
                jTextField5_view.setText(GetViewData_Date_Of_Transfer);
                jTextField6_view.setText(GetViewData_Name_Of_Transfer);
                c.setText(GetViewData_S_o_D_o_W_o);
                jTextArea1_view.setText(GetViewData_Address);
                         jTextArea1_Path_show.setText(img);
                jTextArea1_Path_show1.setText(img1);
                jTextArea1_Path_show2.setText(img2);
                jTextArea1_Path_show3.setText(img3);
                jTextArea1_Path_show4.setText(img4);
                jTextArea1_Path_show5.setText(img5);
                jTextArea1_Path_show6.setText(img6);
                jTextArea1_Path_show7.setText(img7);
                jTextArea1_Path_show8.setText(img8);
                jTextArea1_Path_show9.setText(img9);
                jTextArea1_Path_show10.setText(img10);
                jTextArea1_Path_show11.setText(img11);
                jTextArea1_Path_show12.setText(img12);
                jTextArea1_Path_show13.setText(img13);
                jTextArea1_Path_show14.setText(img14);
                jTextArea1_Path_show15.setText(img15);
                jTextArea1_Path_show16.setText(img16);
                jTextArea1_Path_show17.setText(img17);
                jTextArea1_Path_show18.setText(img18);
                jTextArea1_Path_show19.setText(img19);
                jTextArea1_Path_show20.setText(img20);
                jTextArea1_Path_show21.setText(img21);
                jTextArea1_Path_show22.setText(img22);
                jTextArea1_Path_show23.setText(img23);
                jTextArea1_Path_show24.setText(img24);
                jTextArea1_Path_show25.setText(img25);
                jTextArea1_Path_show26.setText(img26);
                jTextArea1_Path_show27.setText(img27);
                jTextArea1_Path_show28.setText(img28);
                jTextArea1_Path_show29.setText(img29);
                jTextArea1_Path_show30 .setText(img30);
                jTextArea1_Path_show31.setText(img31);
                jTextArea1_Path_show32.setText(img32);
                jTextArea1_Path_show33.setText(img33);
                jTextArea1_Path_show34.setText(img34);
                jTextArea1_Path_show35.setText(img35);
                jTextArea1_Path_show36.setText(img36);
                jTextArea1_Path_show37.setText(img37);
                jTextArea1_Path_show38.setText(img38);
                jTextArea1_Path_show39.setText(img39);
                jTextArea1_Path_show40.setText(img40);
                jTextArea1_Path_show41.setText(img41);
                jTextArea1_Path_show42.setText(img42);
                jTextArea1_Path_show43.setText(img43);
                jTextArea1_Path_show44.setText(img44);
                jTextArea1_Path_show45.setText(img45);
                jTextArea1_Path_show46.setText(img46);
                jTextArea1_Path_show47.setText(img47);
                jTextArea1_Path_show48.setText(img48);
                jTextArea1_Path_show49.setText(img49);
                 jTextField2_view_name.setText(GetViewData_Name);
                jTextArea_allot.setText(GetViewData_allot);
                jTextArea_td.setText(GetViewData_td);
                d.setText(GetViewData_rname);
                
                      ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(Labe2.getWidth(), Labe2.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);
                    Labe2.setIcon(newImage);
                 ImageIcon image1 = new ImageIcon(img1);
                    Image im1 = image1.getImage();
                    Image myImg1 = im1.getScaledInstance(Labe3.getWidth(), Labe3.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage1 = new ImageIcon(myImg1);
                    Labe3.setIcon(newImage1);
                    ImageIcon image2 = new ImageIcon(img2);
                    Image im2 = image2.getImage();
                    Image myImg2 = im2.getScaledInstance(Labe4.getWidth(), Labe4.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage2 = new ImageIcon(myImg2);
                    Labe4.setIcon(newImage2);
                    ImageIcon image3 = new ImageIcon(img3);
                    Image im3 = image3.getImage();
                    Image myImg3 = im3.getScaledInstance(Labe5.getWidth(), Labe5.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage3 = new ImageIcon(myImg3);
                    Labe5.setIcon(newImage3);
                    ImageIcon image4 = new ImageIcon(img4);
                    Image im4 = image4.getImage();
                    Image myImg4 = im4.getScaledInstance(Labe6.getWidth(), Labe6.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage4 = new ImageIcon(myImg4);
                    Labe6.setIcon(newImage4);
                     ImageIcon image5 = new ImageIcon(img5);
                    Image im5 = image5.getImage();
                    Image myImg5 = im5.getScaledInstance(Labe7.getWidth(), Labe7.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage5 = new ImageIcon(myImg5);
                    Labe7.setIcon(newImage5);
                     ImageIcon image6 = new ImageIcon(img6);
                    Image im6 = image6.getImage();
                    Image myImg6 = im6.getScaledInstance(Labe8.getWidth(), Labe8.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage6 = new ImageIcon(myImg6);
                    Labe8.setIcon(newImage6);
                     ImageIcon image7 = new ImageIcon(img7);
                    Image im7 = image7.getImage();
                    Image myImg7 = im7.getScaledInstance(Labe9.getWidth(), Labe9.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage7 = new ImageIcon(myImg7);
                    Labe9.setIcon(newImage7);
                     ImageIcon image8 = new ImageIcon(img8);
                    Image im8 = image8.getImage();
                    Image myImg8 = im8.getScaledInstance(Labe10.getWidth(), Labe10.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage8 = new ImageIcon(myImg8);
                    Labe10.setIcon(newImage8);
                     ImageIcon image9 = new ImageIcon(img9);
                    Image im9 = image9.getImage();
                    Image myImg9 = im9.getScaledInstance(Labe11.getWidth(), Labe11.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage9 = new ImageIcon(myImg9);
                    Labe11.setIcon(newImage9);
                     ImageIcon image10 = new ImageIcon(img10);
                    Image im10 = image10.getImage();
                    Image myImg10 = im10.getScaledInstance(Labe12.getWidth(), Labe12.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage10 = new ImageIcon(myImg10);
                    Labe12.setIcon(newImage10);
                    ImageIcon image11 = new ImageIcon(img11);
                    Image im11 = image11.getImage();
                    Image myImg11 = im11.getScaledInstance(Labe13.getWidth(), Labe13.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage11 = new ImageIcon(myImg11);
                    Labe13.setIcon(newImage11);
                    ImageIcon image12 = new ImageIcon(img12);
                    Image im12 = image12.getImage();
                    Image myImg12 = im12.getScaledInstance(Labe14.getWidth(), Labe14.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage12 = new ImageIcon(myImg12);
                    Labe14.setIcon(newImage12);
                    ImageIcon image13 = new ImageIcon(img13);
                    Image im13 = image13.getImage();
                    Image myImg13 = im13.getScaledInstance(Labe15.getWidth(), Labe15.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage13 = new ImageIcon(myImg13);
                    Labe15.setIcon(newImage13);
                    ImageIcon image14 = new ImageIcon(img14);
                    Image im14 = image14.getImage();
                    Image myImg14 = im14.getScaledInstance(Labe16.getWidth(), Labe16.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage14 = new ImageIcon(myImg14);
                    Labe16.setIcon(newImage14);
                    ImageIcon image15 = new ImageIcon(img15);
                    Image im15 = image15.getImage();
                    Image myImg15 = im15.getScaledInstance(Labe17.getWidth(), Labe17.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage15 = new ImageIcon(myImg15);
                    Labe17.setIcon(newImage15);
                    ImageIcon image16 = new ImageIcon(img16);
                    Image im16 = image16.getImage();
                    Image myImg16 = im16.getScaledInstance(Labe18.getWidth(), Labe18.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage16 = new ImageIcon(myImg16);
                    Labe18.setIcon(newImage16);
                    ImageIcon image17 = new ImageIcon(img17);
                    Image im17 = image17.getImage();
                    Image myImg17 = im17.getScaledInstance(Labe19.getWidth(), Labe19.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage17 = new ImageIcon(myImg17);
                    Labe19.setIcon(newImage17);
                    ImageIcon image18 = new ImageIcon(img18);
                    Image im18 = image18.getImage();
                    Image myImg18 = im18.getScaledInstance(Labe20.getWidth(), Labe20.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage18 = new ImageIcon(myImg18);
                    Labe20.setIcon(newImage18);
                    ImageIcon image19 = new ImageIcon(img19);
                    Image im19 = image19.getImage();
                    Image myImg19 = im19.getScaledInstance(Labe21.getWidth(), Labe21.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage19 = new ImageIcon(myImg19);
                    Labe21.setIcon(newImage19);
                    ImageIcon image20 = new ImageIcon(img20);
                    Image im20 = image20.getImage();
                    Image myImg20 = im20.getScaledInstance(Labe22.getWidth(), Labe22.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage20 = new ImageIcon(myImg20);
                    Labe22.setIcon(newImage20);
                    ImageIcon image21 = new ImageIcon(img21);
                    Image im21 = image21.getImage();
                    Image myImg21 = im21.getScaledInstance(Labe23.getWidth(), Labe23.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage21 = new ImageIcon(myImg21);
                    Labe23.setIcon(newImage21);
                    ImageIcon image22 = new ImageIcon(img22);
                    Image im22 = image22.getImage();
                    Image myImg22 = im22.getScaledInstance(Labe24.getWidth(), Labe24.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage22 = new ImageIcon(myImg22);
                    Labe24.setIcon(newImage22);
                    ImageIcon image23 = new ImageIcon(img23);
                    Image im23 = image23.getImage();
                    Image myImg23 = im23.getScaledInstance(Labe25.getWidth(), Labe25.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage23 = new ImageIcon(myImg23);
                    Labe25.setIcon(newImage23);
                    ImageIcon image24 = new ImageIcon(img24);
                    Image im24 = image24.getImage();
                    Image myImg24 = im24.getScaledInstance(Labe26.getWidth(), Labe26.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage24 = new ImageIcon(myImg24);
                    Labe26.setIcon(newImage24);
                    ImageIcon image25 = new ImageIcon(img25);
                    Image im25 = image25.getImage();
                    Image myImg25 = im25.getScaledInstance(Labe27.getWidth(), Labe27.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage25 = new ImageIcon(myImg25);
                    Labe27.setIcon(newImage25);
                    ImageIcon image26 = new ImageIcon(img26);
                    Image im26 = image26.getImage();
                    Image myImg26 = im26.getScaledInstance(Labe28.getWidth(), Labe28.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage26 = new ImageIcon(myImg26);
                    Labe28.setIcon(newImage26);
                    ImageIcon image27 = new ImageIcon(img27);
                    Image im27 = image27.getImage();
                    Image myImg27 = im27.getScaledInstance(Labe29.getWidth(), Labe29.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage27 = new ImageIcon(myImg27);
                    Labe29.setIcon(newImage27);
                    ImageIcon image28 = new ImageIcon(img28);
                    Image im28 = image28.getImage();
                    Image myImg28 = im28.getScaledInstance(Labe30.getWidth(), Labe30.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage28 = new ImageIcon(myImg28);
                    Labe30.setIcon(newImage28);
                    ImageIcon image29 = new ImageIcon(img29);
                    Image im29 = image29.getImage();
                    Image myImg29 = im29.getScaledInstance(Labe31.getWidth(), Labe31.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage29 = new ImageIcon(myImg29);
                    Labe31.setIcon(newImage29);
                    ImageIcon image30 = new ImageIcon(img30);
                    Image im30 = image30.getImage();
                    Image myImg30 = im30.getScaledInstance(Labe32.getWidth(), Labe32.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage30 = new ImageIcon(myImg30);
                    Labe32.setIcon(newImage30);
                    ImageIcon image31 = new ImageIcon(img31);
                    Image im31 = image31.getImage();
                    Image myImg31 = im31.getScaledInstance(Labe33.getWidth(), Labe33.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage31 = new ImageIcon(myImg31);
                    Labe33.setIcon(newImage31);
                    ImageIcon image32 = new ImageIcon(img32);
                    Image im32 = image32.getImage();
                    Image myImg32 = im32.getScaledInstance(Labe34.getWidth(), Labe34.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage32 = new ImageIcon(myImg32);
                    Labe34.setIcon(newImage32);
                    ImageIcon image33 = new ImageIcon(img33);
                    Image im33 = image33.getImage();
                    Image myImg33 = im33.getScaledInstance(Labe35.getWidth(), Labe35.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage33 = new ImageIcon(myImg33);
                    Labe35.setIcon(newImage33);
                    ImageIcon image34 = new ImageIcon(img34);
                    Image im34 = image34.getImage();
                    Image myImg34 = im34.getScaledInstance(Labe36.getWidth(), Labe36.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage34 = new ImageIcon(myImg34);
                    Labe36.setIcon(newImage34);
                    ImageIcon image35 = new ImageIcon(img35);
                    Image im35 = image35.getImage();
                    Image myImg35 = im35.getScaledInstance(Labe37.getWidth(), Labe37.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage35 = new ImageIcon(myImg35);
                    Labe37.setIcon(newImage35);
                    ImageIcon image36 = new ImageIcon(img36);
                    Image im36 = image36.getImage();
                    Image myImg36 = im36.getScaledInstance(Labe38.getWidth(), Labe38.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage36 = new ImageIcon(myImg36);
                    Labe38.setIcon(newImage36);
                    ImageIcon image37 = new ImageIcon(img37);
                    Image im37 = image37.getImage();
                    Image myImg37 = im37.getScaledInstance(Labe39.getWidth(), Labe39.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage37 = new ImageIcon(myImg37);
                    Labe39.setIcon(newImage37);
                    ImageIcon image38 = new ImageIcon(img38);
                    Image im38 = image38.getImage();
                    Image myImg38 = im38.getScaledInstance(Labe40.getWidth(), Labe40.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage38 = new ImageIcon(myImg38);
                    Labe40.setIcon(newImage38);
                    ImageIcon image39 = new ImageIcon(img39);
                    Image im39 = image39.getImage();
                    Image myImg39 = im39.getScaledInstance(Labe41.getWidth(), Labe41.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage39 = new ImageIcon(myImg39);
                    Labe41.setIcon(newImage39);
                    ImageIcon image40 = new ImageIcon(img40);
                    Image im40 = image40.getImage();
                    Image myImg40 = im40.getScaledInstance(Labe42.getWidth(), Labe42.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage40 = new ImageIcon(myImg40);
                    Labe42.setIcon(newImage40);
                    ImageIcon image41 = new ImageIcon(img41);
                    Image im41 = image41.getImage();
                    Image myImg41 = im41.getScaledInstance(Labe43.getWidth(), Labe43.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage41 = new ImageIcon(myImg41);
                    Labe43.setIcon(newImage41);
                    ImageIcon image42 = new ImageIcon(img42);
                    Image im42 = image42.getImage();
                    Image myImg42 = im42.getScaledInstance(Labe44.getWidth(), Labe44.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage42 = new ImageIcon(myImg42);
                    Labe44.setIcon(newImage42);
                    ImageIcon image43 = new ImageIcon(img43);
                    Image im43 = image43.getImage();
                    Image myImg43 = im43.getScaledInstance(Labe45.getWidth(), Labe45.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage43 = new ImageIcon(myImg43);
                    Labe45.setIcon(newImage43);
                    ImageIcon image44 = new ImageIcon(img44);
                    Image im44 = image44.getImage();
                    Image myImg44 = im44.getScaledInstance(Labe46.getWidth(), Labe46.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage44 = new ImageIcon(myImg44);
                    Labe46.setIcon(newImage44);
                    ImageIcon image45 = new ImageIcon(img45);
                    Image im45 = image45.getImage();
                    Image myImg45 = im45.getScaledInstance(Labe47.getWidth(), Labe47.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage45 = new ImageIcon(myImg45);
                    Labe47.setIcon(newImage45);
                    ImageIcon image46 = new ImageIcon(img46);
                    Image im46 = image46.getImage();
                    Image myImg46 = im46.getScaledInstance(Labe48.getWidth(), Labe48.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage46 = new ImageIcon(myImg46);
                    Labe48.setIcon(newImage46);
                    ImageIcon image47 = new ImageIcon(img47);
                    Image im47 = image47.getImage();
                    Image myImg47 = im47.getScaledInstance(Labe49.getWidth(), Labe49.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage47 = new ImageIcon(myImg47);
                    Labe49.setIcon(newImage47);
                     ImageIcon image48 = new ImageIcon(img48);
                    Image im48 = image48.getImage();
                    Image myImg48 = im48.getScaledInstance(Labe50.getWidth(), Labe50.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage48 = new ImageIcon(myImg48);
                    Labe50.setIcon(newImage48);
                     ImageIcon image49 = new ImageIcon(img49);
                    Image im49 = image49.getImage();
                    Image myImg49 = im49.getScaledInstance(Labe12.getWidth(), Labe12.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage49 = new ImageIcon(myImg49);
                    Labe51.setIcon(newImage49);
                
                JOptionPane.showMessageDialog(null," Record Found ","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                jTextField1_search.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null," Incorrect Plot No ","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                jTextField1_search.setText("");
            }   
        }
        catch(SQLException err_Button_Search)
        {
            JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR_MESSAGE);
            jTextField1_search.setText("");
        }
    }
    
    }//GEN-LAST:event_Button_SearchActionPerformed

    private void Button_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_InsertActionPerformed
        // TODO add your handling code here:

        if( jTextField2_insert.getText().equals("")
            ||jTextField3_insert.getText().equals("") || jTextField4_insert.getText().equals("")
            ||jTextField6_insert.getText().equals("") || jTextField8_insert.getText().equals("")
            || jComboBox1.getSelectedItem().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Empty fields detected ! Please fill up all fields ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            try
            {

                String get_insert_value_name=jTextField2_insertname.getText();
                String get_insert_value_rname=jtext_rname.getText();
                String get_insert_value_td=jText_td.getText();
                String get_insert_value_allot=jText_allot.getText();
                String get_insert_value_reciet_no=jTextField2_insert.getText();
                String get_insert_value_memberShip_no=jTextField3_insert.getText();
                String get_insert_value_plot_no=jTextField4_insert.getText();
                String get_insert_value_date_of_transfer= ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
                String get_insert_value_name_of_transfer=jTextField6_insert.getText();
                String get_insert_value_s_o_d_o_w_o=(String) jComboBox1.getSelectedItem();
                String get_insert_value_address=jTextField8_insert.getText();
                String get_insert_value_file_paths=Path_show.getText();
                String get_insert_value_file_pathss1=Path_show1.getText();
                String get_insert_value_file_paths1=Path_show2.getText();
                String get_insert_value_file_paths2=Path_show3.getText();
                String get_insert_value_file_paths3=Path_show4.getText();
                String get_insert_value_file_paths4=Path_show5.getText();
                String get_insert_value_file_paths5=Path_show6.getText();
                String get_insert_value_file_paths6=Path_show7.getText();
                String get_insert_value_file_paths7=Path_show8.getText();
                String get_insert_value_file_paths8=Path_show9.getText();
                String get_insert_value_file_paths9=Path_show10.getText();
                String get_insert_value_file_paths10=Path_show11.getText();
                String get_insert_value_file_paths11=Path_show12.getText();
                String get_insert_value_file_paths12=Path_show13.getText();
                String get_insert_value_file_paths13=Path_show14.getText();
                String get_insert_value_file_paths14=Path_show15.getText();
                String get_insert_value_file_paths15=Path_show16.getText();
                String get_insert_value_file_paths16=Path_show17.getText();
                String get_insert_value_file_paths17=Path_show18.getText();
                String get_insert_value_file_paths18=Path_show19.getText();
                String get_insert_value_file_paths19=Path_show20.getText();
                String get_insert_value_file_paths20=Path_show21.getText();
                String get_insert_value_file_paths21=Path_show22.getText();
                String get_insert_value_file_paths22=Path_show23.getText();
                String get_insert_value_file_paths23=Path_show24.getText();
                String get_insert_value_file_paths24=Path_show25.getText();
                String get_insert_value_file_paths25=Path_show26.getText();
                String get_insert_value_file_paths26=Path_show27.getText();
                String get_insert_value_file_paths27=Path_show28.getText();
                String get_insert_value_file_paths28=Path_show29.getText();
                String get_insert_value_file_paths29=Path_show30.getText();
                String get_insert_value_file_paths30=Path_show31.getText();
                String get_insert_value_file_paths31=Path_show32.getText();
                String get_insert_value_file_paths32=Path_show33.getText();
                String get_insert_value_file_paths33=Path_show34.getText();
                String get_insert_value_file_paths34=Path_show35.getText();
                String get_insert_value_file_paths35=Path_show36.getText();
                String get_insert_value_file_paths36=Path_show37.getText();
                String get_insert_value_file_paths37=Path_show38.getText();
                String get_insert_value_file_paths38=Path_show39.getText();
                String get_insert_value_file_paths39=Path_show40.getText();
                String get_insert_value_file_paths40=Path_show41.getText();
                String get_insert_value_file_paths41=Path_show42.getText();
                String get_insert_value_file_paths42=Path_show43.getText();
                String get_insert_value_file_paths43=Path_show44.getText();
                String get_insert_value_file_paths44=Path_show45.getText();
                String get_insert_value_file_paths45=Path_show46.getText();
                String get_insert_value_file_paths46=Path_show47.getText();
                String get_insert_value_file_paths47=Path_show48.getText();
                String get_insert_value_file_paths48=Path_show49.getText();
                
                
                

                int get_insert_value_convert_reciet_no=Integer.parseInt(get_insert_value_reciet_no);
                int get_insert_value_convert_memberShip_no=Integer.parseInt(get_insert_value_memberShip_no);
               // int get_insert_value_convert_plot_no=Integer.parseInt(get_insert_value_plot_no);

                String sql_insert = "insert into information (Name,Reciet_No,MemberShip_No,Plot_No,Date_Of_Transfer,Name_Of_Transfer,S_o_D_o_W_o,Address,Path_Files1,rname,Allotment_Details,Transfer_Details,Path_Files2,Path_Files3,Path_Files4,Path_Files5,Path_Files6,Path_Files7,Path_Files8,Path_Files9,Path_Files10,Path_Files11,Path_Files12,Path_Files13,Path_Files14,Path_Files15,Path_Files16,Path_Files17,Path_Files18,Path_Files19,Path_Files20,Path_Files21,Path_Files22,Path_Files23,Path_Files24,Path_Files25,Path_Files26,Path_Files27,Path_Files28,Path_Files29,Path_Files30,Path_Files31,Path_Files32,Path_Files33,Path_Files34,Path_Files35,Path_Files36,Path_Files37,Path_Files38,Path_Files39,Path_Files40,Path_Files41,Path_Files42,Path_Files43,Path_Files44,Path_Files45,Path_Files46,Path_Files47,Path_Files48,Path_Files49,Path_Files50) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                pst=con.prepareStatement(sql_insert);
                pst.setString(1, get_insert_value_name);
                pst.setInt(2, get_insert_value_convert_reciet_no);
                pst.setInt(3, get_insert_value_convert_memberShip_no);
                pst.setString(4, get_insert_value_plot_no);
                pst.setString(5, get_insert_value_date_of_transfer);
                pst.setString(6,get_insert_value_name_of_transfer);
                pst.setString(7, get_insert_value_s_o_d_o_w_o);
                pst.setString(8, get_insert_value_address);
            
                pst.setString(9, get_insert_value_file_paths);
                
                pst.setString(10, get_insert_value_rname);
                pst.setString(11, get_insert_value_allot);
                pst.setString(12, get_insert_value_td);
                pst.setString(13, get_insert_value_file_pathss1);
                pst.setString(14, get_insert_value_file_paths1);
                pst.setString(15, get_insert_value_file_paths2);
                pst.setString(16, get_insert_value_file_paths3);
                pst.setString(17, get_insert_value_file_paths4);
                pst.setString(18, get_insert_value_file_paths5);
                pst.setString(19, get_insert_value_file_paths6);
                pst.setString(20, get_insert_value_file_paths7);
                pst.setString(21, get_insert_value_file_paths8);
                pst.setString(22, get_insert_value_file_paths9);
                pst.setString(23, get_insert_value_file_paths10);
                pst.setString(24, get_insert_value_file_paths11);
                pst.setString(25, get_insert_value_file_paths12);
                pst.setString(26, get_insert_value_file_paths13);
                pst.setString(27, get_insert_value_file_paths14);
                pst.setString(28, get_insert_value_file_paths15);
                pst.setString(29, get_insert_value_file_paths16);
                pst.setString(30, get_insert_value_file_paths17);
                pst.setString(31, get_insert_value_file_paths18);
                pst.setString(32, get_insert_value_file_paths19);
                pst.setString(33, get_insert_value_file_paths20);
                pst.setString(34, get_insert_value_file_paths21);
                pst.setString(35, get_insert_value_file_paths22);
                pst.setString(36, get_insert_value_file_paths23);
                pst.setString(37, get_insert_value_file_paths24);
                pst.setString(38, get_insert_value_file_paths25);
                pst.setString(39, get_insert_value_file_paths26);
                pst.setString(40, get_insert_value_file_paths27);
                pst.setString(41, get_insert_value_file_paths28);
                pst.setString(42, get_insert_value_file_paths29);
                pst.setString(43, get_insert_value_file_paths30);
                pst.setString(44, get_insert_value_file_paths31);
                pst.setString(45, get_insert_value_file_paths32);
                pst.setString(46, get_insert_value_file_paths33);
                pst.setString(47, get_insert_value_file_paths34);
                pst.setString(48, get_insert_value_file_paths35);
                pst.setString(49, get_insert_value_file_paths36);
                pst.setString(50, get_insert_value_file_paths37);
                pst.setString(51, get_insert_value_file_paths38);
                pst.setString(52, get_insert_value_file_paths39);
                pst.setString(53, get_insert_value_file_paths40);
                pst.setString(54, get_insert_value_file_paths41);
                pst.setString(55, get_insert_value_file_paths42);
                pst.setString(56, get_insert_value_file_paths43);
                pst.setString(57, get_insert_value_file_paths44);
                pst.setString(58, get_insert_value_file_paths45);
                pst.setString(59, get_insert_value_file_paths46);
                pst.setString(60, get_insert_value_file_paths47);
                pst.setString(61, get_insert_value_file_paths48);
                
                 //JOptionPane.showMessageDialog(this,"message show" , "Information",JOptionPane.INFORMATION_MESSAGE);
JPasswordField pf = new JPasswordField();
int okCxl = JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

/*if (okCxl == JOptionPane.OK_OPTION) {
  String password = new String(pf.getPassword());
  System.err.println("You entered: " + password);
}*/
    if(pf.getPassword().length==0){
        JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");}
        else{
            
                    char[] password = pf.getPassword();
            String password_convert = String.copyValueOf(password);
            if(validate(password_convert))
            {
                JOptionPane.showMessageDialog(this,"Correct Password","Successfully",JOptionPane.INFORMATION_MESSAGE);
                //JOptionPane.showMessageDialog(null, "Correct Login Credentials");
                pst.executeUpdate();
                  JOptionPane.showMessageDialog(this,"New Record Save","Information",JOptionPane.INFORMATION_MESSAGE);
                
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Incorrect Password","Not Successfully",JOptionPane.INFORMATION_MESSAGE);
                // JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
                // jTextField1.setText("");
                  
            }
        }
                

              

             
                jTextField2_insert.setText("");
                jTextField3_insert.setText("");
                jTextField4_insert.setText("");
                jTextField6_insert.setText("");
                jTextField8_insert.setText("");
                jComboBox1.setSelectedIndex(0);
                jDateChooser1.setDate(null);
            }
            catch(Exception err_insert)
            {
                JOptionPane.showMessageDialog(null," Error : Record Not Save ","Error",JOptionPane.ERROR);
            }
           
           jTextField2_insertname.setText("");
            jTextField2_insert.setText("");
            jTextField3_insert.setText("");
            jTextField4_insert.setText("");
            jText_td.setText("");
            jTextField8_insert.setText("");
            jtext_rname.setText("");
            jText_allot.setText("");
            jTextField6_insert.setText("");
        jComboBox1.setSelectedIndex(0);
        jDateChooser1.setDate(null);
         Path_show.setText("");
           Path_show1.setText("");
           Path_show2.setText("");
           Path_show3.setText("");
           Path_show4.setText("");
           Path_show5.setText("");
           Path_show6.setText("");
           Path_show7.setText("");
           Path_show8.setText("");
           Path_show9.setText("");
           Path_show10.setText("");
           Path_show11.setText("");
           Path_show12.setText("");
           Path_show13.setText("");
           Path_show14.setText("");
           Path_show15.setText("");
           Path_show16.setText("");
           Path_show17.setText("");
           Path_show18.setText("");
           Path_show19.setText("");
           Path_show20.setText("");
           Path_show21.setText("");
           Path_show22.setText("");
           Path_show23.setText("");
           Path_show24.setText("");
           Path_show25.setText("");
           Path_show26.setText("");
           Path_show27.setText("");
           Path_show28.setText("");
           Path_show29.setText("");
           Path_show30.setText("");
           Path_show31.setText("");
           Path_show32.setText("");
           Path_show33.setText("");
           Path_show34.setText("");
           Path_show35.setText("");
           Path_show36.setText("");
           Path_show37.setText("");
           Path_show38.setText("");
           Path_show39.setText("");
           Path_show40.setText("");
           Path_show41.setText("");
           Path_show42.setText("");
           Path_show43.setText("");
           Path_show44.setText("");
           Path_show45.setText("");
           Path_show46.setText("");
           Path_show47.setText("");
           Path_show48.setText("");
           Path_show49.setText("");
        }
        view();
    }//GEN-LAST:event_Button_InsertActionPerformed

    private void Button_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ResetActionPerformed
        // TODO add your handling code here:

       
           jTextField2_insertname.setText("");
            jTextField2_insert.setText("");
            jTextField3_insert.setText("");
            jTextField4_insert.setText("");
            jText_td.setText("");
            jTextField8_insert.setText("");
            jtext_rname.setText("");
            jText_allot.setText("");
            jTextField6_insert.setText("");      
        jComboBox1.setSelectedIndex(0);
        jDateChooser1.setDate(null);
      Path_show.setText("");
           Path_show1.setText("");
           Path_show2.setText("");
           Path_show3.setText("");
           Path_show4.setText("");
           Path_show5.setText("");
           Path_show6.setText("");
           Path_show7.setText("");
           Path_show8.setText("");
           Path_show9.setText("");
           Path_show10.setText("");
           Path_show11.setText("");
           Path_show12.setText("");
           Path_show13.setText("");
           Path_show14.setText("");
           Path_show15.setText("");
           Path_show16.setText("");
           Path_show17.setText("");
           Path_show18.setText("");
           Path_show19.setText("");
           Path_show20.setText("");
           Path_show21.setText("");
           Path_show22.setText("");
           Path_show23.setText("");
           Path_show24.setText("");
           Path_show25.setText("");
           Path_show26.setText("");
           Path_show27.setText("");
           Path_show28.setText("");
           Path_show29.setText("");
           Path_show30.setText("");
           Path_show31.setText("");
           Path_show32.setText("");
           Path_show33.setText("");
           Path_show34.setText("");
           Path_show35.setText("");
           Path_show36.setText("");
           Path_show37.setText("");
           Path_show38.setText("");
           Path_show39.setText("");
           Path_show40.setText("");
           Path_show41.setText("");
           Path_show42.setText("");
           Path_show43.setText("");
           Path_show44.setText("");
           Path_show45.setText("");
           Path_show46.setText("");
           Path_show47.setText("");
           Path_show48.setText("");
           Path_show49.setText("");
          
           
    }//GEN-LAST:event_Button_ResetActionPerformed

    private void Path_showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_showMousePressed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show.setText(file_name);
    }//GEN-LAST:event_Path_showMousePressed

    private void jTextField2_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_insertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_insertActionPerformed

    private void jTextField3_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_insertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_insertActionPerformed

    private void jTextField4_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_insertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_insertActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextArea1_Path_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_showActionPerformed
        // TODO add your handling code here:

        jTextArea1_Path_show.setVisible(false);
    }//GEN-LAST:event_jTextArea1_Path_showActionPerformed

    private void Button_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DeleteActionPerformed
        // TODO add your handling code here:

        String get_delete_value=jTextField4_view.getText();
        int convert_get_delete_value=Integer.parseInt(get_delete_value);

        try
        {
            String sql_delete = "Delete from information where Plot_No="+convert_get_delete_value+"";
            pst=con.prepareStatement(sql_delete);
           
            pst.executeUpdate();
            

            JOptionPane.showMessageDialog(null, " Record Deleted ");

            jTextField2_view.setText("");
            jTextField3_view.setText("");
            jTextField4_view.setText("");
            jTextField5_view.setText("");
            jTextField6_view.setText("");
            d.setText("");
            
            jTextArea1_view.setText("");
            jTextField2_view_name.setText("");
            jTextField6_view.setText("");
            c.setText("");
            jTextArea_allot.setText("");
            jTextArea_td.setText("");
           jTextArea1_Path_show.setText("");
           jTextArea1_Path_show1.setText("");
           jTextArea1_Path_show2.setText("");
           jTextArea1_Path_show3.setText("");
           jTextArea1_Path_show4.setText("");
           jTextArea1_Path_show5.setText("");
           jTextArea1_Path_show6.setText("");
           jTextArea1_Path_show7.setText("");
           jTextArea1_Path_show8.setText("");
           jTextArea1_Path_show9.setText("");
           jTextArea1_Path_show10.setText("");
           jTextArea1_Path_show11.setText("");
           jTextArea1_Path_show12.setText("");
           jTextArea1_Path_show13.setText("");
           jTextArea1_Path_show14.setText("");
           jTextArea1_Path_show15.setText("");
           jTextArea1_Path_show16.setText("");
           jTextArea1_Path_show17.setText("");
           jTextArea1_Path_show18.setText("");
           jTextArea1_Path_show19.setText("");
           jTextArea1_Path_show20.setText("");
           jTextArea1_Path_show21.setText("");
           jTextArea1_Path_show22.setText("");
           jTextArea1_Path_show23.setText("");
           jTextArea1_Path_show24.setText("");
           jTextArea1_Path_show25.setText("");
           jTextArea1_Path_show26.setText("");
           jTextArea1_Path_show27.setText("");
           jTextArea1_Path_show28.setText("");
           jTextArea1_Path_show29.setText("");
           jTextArea1_Path_show30.setText("");
           jTextArea1_Path_show31.setText("");
           jTextArea1_Path_show32.setText("");
           jTextArea1_Path_show33.setText("");
           jTextArea1_Path_show34.setText("");
           jTextArea1_Path_show35.setText("");
           jTextArea1_Path_show36.setText("");
           jTextArea1_Path_show37.setText("");
           jTextArea1_Path_show38.setText("");
           jTextArea1_Path_show39.setText("");
           jTextArea1_Path_show40.setText("");
           jTextArea1_Path_show41.setText("");
           jTextArea1_Path_show42.setText("");
           jTextArea1_Path_show43.setText("");
           jTextArea1_Path_show44.setText("");
           jTextArea1_Path_show45.setText("");
           jTextArea1_Path_show46.setText("");
           jTextArea1_Path_show47.setText("");
           jTextArea1_Path_show48.setText("");
           jTextArea1_Path_show49.setText("");
          
           Labe2.setUI(null);
            
           Labe3.setUI(null);
           Labe4.setUI(null);
           Labe5.setUI(null);
           Labe6.setUI(null);
           Labe7.setUI(null);
           Labe8.setUI(null);
           Labe9.setUI(null);
           Labe10.setUI(null);
           Labe11.setUI(null);
           Labe12.setUI(null);
           Labe13.setUI(null);
           Labe14.setUI(null);
           Labe15.setUI(null);
           Labe16.setUI(null);
           Labe17.setUI(null);
           Labe18.setUI(null);
           Labe19.setUI(null);
           Labe20.setUI(null);
           Labe21.setUI(null);
           Labe22.setUI(null);
           Labe23.setUI(null);
           Labe24.setUI(null);
           Labe25.setUI(null);
           Labe26.setUI(null);
           Labe27.setUI(null);
           Labe28.setUI(null);
           Labe29.setUI(null);
           Labe30.setUI(null);
           Labe31.setUI(null);
           Labe32.setUI(null);
           Labe33.setUI(null);
           Labe34.setUI(null);
           Labe35.setUI(null);
           Labe36.setUI(null);
           Labe37.setUI(null);
           Labe38.setUI(null);
           Labe39.setUI(null);
           Labe40.setUI(null);
           Labe41.setUI(null);
           Labe42.setUI(null);
           Labe43.setUI(null);
           Labe4.setUI(null);
           Labe45.setUI(null);
           Labe46.setUI(null);
           Labe47.setUI(null);
           Labe48.setUI(null);
           Labe49.setUI(null);
           Labe50.setUI(null);
           Labe51.setUI(null);
           
           
           
        }
        catch(SQLException err_delete)
        {
            JOptionPane.showMessageDialog(null," Error Record Not Delete ","Error",JOptionPane.ERROR_MESSAGE);
        }
        view();
    }//GEN-LAST:event_Button_DeleteActionPerformed

    private void jTextField6_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6_viewActionPerformed

    private void jTextField5_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_viewActionPerformed

    private void jTextField4_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_viewActionPerformed

    private void jTextField3_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_viewActionPerformed

    private void jTextField2_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_viewActionPerformed

    private void jText_allotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_allotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_allotActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void select_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_boxActionPerformed
        // TODO add your handling code here:
        switch (select_box.getSelectedIndex()){
            
               case 50:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(true);
            Path_show40.setVisible(true);
            Path_show41.setVisible(true);
            Path_show42.setVisible(true);
            Path_show43.setVisible(true);
            Path_show44.setVisible(true);
            Path_show45.setVisible(true);
            Path_show46.setVisible(true);
            Path_show47.setVisible(true);
            Path_show48.setVisible(true);
            Path_show49.setVisible(true);
            break;
               case 49:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(true);
            Path_show40.setVisible(true);
            Path_show41.setVisible(true);
            Path_show42.setVisible(true);
            Path_show43.setVisible(true);
            Path_show44.setVisible(true);
            Path_show45.setVisible(true);
            Path_show46.setVisible(true);
            Path_show47.setVisible(true);
            Path_show48.setVisible(true);
            Path_show49.setVisible(false);
            break;
               case 48:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(true);
            Path_show40.setVisible(true);
            Path_show41.setVisible(true);
            Path_show42.setVisible(true);
            Path_show43.setVisible(true);
            Path_show44.setVisible(true);
            Path_show45.setVisible(true);
            Path_show46.setVisible(true);
            Path_show47.setVisible(true);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
               case 47:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(true);
            Path_show40.setVisible(true);
            Path_show41.setVisible(true);
            Path_show42.setVisible(true);
            Path_show43.setVisible(true);
            Path_show44.setVisible(true);
            Path_show45.setVisible(true);
            Path_show46.setVisible(true);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
               case 46:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(true);
            Path_show40.setVisible(true);
            Path_show41.setVisible(true);
            Path_show42.setVisible(true);
            Path_show43.setVisible(true);
            Path_show44.setVisible(true);
            Path_show45.setVisible(true);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
               case 45:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(true);
            Path_show40.setVisible(true);
            Path_show41.setVisible(true);
            Path_show42.setVisible(true);
            Path_show43.setVisible(true);
            Path_show44.setVisible(true);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
               case 44:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(true);
            Path_show40.setVisible(true);
            Path_show41.setVisible(true);
            Path_show42.setVisible(true);
            Path_show43.setVisible(true);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
               case 43:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(true);
            Path_show40.setVisible(true);
            Path_show41.setVisible(true);
            Path_show42.setVisible(true);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
               case 42:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(true);
            Path_show40.setVisible(true);
            Path_show41.setVisible(true);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
               case 41:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(true);
            Path_show40.setVisible(true);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 40:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(true);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 39:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(true);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 38:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(true);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 37:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(true);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 36:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(true);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 35:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(true);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 34:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(true);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 33:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(true);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 32:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(true);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 31:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(true);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 30:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(true);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 29:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(true);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 28:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(true);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 27:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(true);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 26:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(true);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 25:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(true);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 24:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(true);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 23:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(true);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 22:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(true);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 21:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(true);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
            case 20:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(true);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
            case 19:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(true);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
               case 18:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(true);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
              case 17:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(true);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
               case 16:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(true);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
              case 15:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(true);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;      
                        case 14:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(true);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 13:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(true);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
            case 12:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(true);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
            case 11:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(true);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
             case 10:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(true);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
            case 9:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(true);
            Path_show9.setVisible(false);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
            case 8:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(true);
            Path_show8.setVisible(false);
            Path_show9.setVisible(false);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
            case 7:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(true);
            Path_show7.setVisible(false);
            Path_show8.setVisible(false);
            Path_show9.setVisible(false);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
            case 6:
                Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(true);
            Path_show6.setVisible(false);
            Path_show7.setVisible(false);
            Path_show8.setVisible(false);
            Path_show9.setVisible(false);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);

            break;
            case 5:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(true);
            Path_show5.setVisible(false);
            Path_show6.setVisible(false);
            Path_show7.setVisible(false);
            Path_show8.setVisible(false);
            Path_show9.setVisible(false);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
            case 4:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(true);
            Path_show4.setVisible(false);
            Path_show5.setVisible(false);
            Path_show6.setVisible(false);
            Path_show7.setVisible(false);
            Path_show8.setVisible(false);
            Path_show9.setVisible(false);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);

            break;
            case 3:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(true);
            Path_show3.setVisible(false);
            Path_show4.setVisible(false);
            Path_show5.setVisible(false);
            Path_show6.setVisible(false);
            Path_show7.setVisible(false);
            Path_show8.setVisible(false);
            Path_show9.setVisible(false);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);

            break;
            case 2:
            Path_show.setVisible(true);
            Path_show1.setVisible(true);
            Path_show2.setVisible(false);
            Path_show3.setVisible(false);
            Path_show4.setVisible(false);
            Path_show5.setVisible(false);
            Path_show6.setVisible(false);
            Path_show7.setVisible(false);
            Path_show8.setVisible(false);
            Path_show9.setVisible(false);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
            case 1:
            Path_show.setVisible(true);
            Path_show1.setVisible(false);
            Path_show2.setVisible(false);
            Path_show3.setVisible(false);
            Path_show4.setVisible(false);
            Path_show5.setVisible(false);
            Path_show6.setVisible(false);
            Path_show7.setVisible(false);
            Path_show8.setVisible(false);
            Path_show9.setVisible(false);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);
            break;
            case 0:
                    Path_show.setVisible(false);
            Path_show1.setVisible(false);
            Path_show2.setVisible(false);
            Path_show3.setVisible(false);
            Path_show4.setVisible(false);
            Path_show5.setVisible(false);
            Path_show6.setVisible(false);
            Path_show7.setVisible(false);
            Path_show8.setVisible(false);
            Path_show9.setVisible(false);
            Path_show10.setVisible(false);
            Path_show11.setVisible(false);
            Path_show12.setVisible(false);
            Path_show13.setVisible(false);
            Path_show14.setVisible(false);
            Path_show15.setVisible(false);
            Path_show16.setVisible(false);
            Path_show17.setVisible(false);
            Path_show18.setVisible(false);
            Path_show19.setVisible(false);
            Path_show20.setVisible(false);
            Path_show21.setVisible(false);
            Path_show22.setVisible(false);
            Path_show23.setVisible(false);
            Path_show24.setVisible(false);
            Path_show25.setVisible(false);
            Path_show26.setVisible(false);
            Path_show27.setVisible(false);
            Path_show28.setVisible(false);
            Path_show29.setVisible(false);
            Path_show30.setVisible(false);
            Path_show31.setVisible(false);
            Path_show32.setVisible(false);
            Path_show33.setVisible(false);
            Path_show34.setVisible(false);
            Path_show35.setVisible(false);
            Path_show36.setVisible(false);
            Path_show37.setVisible(false);
            Path_show38.setVisible(false);
            Path_show39.setVisible(false);
            Path_show40.setVisible(false);
            Path_show41.setVisible(false);
            Path_show42.setVisible(false);
            Path_show43.setVisible(false);
            Path_show44.setVisible(false);
            Path_show45.setVisible(false);
            Path_show46.setVisible(false);
            Path_show47.setVisible(false);
            Path_show48.setVisible(false);
            Path_show49.setVisible(false);

            break;
        }

    }//GEN-LAST:event_select_boxActionPerformed

    private void Labe2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe2MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe2MouseClicked

    private void jTextArea1_Path_show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show1ActionPerformed
        // TODO add your handling code here:

        jTextArea1_Path_show.setVisible(false);
    }//GEN-LAST:event_jTextArea1_Path_show1ActionPerformed

    private void Labe3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe3MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show1.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe3MouseClicked

    private void Labe3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe3MousePressed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_Labe3MousePressed

    private void jTextArea1_Path_show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextArea1_Path_show2ActionPerformed

    private void Path_show1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Path_show1MouseEntered

    private void Path_show1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show1MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show1.setText(file_name);
    }//GEN-LAST:event_Path_show1MousePressed

    private void Labe5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe5MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show3.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe5MouseClicked

    private void Labe5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe5MousePressed

    private void jTextArea1_Path_show3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show3ActionPerformed

    private void Labe4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe4MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show2.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe4MouseClicked

    private void Labe4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe4MousePressed

    private void jTextArea1_Path_show4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show4ActionPerformed

    private void Labe6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe6MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show4.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe6MouseClicked

    private void Labe6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe6MousePressed

    private void Labe7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe7MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show5.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show5.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe7MouseClicked

    private void Labe7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe7MousePressed

    private void Labe8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe8MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show6.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show6.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe8MouseClicked

    private void Labe8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe8MousePressed

    private void Labe14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe14MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show12.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show12.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe14MouseClicked

    private void Labe14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe14MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe14MousePressed

    private void Labe15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe15MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show13.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show13.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe15MouseClicked

    private void Labe15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe15MousePressed

    private void Labe9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe9MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show7.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show7.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe9MouseClicked

    private void Labe10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe10MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show8.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show8.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe10MouseClicked

    private void Labe10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe10MousePressed

    private void Labe12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe12MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show10.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show10.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe12MouseClicked

    private void Labe12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe12MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe12MousePressed

    private void Labe11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe11MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show9.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show9.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe11MouseClicked

    private void Labe11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe11MousePressed

    private void Labe13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe13MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show11.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show11.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe13MouseClicked

    private void Labe13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe13MousePressed

    private void Labe21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe21MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show19.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show19.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe21MouseClicked

    private void Labe21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe21MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe21MousePressed

    private void Labe22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe22MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show20.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show20.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe22MouseClicked

    private void Labe22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe22MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe22MousePressed

    private void Labe16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe16MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show14.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show14.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe16MouseClicked

    private void Labe28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe28MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show26.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show26.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe28MouseClicked

    private void Labe28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe28MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe28MousePressed

    private void Labe29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe29MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show27.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show27.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe29MouseClicked

    private void Labe29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe29MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe29MousePressed

    private void Labe17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe17MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show15.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show15.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe17MouseClicked

    private void Labe17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe17MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe17MousePressed

    private void Labe23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe23MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show21.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show21.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe23MouseClicked

    private void Labe24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe24MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show22.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show22.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe24MouseClicked

    private void Labe24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe24MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe24MousePressed

    private void Labe19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe19MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show17.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show17.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe19MouseClicked

    private void Labe19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe19MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe19MousePressed

    private void Labe26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe26MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show24.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show24.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe26MouseClicked

    private void Labe26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe26MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe26MousePressed

    private void Labe25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe25MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show23.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show23.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe25MouseClicked

    private void Labe25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe25MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe25MousePressed

    private void Labe18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe18MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show16.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show16.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe18MouseClicked

    private void Labe18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe18MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe18MousePressed

    private void Labe27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe27MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show25.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show25.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe27MouseClicked

    private void Labe27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe27MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe27MousePressed

    private void Labe20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe20MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show18.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show18.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe20MouseClicked

    private void Labe20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe20MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe20MousePressed

    private void Labe50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe50MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show48.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show48.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe50MouseClicked

    private void Labe50MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe50MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe50MousePressed

    private void Labe44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe44MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show42.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show42.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe44MouseClicked

    private void Labe30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe30MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show28.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show28.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe30MouseClicked

    private void Labe45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe45MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show43.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show43.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe45MouseClicked

    private void Labe45MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe45MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe45MousePressed

    private void Labe31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe31MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show29.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show29.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe31MouseClicked

    private void Labe31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe31MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe31MousePressed

    private void Labe33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe33MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show31.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show31.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe33MouseClicked

    private void Labe33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe33MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe33MousePressed

    private void Labe47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe47MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show45.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show45.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe47MouseClicked

    private void Labe47MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe47MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe47MousePressed

    private void Labe32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe32MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show30.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show30.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe32MouseClicked

    private void Labe32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe32MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe32MousePressed

    private void Labe34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe34MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show32.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show32.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe34MouseClicked

    private void Labe34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe34MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe34MousePressed

    private void Labe46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe46MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show44.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show44.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe46MouseClicked

    private void Labe46MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe46MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe46MousePressed

    private void Labe35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe35MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show33.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show33.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe35MouseClicked

    private void Labe35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe35MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe35MousePressed

    private void Labe48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe48MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show46.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show46.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe48MouseClicked

    private void Labe48MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe48MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe48MousePressed

    private void Labe36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe36MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show34.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show34.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe36MouseClicked

    private void Labe36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe36MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe36MousePressed

    private void Labe42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe42MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show40.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show40.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe42MouseClicked

    private void Labe42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe42MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe42MousePressed

    private void Labe43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe43MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show41.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show41.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe43MouseClicked

    private void Labe43MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe43MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe43MousePressed

    private void Labe37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe37MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show35.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show35.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe37MouseClicked

    private void Labe38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe38MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show36.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show36.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe38MouseClicked

    private void Labe38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe38MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe38MousePressed

    private void Labe40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe40MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show38.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show38.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe40MouseClicked

    private void Labe40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe40MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe40MousePressed

    private void Labe39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe39MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show37.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show37.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe39MouseClicked

    private void Labe39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe39MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe39MousePressed

    private void Labe41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe41MouseClicked
        // TODO add your handling code here
        if(jTextArea1_Path_show39.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show39.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe41MouseClicked

    private void Labe41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe41MousePressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_Labe41MousePressed

    private void Labe49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe49MouseClicked
        // TODO add your handling code here:
        if(jTextArea1_Path_show47.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show47.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe49MouseClicked

    private void Labe49MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe49MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe49MousePressed

    private void jTextArea1_Path_show5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show5ActionPerformed

    private void jTextArea1_Path_show6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show6ActionPerformed

    private void jTextArea1_Path_show7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show7ActionPerformed

    private void jTextArea1_Path_show8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show8ActionPerformed

    private void jTextArea1_Path_show9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show9ActionPerformed

    private void jTextArea1_Path_show10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show10ActionPerformed

    private void jTextArea1_Path_show11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show11ActionPerformed

    private void jTextArea1_Path_show12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show12ActionPerformed

    private void jTextArea1_Path_show13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show13ActionPerformed

    private void jTextArea1_Path_show14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show14ActionPerformed

    private void jTextArea1_Path_show15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show15ActionPerformed

    private void jTextArea1_Path_show16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show16ActionPerformed

    private void jTextArea1_Path_show17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show17ActionPerformed

    private void jTextArea1_Path_show18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show18ActionPerformed

    private void jTextArea1_Path_show19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show19ActionPerformed

    private void jTextArea1_Path_show20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show20ActionPerformed

    private void jTextArea1_Path_show21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show21ActionPerformed

    private void jTextArea1_Path_show22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show22ActionPerformed

    private void jTextArea1_Path_show23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show23ActionPerformed

    private void jTextArea1_Path_show24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show24ActionPerformed

    private void jTextArea1_Path_show25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show25ActionPerformed

    private void jTextArea1_Path_show26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show26ActionPerformed

    private void jTextArea1_Path_show27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show27ActionPerformed

    private void jTextArea1_Path_show28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show28ActionPerformed

    private void jTextArea1_Path_show29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show29ActionPerformed

    private void jTextArea1_Path_show30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show30ActionPerformed

    private void jTextArea1_Path_show31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show31ActionPerformed

    private void jTextArea1_Path_show32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show32ActionPerformed

    private void jTextArea1_Path_show33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show33ActionPerformed

    private void jTextArea1_Path_show34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show34ActionPerformed

    private void jTextArea1_Path_show35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show35ActionPerformed

    private void jTextArea1_Path_show40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show40ActionPerformed

    private void jTextArea1_Path_show41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show41ActionPerformed

    private void jTextArea1_Path_show42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show42ActionPerformed

    private void jTextArea1_Path_show43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show43ActionPerformed

    private void jTextArea1_Path_show44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show44ActionPerformed

    private void jTextArea1_Path_show45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show45ActionPerformed

    private void jTextArea1_Path_show46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show46ActionPerformed

    private void jTextArea1_Path_show47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show47ActionPerformed

    private void jTextArea1_Path_show48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show48ActionPerformed

    private void jTextArea1_Path_show36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show36ActionPerformed

    private void jTextArea1_Path_show37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show37ActionPerformed

    private void jTextArea1_Path_show38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show38ActionPerformed

    private void jTextArea1_Path_show39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show39ActionPerformed

    private void jTextArea1_Path_show49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextArea1_Path_show49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1_Path_show49ActionPerformed

    private void Path_show2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show2MousePressed
        // TODO add your handling code here:
          JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show2.setText(file_name);
    }//GEN-LAST:event_Path_show2MousePressed

    private void Path_show3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show3MousePressed
        // TODO add your handling code here:
          JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show3.setText(file_name);
    }//GEN-LAST:event_Path_show3MousePressed

    private void Path_show4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show4MousePressed
        // TODO add your handling code here:
          JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show4.setText(file_name);
    }//GEN-LAST:event_Path_show4MousePressed

    private void Path_show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Path_show2ActionPerformed

    private void Path_show5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show5MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show5.setText(file_name);
    }//GEN-LAST:event_Path_show5MousePressed

    private void Path_show6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show6MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show6.setText(file_name);
    }//GEN-LAST:event_Path_show6MousePressed

    private void Path_show7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show7MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show7.setText(file_name);
    }//GEN-LAST:event_Path_show7MousePressed

    private void Path_show8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show8MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show8.setText(file_name);
    }//GEN-LAST:event_Path_show8MousePressed

    private void Path_show9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show9MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show9.setText(file_name);
    }//GEN-LAST:event_Path_show9MousePressed

    private void Path_show8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show8ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Path_show8ActionPerformed

    private void Path_show10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show10MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show10.setText(file_name);
    }//GEN-LAST:event_Path_show10MousePressed

    private void Path_show10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show10ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Path_show10ActionPerformed

    private void Path_show11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show11MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show11.setText(file_name);
    }//GEN-LAST:event_Path_show11MousePressed

    private void Path_show12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show12MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show12.setText(file_name);
    }//GEN-LAST:event_Path_show12MousePressed

    private void Path_show12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show12ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_Path_show12ActionPerformed

    private void Path_show13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show13MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show13.setText(file_name);
    }//GEN-LAST:event_Path_show13MousePressed

    private void Path_show14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show14MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show14.setText(file_name);
    }//GEN-LAST:event_Path_show14MousePressed

    private void Path_show14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show14ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Path_show14ActionPerformed

    private void Path_show15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show15MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show15.setText(file_name);
    }//GEN-LAST:event_Path_show15MousePressed

    private void Path_show16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show16MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show16.setText(file_name);
    }//GEN-LAST:event_Path_show16MousePressed

    private void Path_show16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show16ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Path_show16ActionPerformed

    private void Path_show17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show17MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show17.setText(file_name);
    }//GEN-LAST:event_Path_show17MousePressed

    private void Path_show18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show18MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show18.setText(file_name);
    }//GEN-LAST:event_Path_show18MousePressed

    private void Path_show18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show18ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Path_show18ActionPerformed

    private void Path_show19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show19MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show19.setText(file_name);
    }//GEN-LAST:event_Path_show19MousePressed

    private void Path_show20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show20MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show20.setText(file_name);
    }//GEN-LAST:event_Path_show20MousePressed

    private void Path_show20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show20ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Path_show20ActionPerformed

    private void Path_show21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show21MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show21.setText(file_name);
    }//GEN-LAST:event_Path_show21MousePressed

    private void Path_show22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show22MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show22.setText(file_name);
    }//GEN-LAST:event_Path_show22MousePressed

    private void Path_show22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show22ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Path_show22ActionPerformed

    private void Path_show23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show23MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show23.setText(file_name);
    }//GEN-LAST:event_Path_show23MousePressed

    private void Path_show24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show24MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show24.setText(file_name);
    }//GEN-LAST:event_Path_show24MousePressed

    private void Path_show24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show24ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_Path_show24ActionPerformed

    private void Path_show25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show25MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show25.setText(file_name);
    }//GEN-LAST:event_Path_show25MousePressed

    private void Path_show26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show26MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show26.setText(file_name);
    }//GEN-LAST:event_Path_show26MousePressed

    private void Path_show26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show26ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Path_show26ActionPerformed

    private void Path_show27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show27MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show27.setText(file_name);
    }//GEN-LAST:event_Path_show27MousePressed

    private void Path_show28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show28MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show28.setText(file_name);
    }//GEN-LAST:event_Path_show28MousePressed

    private void Path_show28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show28ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Path_show28ActionPerformed

    private void Path_show29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show29MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show29.setText(file_name);
    }//GEN-LAST:event_Path_show29MousePressed

    private void Path_show30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show30MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show30.setText(file_name);
    }//GEN-LAST:event_Path_show30MousePressed

    private void Path_show30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show30ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Path_show30ActionPerformed

    private void Path_show31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show31MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show31.setText(file_name);
    }//GEN-LAST:event_Path_show31MousePressed

    private void Path_show32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show32MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show32.setText(file_name);
    }//GEN-LAST:event_Path_show32MousePressed

    private void Path_show32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show32ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Path_show32ActionPerformed

    private void Path_show33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show33MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show33.setText(file_name);
    }//GEN-LAST:event_Path_show33MousePressed

    private void Path_show34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show34MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show34.setText(file_name);
    }//GEN-LAST:event_Path_show34MousePressed

    private void Path_show34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show34ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Path_show34ActionPerformed

    private void Path_show35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show35MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show35.setText(file_name);
    }//GEN-LAST:event_Path_show35MousePressed

    private void Path_show36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show36MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show36.setText(file_name);
    }//GEN-LAST:event_Path_show36MousePressed

    private void Path_show36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show36ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Path_show36ActionPerformed

    private void Path_show37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show37MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show37.setText(file_name);
    }//GEN-LAST:event_Path_show37MousePressed

    private void Path_show38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show38MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show38.setText(file_name);
    }//GEN-LAST:event_Path_show38MousePressed

    private void Path_show38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show38ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Path_show38ActionPerformed

    private void Path_show39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show39MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show39.setText(file_name);
    }//GEN-LAST:event_Path_show39MousePressed

    private void Path_show40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show40MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show40.setText(file_name);
    }//GEN-LAST:event_Path_show40MousePressed

    private void Path_show40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show40ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Path_show40ActionPerformed

    private void Path_show41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show41MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show41.setText(file_name);
    }//GEN-LAST:event_Path_show41MousePressed

    private void Path_show42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show42MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show42.setText(file_name);
    }//GEN-LAST:event_Path_show42MousePressed

    private void Path_show42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show42ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Path_show42ActionPerformed

    private void Path_show43MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show43MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show43.setText(file_name);
    }//GEN-LAST:event_Path_show43MousePressed

    private void Path_show44MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show44MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show44.setText(file_name);
    }//GEN-LAST:event_Path_show44MousePressed

    private void Path_show44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show44ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Path_show44ActionPerformed

    private void Path_show45MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show45MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show45.setText(file_name);
    }//GEN-LAST:event_Path_show45MousePressed

    private void Path_show46MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show46MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show46.setText(file_name);
    }//GEN-LAST:event_Path_show46MousePressed

    private void Path_show46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show46ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Path_show46ActionPerformed

    private void Path_show47MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show47MousePressed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show47.setText(file_name);
    }//GEN-LAST:event_Path_show47MousePressed

    private void Path_show48MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show48MousePressed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show48.setText(file_name);
    }//GEN-LAST:event_Path_show48MousePressed

    private void Path_show48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path_show48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Path_show48ActionPerformed

    private void Path_show49MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Path_show49MousePressed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String file_name=f.getAbsolutePath();
        Path_show49.setText(file_name);
    }//GEN-LAST:event_Path_show49MousePressed

    private void Labe51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe51MouseClicked
        // TODO add your handling code here:
          if(jTextArea1_Path_show49.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null," No File ","Infornation Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GetViewData_Path_File=jTextArea1_Path_show49.getText();
            try
            {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+""+GetViewData_Path_File);
            }
            catch(Exception err_open_file)
            {
                JOptionPane.showMessageDialog(null," Error ","Error",JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_Labe51MouseClicked

    private void Labe51MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Labe51MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Labe51MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          MessageFormat header = new MessageFormat("Allotment");
        MessageFormat footer = new MessageFormat("Page {0,number,integer} ");
        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH  , header, footer);
        }
        catch (java.awt.print.PrinterException e)
        {
            System.err.format("Cannot print %s%n ",e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          MessageFormat header = new MessageFormat("Membership");
        MessageFormat footer = new MessageFormat("Page {0,number,integer} ");
        try{
            jTable3.print(JTable.PrintMode.FIT_WIDTH  , header, footer);
        }
        catch (java.awt.print.PrinterException e)
        {
            System.err.format("Cannot print %s%n ",e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Printer Data");
            
            job.setPrintable(new Printable(){
                public int print (Graphics pg,PageFormat pf, int pageNum){
                    if(pageNum>0){
                        return Printable.NO_SUCH_PAGE;
                    }
                    Graphics2D g2 =  (Graphics2D)pg;
                    g2.translate(pf.getImageableX(), pf.getImageableY());
                    g2.scale(0.54, 0.54);
                    jPanel1.paint(g2);
                    return Printable.PAGE_EXISTS;
                }
                
            });
            
            boolean ok = job.printDialog();
            if(ok){
                try{
                    job.print();
                }
                catch(PrinterException ex){
                    
                }
            }
            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Button_print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_print1ActionPerformed
        // TODO add your handling code here:
           MessageFormat header = new MessageFormat("");
        MessageFormat footer = new MessageFormat("Page {0,number,integer} ");
        try{
            viewtable.print(JTable.PrintMode.FIT_WIDTH  , header, footer);
        }
        catch (java.awt.print.PrinterException e)
        {
            System.err.format("Cannot print %s%n ",e.getMessage());
        }
    }//GEN-LAST:event_Button_print1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Delete;
    private javax.swing.JButton Button_Insert;
    private javax.swing.JButton Button_Reset;
    private javax.swing.JButton Button_Search;
    private javax.swing.JButton Button_print1;
    private javax.swing.JLabel Labe10;
    private javax.swing.JLabel Labe11;
    private javax.swing.JLabel Labe12;
    private javax.swing.JLabel Labe13;
    private javax.swing.JLabel Labe14;
    private javax.swing.JLabel Labe15;
    private javax.swing.JLabel Labe16;
    private javax.swing.JLabel Labe17;
    private javax.swing.JLabel Labe18;
    private javax.swing.JLabel Labe19;
    private javax.swing.JLabel Labe2;
    private javax.swing.JLabel Labe20;
    private javax.swing.JLabel Labe21;
    private javax.swing.JLabel Labe22;
    private javax.swing.JLabel Labe23;
    private javax.swing.JLabel Labe24;
    private javax.swing.JLabel Labe25;
    private javax.swing.JLabel Labe26;
    private javax.swing.JLabel Labe27;
    private javax.swing.JLabel Labe28;
    private javax.swing.JLabel Labe29;
    private javax.swing.JLabel Labe3;
    private javax.swing.JLabel Labe30;
    private javax.swing.JLabel Labe31;
    private javax.swing.JLabel Labe32;
    private javax.swing.JLabel Labe33;
    private javax.swing.JLabel Labe34;
    private javax.swing.JLabel Labe35;
    private javax.swing.JLabel Labe36;
    private javax.swing.JLabel Labe37;
    private javax.swing.JLabel Labe38;
    private javax.swing.JLabel Labe39;
    private javax.swing.JLabel Labe4;
    private javax.swing.JLabel Labe40;
    private javax.swing.JLabel Labe41;
    private javax.swing.JLabel Labe42;
    private javax.swing.JLabel Labe43;
    private javax.swing.JLabel Labe44;
    private javax.swing.JLabel Labe45;
    private javax.swing.JLabel Labe46;
    private javax.swing.JLabel Labe47;
    private javax.swing.JLabel Labe48;
    private javax.swing.JLabel Labe49;
    private javax.swing.JLabel Labe5;
    private javax.swing.JLabel Labe50;
    private javax.swing.JLabel Labe51;
    private javax.swing.JLabel Labe6;
    private javax.swing.JLabel Labe7;
    private javax.swing.JLabel Labe8;
    private javax.swing.JLabel Labe9;
    private javax.swing.JTextField Path_show;
    private javax.swing.JTextField Path_show1;
    private javax.swing.JTextField Path_show10;
    private javax.swing.JTextField Path_show11;
    private javax.swing.JTextField Path_show12;
    private javax.swing.JTextField Path_show13;
    private javax.swing.JTextField Path_show14;
    private javax.swing.JTextField Path_show15;
    private javax.swing.JTextField Path_show16;
    private javax.swing.JTextField Path_show17;
    private javax.swing.JTextField Path_show18;
    private javax.swing.JTextField Path_show19;
    private javax.swing.JTextField Path_show2;
    private javax.swing.JTextField Path_show20;
    private javax.swing.JTextField Path_show21;
    private javax.swing.JTextField Path_show22;
    private javax.swing.JTextField Path_show23;
    private javax.swing.JTextField Path_show24;
    private javax.swing.JTextField Path_show25;
    private javax.swing.JTextField Path_show26;
    private javax.swing.JTextField Path_show27;
    private javax.swing.JTextField Path_show28;
    private javax.swing.JTextField Path_show29;
    private javax.swing.JTextField Path_show3;
    private javax.swing.JTextField Path_show30;
    private javax.swing.JTextField Path_show31;
    private javax.swing.JTextField Path_show32;
    private javax.swing.JTextField Path_show33;
    private javax.swing.JTextField Path_show34;
    private javax.swing.JTextField Path_show35;
    private javax.swing.JTextField Path_show36;
    private javax.swing.JTextField Path_show37;
    private javax.swing.JTextField Path_show38;
    private javax.swing.JTextField Path_show39;
    private javax.swing.JTextField Path_show4;
    private javax.swing.JTextField Path_show40;
    private javax.swing.JTextField Path_show41;
    private javax.swing.JTextField Path_show42;
    private javax.swing.JTextField Path_show43;
    private javax.swing.JTextField Path_show44;
    private javax.swing.JTextField Path_show45;
    private javax.swing.JTextField Path_show46;
    private javax.swing.JTextField Path_show47;
    private javax.swing.JTextField Path_show48;
    private javax.swing.JTextField Path_show49;
    private javax.swing.JTextField Path_show5;
    private javax.swing.JTextField Path_show6;
    private javax.swing.JTextField Path_show7;
    private javax.swing.JTextField Path_show8;
    private javax.swing.JTextField Path_show9;
    private javax.swing.JTextField c;
    private javax.swing.JTextField d;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_view;
    private javax.swing.JLabel jLabel2_insert;
    private javax.swing.JLabel jLabel2_insert1;
    private javax.swing.JLabel jLabel2_insert2;
    private javax.swing.JLabel jLabel2_view;
    private javax.swing.JLabel jLabel2_view1;
    private javax.swing.JLabel jLabel3_insert;
    private javax.swing.JLabel jLabel3_view;
    private javax.swing.JLabel jLabel4_insert;
    private javax.swing.JLabel jLabel4_insert1;
    private javax.swing.JLabel jLabel4_view;
    private javax.swing.JLabel jLabel5_insert;
    private javax.swing.JLabel jLabel5_view;
    private javax.swing.JLabel jLabel6_insert;
    private javax.swing.JLabel jLabel6_view;
    private javax.swing.JLabel jLabel6_view1;
    private javax.swing.JLabel jLabel6_view2;
    private javax.swing.JLabel jLabel8_insert;
    private javax.swing.JLabel jLabel8_view;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextArea1_Path_show;
    private javax.swing.JTextField jTextArea1_Path_show1;
    private javax.swing.JTextField jTextArea1_Path_show10;
    private javax.swing.JTextField jTextArea1_Path_show11;
    private javax.swing.JTextField jTextArea1_Path_show12;
    private javax.swing.JTextField jTextArea1_Path_show13;
    private javax.swing.JTextField jTextArea1_Path_show14;
    private javax.swing.JTextField jTextArea1_Path_show15;
    private javax.swing.JTextField jTextArea1_Path_show16;
    private javax.swing.JTextField jTextArea1_Path_show17;
    private javax.swing.JTextField jTextArea1_Path_show18;
    private javax.swing.JTextField jTextArea1_Path_show19;
    private javax.swing.JTextField jTextArea1_Path_show2;
    private javax.swing.JTextField jTextArea1_Path_show20;
    private javax.swing.JTextField jTextArea1_Path_show21;
    private javax.swing.JTextField jTextArea1_Path_show22;
    private javax.swing.JTextField jTextArea1_Path_show23;
    private javax.swing.JTextField jTextArea1_Path_show24;
    private javax.swing.JTextField jTextArea1_Path_show25;
    private javax.swing.JTextField jTextArea1_Path_show26;
    private javax.swing.JTextField jTextArea1_Path_show27;
    private javax.swing.JTextField jTextArea1_Path_show28;
    private javax.swing.JTextField jTextArea1_Path_show29;
    private javax.swing.JTextField jTextArea1_Path_show3;
    private javax.swing.JTextField jTextArea1_Path_show30;
    private javax.swing.JTextField jTextArea1_Path_show31;
    private javax.swing.JTextField jTextArea1_Path_show32;
    private javax.swing.JTextField jTextArea1_Path_show33;
    private javax.swing.JTextField jTextArea1_Path_show34;
    private javax.swing.JTextField jTextArea1_Path_show35;
    private javax.swing.JTextField jTextArea1_Path_show36;
    private javax.swing.JTextField jTextArea1_Path_show37;
    private javax.swing.JTextField jTextArea1_Path_show38;
    private javax.swing.JTextField jTextArea1_Path_show39;
    private javax.swing.JTextField jTextArea1_Path_show4;
    private javax.swing.JTextField jTextArea1_Path_show40;
    private javax.swing.JTextField jTextArea1_Path_show41;
    private javax.swing.JTextField jTextArea1_Path_show42;
    private javax.swing.JTextField jTextArea1_Path_show43;
    private javax.swing.JTextField jTextArea1_Path_show44;
    private javax.swing.JTextField jTextArea1_Path_show45;
    private javax.swing.JTextField jTextArea1_Path_show46;
    private javax.swing.JTextField jTextArea1_Path_show47;
    private javax.swing.JTextField jTextArea1_Path_show48;
    private javax.swing.JTextField jTextArea1_Path_show49;
    private javax.swing.JTextField jTextArea1_Path_show5;
    private javax.swing.JTextField jTextArea1_Path_show6;
    private javax.swing.JTextField jTextArea1_Path_show7;
    private javax.swing.JTextField jTextArea1_Path_show8;
    private javax.swing.JTextField jTextArea1_Path_show9;
    private javax.swing.JTextArea jTextArea1_view;
    private javax.swing.JTextArea jTextArea_allot;
    private javax.swing.JTextArea jTextArea_td;
    private javax.swing.JTextField jTextField1_search;
    private javax.swing.JTextField jTextField2_insert;
    private javax.swing.JTextField jTextField2_insertname;
    private javax.swing.JTextField jTextField2_view;
    private javax.swing.JTextField jTextField2_view_name;
    private javax.swing.JTextField jTextField3_insert;
    private javax.swing.JTextField jTextField3_view;
    private javax.swing.JTextField jTextField4_insert;
    private javax.swing.JTextField jTextField4_view;
    private javax.swing.JTextField jTextField5_view;
    private javax.swing.JTextField jTextField6_insert;
    private javax.swing.JTextField jTextField6_view;
    private javax.swing.JTextField jTextField8_insert;
    private javax.swing.JTextField jText_allot;
    private javax.swing.JTextField jText_td;
    private javax.swing.JTextField jtext_rname;
    private javax.swing.JComboBox<String> select_box;
    private javax.swing.JTable viewtable;
    // End of variables declaration//GEN-END:variables
String GetViewData_Path_File=null;
}
