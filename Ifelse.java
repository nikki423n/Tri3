//3.3 if-else statements
public class Ifelse
{
    public static void main (String[] args)
    {
        String weather;
        int temp = 51; //code prints temp as moderate
        //int temp = 30; this is the error bc temp>= 51 is evaluated to false, thus 30 will be considered warm, not cold
        //int temp = 51; the if then statement assigns this to moderate, since it is equal to 51 (True)
        //int temp = 60; the if then statement assigns this to moderate, since it is > 51 (True)
        if (temp <= 31)
        {
            weather = "cold";
        }
        else
        {
            weather = "cool";
        }
        if (temp >= 51)
        {
            weather = "moderate";
        }
        else
        {
            weather = "warm";
        }
        System.out.println(weather);
    }
}
        