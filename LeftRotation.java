package InterviewPrepKit;

import java.util.*;
class Result {

    /*
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    Integer[] intArray = new Integer[arr.size()];
    intArray = arr.toArray(intArray);
    int len = intArray.length;
    int mod = d%len;
    List<Integer>Ans = new ArrayList<>();
    for(int i=0; i<len; i++){
        Ans.add(intArray[(i+mod)%len]);
    }
    return Ans; 
 }  
    
}
public class LeftRotation {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int rot = sc.nextInt();
	List<Integer> l = new ArrayList<>();
	for(int i=0;i<n; i++) {
		l.add(sc.nextInt());
	}
	Result r = new Result();
	System.out.println(r.rotateLeft(rot, l));
}
}