package practise;
import java.util.*;
public class matrix {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	int m,n,sum=0;
	System.out.println("enter the no.of rows and columns of first matrix");
	int r1=sc.nextInt();
	int c1=sc.nextInt();
	System.out.println("enter number of rows and columns of second matrix");
	int r2=sc.nextInt();
	int c2=sc.nextInt();
	int first[][] = new int[r1][c1];
	int second[][]=new int[r2][c2];
	int result[][]=new int[r1][c2];
	System.out.println("enter the first matrix values");
	for (int i=0;i<r1;i++){
		for(int j=0;j<c1;j++){
			first[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter the second matrix values");
	for (int i=0;i<r2;i++){
		for(int j=0;j<c2;j++){
			
			second[i][j]=sc.nextInt();
		}
	}
	while(true){
	System.out.println("enter an option: \n 1.addition\n 2.subraction \n 3.multiplication");
	int opt=sc.nextInt();
	switch(opt)
	{
	case 1:
		if(r1==r2 && c1==c2){
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.print(result[i][j]=first[i][j]+second[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		}else{
			System.out.println("addition cannot be done");
		}
		break;
	case 2:
		if(r1==r2 && c1==c2){
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.print(result[i][j]=first[i][j]-second[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		}
		else{
			System.out.println("subraction cannot be done");
		}
		break;
	case 3:
		if(c1!=r2){
			System.out.println("matrices cant be multiplied");
		}else{
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				for(int k=0;k<r2;k++){
					sum=sum+first[i][k]*second[k][j];
				}
				result[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				System.out.print(result[i][j]);
				System.out.print("\t");
			}
			System.out.println();
	}
		break;
	
		}
	
	
	}
	
	}
}
}
