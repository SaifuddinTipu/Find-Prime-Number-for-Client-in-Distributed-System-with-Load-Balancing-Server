# Find-Prime-Number-for-Client-in-Distributed-System-with-Load-Balancing-Server

We have two servers, two clients and additional one load balance server to examine speeding up an intense computation problem using distributed system concept. Our team has designed and implemented a distributed program to speed up the prime number finding within the specified number range. This experiment is required to use five different PC to execute the programmes of Load balance server, server1, server2, client1 and client2 or we can use five different new windows of eclipse at the same PC.

#User manual

Step 1: 

we should open the LoadBalanceServer.java, Server1.java, Server2.java, client1.java and client2.java in eclipse. Then we need to run the LoadBalanceServer.java file and it will start working. Once running the Load Balance Server, we can’t click run the Load Balance Server twice because it was already started. As the Load Balance Server already started so it starts waiting for additional prime number calculator servers. We need to connect the additional servers one by one to the Load Balance Server.

Step 2: 

We have to run the Server1.java file then we can notice that Server1 is already connected with the Load Balance Server. Then we will connect the Server2.java with Load Balance Server by running Server2.java. Once the Load Balance Server is connected with the additional two prime number calculator servers, we can proceed to calculate the prime numbers for the clients. For that, we need to run a client first. We have two clients and we can proceed with any clients to find the prime number of specified range given by the user. Once we run the Client1.java file it will be connected to the Load Balance Server. We will be asked to input the specified range to find the prime number by client1. Once we input any number, the client will request the Load Balance Server to find the prime number. Load Balance Server will accept the request and will send the request to Server1.java dynamically to find the prime numbers between the specified range. Then the server1 will calculate and send the prime numbers to c Load Balance Server and the Load Balance Server will send it back again to the client who requested. Then we can see the output of prime numbers in client 1. The server will also display the output of prime numbers requested by client 1 as well. In client1.java source code, there is a method to calculate the execution or elapsed time of the programme. So client1.java will send the execution time to the server to print. Then the server will read the execution time which is sent by client1 and it will print the output of the execution time of client1 processes.

Step 3: 

For client2, we need to connect the Load Balance Server with it. For that we need to run client2.java file and it will be connected to the Load Balance Server automatically. Then the remaining process of finding prime numbers form the given range by client2 will be same as the process which was completed by client1.
Then we get the output of prime numbers in client2. And the execution time for the process of finding the prime numbers of client2 which will be displayed in the Load Balance Server.
Finally, we get the execution times from two different clients on the Load Balance Server. The Load Balance Server will calculate the average execution time of two different clients to find the prime numbers and we will get the output of average execution time on the Load Balance Server.
