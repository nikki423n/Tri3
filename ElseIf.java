//3.4 Else if statements
public class ElseIf
{
    public static void main(String[] args)
    {
        int result = 0;
        int x = 1;
        int y = 2;
        //compare the outputs of the 2 code segments
        /*both code segments print the same output for all values of x and
         * this is bc both print the absolute value of the differences
         * both print 0 if x = y
         */
        
       
        if (x>y)
        {
            result = x-y;
            System.out.println(result);
            // when x is greater than y, the code prints out to x-y
        }
        else if (x<y)
        {
            result = y-x;
            System.out.println(result);
            // if x is less than y, then it is y-x
        }
        else
        {
            System.out.println(result);
        }
        if (x<y)
        {
            System.out.println(y-x);
            //if x is less than y, then it is y-x (Same as code above)
        }
        else
        {
            System.out.println(x-y);
            // when x is greater than y, the code prints out to x-y (same as code above)
            //if x = y, subtracting them would still make the value 0, which is the same output for the code above
        }
        
    }
}