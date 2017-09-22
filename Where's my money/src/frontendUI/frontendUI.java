package frontendUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

public class frontendUI {
	public frontendUI(boolean remembered)
	{
		mainFrame =new JFrame();
		mainFrame.setSize(400,500);
		mainFrame.setVisible(true);
		
		if (!remembered)
			getSignInPage();
		else			
			loadPersonalInfo();
	}
	
	private void getSignInPage()
	{	
		signInPanel = new JPanel();
		signInPanel.setBounds(0, 0, mainFrame.getWidth(), mainFrame.getHeight());
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
		
		mainFrame.add(signInPanel);
		mainFrame.repaint();
	}
	
	private void pressSignInButton()
	{
		for (Component component : signInPanel.getComponents()) {
		    if (component.getClass().equals(JTextField.class)) {
		    	
		    }
		    else if (component.getClass().equals(JPasswordField.class))
		    {
		    	
		    }
		}
		mainFrame.remove(signInPanel);
		mainFrame.revalidate();
		mainFrame.repaint();
	}
	
	private void loadPersonalInfo()
	{
		
	}
	
	private JFrame mainFrame;
	private JPanel signInPanel;
}
