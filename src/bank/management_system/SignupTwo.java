/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management_system;
import javax.swing.*;
import java.awt.*;
import java.util.*;

import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    String sreligion,scategory,sincome,soccupation,seniorcitizen,existingaccount,seducation,span,saadhar;
    
    SignupTwo(String formno)
    {
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION - PAGE 2");
        
        JLabel additionalDetails=new JLabel("PAGE 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,40);
        add(additionalDetails);
        
        JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
       
        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        String valcategory[]={"General","OBC","SC","ST","Other"};
        category=new JComboBox(valcategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300,190,400,30);
        add(category);
        
        
        JLabel dob=new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        String incomecategory[]={"NIL","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income=new JComboBox(incomecategory);
        income.setBackground(Color.WHITE);
        income.setBounds(300,240,400,30);
        add(income);
       
        
        JLabel gender=new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        
        JLabel email=new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD, 20));
        email.setBounds(100,315,200,30);
        add(email);
        String educationvalues[]={"Non-Graduate","Graduation","Post-Graduation","Doctrate","Others"};
        education=new JComboBox(educationvalues);
        education.setBackground(Color.WHITE);
        education.setBounds(300,315,400,30);
        add(education);
        
        
        
        JLabel marital=new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);
        String occupationvalues[]={"Salaried","Self-employed","Business","Student","Retired","Others"};
        occupation=new JComboBox(occupationvalues);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300,390,400,30);
        add(occupation);
        
        
        JLabel address=new JLabel("Pan number:");
        address.setFont(new Font("Raleway",Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        
        JLabel city=new JLabel("Aadhar number:");
        city.setFont(new Font("Raleway",Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        
        JLabel state=new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,50,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        sno=new JRadioButton("No");
        sno.setBounds(400,540,60,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        ButtonGroup seniorgroup=new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
        JLabel pincode=new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,60,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        eno=new JRadioButton("No");
        eno.setBounds(400,590,120,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        ButtonGroup existgroup=new ButtonGroup();
        existgroup.add(eyes);
        existgroup.add(eno);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setVisible(true);
        setLocation(350, 10);
        
    }

public static void main(String args[])
    {
        new SignupTwo("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        sreligion= (String)religion.getSelectedItem();
        scategory=(String)category.getSelectedItem();
        sincome=(String)income.getSelectedItem();
        seducation=(String)education.getSelectedItem();
        soccupation=(String)occupation.getSelectedItem();
        
        seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }
        else if(sno.isSelected()){
            seniorcitizen="No";
        }
        existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="Yes";
        }
        else if(eno.isSelected()){
            existingaccount="No";
        }
        
        span=pan.getText();
        saadhar=aadhar.getText();
        
        
        try{
            conn c=new conn();
            String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            //signup3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
