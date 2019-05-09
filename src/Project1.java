public class Project1 {
    public static void main(String[] args) {
        int width = 1920;
        boolean  done = false;
        double factor = 4.1278;

        System.out.println(width+"\n"+done );
        System.out.println("factor is "+factor);

        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        max = max+1;

        float maxFloat=Float.MAX_VALUE;
        System.out.println(maxFloat);
        float minFloat=Float.MIN_VALUE;
        System.out.println(minFloat);

        int x= 6;
        int y=11;
        int sum = x+y;
        System.out.println(sum = x+y );

        double d= 3.23523;
        double dl = d* 100;
        System.out.println(dl);

        int d2 = (int) dl;
        System.out.println(d2);

        double d3 = (double)d2/100;
        System.out.println(d3);

        int a=4;
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a%3);
        System.out.println(11%2);
        System.out.println(7%a++);
        System.out.println(a==4);
        System.out.println(a!=4);

        int s= 10;
        int t= 5;
        System.out.println(s==10&&t<=5);
        System.out.println(s<=t&&t>5);
        System.out.println("abc" instanceof String);

        double e =89.832;
        int f = (int) e;
        System.out.println(f);

        int l = 78;
        double m = l;
        System.out.println(m);

    }
}
