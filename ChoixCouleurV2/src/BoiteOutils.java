import java.awt.Color;


//ChoixCouleur
//22 juil. 2016
//charvoz
//

public class BoiteOutils 
{
	
		public static String colorToString (Color c)
		{
			String s;
			if ( c == Color.RED) s = "Rouge";
			else if ( c == Color.BLUE) s = "Bleu";
			else if ( c == Color.GREEN) s = "Vert";
			else s = "Jaune";
			return s;
			
		}
		
		public static Color stringToColor (String s)
		{
			Color c;
			if (s == "Rouge") c = Color.RED;
			else if (s == "Bleu") c = Color.BLUE;
			else if (s == "Vert") c = Color.GREEN;
			else c = Color.YELLOW;
			return c;
			
		}
		
		
	
}
