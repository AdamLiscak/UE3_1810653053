public class Taschenrechner {
    public static void main(String[] args) {
        System.out.println("IntDivision:"+divide(20, 3)+"\nDoubledivision:"+divide(20.0,3));
        System.out.println("Intmultiply:"+multiply(7,3)+"\nDoublemultiply:"+multiply(7.0,3.2));
        System.out.println("Intsubtract:"+subtract(10,4)+"\nDoublesubtract:"+subtract(10.40,5.30));
        System.out.println("Intadd:"+add(3,5)+"\nDoubleadd:"+add(3.2,5.3));
    }

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
