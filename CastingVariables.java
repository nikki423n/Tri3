//1.5 casting and ranges of variables
public class CastingVariables
{
    public static void main(String[] args)
    {
        //this is intended to display 6.0
        /*  double fact1 = 1/2;
         *  double fact2 = 3*4;
         *  double product = fact1 * fact2;
         *  System.out.println(product);
         */
        
        // either the numerator or denominator has to be cast to a double. before they were int
        // types so the result would have been evaluated as a 0 instead of 0.5
        // 0.5 * 12 = 6.0
        double fact1 = 1.0/2;
        double fact2 = 3*4;
        double product= fact1 * fact2;
        System.out.println(product);
        
    }
}