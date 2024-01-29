//   *
//  ***
// *****
//  ***
//   *

public class Pattern2 {
    public static void main(String[] args) {
        
        int n = 7;
        for(int i=0;i<n/2+1;i++)
        {
            // Space
            for(int j=0;j<n-(n/2)-(i+1);j++)
            {
                System.out.print(" ");
            }

            // Star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print('*');
            }

            System.out.println();
        }

        for(int i=1;i<=n/2;i++)
        {
            // space

            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }

            // star
            for(int j=0;j<n-2*i;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
