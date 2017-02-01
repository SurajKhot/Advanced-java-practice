import java.awt.*;
import java.applet.*;
/*<applet code=LeblTextBttn width=296 height=201></applet>*/
public class LeblTextBttn extends Applet
{
	public void init()
	{
		Label l1=new Label("Enter your name");		
		TextField t1=new TextField(35);		
		Button b1=new Button("Log in");
		add(l1);add(t1);add(b1);
	}
}