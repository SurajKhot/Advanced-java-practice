import java.awt.*;
import javax.swing.*;

/*<applet code=IT width=500 height=500></applet>*/
public class IT extends JPanel
{
	public IT()
	{
		JCheckBox jc1=new JCheckBox("Object Oriented Modeling & Designing");
		JCheckBox jc2=new JCheckBox("Data Communication & Networking");
		JButton b1=new JButton("Submit");
		JButton b2=new JButton("Cancel");
		add(jc1);add(jc2);
		add(b1);add(b2);
	}
}