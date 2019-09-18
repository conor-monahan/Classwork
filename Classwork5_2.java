import java.util.Scanner;
public class Classwork5_2
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ask a question");
        double randNum = (int) (Math.random()*3);
        if (randNum == 0)
        {System.out.println("You may never know");}
        else if (randNum == 1)
        {System.out.println("Odds aren't looking too good");}
        else if (randNum == 2)
        {System.out.println("It could happen");}
        else if (randNum == 3)
        {System.out.println("Likely");}
        else if (randNum == 4)
        {System.out.println("Certainly will happen");}
        else if (randNum == 5)
        {System.out.println("Will not happen");}
        else
        {System.out.println("Fifty-fifty chance");}
        
    
        
    }
}
