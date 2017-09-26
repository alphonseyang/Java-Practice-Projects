package frontendUI;

import javax.swing.*; 

public class FrontendUI {
	public FrontendUI(boolean remembered)
	{	
		mainFramePage = new MainFramePage(this);
		
		if (!remembered)
			setUpSignInPage();
		else			
			setUpUserInformationPage();
	}
	
	public MainFramePage getMainFramePage()
	{
		return mainFramePage;
	}
	
	public SignInPage getSignInPage()
	{
		return signInPage;
	}
	
	public void setUpSignInPage()
	{	
		if (signInPage == null)
		{
			signInPage = new SignInPage(mainFramePage.getMainFrame().getWidth(), mainFramePage.getMainFrame().getHeight(), this);
		}
		
		mainFramePage.setUpSignInPage();
	}
	
	public void removeSignInPage()
	{
		mainFramePage.removeSignInPage();
	}

	public void setUpUserInformationPage()
	{
		
	}
	
	private MainFramePage mainFramePage;
	private SignInPage signInPage;
}
