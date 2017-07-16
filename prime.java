package practise;
import java.io.*;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=(n/2);i++){
			if(n%i==0){
				System.out.println("not prime");
				count++;
				break;
			}
		}
		if(count==0){
		System.out.println("it is prime");
		}
	}

}
