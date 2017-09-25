package frontendUI;

import javax.swing.*; 

public class FrontendUI {
	public FrontendUI(boolean remembered)
	{	
		mainFrame = new MainFrame(this);
		
		if (!remembered)
			getSignInPage();
		else			
			loadPersonalInfo();
	}
	
	private void getSignInPage()
	{	
		signInPage = new SignInPage(mainFrame.getMainFrame().getWidth(), mainFrame.getMainFrame().getHeight(), this);
		
		mainFrame.getMainFrame().add(signInPage.getSignInPanel());
		mainFrame.getMainFrame().repaint();
	}
	
	public JFrame getMainFrame()
	{
		return mainFrame.getMainFrame();
	}

	private void loadPersonalInfo()
	{
		
	}
	
	private MainFrame mainFrame;
	private SignInPage signInPage;
}
