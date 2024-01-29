public class Pow {
    public static void main(String[] args) {
        int x = 3;
        int nn = 4;

        int ans = 1;
        while(nn !=0)
        {
            if(nn%2 == 1)
            {
                ans = ans*x;
                nn = nn-1;
            }
            else
            {
                x = x*x;
                nn = nn/2;
            }
        }

        System.out.println(ans);
    }
}
