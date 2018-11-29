import javax.swing.*;

public class Aufgabe2_1810653053
{
    public static void main (String[]args)
    {
partialString(JOptionPane.showInputDialog("String über drei zeichen bitte"));
        System.out.println("\n_________________________");
partialString("123456789A");
        System.out.println("\n_________________________");
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
