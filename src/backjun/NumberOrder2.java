package backjun;

import java.util.LinkedList;
import java.util.Scanner;

public class NumberOrder2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int maxDigit = 1;
		int[] intList = new int[x];
		int max = 0;
		
		for(int i = 0; i < x; i++) {
			intList[i] = sc.nextInt();
			if (max < intList[i]) {
                max = intList[i];
            }
		}
		
		while(max/10!=0) {
			maxDigit++;
			max = max/10;
		}
		
		sortRadix(intList, maxDigit);
	}
	private static LinkedList<Integer>[] counter = new LinkedList[] {
            new LinkedList<Integer>(), new LinkedList<Integer>(),
            new LinkedList<Integer>(), new LinkedList<Integer>(),
            new LinkedList<Integer>(), new LinkedList<Integer>(),
            new LinkedList<Integer>(), new LinkedList<Integer>(),
            new LinkedList<Integer>(), new LinkedList<Integer>() };

	static void sortRadix(int[] intList,int maxDigit) {
		 int mod = 10;
	        int dev = 1;
	        for (int i = 0; i < maxDigit; i++, dev *= 10, mod *= 10) {
	            for (int j = 0; j < intList.length; j++) {
	                int bucket = (intList[j] % mod) / dev;
	                counter[bucket].add(intList[j]);
	            }
	 
	            int pos = 0;
	 
	            for (int j = 0; j < counter.length; j++) {
	                Integer value = null;
	                while ((value = counter[j].poll()) != null) {
	                    intList[pos++] = value;
	                }
	 
	            }
	            for(Integer in:intList) {
	            	System.out.println(in);
	            }
	        }

	}
}
