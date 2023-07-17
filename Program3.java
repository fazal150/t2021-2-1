import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int val = n%2!=0 ? n : n-1;
		
		for(int i=0;i<val*2;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		

	}

}