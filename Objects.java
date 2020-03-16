// 2.2 creating and storing objects(instantiation)
public class Objects
{
    /* question asks for a code segment that would create a reference of type Objects with a 
     * value of null
     * below shows the class declaration
     */
    private String color;
    // code declares variable type Objects name someObjects, but it doesn't initialize it
    // therefore, the value will be equal to null
    // --> asnwer is: Objects someObjects;
   
    public Objects()
    {
        color = "Blue";
    }
    public Objects(String setColor)
    {
        color = setColor;
    }
    
}