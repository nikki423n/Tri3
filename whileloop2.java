// unit 4 Q17 4.5
public class whileloop2
{
    public static void main(String[] args)
    {
        int k = 35;
        //how many times will the string "x" be printed as a result of the code segment?
        while ( k >=0)
        {
            System.out.println("X");
            k -= 5;
        }
        // 8 times bc 35 -> 30 -> 25 -> 20 -> 15 -> 10 -> 5 -> 0
    }
}