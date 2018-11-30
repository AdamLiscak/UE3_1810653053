
public class Fibronacci {
    public static void main(String[] args) {
        System.out.println(recursive(8));
        System.out.println("..");
        System.out.println(iterative(8));
    }

    public static int recursive(int a)
    {
        if(a>1) {
            return recursive(a-1) + recursive(a -2);
        }
        else if (a==0)
        {
            return 0;
        }
        else return a;
    }

   public static int iterative(int a)
    {
        if (a!=0) {
            int i = 1;
            int k = 1;
            int l = 1;
            while (a - 1 > i - 1) {
                k = k + l;
                l = k - l;
                i++;
            }
            return l;
        }
        else return 0;

    }

}
