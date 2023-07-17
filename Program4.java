import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array:");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter elements of array:");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		
		int[] multiple= {1,2,3,4,5,6,7,8,9};
		
		HashMap<Integer,Integer> countMap=new HashMap<>();
		for(int mul : multiple) {
			countMap.put(mul,0);
		}
		
		for(int arrays : ar) {
			for(int mul : multiple) {
				if (arrays % mul == 0) {
                    int count = countMap.get(mul);
                    countMap.put(mul, count + 1);
                }
			}
		}
		
		for (int key : countMap.keySet()) {
            System.out.print(key + ":" + countMap.get(key) + ", ");
        }
	}

}