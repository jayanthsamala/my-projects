package practise;
import java.util.*;
public class fibonacci{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int first=0,second=1,next,a;
	//System.out.println("enter max number of series");
	//a=sc.nextInt();
	System.out.println(first);
	System.out.println(second);
	for(int i=0; ;i++){
		next=first+second;
		System.out.println(next);
		first=second;
		second=next;
		if(next>100){
			break;
		}
		
	}
	
	
	
	
	
	}
}

