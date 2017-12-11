package loadbalancer;
import java.io.*;
import java.net.*;
public class LoadBalanceServer {
	
	public static void main(String argv[]) throws Exception
	{
		System.out.println("");
		System.out.println("Load Balance Server is Started...");
		ServerSocket ss = new ServerSocket(9999);
		
		System.out.println("");
		System.out.println("Load Balance Server is Waiting for Servers...");
		Socket server1 = ss.accept();
		System.out.println("");
		System.out.println("Server 1 Connected to the Load Balance Server...");
		BufferedReader br3=new BufferedReader(new InputStreamReader(server1.getInputStream()));
		
		Socket server2 = ss.accept();
		System.out.println("");
		System.out.println("Server 2 Connected to the Load Balance Server...");
		BufferedReader br4 =new BufferedReader(new InputStreamReader(server2.getInputStream()));
		
		System.out.println("");
		System.out.println("Load Balance Server is Waiting for Clients...");
		Socket s = ss.accept();
		
		
		System.out.println("");
		System.out.println("Client 1 Connected...");
		System.out.println("");
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		int range = br.read();
		
		System.out.print("Given Range from the Client 1 is: ");
		System.out.println(+range);
		System.out.println("");
		System.out.println("Range sent to Server 1 to calculate the PRIME NUMBER");
		OutputStreamWriter os1 = new OutputStreamWriter(server1.getOutputStream());
	    os1.write(range);
	    os1.flush();
	    
        System.out.println();
        int time = br.read();
        System.out.println("Result Collected from Server 1 and Sent back to Client 1...");
        System.out.println("");
        System.out.print("Elapsed Time For Client 1 is: 0.");
        System.out.print(+time);
        System.out.println(" seconds");
        
        Socket s2 = ss.accept();
        System.out.println("");
		System.out.println("Client 2 Connected...");
		BufferedReader br1=new BufferedReader(new InputStreamReader(s2.getInputStream()));
		
		int range1 = br1.read();
		System.out.println("");
		System.out.print("Given Range from the Client 2 is: ");
		System.out.println(+range1);
		System.out.println("");
		System.out.print("Range sent to Server 2 to calculate the PRIME NUMBER");
		System.out.println("");
		OutputStreamWriter os2 = new OutputStreamWriter(server2.getOutputStream());
	    os2.write(range1);
	    os2.flush();
	    
        System.out.println();
        int time2 = br.read();
        System.out.println("Result Collected from Server 2 and Sent back to Client 2...");
        System.out.println("");
        System.out.print("Elapsed Time For Client 2 is: 0.");
        System.out.print(+time2);
        System.out.println(" seconds");
        System.out.println("");
        int avrgTime = ((time+time2)/2);
        System.out.print("Average Elapsed time for Clients is: 0.");
        System.out.print(avrgTime);
        System.out.print("  seconds");
		}

}