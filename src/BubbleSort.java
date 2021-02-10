import java.util.*;

public class BubbleSort {
	
	public static void arr_sort(int arr_[]) {
		
		for (int i=0;i<arr_.length;i++) {
			for(int j=0;j<arr_.length-i-1;j++) {
				if (arr_[j]>=arr_[j+1]) {
					int check=arr_[j+1];
					arr_[j+1]=arr_[j];
					arr_[j]=check;
				}
			}
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