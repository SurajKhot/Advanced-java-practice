import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="CardLayoutDemo.class" width=298 height=215></applet>*/

public class CardLayoutDemo extends Applet implements ActionListener,MouseListener
{
	Checkbox winxp,win7,lin,sol;
	Button windows,others;
	Panel winpan,otherspan,ospan;
	CardLayout cl;
	public void init()
	{
		winxp=new Checkbox("Windows Xp");
		win7=new Checkbox("Windows 7");
		lin=new Checkbox("Linux");
		sol=new Checkbox("Solaris");
		windows=new Button("Windows");
		others=new Button("Others");
		
		winpan=new Panel();
		otherspan=new Panel();
		ospan=new Panel();
		
		cl=new CardLayout();
		ospan.setLayout(cl);
		
		winpan.add(winxp);
		winpan.add(win7);
		
		otherspan.add(lin);
		otherspan.add(sol);
		
		ospan.add(winpan,"Windows");
		ospan.add(otherspan,"Others");
		
		add(ospan);
		//add list
		windows.addActionListener(this);
		others.addActionListener(this);
	}
	public void mousePressed(MouseEvent me)
	{
		cl.next(ospan);
	}
	public void mouseClicked(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==windows)
			cl.show(ospan,"Windows");
		else
			cl.show(ospan,"Others");
		repaint();
	}
	
}	
	