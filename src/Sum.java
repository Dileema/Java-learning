/**
 * Created by Dileema on 3/2/2017.
 */
public class Sum {
    public static void main (String args[]){
        int sum=0;
        for(int i=1;i<1000;i++){
            if(i%3==0 || i%5==0) {
                sum = sum + i;
            }else{
                sum=sum;
            }
        }
        System.out.println("Total sum=" + sum);
    }
}
