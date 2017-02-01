import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*<applet code=JCmbBxo width=500 height=400></applet>*/
public class JCmbBxo extends JApplet implements ItemListener
{
	JComboBox jcb;
	JList jl;
	public void init()
	{
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		jcb=new JComboBox();
		jcb.addItem("India");
		jcb.addItem("America");
		jcb.addItem("Japan");
		jcb.addItem("China");
		jcb.addItem("Australiya");
		ct.add(jcb);
		String data[]={"delhi","washington","tokiyo","bejing","melborn"};
		jl=new JList(data);
		ct.add(jl);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String s=(String)ie.getItem();
		if(s=="India")
			public void setSelectedIndex(1);
		/*else if(s=="America") jl.setSelectedValue(2);
		else if(s=="Japan") jl.setSelectedValue(3);
		else if(s=="China") jl.setSelectedValue(4);
		else if(s=="Australiya") jl.setSelectedValue(5);*/
		repaint();
	}		
}
