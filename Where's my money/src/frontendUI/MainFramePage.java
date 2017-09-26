package frontendUI;

import javax.swing.JFrame;

public class MainFramePage {
	public MainFramePage(FrontendUI feptr)
	{
		this.feptr = feptr;
		
		mainFrame =new JFrame();
		mainFrame.setSize(400,500);
		mainFrame.setVisible(true);
	}
	
	public JFrame getMainFrame()
	{
		return this.mainFrame;
	}
	
	public void setUpSignInPage()
	{
		mainFrame.add(feptr.getSignInPage().getSignInPanel());
		mainFrame.repaint();
	}
	
	public void removeSignInPage()
	{
		mainFrame.remove(feptr.getSignInPage().getSignInPanel());
		mainFrame.revalidate();
		mainFrame.repaint();
	}
	
	private JFrame mainFrame;
	
	private FrontendUI feptr;
}
