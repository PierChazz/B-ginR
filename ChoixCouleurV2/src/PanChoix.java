import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;

//ChoixCouleur
//22 juil. 2016
//charvoz
//

public class PanChoix extends Panel
{	
	private static final long serialVersionUID = 1L;
	
	private Choice combo = new Choice();
	
	public PanChoix()
	{
		setSize (80, 120);
		setVisible(true);
		setBackground( Color.cyan);
		add(combo, new GridLayout(1,1));
		combo.add("Rouge");
		combo.add("Bleu");
		combo.add("Vert");
		combo.add("Jaune");
	}
	
	

	public Insets getInsets()
	{
		
		return new Insets(30, 30, 30 , 30);				//(top, left, bottom, right)
	}

}
