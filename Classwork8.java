
/**
 * Write a description of class Classwork8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classwork8
{
    public static void main(String[] args)

    {
        // text your methods here
        System.out.println(raceToday(140, true));
        System.out.println(raceToday(200, true));
        
        System.out.println(numValue(5));
        System.out.println(numValue(10));
        
        

         

    }

    

    /** Question 11: Define a function that determines if a rider can race their dirtbike today. A dirtbike race only 

    ** happens on Fridays, and the motor requirements for the cc’s (or cubic centimeters) specify that the motor has ** a minimum of 150cc and a maximum of 800cc to be able to race. The method should return true if you are  

    ** racing today.

    **

    **@param size describes the cc’s for the dirt bike

    **@param isFriday boolean data that is true if it is Friday

    **

    **@return True if the size is between 150 and 800 (inclusive) and it’s Friday

    **/

    public static boolean raceToday(int size, boolean isFriday) 

    {               
        
       if (size >= 150 && size <= 800 && isFriday == true)
       return true;
       else
       return false;
    }

    

    /** Question 12: Define a function to determine if a number entered is even, then returns that number times 5. If ** the number entered is odd and is divisible by 5, then the function returns that number divided by five. If the 

    ** number is odd and is not divisible by 5, then the function returns three times that number. 

    **

    **@param number the number that determines the outputs to the function

    **

    **@return five times number if the number is even, number/five if number is odd and 

    ** divisible by five, and three times number if the number is odd and not divisible by five

    **/



    public static int numValue(int number)

    {               
        if (number % 2 == 0)
        return number * 5;
        else if (number % 2 == 0 && number % 5 == 0)
        return number / 5;
        else if (number % 2 == 1 && number % 5 == 1 || number % 5 == 2 || number % 5 == 3 || number % 5 == 4)
        return number * 3;
        else
        return 0;
        



    }

}

