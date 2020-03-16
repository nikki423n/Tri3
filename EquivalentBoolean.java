//3.6 Equivalent Boolean Expressions
// de morgan's laws
public class EquivalentBoolean
{
    public static void main(String[] args)
    {
        int j = 1;
        int k = 4;
        int m = 5;
        
        if (!((j == k) && (k > m)))
        {
            System.out.println("yay");
        }
        else
        {
            System.out.println("boo");
        }
        if ((j != k) || (k <= m))
        {
            System.out.println("right");
        }
        else
        {
            System.out.println("wrong");
        }
        /* !(A && B) is the same as !A || !B
         * !(E == F) is the same as E!=F
         * !(C>=D) is the same as C<D
         * therefore this statement should be the same as (j != k) || (k <=m)
         * the code i wrote is supossed to print out the strings that correspond to each other
         * if the code evaluates to yay, it is supposed to print out yay and right
         */
        
    }
}
