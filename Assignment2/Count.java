public class Count {
    public static void main(String[] args) {
        int n = 132456;
        int ec = 0;
        int oc = 0;

        while(n!=0)
        {
            int r = n%10;
            if(r%2 == 0)
            {
                ec += r;
            }
            else
            {
                oc += r;
            }
            n = n/10;
        }
        System.out.println(ec + " " + oc);
    }
}
