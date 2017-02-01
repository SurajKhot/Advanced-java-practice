import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Chice extends Applet implements ActionListener
{
	String msg=" ";
	Choice Country,Capital;
	Checkbox one,two,three;
	Button Tanmay,Geetanjali,Minal,Suraj;
	public void init()
	{
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
		Capital.add("berlin");
		Capital.add("berlin");
		Capital.add("berlin");
		Capital.add("berlin");
		Capital.add("berlin");
		Capital.add("berlin");
		Capital.add("berlin");
		Capital.add("berlin");
		Country.add("India");
		Country.add("Shrilanka");
		Country.add("australiya");
		Country.add("rome");
		Country.add("America");
		Country.add("Afrika");
		Country.add("Dubai");
		add(Country);
		add(Capital);
		
		CheckboxGroup obj=new CheckboxGroup();
		one=new Checkbox("Mumbai",true);
		two=new Checkbox("Thane",true);
		three=new Checkbox("Pune");
		add(one);
		add(two);
		add(three);
		
		Font f=new Font("Garamond",Font.BOLD,20);
		setFont(f);
		Tanmay=new Button("Tanmay");
		Geetanjali=new Button("Geetanjali");
		Minal=new Button("Minal");
		Suraj=new Button("Suraj");
		add(Tanmay);
		add(Geetanjali);
		add(Minal);
		add(Suraj);
		Tanmay.addActionListener(this);
		Geetanjali.addActionListener(this);
		Minal.addActionListener(this);
		Suraj.addActionListener(this);
		
		
		Label l1=new Label("BBF",Label.RIGHT);
		add(l1);
		
	}
		
		public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Tanmay"))
		{
			msg="\t hii Suraj You have pressed Tanmay's Button.";
		}
		else if(str.equals("Minal"))
		{
			msg="hii Suraj You pressed Minal's Button.";
		}
		else if(str.equals("Geetanjali"))
		{
			msg="hii Suraj You pressed Geetanjali's Button.";
		}
		else if(str.equals("Suraj"))
		{
			msg="hii Suraj You pressed your Button.";
		}
		repaint();
	}
		
	public void paint(Graphics g)
	{
		String mtg="hi this is label of buttton b1 : "+Tanmay.getLabel();
		g.drawString(mtg,6,100);
		String mpg="hi this is label of buttton b2 : "+Geetanjali.getLabel();
		g.drawString(mpg,6,120);
		g.drawString(msg,6,140);
		if((Geetanjali.getLabel()).equals("Geetanjali"))
		{
			if((Suraj.getLabel()).equals("Suraj"))
			{
				String mog="******* T G M S *******";
				g.drawString(mog,6,80);
			}
		}
		
		String mttg="mumbai: "+one.getState();
		String sss="Thane: "+two.getState();
		g.drawString(mttg,6,160);
		if(one.getState()&&two.getState()==true)
		{
			g.drawString(sss,6,180);
		}
		
		
	}
}
/*<applet code="Chice.class" width=1023 height=500></applet>*/