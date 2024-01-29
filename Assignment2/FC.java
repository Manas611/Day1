public class FC {
    public static void main(String[] args) {
        float start = 120;
        float end = 200;
        float gap = 40;
        while(start<=end)
        {
            float cel = 0;
            cel = (start-32)*5/9;
            start = start + gap;
            System.out.println(cel);
        }
    }
}
