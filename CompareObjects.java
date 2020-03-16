//3.7 comparing objects
public class CompareObjects
{
    public static void main(String[] args)
    {
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        /* what is printed as a result of executing the code segment?
         * answer: C
         * 
         */
        if (first == second)
        {
            System.out.print("A");
        }
        else if (second == third)
        {
            System.out.print("B");
        }
        // these first 2 conditions are not correct becasue they are not comparing content (only comparing object references)
        else if (first.equals(second))
        {
            System.out.print("C");
            // this condition evaluates to true becasue the contents of first and second are compared
            // since "duck" = "duck" the code prints out as C
        }
        else if (second.equals(third))
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("E");
        }
    }
}
        