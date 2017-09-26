package frontendUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignInPage {
	public SignInPage(int width, int height, FrontendUI feptr)
	{
		fakeUserData = new HashMap();
		fakeUserData.put("abc", "123");
		
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
		
		userNameField =new JTextField(); 
		pwdField =new JPasswordField(); 
		userNameField.setBounds(50,150,150,20); 
		pwdField.setBounds(50,250,150,20);
		
		
		signInPanel.add(signInButton);
		signInPanel.add(userNameField);
		signInPanel.add(pwdField);
		
		signInPanel.setLayout(null);   //this to disable the default flowLayout
	}
	
	public JPanel getSignInPanel()
	{
		return signInPanel;
	}
	
	private void pressSignInButton()
	{
		String userName = userNameField.getText(); 
		String pwd = new String(pwdField.getPassword());
		
		if (fakeUserData.keySet().contains(userName) && fakeUserData.get(userName).equals(pwd))
		{
			// user log in
			feptr.removeSignInPage();
			feptr.setUpUserInformationPage();
		}
		else
		{
			//promot a window 
			System.out.println("error");
		}
	}
	
	private JPanel signInPanel;
	private JTextField userNameField ;
	private JPasswordField pwdField;
	
	private FrontendUI feptr;
	private String panelName;
	
	private HashMap fakeUserData;
}
