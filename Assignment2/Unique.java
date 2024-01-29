
import java.util.*;

public class Unique {
    public static void main(String[] args) {
        // String s = "abcabdfc";
        // int n = s.length();

        // HashMap<Character, Integer> m = new HashMap<>();

        // for (char c : s.toCharArray()) {
        //     if (m.containsKey(c)) {
        //         m.put(c, m.get(c) + 1);
        //     }
        //     else {
        //         m.put(c, 1);
        //     }
        // }

        // String out = "";

        // for (char key : m.keySet()) {
        //     if(m.get(key) == 1)
        //     {
        //         out += key;
        //     }
        // }
        // System.out.println(out);

        

        String s = "abcabdfc";
        int n = s.length();
        int[] arr = new int[26];
        String out = "";

        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            arr[ch-97]++;
        }

        for(int i=0;i<26;i++)
        {
            if(arr[i] == 1)
            {
                char ch = (char)(i + 97);
                out += ch;
            }
        }
        System.out.println(out);




    }
}
