//1.3 expressions and assignment statements
public class Math

{
    public static void main(String[] args)
    {
        double math = 2/5%3;
        double math1 = 2/(5%3);
        double math2 = 2/5 + 1;
        System.out.println(math);
        System.out.println(math1);
        System.out.println(math2);
        /*only math1 and math2 are going to equal 1. math is going to be 0 becasue 2/5 evaluates
         * to 0, thus 0%3 evaluates to 0 as well. 5%3 evaluates to 2 and 2/2 is 1. 2/5 evaluates to
         * 0 and 0 + 1 evaluates to 1
         * 
         */
       
    }
}