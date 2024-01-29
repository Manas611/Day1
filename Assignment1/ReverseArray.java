import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // arr.add(10);
        // arr.add(20);
        // arr.add(30);
        // arr.add(40);
        // arr.add(50);

        // int n = arr.size();

        // // System.out.println(n);

        // for(int i=0;i<n/2;i++)
        // {
        //     Collections.swap(arr, i , n-i-1 );
        // }

        // System.out.println(arr);





        int arr[] = {10,20,30,40,50};
        
        int n = 5;

        for(int i=0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }    
}
