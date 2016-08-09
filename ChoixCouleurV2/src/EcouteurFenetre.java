import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//InterfaceGraphic
//20 juil. 2016
//charvoz
//

	public class EcouteurFenetre implements WindowListener
	{
		
		public EcouteurFenetre(Frame f)
		{	
			f.addWindowListener(this);
			
		}
		
		@Override
		public void windowClosing(WindowEvent arg0)
		{
			System.exit(0);
		}

		@Override
		public void windowActivated(WindowEvent arg0){}
		
		@Override
		public void windowClosed(WindowEvent arg0){}
				
		@Override
		public void windowDeactivated(WindowEvent arg0){}
		
		@Override
		public void windowDeiconified(WindowEvent arg0){}
		
		@Override
		public void windowIconified(WindowEvent arg0){}
		
		@Override
		public void windowOpened(WindowEvent arg0){}
}
