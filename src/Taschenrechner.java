public class Taschenrechner {
    public static void main(String[] args) {
        System.out.println(divide(20, 3));
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int subtract(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int mulitply(int a, int b) {
        int c = a * b;
        return c;
    }

    public static String divide(int a, int b) {
        int c = a / b;
        int d= a-c*b;
        String e= String.valueOf(d);
        String g= String.valueOf(c);
        String f= g + " rest "+ e +" mod("+b+")";
        return f;
    }


    //________________________________________________________________________


    /* public static void add(double a, double b)
    {

    }
    public static void subtract(double a, double b)
    {

    }
    public static void mulitply(double a, double b)
    {

    }
    public static void divide(double a, double b)
    {

    }
 */
}
