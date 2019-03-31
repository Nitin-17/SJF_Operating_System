import java.util.*;
import java.util.ArrayList.*;

public class main5 {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		int i=0;
		int p0=0,p1=0,p2=0;
		
		System.out.println("Enter p"+(i));
		boolean hasvalid=user.hasNextInt();
		
		if(hasvalid) {
		p0=user.nextInt();
		System.out.println("Enter P1 :");
	    p1=user.nextInt();
		System.out.println("Enter P2 :");
		p2=user.nextInt();
			
		}else {
			System.out.println("Invalid number");
		}
		user.nextLine();
		
		if(p0<10 & p1<10 & p2<10) {
		userinput(p0,p1,p2);
		}else {
			System.out.println("Inavlid process");
			
		}
	}

	public static void userinput(int p0,int p1,int p2 ){
		int burst[]= {p0,p1,p2};
		for(int x:burst) {
			System.out.println("Burst timejhhhhh is "+x);
			}
		
		ArrayList<Integer> pro=new ArrayList<Integer>();
		pro.add(p0);
		pro.add(p1);
		pro.add(p2);
		
		/*for(int obj:pro) {
		System.out.println("Burst time of process p"+ obj);
		}*/
		
		//list for get the index later
		
		ArrayList<Integer> proind=new ArrayList<Integer>();
		proind.add(p0);
		proind.add(p1);
		proind.add(p2);
		
		
		for(int i=0;i<=2;i++) {
		
		System.out.println("Burst time of process :p"+(i)+" is: "+pro.get(i));
		}
		
		//ArrayList<Integer> =new ArrayList<Integer>();
		int arrival[]=new int[]{3,5,4};
		for(int i=0;i<arrival.length;i++) {
			System.out.println("Arrival time of process p"+(i)+" is :"+arrival[i]);
	}
	
		
		//smallest
	int smallest=arrival[0];
	int count=0;
	for(int x:arrival) {
		if(x<smallest) {
			smallest=x;
			count++;
		}
	}
	
	int index=0;

	for(int i=0;i<arrival.length;i++) {
		if(arrival[i]==smallest) {
			index=i;
		}
	}
	
	//largest
	int largest=arrival[0];
	int countL=0;
	for(int x:arrival) {
		if(largest<x) {
			largest=x;
			countL++;
		}
	}
	
	
	int indexL=0;

	for(int i=0;i<arrival.length;i++) {
		if(arrival[i]==smallest) {
			indexL=i;
		}
	}
	
	//System.out.println("Largest value is :"+largest);
	
	//
	System.out.println();
	
	//System.out.println("Smallest arrival time is :"+smallest+" and index is "+index);
	System.out.println("process is p"+(index)+" and burst time is :"+pro.get(index));
	//System.out.println("Process to that number is :");
	
	
	
	System.out.println();
	System.out.println("CPU is ideal for 3 sec ");
	int first=pro.get(index);
	
	
	int veryp=first+3;
	System.out.println("[0 - 3] " +"p"+(index)+ "[]"+veryp);
	
	pro.remove(index);
	System.out.println("We have only "+pro.size()+" Elements in the list");
	System.out.println(pro);
	
	
	//System.out.println("  -------    "+veryp);
	System.out.println();
	
	//find if any process is came or not within 8 seconds
	
	
	//second
	
	ArrayList<Integer> pro2=new ArrayList<Integer>();
	pro2.addAll(pro);
	
	int smallest2=0;
	
	//largest for pro2
	for(int x:pro2) {
		if(x>smallest2) {
			smallest2=x;
			//count2++;
		}
	}
	
	
	//int count2=0;
	int smallest22=0;
	for(int x:pro2) {
		if(x<smallest2 && x>smallest22) {
			smallest22=x;
			//count2++;
		}
	}
	
	//System.out.println("Second smallest burst time is :"+smallest22);
	
	int index2=0;
	int a=0;

	/*for( a=0;a<pro2.size();a++) {
		if(pro2.get(a)<smallest22 & pro.get(a)>index2) {
			index2=a;
			
		}
	}*/
	
	int smallindex=pro.indexOf(smallest22);
	
	
	//for get the index of smallest22 in proind
	
	int secondind=proind.indexOf(smallest22);
	
	
	
	//System.out.println("Index is:"+secondind);
	System.out.println("process is p"+(secondind)+" and burst time is :"+smallest22);
	System.out.println();
	
	int second=veryp+smallest22;
	System.out.println("[0 - 3] " +"p"+(index)+ "[]"+veryp+"[p"+(secondind)+"]"+second);
	
	
	//third
	pro2.remove(smallindex);
	System.out.println("Now we have only "+pro2.size()+" elements in the list ");
	System.out.println(pro2);
	System.out.println();
	
	ArrayList<Integer> pro3=new ArrayList<Integer>();
	pro3.addAll(pro2);
	//System.out.println(pro3);
	int smallest4=0;
	//int count2=0;
	for(int x:pro3) {
		if(x>smallest4) {
			smallest4=x;
			//count2++;
		}
	}
	
	//System.out.println("Third smallest arrival time is :"+smallest4);
	
	int index3=0;
	int i;

	for(i=0;i<pro3.size();i++) {
		if(pro3.get(i)>smallest4) {
			index3=i;
		}
	}
	
	
	//for get the third index from proind
	
	int thirdind=proind.indexOf(smallest4);
	
	//System.out.println("Index is:"+thirdind);
	System.out.println("process is p"+(thirdind)+" and burst time is :"+pro3.get(index2));
	
	int thirdd=second+smallest4;
	System.out.println("[0 - 3] " +"p"+(index)+ "[]"+veryp+
			"[p"+(secondind)+"]"+second+"[p"+(thirdind)+"]"+thirdd);
	//System.out.println(pro);
	
	
	System.out.println();
	System.out.println("-----------Turnaround time-----------");
	System.out.println();
	
	
	System.out.println("[0 - 3] " +"p"+(index)+ "[]"+veryp+
			"[p"+(secondind)+"]"+second+"[p"+(thirdind)+"]"+thirdd);
	int seqofprocess []= {index,secondind,thirdind};
	for(int x:seqofprocess) {
	System.out.println(x);
	}
/*	System.out.println("Turnaround time for P0: "+(veryp-arrival[0]));
	System.out.println("Turnaround time for P1: "+(second-arrival[1]));
	System.out.println("Turnaround time for P2: "+(thirdd-arrival[1]));
	*/
	

	int t=0,w=0;
	/*for(i=0;i<3;i++) {
		
		switch(arr[i]) {
		case 0:System.out.println("Turnaround time for P"+i+" "+(veryp-arrival[0])+" "+burst[i]);
		       System.out.println("Waiting time for P"+i+" "+
		((veryp-arrival[0])-burst[arr[i]]));
		 
		break;
		case 1:System.out.println("Turnaround time for P"+i+" "+(second-arrival[1])+" "+burst[arr[i]]);
	       int b2=((secondind)-(arrival[1]))-burst[i];
		System.out.println("Waiting time for P"+i+" "+b2);
		break;
		case 2:System.out.println("Turnaround time for P"+i+" "+(thirdd-arrival[1]));
	       System.out.println("Waiting time for P"+i+" "+
	((thirdind-arrival[2])-burst[arr[i]]));
		break;
		
		}
	}*/
for(i=0;i<3;i++) {
		
		switch(seqofprocess[i]) {
		case 0:
		       t=(veryp-arrival[0]);
		       w=t-burst[seqofprocess[i]];
		 
		break;
		case 1:
		t=(second-arrival[1]);
		w=t-burst[seqofprocess[i]];
		break;
		case 2:
	       t=(thirdd-arrival[2]);
	       w=t-burst[seqofprocess[i]];
		break;
		
		}
		System.out.println("Turn around->"+t+"\n Waiting time->"+w);
	}
	
	
}

	
	
}
