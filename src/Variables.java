import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * Created by Dileema on 2/11/2017.
 */
public class Variables {
    public static void main(String args[]){
        int x=2;
        int y=4;
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x= x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
    }
}
