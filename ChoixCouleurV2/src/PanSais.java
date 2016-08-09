import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;

//ChoixCouleur
//22 juil. 2016
//charvoz
//

public class PanSais extends Panel
{	
	private static final long serialVersionUID = 1L;
	private TextField tf = new TextField("Couleur");
	private Label lbl = new Label("Saisie");

	public PanSais()
	{
		setSize (80, 120);
		setVisible(true);
		setBackground( Color.yellow);
		add(lbl);
		add(tf);
		tf.setPreferredSize(new Dimension(60,30));
		
	}
	
	public Insets getInsets()
	{
		
		return new Insets(20, 30, 10 , 30);				//(top, left, bottom, right)
	}

	@Override
	public void setBackground(Color bgColor)
	{
		super.setBackground(bgColor);
		if(tf!=null)
		{
		tf.setBackground(bgColor);
		lbl.setBackground(bgColor);
		}
	}
	
	public void abonner(ActionListener al)
	{
		tf.addActionListener(al);
		
	}
}
