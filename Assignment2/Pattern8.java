// 1357
// 3571
// 5713
// 7135



public class Pattern8 {
    public static void main(String[] args) {
        int n = 4;
        int maxi = (n*2)-1;

        for(int i=0;i<n;i++)
        {
            int cnt = (i*2)+1;
            for(int j=0;j<n;j++)
            {
                if(cnt<=maxi)
                {
                    System.out.print(cnt);
                    cnt += 2;
                }
                else
                {
                    cnt = 1;
                    System.out.print(cnt);
                    cnt += 2;

                }
            }
            System.out.println();
        }
    }
}
