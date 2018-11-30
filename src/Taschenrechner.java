public class Taschenrechner {

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int subtract(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int multiply(int a, int b) {
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


    //double________________________________________________________________________


    public static double add(double a, double b)
    {
        double c = a + b;
        return c;
    }
    public static double subtract(double a, double b)
    {
        double c = a - b;
        return c;
    }
    public static double multiply(double a, double b)
    {
        double c = a * b;
        return c;
    }
    public static double divide(double a, double b)
    {
        double c = a/b;
        return c;

    }

}
