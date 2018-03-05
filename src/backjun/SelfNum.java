package backjun;

import java.util.HashSet;
/*

In 1949 the Indian mathematician D.R. Kaprekar discovered a class of numbers called self-numbers. 
For any positive integer n, define d(n) to be n plus the sum of the digits of n. 
(The d stands for digitadition, a term coined by Kaprekar.) For example, d(75) = 75 + 7 + 5 = 87. 
Given any positive integer n as a starting point, you can construct the infinite increasing sequence of integers n, 
d(n), d(d(n)), d(d(d(n))), .... For example, if you start with 33, the next number is 33 + 3 + 3 = 39, 
the next is 39 + 3 + 9 = 51, the next is 51 + 5 + 1 = 57, and so you generate the sequence

33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...

The number n is called a generator of d(n). In the sequence above, 33 is a generator of 39, 
39 is a generator of 51, 51 is a generator of 57, and so on. Some numbers have more than one generator: 
for example, 101 has two generators, 91 and 100. A number with no generators is a self-number. 
There are thirteen self-numbers less than 100: 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, and 97.

Write a program to output all positive self-numbers less than 10000 in increasing order, one per line.

*/
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
