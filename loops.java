//Unit 4 Q5 4.2
public class loops
{
    public static void main(String[] args)
    {
        int total = 0;
        int result = 0;
        /*which of the following for loops could be used to replace the for loop in the original code segment
         * so that the orginal and revised code segments store the same value
         */
        //original code segment
        for (int k = 0; k<= 100; k+= 2)
        {
            total += k;
        }
        System.out.println(total);
        //for (int k = 1; k<101; k+=2)
        //{
        //    result += k -1;
        //}
        //System.out.println(result);
        //this is wrong becausea it evalutates to 2450 (sums up all even integers from 0 to 98 inclusive
        for (int k = 1; k <= 101; k+=2)
        {
            result += k-1;
        }
        System.out.println(result);
        // this code evaluates to 2,550 (the same as the original)
        // it sums all the even integers between 0 and 100 inclusive = 2,550
        //it adds even integers to the total bc odds are decreased by 1 before addition
    }
}