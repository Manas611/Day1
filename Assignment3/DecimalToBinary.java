import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {

        // T(O) = 1  S(O) = 1


        // int n = 2;

        // int ans = 0;
        // double i = 0;

        // while(n!=0)
        // {
        //     int bit = n & 1;
        //     double val = Math.pow(10.0, i);
        //     int temp = (int)(val);
        //     ans = (bit*temp) + ans;

        //     // Right shift (Divide by 2)
        //     n = n >> 1;
        //     i++;
        // }

        // System.out.println(ans);


        // T(O) = log(n)  S(o) = 100 
        int n = 2;
        int[] arr = new int[100];
        int i = 0;

        while(n!=0)
        {
            int rem = n%2;
            arr[i++] = rem;
            n = n/2;
        }

        for(int j=i-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }


    }
}
