import java.util.*;
import java.util.ArrayList;


public class main1 {

	//Global variable
	
	static Scanner burst=new Scanner(System.in);
	static int small=0,smallreturn=0;
	static int p0=0;
	static int p1=0;
	static int p2=0;
	static int i=0,k=0,t=0;
	static int howmany;
	static int j=0;
	static int indexofpro=0;
	static int[] burstvalues=new int[20];
	static ArrayList<Integer> pro=new ArrayList<Integer>();
	static ArrayList<Integer> arrival=new ArrayList<Integer>();
	static ArrayList<Integer> cal=new ArrayList<Integer>();
	static ArrayList<Integer> finalArray=new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
		
		
//burst time of process
		System.out.println("How many process you want to store :");
		howmany=burst.nextInt();

					
			for(i=0;i<howmany;i++) {
				System.out.println("Enter the burst time of P"+i);
				//burstvalues[i]=burst.nextInt();
				j=burst.nextInt();
				if(j<10&&j>0) {
				pro.add(j);
				}else
				{
					System.out.println("Invalid process. Enter the value again ");
					
					j=burst.nextInt();
					while(j>10) {
						System.out.println("Inavlid again");
						j=burst.nextInt();
					}
				}
			}
		
		
		for(i=0;i<howmany;i++) {
			System.out.println("Your burst time is :"+pro.get(i));
		}
		System.out.println("Your burst array is :"+pro);
		System.out.println();
		
//Arrival time 
		System.out.println("Enter  the arrival time of Process:");
		System.out.println();
		
		for(i=0;i<howmany;i++) {
			System.out.println("Enter the arrival time of process P"+i);
			k=burst.nextInt();
			if(k>3 && k<20) {
				
				arrival.add(k);
			}else {
				
				System.out.println("Invalid Arrival time . Enter the value again ");
				k=burst.nextInt();
				while(k<3 || k>20) {
					System.out.println("Invalid again");
					k=burst.nextInt();
				}
			}
		}
		
		
		for(i=0;i<howmany;i++) {
			System.out.println("Your Arrival time :"+arrival.get(i));
		}
		System.out.println("Arrival time list is :"+arrival);
		System.out.println();
		
		for(i=0;i<howmany;i++) {
			System.out.println("Process : P"+i+"   Burst time : "+pro.get(i)+
			"  AT : "+arrival.get(i));
		}
		
		calculate(arrival);
	}
	
	public static void calculate(ArrayList<Integer> cal) {
		System.out.println();
		System.out.println("get a list: "+cal);
		
		System.out.println("CPU is ideal for 3 seconds");
		System.out.println();
		
		
		
		//find the smallest arrival time
		
			smallreturn=smallest(arrival);
		System.out.println("Smallest arrival time is:"+smallreturn);
		indexofpro=pro.get(t);
		System.out.println("Value is :"+indexofpro);
		pro.remove(t);
		System.out.println(pro);
		finalvalues();
	}
	
	
	
	
	public static int smallest(ArrayList<Integer> cal) {
		
		small=arrival.get(0);
		for(int t:arrival) {
			if(t<small) {
				small=t;
			}
		}
		return small;
	}

	
	public static void finalvalues() {
		
		finalArray.add(indexofpro);
		System.out.println(finalArray);
	}
	
}
