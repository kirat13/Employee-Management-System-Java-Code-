/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField tfname, tffname, tfemail, tfaddress, tfadhar, tfsalary, tfphone, tfdesignation;
    JComboBox cbeducation;
    JDateChooser dcdob;
    JLabel lempID, labelfname, labelname, heading, labeldob, labeladhar, labeladdress, labelsalary, labelemail, labelempID, labelphone, labeleducation, labeldesignation;
    JButton ad, back;

    Random ran = new Random();
    int number = ran.nextInt(999999);

    AddEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        heading = new JLabel("Add Employee Details");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

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

        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);

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

        String courses[] = {"BBA", "BCA", "BA", "BSC", "B.COM", "BTEch", "MBA", "MCA", "MA"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);

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

        tfadhar = new JTextField();
        tfadhar.setBounds(600, 350, 150, 30);
        add(tfadhar);

        labelempID = new JLabel("Employee ID");
        labelempID.setBounds(50, 400, 150, 30);
        labelempID.setFont(new Font("SERIF", Font.PLAIN, 20));
        add(labelempID);

        lempID = new JLabel("" + number);
        lempID.setBounds(200, 400, 150, 30);
        lempID.setFont(new Font("SERIF", Font.PLAIN, 20));
        add(lempID);

        ad = new JButton("Add Details");
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
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String adhar = tfadhar.getText();
            String empID = lempID.getText();

            try {
                Conn con = new Conn();
                String query = "insert into employee values('"+name+"','" +fname+"','" +dob+"','"+salary+"' ,'" + address + "','" + phone + "', '" + email + "', '" + education + "','"+designation+"', '" + adhar + "' ,'" + empID + "')";
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Details Added successfully");
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
        new AddEmployee();
    }
}
