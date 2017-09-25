package frontendUI;

import javax.swing.JFrame;

public class MainFrame {
	public MainFrame(FrontendUI feptr)
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
	
	private JFrame mainFrame;
	
	private FrontendUI feptr;
}
