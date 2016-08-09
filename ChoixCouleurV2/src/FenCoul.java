import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



//ChoixCouleur
//21 juil. 2016
//charvoz
//

public class FenCoul extends Frame 
{
	
	private static final long serialVersionUID = 1L;
	private Panel panBut  = new PanBut();
	private Panel panCheck = new PanCheck();
	private Panel panDiv = new PanDiv();
	
		
	public FenCoul()
	{
		new EcouteurFenetre(this);
		EcouteurFenCoul efc = new EcouteurFenCoul();
		//bdial.addActionListener(new EcouteurBD());
		//bd.abonner(new EcouteBD());  
		panBut.abonner(efc);
		panCheck.abonner(efc);
		setSize (500, 400);
		setLayout(new GridLayout(1,3,10,10));
		this.add(panBut);
		this.add(panCheck);
		this.add(panDiv);
		setVisible(true);
		setBackground( Color.blue);
	}
	
	public void setBackground (Color c)
	{
		super.setBackground(c);
		panBut.setBackground(c);
		panCheck.setBackground(c);
		panDiv.setBackground(c);
	}
	
	public class EcouteurFenCoul implements ActionListener, ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent ie)
		{
			
			// (String) ie.getItem();
			BoiteOutils.stringToColor((String) ie.getItem()); //cast en string getItem retourne un objet
		}

		@Override
		public void actionPerformed(ActionEvent ae)
		{
			
			setBackground(BoiteOutils.stringToColor((ae.getActionCommand())));
			
		}

		
	}
	
	
	
	
}
