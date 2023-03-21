package bank.management_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    String pinnumber;
    JPasswordField pin,repin;
    JButton change,back;
    
    PinChange(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text= new JLabel("Change your pin");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,16));
        text.setBounds(260,300,500,35);
        image.add(text);
        
        JLabel pintext= new JLabel("New pin:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("Raleway",Font.BOLD,16));
        pintext.setBounds(165,350,180,25);
        image.add(pintext);
        pin=new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,350,180,25);
        image.add(pin);
        
        
        JLabel repintext= new JLabel("Re-Enter New pin:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("Raleway",Font.BOLD,16));
        repintext.setBounds(165,390,180,25);
        image.add(repintext);
        repin=new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,390,180,25);
        image.add(repin);
        
        change=new JButton("Change");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back=new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
        try{
            String npin=pin.getText();
            String rpin=repin.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter new Pin");
            }
            
            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null,"Please re-enter new Pin");
            }
            
            conn co=new conn();
            String query1="update bank set pin='"+rpin+"' where pin='"+pinnumber+"'";
            String query2="update login set pinnumber='"+rpin+"' where pinnumber='"+pinnumber+"'";
            String query3="update signupthree set pinnumber='"+rpin+"' where pinnumber='"+pinnumber+"'";
            
            co.s.executeUpdate(query1);
            co.s.executeUpdate(query2);
            co.s.executeUpdate(query3);
            JOptionPane.showMessageDialog(null,"Pin changed successfully");
            
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }else {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[]){
        new PinChange("").setVisible(true);
    }
}
