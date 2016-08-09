import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionListener;

//ChoixCouleur
//22 juil. 2016
//charvoz
//

public class PanCheck extends Panel
{
	private static final long serialVersionUID = 1L;
	
	private CheckboxGroup cbxg = new CheckboxGroup();
	private Checkbox cbxrg = new Checkbox("rouge", cbxg, true);
	private Checkbox cbxbl = new Checkbox("bleu", cbxg, false );
	private Checkbox cbxvr = new Checkbox("vert",cbxg, false);
	private Checkbox cbxjn = new Checkbox("jaune",cbxg, false);
	
	public PanCheck()
	{
		setSize (140, 380);
		setVisible(true);
		setBackground( Color.pink);
		setLayout(new GridLayout(4,1,0,0));
		add(cbxrg);
		add(cbxbl);
		add(cbxvr);
		add(cbxjn);
	}

	public Insets getInsets()
	{
		
		return new Insets(30, 30, 30 , 30);				//(top, left, bottom, right)
	}
	
	public void abonner(ActionListener al)
	{
		
		cbxrg.addActionListener(al);
		cbxbl.addActionListener(al);
		cbxvr.addActionListener(al);
		cbxjn.addActionListener(al);
	}
	
	@Override
	public void setBackground(Color c)
	{
		super.setBackground(c);
		if ( cbxrg != null)
		{
			cbxrg.setBackground(c);
			cbxbl.setBackground(c);
			cbxvr.setBackground(c);	
			cbxjn.setBackground(c);
		}
	}
	
}


