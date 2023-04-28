import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {
	private JLabel signin,email,password,bgpic,credit,logo,wronginput,topicon;
	private JTextField email_;
	private JPasswordField password_;
	private JButton enter;
	private String passinput,unameinput;
	private JPanel sign;
	private ImageIcon icon;
	private JRadioButton admin,librarian;
	
	
login() {
		
		ImageIcon bg = new ImageIcon("library.jpg");
		icon = new ImageIcon("booklogo.jpg");
		
		topicon = new JLabel();
	
		logo = new JLabel("Bulldog Library");
		logo.setFont(new Font("Agency FB",Font.BOLD,40));
		logo.setForeground(Color.white);
		logo.setBounds(20, -5, 250, 70);
		
		bgpic = new JLabel();
		bgpic.setSize(700, 700);
		bgpic.setIcon(bg);
		
		signin = new JLabel("Sign in");
		signin.setFont(new Font("Agency FB",Font.BOLD,30));
		signin.setBounds(135, -25, 100, 100);
		signin.setForeground(new Color(0x010A14));
		
		email = new JLabel("Username");
		email.setFont(new Font("Agency FB",Font.BOLD,12));
		email.setBounds(15, 80, 75, 50);
		
		email_ = new JTextField(10);
		email_.setBounds(15, 115, 320, 25);
		
		password = new JLabel("Password");
		password.setFont(new Font("Agency FB",Font.BOLD,12));
		password.setBounds(15, 150, 75, 50);
		
		password_ = new JPasswordField();
		password_.setBounds(15, 185, 320, 25);
		
		enter = new JButton("Sign in");
		enter.setBounds(75, 270, 200, 35);
		enter.setFont(new Font("Agency FB",Font.BOLD,20));
		enter.setForeground(Color.white);
		enter.setFocusable(false);
		enter.setBackground(new Color(0x010A14));
		enter.setBorder(BorderFactory.createEtchedBorder());
		enter.addActionListener(this);
		
		
		credit = new JLabel("Created by Karl Gabutero");
		credit.setFont(new Font("Agency FB",Font.BOLD,12));
		credit.setBounds(125, 315, 100, 20);
		credit.setForeground(Color.gray);
		
		wronginput = new JLabel("");
		wronginput.setFont(new Font("Agency FB",Font.BOLD,12));
		wronginput.setBounds(85, 50, 200, 20);
		wronginput.setForeground(Color.red);
		
		admin = new JRadioButton("admin");
		admin.setFont(new Font("Agency FB",Font.BOLD,14));
		admin.setBounds(110, 215, 150, 20);
		
		librarian = new JRadioButton("librarian");
		librarian.setFont(new Font("Agency FB",Font.BOLD,14));
		librarian.setBounds(110, 240, 150, 20);
		
		
		sign = new JPanel();
		sign.setBounds(175, 175, 350, 350);
		sign.setBackground(Color.white);
		sign.setLayout(null);
		sign.add(signin);
		sign.add(email);
		sign.add(email_);
		sign.add(password);
		sign.add(password_);
		sign.add(enter);
		sign.add(credit);
		sign.add(wronginput);
		sign.add(admin);
		sign.add(librarian);
		
		
		Container contain = this.getContentPane();
		contain.setLayout(null);
		contain.add(sign);
		contain.add(logo);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Bulldog Library");
		this.setSize(700,700);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setIconImage(icon.getImage());
		this.add(bgpic);		
	}
@Override
public void actionPerformed(ActionEvent e){
	
	unameinput = email_.getText();
	passinput = password_.getText();
	
	if (admin.isSelected()) {
        if (unameinput.equals("Admin_01") && passinput.equals("AdminOne") || 
            unameinput.equals("Admin_02") && passinput.equals("AdminTwo") || 
            unameinput.equals("Admin_03") && passinput.equals("AdminThree")) {
            JOptionPane.showMessageDialog(getContentPane(), "Successfully Logged In as Admin.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }else
        	wronginput.setText("Invalid username and password for admin");
        }
        
        
        else if (librarian.isSelected()) {
            if (unameinput.equals("Librarian_01") && password.equals("LibOne") || 
                    unameinput.equals("Librarian_02") && password.equals("LibTwo") || 
                    unameinput.equals("Librarian_03") && password.equals("LibThree")) {
                    JOptionPane.showMessageDialog(getContentPane(), "Successfully Logged In as Librarian.", "Success", JOptionPane.INFORMATION_MESSAGE);
            
       }else
		
		wronginput.setText("Invalid username and password for librarian");
	
	
}}
	
public static void main(String args[]) {
	
	new login();
	
}
	
	
	

}
