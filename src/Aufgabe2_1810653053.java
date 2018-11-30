import javax.swing.*;

public class Aufgabe2_1810653053
{
    public static void main (String[]args)
    {
partialString(JOptionPane.showInputDialog("String über drei zeichen bitte"));
        System.out.println("\n_________________________");
partialString("123456789A");
        System.out.println("\n_________________________");
        System.out.println("IntDivision:"+Taschenrechner.divide(20, 3)+"\nDoubledivision:"+Taschenrechner.divide(20.0,3));
        System.out.println("Intmultiply:"+Taschenrechner.multiply(7,3)+"\nDoublemultiply:"+Taschenrechner.multiply(7.0,3.2));
        System.out.println("Intsubtract:"+Taschenrechner.subtract(10,4)+"\nDoublesubtract:"+Taschenrechner.subtract(10.40,5.30));
        System.out.println("Intadd:"+Taschenrechner.add(3,5)+"\nDoubleadd:"+Taschenrechner.add(3.2,5.3));
    }
    public static void partialString(String a)
    {
        int length = a.length();
if (length<4)
{
    System.err.println("sie hom a String eingem, da longa isch ");
}
else
{
    char[] m = a.toCharArray();
    for (int i=0; i<length;i++)
    {
        if(i<(length/2)){}
        else
        {
            System.out.print(m[i]);
        }
    }
}
    }

}
