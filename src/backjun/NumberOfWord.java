package backjun;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfWord {
	public static void main(String[] args) {
/*
����

���� ��ҹ��ڿ� ���⸸���� �̷���� ������ �־�����. �� ���忡�� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�

ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ������ �־�����. �� ������ ���̴� 1,000,000�� ���� �ʴ´�. �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����.
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
