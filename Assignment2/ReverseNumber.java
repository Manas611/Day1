public class ReverseNumber {
    public static void main(String[] args) {
        int n = 0034;
        int ans = 0;
        System.out.println(n);

        while(n!=0)
        {
            int r = n%10;
            ans = ans*10 + r;
            n = n/10;
        }
        System.out.println(ans);
    }
}
