package backjun;

import java.util.Scanner;

public class AlphaCentauri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcaseNum = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < testcaseNum; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int distance = b-a;
			int maxSpeed;
			maxSpeed = (int) Math.sqrt(distance); 
			if(Math.sqrt(distance)-(int) Math.sqrt(distance)!=0) {
				if(Math.round(Math.sqrt(distance))==(int) Math.sqrt(distance)) {
					System.out.println(maxSpeed*2);
				}else {
					System.out.println(maxSpeed*2+1);
				}
			} else {
				System.out.println(maxSpeed*2-1);
			}
		}
	}
}
