import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class butnEvnt extends Applet implements ActionListener
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
			msg="\t hii Suraj You have pressed add.";
		}
		else if(str.equals("Modify"))
		{
			msg="hii Suraj You pressed Modify.";
		}
		else
		{
			msg="hii Suraj You pressed delete.";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,6,100);
	}
}
/*<applet code="butnEvnt.class" width=328 height=138></applet>*/