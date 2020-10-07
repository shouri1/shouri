
	import java.applet.*; 
import java.awt.*; 
public class BOLD extends Applet{
public void paint (Graphics g) 
{
Font myFont = new Font("Courier", Font.BOLD,20);	
g.setFont(myFont);
g.drawString("Hello world",150,150); 
} 

}
