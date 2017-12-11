package server1;
import java.io.*;
import java.net.*;
public class Server1 {
	
	public static void main(String argv[]) throws Exception
	{
		String ip = "localhost";
		int port = 9999;
		Socket server1 = new Socket(ip,port);
		
		System.out.println("");
		System.out.println("Load Balancer is Connected...");
        BufferedReader br=new BufferedReader(new InputStreamReader(server1.getInputStream()));
		
		int range = br.read();
		System.out.println("");
		System.out.print("Given Range by the Client 1 From The Load Balancer is: ");
		System.out.println(range);
		System.out.println("Prime Number of The given Range Calculated and Send to the Load balancer...");
        for(int i=1;i<=range;i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                }
            }
            if(flag==0)
                System.out.print("");
        }
		
        
	}
}