public class Prime {
    public static void main(String[] args) {
        int n = 13;
        for(int i=2;i<=n;i++)
        {
            boolean flag = true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j == 0)
                {
                    // System.out.println(i+" Not prime "+j);
                    flag = false;
                    break;
                }
            }
            if(flag == true)
            {
                System.out.println(i);
            }
        }
    }
}
