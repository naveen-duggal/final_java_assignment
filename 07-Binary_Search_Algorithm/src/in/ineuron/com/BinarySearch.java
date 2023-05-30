package in.ineuron.com;
import java.util.Scanner;

class BinarySearch{  
	 public static void binarySearch(int arr[], int first, int last, int key){  
	   int mid = (first + last)/2;  
	   while( first <= last ){  
	      if ( arr[mid] < key ){  
	        first = mid + 1;     
	      }else if ( arr[mid] == key ){  
	        System.out.println("Element is found at index: " + mid);  
	        break;  
	      }else{  
	         last = mid - 1;  
	      }  
	      mid = (first + last)/2;  
	   }  
	   if ( first > last ){  
	      System.out.println("Element is not found!");  
	   }  
	 }  
	 public static void main(String args[]){  
		    Scanner sc = new Scanner(System.in);
	        int arr[] = {11,24,35,41,52,68};  
	        for(int num:arr) {
	        System.out.print(num+" ");
	        }
	        System.out.println();
	        System.out.println("Enter the key to find the index No. ");
	        int key = sc.nextInt();
	        int last=arr.length-1;  
	        binarySearch(arr,0,last,key);     
	 }  
	}  