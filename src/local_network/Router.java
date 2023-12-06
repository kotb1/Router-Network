package local_network;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Router 
{
	private int maxnum,num_devices;
	public ArrayList<Device> list = new ArrayList<Device>();
	Router(int n,int x)
	{
		maxnum = n;
		num_devices=x;
	}
	void Add_connection(Device device)
	{
		list.add(device);
	}
	void Terminate_connection(String name_device) throws IOException 
	{
		int j = 0;
		for(int i =1;i<list.size();i++) 
		{
			if(list.get(i).get_name().equals(name_device)) 
			{
				j = i;
			}
		}
		Files.write(Paths.get("C:\\Users\\bodyy\\OneDrive\\Desktop\\Connected.txt"),("After "+list.get(j).get_name()+" has logged out:"+"\n").getBytes(),StandardOpenOption.APPEND);
		list.remove(j);
		num_devices-=1;
		Connection();
	}
	void Connection() throws IOException 
	{
		Semaphore l = new Semaphore(maxnum);
		int r=0;
		while(l.value>0) 
		{
			System.out.println(list.get(r).get_name()+" is now connected");
			Files.write(Paths.get("C:\\Users\\bodyy\\OneDrive\\Desktop\\Connected.txt"),(list.get(r).get_name()+" is now connected").getBytes(),StandardOpenOption.APPEND);
			Files.write(Paths.get("C:\\Users\\bodyy\\OneDrive\\Desktop\\Connected.txt"),("\n").getBytes(),StandardOpenOption.APPEND);
			r++;
			l.P();
		}
		if(maxnum<num_devices) 
		{
			for(int i=maxnum;i<num_devices;i++) 
			{
				System.out.println(list.get(i).get_name()+" is waiting for a user to terminate connection");
			}
		}
	}
}