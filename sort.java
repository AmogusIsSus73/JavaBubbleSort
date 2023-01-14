package main;

import java.util.Scanner;

public class sort {
	public static void bubbleSort(int[] sortArr){
	    for (int i = 0; i < sortArr.length - 1; i++) {
	        for(int j = 0; j < sortArr.length - i - 1; j++) {
	            if(sortArr[j + 1] < sortArr[j]) {
	                int swap = sortArr[j];
	                sortArr[j] = sortArr[j + 1];
	                sortArr[j + 1] = swap;
	            }
	        }
	    }
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.println("Insert array elements:");
	    for(int i = 0; i < size; i++){    	
	    array[i] = input.nextInt();	        
	    }
	    System.out.print ("Inserted array elements:");
	    for (int i = 0; i < size; i++) {
	    System.out.print (" " + array[i]);
	    }
	    System.out.println();
	    bubbleSort(array);
	    for(int i = 0; i < array.length; i++){
        System.out.print(array[i] + "\n");
}
}
}