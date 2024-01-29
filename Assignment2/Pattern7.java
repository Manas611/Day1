//    1 
//   12
//  123
// 1234

public class Pattern7 {
    public static void main(String[] args) {
        int n = 4;

        for(int i=0;i<n;i++)
        {
            //space
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print(" ");
            }

            //number
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
