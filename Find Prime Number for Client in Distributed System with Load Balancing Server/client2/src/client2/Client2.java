package client2;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client2 {
	public static void main(String argv[]) throws Exception
	{
		long startTime = System.currentTimeMillis();
		String ip = "localhost";
		int port = 9999;
		Socket s2 = new Socket(ip,port);
		
		System.out.println("Server Connected...");
		System.out.print("\nEnter the range : ");
		Scanner sc = new Scanner(System.in);
		int range1 = sc.nextInt();
		System.out.println();
		System.out.println("Data from Load Balance Server in Client 2 is: ");
        for(int i=1;i<=range1;i++)
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
	    OutputStreamWriter os1 = new OutputStreamWriter(s2.getOutputStream());
	    os1.write(range1);
	    os1.flush();
	    long endTime   = System.currentTimeMillis();
	    long totalTime = endTime - startTime;
	    int time2 = Math.round(totalTime);
	    
	    System.out.println();
	    OutputStreamWriter ts1 = new OutputStreamWriter(s2.getOutputStream());
	    PrintWriter tout1 = new PrintWriter(ts1);
	    tout1.println(time2);
	    tout1.flush();
	    
	}
}