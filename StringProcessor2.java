
public class StringProcessor2
{
    public static String withoutEnds(String str)
    {
        return str.substring(1, str.length()-1);
    }
    
    public static String front2(String str)
    {
        return str.substring(str.length()-2, str.length()) + str.substring(0, (str.length()-2));
    }
    
    public static String firstFour(String str)
    {
        if (str.length() == 3)
        return str.substring(0, 3) + "#";
        else if (str.length() == 2)
        return str.substring(0, 2) + "##";
        else if (str.length() == 1)
        return str.substring(0, 1) + "###";
        else if (str.length() == 0)
        return str.substring(0) + "####";
        else
        return str.substring(0, 4);
        
    }
}
