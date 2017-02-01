import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code=JButonDemo width=575 height=426>
	<param name="img" value="rt.jpg">
	</param>
  </applet>
 */
public class JButonDemo extends JApplet implements ActionListener
{
	JButton js,jc;
	Image img;
	ImageIcon is,ic,io;
	JTextField t1;
	public void init()
	{
		Container ct=getContentPane();
		ct.setLayout(new GridLayout(3,0));
		img=getImage(getDocumentBase(),getParameter("img"));
		is=new ImageIcon("square.png");
		ic=new ImageIcon("circle.png");
		io=new ImageIcon("oval.png");
		
		js=new JButton("square",is);
		jc=new JButton("circle",ic);
		
		t1=new JTextField(15);
		
		js.setActionCommand("		    You Have Clicked square");
		jc.setActionCommand("		    You Have Clicked circle");
		
		js.addActionListener(this);
		jc.addActionListener(this);
		
		ct.add(js);
		ct.add(jc);
		ct.add(t1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		t1.setText(ae.getActionCommand());
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(img,0,0,this);
	}
}
		