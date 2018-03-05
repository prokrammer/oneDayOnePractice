package backjun;

import java.util.Scanner;

public class Nanugi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long currTime = System.currentTimeMillis();
		for (int n = 0; n <= 5000/3; n++) {
			for (int m = 0; m <= 5000/5; m++) {
				if ((n + m != 0) && a == (3 * n + 5 * m)) {
					System.out.println(n + m);
					System.out.println(System.currentTimeMillis()-currTime);
					return;
				}
			}

		}
		System.out.println(-1);
		System.out.println(System.currentTimeMillis()-currTime);
	}
}
