// E
// DE
// CDE
// BCDE
// ABCDE

public class Pattern5 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0;i<n;i++)
        {
            char ch = (char)('A' + n - i - 1);
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
