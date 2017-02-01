import java.net.*;
import java.io.*;
public class HostPortURL
{	public static void main(String args[])throws MalformedURLException
	{
		URL url=new URL("http://www.msbte.com");
		System.out.println("Host Name ::"+url.getHost());
		System.out.println("Port No. ::"+url.getPort());
	}
}