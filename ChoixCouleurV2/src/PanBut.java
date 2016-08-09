import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionListener;

//ChoixCouleur
//22 juil. 2016
//charvoz
//

public class PanBut extends Panel
{
	private static final long serialVersionUID = 1L;
	
	private Button butRg = new Button("Rouge") ;
	private Button butBl = new Button("Bleu") ;
	private Button butVr = new Button("Vert") ;
	private Button butJn = new Button("Jaune") ;
	
	public PanBut()
	{
		setSize (140, 400);
		setVisible(true);
		setBackground(new Color(255, 170, 3));
		add(butRg);
		add(butBl);
		add(butVr);
		add(butJn);
		setLayout(new GridLayout(4,1,0,20));  //(lig, col, horiz gap, vert gap)
		
	}
	public Insets getInsets()
	{
		
		return new Insets(30, 30, 30 , 30);				//(top, left, bottom, right)
	}
	@Override
	public void setBackground(Color c)
	{
		super.setBackground(c);
		if (c == Color.RED ) butRg.requestFocus();
		else if (c == Color.BLUE ) butBl.requestFocus();
		else if (c == Color.GREEN ) butVr.requestFocus();
		else butJn.requestFocus();
	}
	
	public void abonner(ActionListener al)
	{
		if ( al != null)
			butRg.addActionListener(al);
			butBl.addActionListener(al);
			butVr.addActionListener(al);
			butJn.addActionListener(al);
	}
	

}
