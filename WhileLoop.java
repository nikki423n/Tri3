// unit 4 Q16 4.5
public class WhileLoop
{
    public static void main(String[] args)
    {
        int a = 100;
        // how many dollar signs printed by while loop
        while (a > 1)
        {
            System.out.println("$");
            a /= 2;
        }
        // it is not 7 bc the it would have to be a>=1
        // the answer is 6 bc the while loop executes 6 times
        // the end of the first loop is 50 then 25 --> 12 --> 6 --> 3 --> 1
        // the while loop stops after the 6th iteration bc a>1 is now false
    }
}