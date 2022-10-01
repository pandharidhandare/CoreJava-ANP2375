package org.view;
import org.service.ArrayService;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[]=new int [5];
		System.out.println("enter five integer value of array");
		for(int i =0;i<5;i++) {
		
		arr1[i] =sc.nextInt();
		
	}
		ArrayService avg1 =new  ArrayService();
		System.out.println(avg1.calculateAverage(arr1));
	}
}
