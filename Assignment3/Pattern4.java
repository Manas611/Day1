public class Pattern4 {
    public static void main(String[] args) {
        int n = 7;
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>0;j--)
            {
                if(j == i+1)
                {
                    System.out.print('*');
                }
                else
                    System.out.print(j);
            }
            System.out.println();
            
        }
    }
}
