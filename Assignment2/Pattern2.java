// 1
// 21
// 321
// 4321

public class Pattern2 {
    public static void main(String[] args) {
        int n = 10;
        for(int i=0;i<n;i++)
        {
            int k = i+1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(k--);
            }
            System.out.println();
        }
    }
}
