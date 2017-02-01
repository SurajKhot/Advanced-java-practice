import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code=JbuttonDemo width=575 height=426>
	<param name="img" value="rt.jpg">
	</param>
  </applet>
 */
public class JbuttonDemo extends JApplet implements ActionListener
{
	JButton jb1,jb2;
	Image img;
	ImageIcon i,i1;
	JTextField t1,t2;
	public void init()
	{
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		img=getImage(getDocumentBase(),getParameter("img"));
		i=new ImageIcon("blogs.jpg");
		i1=new ImageIcon("videos.jpg");
		
		jb1=new JButton(i);
		jb2=new JButton(i1);
		
		t1=new JTextField(15);
		
		jb1.setActionCommand("blogs");
		jb2.setActionCommand("videos");
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		ct.add(jb2);
		ct.add(jb1);
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
		
		