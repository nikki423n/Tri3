
// 2.9 Using the Math Class
import java.util.Random;
import java.lang.Math;

public class MathClass
{
    public static void main(String[] args)
    {
        /*the code is intended to randomly print one of the values 2,4,6,8
         * 
         */
        
        
        int val = (int) (Math.random() * 4 +1);
        // this is the right answer because it returns a double value less than 1 and greater than 0
        // it then multiplies the value by 4 and adds 1
        // this value is cast to int and is multiplied by 2 --> prduces {2,4,6,8}
        
        val *= 2;
        System.out.println(val);
    }
}
