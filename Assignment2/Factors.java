import java.util.*;

public class Factors {
    public static void main(String[] args) {
        int n = 100;

        double sq = Math.sqrt(n);
        for(int i=1;i<=(int)(sq);i++)
        {
            if(n%i == 0)
            {
                System.out.println(i);
                System.out.println(n/i);
            }
        }
    }
}
