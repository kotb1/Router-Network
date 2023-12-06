package architecture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class main 
{
	public static void main(String[] args) throws IOException {
		boolean y=true;
		while(y==true) 
		{
			System.out.println("Register Or Login Or Exit");
			Scanner hima = new Scanner (System.in);		
			String X = hima.nextLine();
			String Y = hima.nextLine();
			Register_login heba = new Register_login();
			if(X.equals("Register")) 
			{
				heba.Register(Y);
			}
			else if(X.equals("Login")) 
			{
				heba.Login(Y);
			}
			else if(X.equals("Exit")) 
			{
				//heba.exit();
				y=false;
			}
			else 
			{
				System.out.println("invalid input");
			}
		}
	}
}
