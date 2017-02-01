import java.awt.*;
import javax.swing.*;

/*<applet code=JScrlPane width=276 height=103></applet>*/
public class JScrlPane extends JApplet
{
	JButton b1,b2;
	public void init()
	{
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		
		//create buttons
		
		b1=new JButton("ok");
		b2=new JButton("cancel");
		
		//create panel
		
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(2,2)); 	//setting layout for panel
		
		//adding buttons in panel
		
		jp.add(b1);
		jp.add(b2);
		
		//using scrollpane constants
		
		int v= ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h= ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp=new JScrollPane(jp,v,h);
		
		//add scrollpane to content pane
		
		ct.add(jsp);
	}
}	