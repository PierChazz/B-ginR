import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;

//ChoixCouleur
//22 juil. 2016
//charvoz
//

public class PanDiv extends Panel
{	
	private static final long serialVersionUID = 1L;
	
	private Panel panSais = new PanSais();
	private Panel panAff = new PanAff ();
	private Panel panChoix = new PanChoix ();
	
	
	public PanDiv()
	{
		
		setSize (140, 380);
		setVisible(true);
		setBackground( Color.white);
		setLayout(new GridLayout(3,1));
		this.add(panSais);
		this.add(panAff);
		this.add(panChoix);
	}
	
	
	public void setBackground (Color c)
	{
		if (c != Color.blue)
		super.setBackground(c);
		panSais.setBackground(c);
		panAff.setBackground(c);
		panChoix.setBackground(c);
	}
	
	public void abonner(ActionListener al)
	{
		if (al!=null)
		{
			((PanDiv) panSais).abonner(al);
		}
		
	}

}
