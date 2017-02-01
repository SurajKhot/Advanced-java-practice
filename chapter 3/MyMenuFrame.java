import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code=MyMenuFrame width=400 height=350></applet>*/
public class MyMenuFrame extends Frame
{
	MyMenuFrame(String title)
	{
		super(title);
		MenuBar mbar=new MenuBar();
		setMenuBar(mbar);
		java.awt.Menu file=new java.awt.Menu("File");
		java.awt.Menu edit=new java.awt.Menu("Edit");
		java.awt.Menu view=new java.awt.Menu("View");
		mbar.add(file);
		mbar.add(edit);
		mbar.add(view);
	}
}
