/**
 * Created by srachit on 12/1/14.
 */
public class problemTwo {
    public static void main(String[] args)
    {
        double sum = 0;
        double j = 1;
        double k = 1;
        while(j < 4000000)
        {
            if(j % 2 == 0)
            {
                sum += j;
            }
            j = j + k;
            k =  j - k;
        }
        System.out.println(sum);
    }
}
