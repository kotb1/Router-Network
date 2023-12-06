package local_network;

public class Device extends Thread
{
	Thread device;
	private String name,type;
	Device(String name1,String type1)
	{
		name=name1;
		type=type1;
	}
	String get_name() 
	{
		return name;
	}
	String get_type() 
	{
		return type;
	}
	void connect() throws InterruptedException 
	{
		device = new Thread(name);
		device.sleep(100);
	}
	void logout() 
	{
		device.interrupt();
	}
}
