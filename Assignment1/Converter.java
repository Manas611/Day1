import java.util.Scanner;
import java.util.*;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            if(ch[i]>=65 && ch[i]<=90)
            {
                ch[i] += 32;
            }
            else  if(ch[i]>=97 && ch[i]<=122)
            {
                ch[i] -= 32;
            }
            // System.out.print(ch[i]);
        }

        System.out.println(ch);
    }
}
