package ProblemSolvingHackerrank;
import java.util.*;
public class ArrayManipulation {
	public static long arrayManipulation(int n, int [][]arr) {
		
		/* Created long array with size n+2
		 * because the index of 0 will always remain zero and the indexing starts from 1
		 * and when we go for oneArr[b+1] later, we need extra element at last to perform this operation
		 * */
		
		long [] oneArr = new long [n+2];
		
		/*To reduce time complexity we go like this
		 * we are just adding k at the ath index and we assume that to happen until we reach bth index position
		 * negative value of k is put at b+1
		 * */
		
		for(int i=0; i<arr.length; i++) {
			int a = arr[i][0];
			int b = arr[i][1];
			int k = arr[i][2];
			oneArr[a] += k;
			oneArr[b+1] -= k;
		}
		/*The Maximum method will use prefix sum algorithm and return max value*/
		long max = Maximum(oneArr);
		return max;
	}
	public static long Maximum(long[]arr) {
		/*The value of max is initialized to minimum value of long, which is -2^63*/
		long max = Long.MIN_VALUE;
		long sum = 0;
		for(int i=0; i<arr.length; i++) {
			/*Prefix sum algorithm is performed here*/
			sum+=arr[i];
			max = Math.max(max, sum);
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Getting the inputs n and m*/
		int n = sc.nextInt();
		int m = sc.nextInt();
		/*Creating 2-d array with m as row size*/
		int [][] twoArr = new int [m][3];
		/*Got values for the twoArr using single for loop
		 * because in this problem we know the column value is 3 always*/
		for(int i=0; i<m; i++) {
			twoArr[i][0] = sc.nextInt();
			twoArr[i][1] = sc.nextInt();
			twoArr[i][2] = sc.nextInt();
		}
		/*The array is passed to the below method to get the output*/
		System.out.println(arrayManipulation(n,twoArr));
	}
}