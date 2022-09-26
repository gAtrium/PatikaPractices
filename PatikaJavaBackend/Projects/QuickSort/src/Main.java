import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing RNG");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int arrsize = sc.nextInt();
        int[] arr = new int[arrsize];
        System.out.println("Initial Array:");
        for (int i = 0; i < arrsize; i++) {
            arr[i] = rand.nextInt((int)(arrsize*1.5));
            System.out.print(arr[i]);
            if(i < arrsize -1)System.out.print(',');
            else System.out.print('\n');
        }
        quickSort(arr,0,arrsize-1);
        System.out.println("Sorted Array:");
        for (int i = 0; i < arrsize; i++) {
            System.out.print(arr[i]);
            if(i < arrsize -1)System.out.print(',');
            else System.out.print('\n');
        }
    }

    static void quickSort(int arr[], int low,int high) {
        if (low < high) {
            int index = partition(arr, low, high);
            quickSort(arr, low, index-1);  // Before pi
            quickSort(arr, index + 1, high); // After pi
        }
    }
    static int partition (int arr[],int low,int high) {
        int pivot = arr[high];

        int i = (low - 1);
        for (int j = low; j <= high- 1; j++){
            if (arr[j] < pivot){
                i++;    // increment index of smaller element
                swap(arr,i,j);
            }
        }
        swap(arr, i + 1,high);
        return (i + 1);
    }

    static void swap(int[] arr, int o, int t) {
        int temp = arr[o];
        arr[o] = arr[t];
        arr[t] = temp;
    }
}