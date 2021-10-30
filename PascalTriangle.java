import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows :");
		int n=sc.nextInt();
		for(int j=1;j<=n;++j) {
			for(int i=1;i<2*(n-j);++i) {
				System.out.print(" ");
			}
			
			for(int i=1;i<=j;++i) {
				nums(j,i);
			}
			System.out.println();
		}
		
	}

	static void nums(int a,int b) {
		int fact1=1,fact2=1,fact3=1;
		int x=a-1,y=b-1;
		int c=x-y;
		
	
		while(x>0) {
			fact1=fact1*x;
			x--;
		}
		while(y>0) {
			fact2=fact2*y;
			y--;
		}
		while(c>0) {
			fact3=fact3*c;
			c--;
		}
		int d=fact1/(fact2*fact3);
		System.out.print(d+"   ");
		
	}
	
}
