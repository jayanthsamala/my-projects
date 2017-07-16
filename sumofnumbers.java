package practise;
import java.io.*;
import java.util.*;

public class sumofnumbers {

	public static void main(String[] args){
		
		int a,sum=0;
		for(int i=0; ;i++){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number\n");
		a=sc.nextInt();
		if(a>0){		
			sum=sum+a;
			System.out.println(sum);
		}	
		else  {
			break;
		}
	}

	}

}
