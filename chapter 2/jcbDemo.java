import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*<applet code=jcbDemo width=276 height=103></applet>*/
public class jcbDemo extends JApplet implements ItemListener
{
	
	JTextField jtf;
	JComboBox jcb;
	public void init()
	{
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		jcb=new JComboBox();
		jcb.addItem("C");
		jcb.addItem("C++");
		jcb.addItem("Java");
		jcb.addItem(".Net");
		ct.add(jcb);
		
		jcb.addItemListener(this);
		jtf=new JTextField(15);
		ct.add(jtf);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String s=(String)ie.getItem();
		jtf.setText(s);
	}
}