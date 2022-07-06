import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		RR rr = new RR();
		SJF sjf = new SJF();
		Priority priority = new Priority();
		MultilevelQueue multilevelqueue = new MultilevelQueue();
		/*System.out.println("Please enter the total number of processes:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String process[] = new String[n];
		int burstTime[] = new int[n];
		int arrivalTime[] = new int[n];
		int priority2[] = new int[n];
		int queueNumber[] = new int[n];
		int quantumTime;
		for(int i=0;i<n;i++)
		{
			System.out.println("Please enter the process's name:");
			process[i]= sc.next();
			System.out.println("Please enter the burst time:");
			burstTime[i]= sc.nextInt();
			System.out.println("Please enter the arrival time:");
			arrivalTime[i]= sc.nextInt();
			System.out.println("Please enter the process's priority:");
			priority2[i]= sc.nextInt();
			System.out.println("Please enter the queue number for multilevel queue:");
			queueNumber[i]= sc.nextInt();
		}
		System.out.println("Please enter the quantum time:");
		quantumTime= sc.nextInt();*/
		int n=4;
		String process[] = {"p1","p2","p3","p4"};
		int burstTime[] = {7,4,1,4};
		int arrivalTime[] = {0,2,4,5};
		sjf.shortestJobFirst(n, process, burstTime, arrivalTime);
		System.out.println("----------------------------------------------------------");
		int n1=5;
		String process1[] = {"p1","p2","p3","p4","p5"};
		int burstTime1[] = {10,1,2,1,5};
		int priority2[] = {3,1,4,5,2};
		priority.priorityScheduling(n1, process1, burstTime1, priority2);
		System.out.println("----------------------------------------------------------");
		int n2=3;
		String process2[] = {"p1","p2","p3"};
		int burstTime2[] = {24,3,3};
		int quantumTime = 4;
		rr.roundRobin(n2, process2, burstTime2, quantumTime);
		System.out.println("----------------------------------------------------------");
		int n3=4;
		String process3[] = {"p1","p2","p3","p4"};
		int burstTime3[] = {4,3,8,5};
		int arrivalTime2[] = {0,0,0,10};
		int queueNumber[]= {1,1,2,1};
		int quantumTime1 = 2;
		multilevelqueue.multilevelScheduling(n3, process3, burstTime3, arrivalTime2, queueNumber, quantumTime1);
		System.out.println("----------------------------------------------------------");
	}
}