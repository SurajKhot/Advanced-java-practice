import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Fusion extends Applet implements ActionListener
{
	String msg=" ";
	Choice Country,Capital;
	Checkbox one,two,three;
	Button Suraj,Chaitanya,Muzzamil,Krishna,Priyanka;
	CheckboxGroup obj;
	public void init()
	{
		Color c1=new Color(255,100,100);
		
		setBackground(Color.black);
		setForeground(c1);
		Country =new Choice();
		Capital =new Choice();
		Capital.add("Delhi");
		Capital.add("Columbo");
		Capital.add("WASHINGTON");
		Capital.add("london");
		Capital.add("BjInG");
		Capital.add("Koriya");
		Capital.add("new york");
		Capital.add("berlin");
		Capital.add("Tokiyo");
		Country.add("India");
		Country.add("Shrilanka");
		Country.add("australiya");
		Country.add("rome");
		Country.add("America");
		Country.add("Afrika");
		Country.add("Dubai");
		Country.add("China");
		Country.add("Japan");
		add(Country);
		setForeground(Color.black);
		add(Capital);
		
		obj=new CheckboxGroup();
		one=new Checkbox("Mumbai");
		two=new Checkbox("Thane");
		three=new Checkbox("Bhivandi");
		
		setForeground(Color.yellow);
		add(one);
		setForeground(Color.white);
		add(two);
		setForeground(Color.red);
		add(three);
		
		Font f=new Font("DaunPenh",Font.BOLD,20);
		setFont(f);
		Suraj=new Button("Suraj");
		Chaitanya=new Button("Chaitanya");
		Muzzamil=new Button("Muzzamil");
		Krishna=new Button("Krishna");
		Priyanka=new Button("Priyanka");
		setForeground(Color.red);
		add(Suraj);
		setForeground(Color.blue);
		add(Chaitanya);
		setForeground(Color.black);
		add(Muzzamil);
		setForeground(Color.blue);
		add(Krishna);
		setForeground(Color.red);
		add(Priyanka);
		Suraj.addActionListener(this);
		Chaitanya.addActionListener(this);
		Muzzamil.addActionListener(this);
		Krishna.addActionListener(this);
		Priyanka.addActionListener(this);
		
		
		Label l1=new Label("I  T  I  A  N  S",Label.RIGHT);
		setForeground(Color.yellow);
		add(l1);
		
	}
		
		public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Suraj"))
		{
			setBackground(Color.red);
			msg="\t hii You have pressed your Button.";
			two.setState(true);
			one.setState(false);
			three.setState(false);
			repaint();
		}
		else if(str.equals("Muzzamil"))
		{
			setBackground(Color.black);
			msg="hii You pressed Muzzamil's Button.";
			two.setState(true);
			one.setState(false);
			three.setState(false);
			repaint();
			
		}
		else if(str.equals("Chaitanya"))
		{
			setBackground(Color.blue);
			msg="hii You pressed Chaitanya's Button.";
			three.setState(true);
			one.setState(false);
			two.setState(false);
			repaint();
			
		}
		else if(str.equals("Krishna"))
		{
			setBackground(Color.blue);
			msg="hii You pressed Krishna's Button.";
			one.setState(true);
			two.setState(false);
			three.setState(false);
			repaint();
		}
		else if(str.equals("Priyanka"))
		{
			setBackground(Color.red);
			msg="hii You pressed Priyankaa's Button.";
			one.setState(true);
			two.setState(false);
			three.setState(false);
			repaint();
		}
		
	}
		
	public void paint(Graphics g)
	{
		String ppp="                  ";
		g.setColor(Color.cyan);
		String mtg="hi this is label of buttton b1 : "+Suraj.getLabel();
		g.drawString(ppp+mtg,6,160);
		String mpg="hi this is label of buttton b2 : "+Chaitanya.getLabel();
		g.drawString(ppp+mpg,6,180);
		String mxg="hi this is label of buttton b3 : "+Muzzamil.getLabel();
		g.drawString(ppp+mxg,6,200);
		String mzg="hi this is label of buttton b4 : "+Krishna.getLabel();
		g.drawString(ppp+mzg,6,220);
		String mcg="hi this is label of buttton b5 : "+Priyanka.getLabel();
		g.drawString(ppp+mcg,6,240);
		g.setColor(Color.yellow);
		g.drawString(ppp+"   "+msg,6,260);
		g.setColor(Color.green);
		if((Chaitanya.getLabel()).equals("Chaitanya"))
		{
			if((Suraj.getLabel()).equals("Suraj"))
			{
				String mog="       ******* Project Team *******";
				g.drawString(ppp+mog,6,140);
			}
		}
		
		g.setColor(Color.pink);
		if(one.getState()&&two.getState()==true)
		{
			g.drawString(ppp+"  You have ticked Mumbai and Thane",6,280);
		}
		
		
		
	}
}
/*<applet code="Fusion.class" width=551 height=328></applet>*/