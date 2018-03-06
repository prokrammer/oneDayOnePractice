package backjun;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfWord {
	public static void main(String[] args) {
/*
문제

영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.

입력

첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문장이 주어진다. 이 문장의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다.
*/
		
		Scanner sc;
		String word;
		ArrayList<String> wordList;
		StringTokenizer stringTokenizer;
		
		sc = new Scanner(System.in);
		word = sc.nextLine();
		wordList = new ArrayList<String>();
		stringTokenizer = new StringTokenizer(word, " ");
		
		while(stringTokenizer.hasMoreTokens()) {
			wordList.add(stringTokenizer.nextToken());
		}
		
		System.out.println(wordList.size());
		
		sc.close();
	}
}
