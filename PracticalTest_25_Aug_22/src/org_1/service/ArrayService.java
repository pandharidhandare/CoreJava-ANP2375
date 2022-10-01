package org.service;

public class ArrayService {
public double calculateAverage(int a[]) {
	int sum =0;
	double avg;
	for(int i =0;i<a.length;i++) {
		sum = sum +a[i];
	}
	avg =sum/a.length;
	
	return avg;
}
}
