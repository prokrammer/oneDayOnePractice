package backjun;

import java.util.HashSet;

public class SelfNum {
	public static void main(String args[]) {
		HashSet<Integer> xi = new HashSet<>();
		for(int i = 1; i <= 10000; i++) {
			xi.add(i);
		}
		for(int i = 1; i <= 10000; i++) {
			xi.remove(d(i));
			if(xi.contains(i)){
				System.out.println(i);
			}
		}
/*		for(int i = 1; i <= 10000; i++) {
		}*/
	}
	
	public static int d(int n) {
		int temp = 0, result = 0;
		
		temp = n/10;
		result = n + n%10;
		while(true) {
			if(temp<10) {
				result = result+temp;
				break;
			} else {
				result = result + temp%10;
				temp = temp/10;
			}
		}
		return result;
	}
}
