// 1=1
// 1+2=3
// 1+2+3=6

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            int val = 0;
            String temp = "";
            for(int j=1;j<=i;j++)
            {
                val = val+j;
                temp = temp + j + "+";
            }
            temp = temp.substring(0, temp.length() - 1);
            temp += "=";
            System.out.print(temp);
            System.out.print(val);
            System.out.println();
        }
    }
}
