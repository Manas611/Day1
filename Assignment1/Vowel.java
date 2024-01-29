public class Vowel {
    public static void main(String[] args) {
        String s = "ae#zyu**awiv";
        int n = s.length();
        int vc = 0, cc =0, oc = 0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                vc++;
            }
            else if((s.charAt(i)<=65 && s.charAt(i)>=90) || (s.charAt(i)>=97 && s.charAt(i)<=122))
            {
                cc++;
            }
            else
            {
                oc++;
            }
        }
        System.out.println("Vowels are "+vc);
        System.out.println("Consonent are "+cc);
        System.out.println("Other characters are "+oc);
    }
}
