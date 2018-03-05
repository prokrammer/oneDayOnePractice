package backjun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class If6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String testCase = sc.nextLine();
		ArrayList list;
		int sum =0;
		int count = 0;
		double avg = 0;
		int[] a;
		list = new ArrayList();
		
		for(int i = 0; i < Integer.valueOf(testCase); i++) {
			int haksangSu = sc.nextInt();
			a = new int[haksangSu];
			for(int j = 0; j < haksangSu; j++) {
				a[j] = sc.nextInt();
				sum += a[j];
			}
			avg = ((double)sum)/haksangSu;
			for(int k = 0; k < haksangSu; k++) {
				if(a[k]>avg) {
					count++;
				}
				
			}
			double imsi = (double)count/haksangSu;
			imsi = ((double)Math.round(imsi*100000))/1000;
			list.add(imsi);
			
			count = 0;
			sum = 0;
			avg = 0;
		}
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			
//		}
//		System.out.println(list.get(0).getClass());
		for(int l = 0; l < list.size(); l++) {
			System.out.printf("%5.3f%%\n", list.get(l));
		}
		
	}
}
