import java.util.Scanner;
public class Classwork5
{
    public static void main (String[] args)
    {
        for (int i = 0; i < 500; i++)
        {
            double dice1 = (int) (Math.random() * 11) + 2;
            double dice2 = (int) (Math.random() * 11) + 2;
        
            double sum = dice1 + dice2;
            
            if (sum == 7 ||sum == 11)
            {System.out.println("You win!");}
            else if (sum == 2 || sum == 3 || sum == 12)
            {System.out.println("You lose!");}
            else
            {System.out.println("You keep playing");}
         
            
        }
    }
}

