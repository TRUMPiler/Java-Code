import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void insertionSort(int arr[]) {
       int n=arr.length;
       for(int i=0;i<n;i++)
       {
            int key=i;
            int j=0;
            while(j>=0&&arr[key]>arr[j])
            {
                arr[j+1]=arr[j];
            }
            arr[j+1]=key;
       }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        System.out.println("Original Array: " + Arrays.toString(arr));

        
        insertionSort(arr);

        
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        scanner.close();
    }
}
