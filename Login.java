/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JTextField tfusername, tfpass;
    Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel username= new JLabel("Username");
        username.setBounds(40,20,100,30);
        add(username);
        
       tfusername= new JTextField();
        tfusername.setBounds(150,20,150,30);
        add(tfusername);
        
        
         JLabel pass= new JLabel("Password");
        pass.setBounds(40,70,100,30);
        add(pass);
         
         tfpass= new JTextField();
        tfpass.setBounds(150,70,150,30);
        add(tfpass);
        
         JButton login=new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
         
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);
        
         setSize(600,300);
        setLocation(450,200);
        setVisible(true);
        
    }
  
    @Override
       public void actionPerformed(ActionEvent e){
           String username,password;
       try{
           username= tfusername.getText();
            password= tfpass.getText();
           Conn c= new Conn();
           String query ="SELECT * from login where username= '"+username+"' and password = '"+password+"'";
           ResultSet rs=c.s.executeQuery(query);
                     
              
                   if(rs.next())
                   {
                       setVisible(false);
                       new Home();
                       
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Invalid username or password");
                       setVisible(false);
                   }
       
       }
catch(Exception ae){
ae.printStackTrace();
}
       }

public static void main(String args[])
{
new Login();
}
}