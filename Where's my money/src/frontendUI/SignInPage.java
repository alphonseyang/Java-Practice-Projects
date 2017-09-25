package frontendUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignInPage {
	public SignInPage(int width, int height, FrontendUI feptr)
	{
		panelName = "SignIn";
		this.feptr = feptr;
		
		signInPanel = new JPanel();
		signInPanel.setBounds(0, 0,width, height);
		signInPanel.setBackground(Color.gray);  
		
		JButton signInButton =new JButton("Sign In");
		signInButton.setBounds(50,100,95,30);
		signInButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				pressSignInButton();
			} 
		} );
		
		JTextField userNameField =new JTextField(); 
		JPasswordField passwordFiled =new JPasswordField(); 
		userNameField.setBounds(50,150,150,20); 
		passwordFiled.setBounds(50,250,150,20);
		
		
		signInPanel.add(signInButton);
		signInPanel.add(userNameField);
		signInPanel.add(passwordFiled);
		
		signInPanel.setLayout(null);   //this to disable the default flowLayout
	}
	
	public JPanel getSignInPanel()
	{
		return signInPanel;
	}
	
	private void pressSignInButton()
	{
		feptr.getMainFrame().remove(this.signInPanel);
		feptr.getMainFrame().revalidate();
		feptr.getMainFrame().repaint();
	}
	
	private JPanel signInPanel;
	private JTextField userNameField ;
	private JPasswordField pwdField;
	
	private FrontendUI feptr;
	private String panelName;
	
}
