    //        1
    //       232
    //      34543
    //     4567654
    //    567898765

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++)
        {

            // space
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print(" ");
            }


            // Triangle number 1

            for(int j=0;j<=i;j++)
            {
                System.out.print(j+i+1);
            }

            // Triangle number 2
            for(int j=0;j<i;j++)
            {
                System.out.print(2*i-j);
            }
            System.out.println();
        }
    }
}
