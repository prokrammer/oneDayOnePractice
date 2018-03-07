package backjun;

import java.io.IOException;
//import java.io.BufferedInputStream;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;

public class NumberOrder {
/*

문제

N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
입력

첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
출력

첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

*/	
	Scanner sc;
	int x;
	int[] intList;
	int[] countArr;
	int[] result;
	
	void inputNumber() throws IOException{
		sc  = new Scanner(System.in);
		x = sc.nextInt();
		intList = new int[x];
		
		for(int i = 0; i < x; i++) {
			intList[i] = sc.nextInt();
		}
	}
	
	int findMaxNumber() {
        int max = 0;
        for (int i = 0; i < intList.length; i++) {
            if (max < intList[i]) {
                max = intList[i];
            }
        }
        return max;
    }

/*	void display() {
        for (int i = 0; i < countArr.length; i++) {
            System.out.print(countArr[i] + " ");
        }
        System.out.println();
    }
*/ 
    void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    void sort() throws IOException {
        inputNumber();
        int maxNumber = findMaxNumber();
        
        countArr = new int[maxNumber + 1];
        
        result = new int[intList.length];
 
        for (int i = 0; i < intList.length; i++) {
            countArr[intList[i]]++;
        }
        //System.out.println("CountArr[]=");
        //display();
 
        for (int i = 1; i < countArr.length; i++) {
            //누적 숫자 더하기
            countArr[i] += countArr[i - 1];
        }
        //System.out.println("누적 배열");
        //display();
 
        for (int i = intList.length - 1; i >= 0; i--) {
            //정렬하기
            result[--countArr[intList[i]]] = intList[i];
            //countArr[numbers[i]]--;
        }
        display(result);
    }


    
    
	public static void main(String[] args) throws IOException{
		new NumberOrder().sort();
		/*
		Scanner sc;
		int x;
		int[] intList;
		
		sc  = new Scanner(System.in);
		x = sc.nextInt();
		intList = new int[x];
		
		for(int i = 0; i < x; i++) {
			intList[i] = sc.nextInt();
		}
		
		for(int i = 0; i < x; i++) {
			for(int j = i + 1; j < x; j++) {
				if(intList[i]>intList[j]) {
					int temp = intList[i];
					intList[i] = intList[j];
					intList[j] = temp;
							
				}
			}
		}
		
		for(int i = 0; i < intList.length; i++) {
			System.out.println(intList[i]);
		}
		
		sc.close();
		*/
/*		BufferedReader br;
		int x = 0;
		ArrayList<Integer> arrayList;
		
		br = new BufferedReader(new InputStreamReader(System.in));
			try {
				x = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		arrayList = new ArrayList<>();
		
		for(int i = 0; i < x; i++) {
			try {
				arrayList.add(Integer.parseInt(br.readLine()));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Collections.sort(arrayList);
		for(int i = 0; i < arrayList.size(); i++) {
			for(int j = i + 1; j < arrayList.size(); j++) {
				if(arrayList.get(i)>arrayList.get(j)) {
					int temp = arrayList.get(i);
					arrayList.set(i, arrayList.get(j));
					arrayList.set(j, temp);
				}
			}
		}
		
		for(Integer sortedInt : arrayList) {
			System.out.println(sortedInt);
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
