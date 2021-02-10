import java.util.*;

public class NewSort {
	// Insertion Sort algorithm
	
public static void arr_sort(int arr[]) {  
for (int i=1;i<arr.length;i++) { 
	int check=arr[i]; 
	int j=i-1; 
	while ((j>=0)&&(arr[j]>check)){ 
		arr[j+1]=arr[j]; 
	    j=j-1;} 
	    arr[j+1]=check;
	    } 
} 

public static void print_arr(int arr[]) {
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}

public static void main(String[] args) {
	System.out.println("Enter the size of array :- ");
	Scanner sc= new Scanner(System.in);
	int inp=sc.nextInt();
	int[] arr_1 = new int[inp];
	System.out.print("Enter ");
	System.out.print(inp);
	System.out.println(" numbers in array");
	for(int i=0;i<inp;i++) {
	arr_1[i]=sc.nextInt();	
	}
	System.out.println("Unsorted Array :- ");
	print_arr(arr_1);
	System.out.println();
	arr_sort(arr_1);
	System.out.println("Sorted Array :- ");
	print_arr(arr_1);
}
}



