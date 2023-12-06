package local_network;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Network 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);
		System.out.println("Please Enter the max number of connections");
		int N = in.nextInt();
		System.out.println("PLease enter the total number of devices that u wish to connect");
		int TC = in.nextInt();
		String [] Tc_Lines=new String[(TC-1)*2];
		System.out.println("PLease enter the devices with space separated");
		String devices = in2.nextLine();
		Tc_Lines = devices.split(" ");
		Router k = new Router(N,TC);
		for(int i = 0; i<TC*2;i+=2) 
		{
			Device a = new Device (Tc_Lines[i],Tc_Lines[i+1]);
			k.Add_connection(a);
		}
		k.Connection();
		while(k.list.size()>N) 
		{
			System.out.println("Write the name of the device u want to logout");
			String o = in3.nextLine();
			k.Terminate_connection(o);
		}
	}
}
