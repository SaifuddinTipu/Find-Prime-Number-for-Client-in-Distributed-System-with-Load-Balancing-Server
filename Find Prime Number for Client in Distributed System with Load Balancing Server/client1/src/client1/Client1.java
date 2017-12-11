package client1;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client1 {
	public static void main(String argv[]) throws Exception
	{
		long startTime = System.currentTimeMillis();
		String ip = "localhost";
		int port = 9999;
		Socket s = new Socket(ip,port);
		
		System.out.println("Server Connected...");
		System.out.print("\nEnter the range : ");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		System.out.println();
		System.out.println("Data from Load Balance Server in Client 1 is: ");
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
                System.out.print(i+" ");   
        }
        System.out.println();
	    OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
	    os.write(range);
	    os.flush();
	    long endTime   = System.currentTimeMillis();
	    long totalTime = endTime - startTime;
	    int time = Math.round(totalTime);
	    
	    System.out.println();
	    OutputStreamWriter ts = new OutputStreamWriter(s.getOutputStream());
	    PrintWriter tout = new PrintWriter(ts);
	    tout.println(+time);
	    tout.flush();
	}
}
