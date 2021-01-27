package InterviewPrepKit;

import java.util.*;

public class SparseArray {
	static int[] matchingStrings(String[] strings, String[] queries) {
		int [] ansArr = new int[queries.length];
		int count = 0;
		for(int i=0; i<queries.length;  i++) {
			for(int j=0; j<strings.length; j++) {
				if(queries[i].equals(strings[j])) {
					count++;
				}
			}
			ansArr[i] = count;
			count = 0;
		}
		return ansArr;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String [] s1 = new String[n1];
        for(int i=0; i<n1; i++){
            s1[i] = sc.next();
        }
        int n2 = sc.nextInt();
        String [] s2 = new String[n2];
        for(int i=0; i<n2; i++){
            s2[i] = sc.next();
        }
		//System.out.println(Arrays.toString(matchingStrings(s1,s2)));
        int [] ansArra = new int[s2.length];
        ansArra = matchingStrings(s1,s2);
        for(int i: ansArra) {
        	System.out.println(i);
        }
	}
}
