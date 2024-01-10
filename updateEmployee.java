/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

public class updateEmployee extends JFrame implements ActionListener {

    JTextField tfeducation, tfname, tffname, tfemail, tfaddress, tfadhar, tfsalary, tfphone, tfdesignation;

    JLabel lempID, labelname,labelfname, lblname, heading, labeldob, labeladhar, labeladdress, labelsalary, labelemail, labelempId, labelphone, labeleducation, labeldesignation;
    JButton ad, back;
    String empId;

    updateEmployee(String empId) {
        this.empId = empId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        heading = new JLabel("Update Employee Details");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 150, 30);
        lblname.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(lblname);

        labelname = new JLabel();
        labelname.setBounds(200, 150, 150, 30);
        add(labelname);

        labelfname = new JLabel("Father's Name");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelfname);

        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("SERIF", Font.PLAIN, 20));
        add(labeldob);

       labeldob = new JLabel();
        labeldob.setBounds(200, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);

        labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("SERIF", Font.PLAIN, 20));
        add(labelsalary);

        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);

        labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("SERIF", Font.PLAIN, 20));
        add(labeladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("SERIF", Font.PLAIN, 20));
        add(labelphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);

        labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("SERIF", Font.PLAIN, 20));
        add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        labeleducation = new JLabel("Highest Education");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("SERIF", Font.PLAIN, 20));
        add(labeleducation);

        tfeducation = new JTextField();
        tfeducation.setBounds(600, 300, 150, 30);
        add(tfeducation);

        labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labeldesignation);

        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);

        labeladhar = new JLabel("Adhaar Number");
        labeladhar.setBounds(400, 350, 150, 30);
        labeladhar.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labeladhar);

        JLabel adhar = new JLabel();
        adhar.setBounds(600, 350, 150, 30);
        add(adhar);

        labelempId = new JLabel("Employee ID");
        labelempId.setBounds(50, 400, 150, 30);
        labelempId.setFont(new Font("SERIF", Font.PLAIN, 20));
        add(labelempId);
        
        labelempId= new JLabel();
        labelempId.setBounds(200,400,150,30);
        labelempId.setFont(new Font("serif",Font.PLAIN,20));
        add(labelempId); 
        
        
        try {
            Conn c = new Conn();
            String query = "select *from employee where empId = '" + empId + "' ";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                labelname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfsalary.setText(rs.getString("salary"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfeducation.setText(rs.getString("education"));
                labeladhar.setText(rs.getString("adhar"));
                labelempId.setText(rs.getString("empId"));
                tfdesignation.setText(rs.getString("designation"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
  
ad = new JButton("Update Details");
        ad.setBounds(250, 550, 150, 40);
        ad.addActionListener(this);
        ad.setForeground(Color.WHITE);
        ad.setBackground(Color.BLACK);
        add(ad);

        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);

        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ad) {
            String fname = tffname.getText();
           String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education=tfeducation.getText();
            String designation = tfdesignation.getText();
            
            try {
                Conn con = new Conn();
                String query="update employee set fname=  '"+fname+"',salary = '"+salary+"', address= '"+address+"', phone = '"+phone+"', email = '"+email+"' , education ='"+education+"', designation ='"+designation+"' where empId= '"+empId+"' ";
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                new Home();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String args[]) {
      new updateEmployee("");
    }
}
