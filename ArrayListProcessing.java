import java.util.*;
public class ArrayListProcessing
{
    public static void main(String[] args)
    {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("Softball");
        sports.add("Soccer");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Soccer");
        sports.add("Skiing");
        sports.add("Rowing");
        
        System.out.println("Question 3:" + returnElement(sports, 3));
        System.out.println("Question 4:");
        removeThirdElement(sports);
    }
    
    // Number 3
    public static String returnElement(ArrayList<String> inList,int i)
    {
        return inList.get(i);
    }
    
    // Number 4
    public static void removeThirdElement(ArrayList<String> inList)
    {
        inList.remove(2);
        for(int i = 0; i < inList.size(); i++)
            System.out.println(inList.get(i));
    }
    
    // Number 1
    public static void printElements(ArrayList<String> inList)
    {
        for(int i = 0; i<inList.size(); i++)
            System.out.println(inList.get(i));
    }
    
    //Number 2
    public static void addElements(ArrayList<String> inList)
    {
        inList.add("chess");
        for(int i = 0; i<inList.size(); i++)
            System.out.println(inList.get(i));
    }
    
    // Number 5
    public static void findElements(ArrayList<String> inList, String thing)
    {
        for(int i = 0; i<inList.size(); i++)
        {
            if(thing == inList(int i))
            {
                System.out.println(inList.get(i));
            }
        }
    }
}
