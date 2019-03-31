import java.util.*;
import java.util.ArrayList.*;

public class main3 {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		int i=0;
		int p1=0,p2=0,p3=0;
		
		System.out.println("Enter p"+(i+1));
		boolean hasvalid=user.hasNextInt();
		
		if(hasvalid) {
		p1=user.nextInt();
		System.out.println("Enter P2 :");
	    p2=user.nextInt();
		System.out.println("Enter P3 :");
		p3=user.nextInt();
			
		}else {
			System.out.println("Invalid number");
		}
		user.nextLine();
		
		if(p1<10 & p2<10 & p3<10) {
		userinput(p1,p2,p3);
		}else {
			System.out.println("Inavlid process");
			
		}
	}

	public static void userinput(int p1,int p2,int p3 ){
		
		ArrayList<Integer> pro=new ArrayList<Integer>();
		pro.add(p1);
		pro.add(p2);
		pro.add(p3);
		
		/*for(int obj:pro) {
		System.out.println("Burst time of process p"+ obj);
		}*/
		
		for(int i=0;i<=2;i++) {
		
		System.out.println("Burst time of process :"+(i+1)+" is: "+pro.get(i));
		}
		
		//ArrayList<Integer> =new ArrayList<Integer>();
		int arrival[]=new int[]{3,6,4};
		for(int i=0;i<arrival.length;i++) {
			System.out.println("Arrival time of process p"+(i+1)+" is :"+arrival[i]);
	}
	
		
		//smallest value
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
	
	System.out.println("Large value is :"+largest);
	int indexL=0;

	for(int i=0;i<arrival.length;i++) {
		if(arrival[i]==largest) {
			indexL=i;
		}
//	}
	
	
	
	
	//for ()
	
	
	
	System.out.println("Smallest arrival time is :"+smallest+" and index is "+index);
	System.out.println("process is p"+(index+1)+" and burst time is :"+pro.get(index));
	//System.out.println("Process to that number is :");
	
	
	
	System.out.println();
	System.out.println("CPU is ideal for 3 sec ");
	int first=pro.get(index);
	//int firstout=first-first;
	
	int veryp=first+3;
	System.out.println("[0 - 3] " +"p"+(index+1)+ "[]"+veryp);
	
	pro.remove(index);
	System.out.println("We have only "+pro.size()+" Elements in the list");
	System.out.println(pro);
	
	
	
	
	//second
	int smallest2=smallest;
	ArrayList<Integer> pro2=new ArrayList<Integer>();
	pro2.addAll(pro);
	
	
	//int count2=0;
	if(veryp>6 ||veryp>4) {
	for(int x:arrival) {
		if(x>smallest2) {
			smallest2=x;
			//count2++;
		}
		}
	}else {
		System.out.println("Invalid process");
		System.exit(0);
	}
	
	
	
	
	System.out.println("Second smallest arrival time is :"+smallest2);
	
	int index2=0;

	for(int j=0;j<arrival.length;j++) {
		if(arrival[j]>smallest) {
			index2=j;
		}
	}
	
	System.out.println("Index is:"+index2);
	System.out.println("process is p"+(index2+1)+" and burst time is :"+pro2.get(index2-1));
	
	int second=veryp+pro2.get(index2-1);
	System.out.println("[0 - 3] " +"p"+(index+1)+ "[]"+veryp+"[p"+(index2+1)+"]"+second);
	
	
	//third
	pro2.remove(index2-1);
	System.out.println("Now we have only "+pro2.size()+" elements in the list ");
	System.out.println(pro2);
	
	
	ArrayList<Integer> pro3=new ArrayList<Integer>();
	pro3.addAll(pro2);
	
	int smallest3=arrival[0];
	//int count2=0;
	for(int x:arrival) {
		if(x>smallest3) {
			smallest3=x;
			//count2++;
		}
	}
	
	System.out.println("Third smallest arrival time is :"+smallest3);
	
	int index3=0;

	for(int q=0;q<arrival.length;q++) {
		if(arrival[q]>smallest) {
			index3=i;
		}
	}
	
	System.out.println("Index is:"+index3);
	System.out.println("process is p"+(index3)+" and burst time is :"+pro3.get(index2-2));
	
	int third=second+pro2.get(index2-2);
	System.out.println("[0 - 3] " +"p"+(index+1)+ "[]"+veryp+"[p"+(index2+1)+"]"+
	second+"[p"+(index3)+"]"+third);
	
	}
	
	
	
	
}

	private static int findIndex(int[] arrival, int smallest) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
