//1.5 casting and ranges of variables
public class Casting
{
    public static void main(String[] args)
    {
        double d = 0.25;
        int i = 3;
        double diff = d-i;
        System.out.print((int)diff - 0.5);
        /* the value of diff is -2.75. However, this is cast to an int so the digits to the
         * right of the decimal point are truncated --> -2. -2 - 0.5 = -2.5
         * 
         */
    }
}