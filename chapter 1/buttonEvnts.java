import java.awt.*;
import java.applet.*;
public class buttonEvnts extends Applet
{
	String msg=" ";
	Button add,modify,delete;
	public void init()
	{
		add=new Button("Add");
		modify=new Button("Modify");
		delete=new Button("delete");
		add(add);
		add(modify);
		add(delete);
		add.addActionListener(this);
		modify.addActionListener(this);
		delete.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Add"))
		{
			msg="You pressed add.";
		}
		else if(str.equals("Modify"))
		{
			msg="You pressed Modify.";
		}
		else
		{
			msg="You pressed delete.";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,6,100);
	}
}
/*<applet code="buttonEvnts.class" width=500 height=400></applet>*/