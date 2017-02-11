import java.util.Arrays;

/**
 * Created by Dileema on 2/11/2017.
 */
public class NewArray {

    public static void main(String args[]) {
        int a[] = {2, 4, 6, 7, 8};
        String b= Arrays.toString(a);
        System.out.println(b);

        int c[]=new int[5];
        int  n=a.length;
        int  m=c.length;

        for(n=0;n<5;n++) {
            c[m - 1] = a[n];
            m--;
        }
        String d = Arrays.toString(c);
        System.out.println(d);
    }
}