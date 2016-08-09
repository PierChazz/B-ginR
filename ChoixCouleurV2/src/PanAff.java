import java.awt.Color;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;

//ChoixCouleur
//22 juil. 2016
//charvoz
//

public class PanAff extends Panel
{	
	private static final long serialVersionUID = 1L;

	private Label lbl = new Label("Votre couleur : ");
	
	public PanAff()
	{
		setSize (80, 120);
		setVisible(true);
		setBackground( new Color(220,158, 5));
		add(lbl);
	}
	
	public Insets getInsets()
	{
		
		return new Insets(30, 30, 30 , 30);				//(top, left, bottom, right)
	}

}
