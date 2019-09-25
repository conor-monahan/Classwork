
public class Classwork7
{

    public static void main(String[] args)
    {
        System.out.println(findSum(2, 3));
        System.out.println(canIVote(17));
        System.out.println(canIVote(18));
        System.out.println(whatSport("Hockey"));
        System.out.println(whatSport("Football"));
        System.out.println(whatSport("Soccer"));
        System.out.println(whatSport("futbol"));
        System.out.println(whatSport("Baseball"));
    }
    
    public static double findSum(int a, int b)
    {
        return a + b;
    }
    
    public static String canIVote(int age)
    {
        if (age >= 18)
            return "You can vote!";
        else
            return "You can't vote";
    }
    
    public static String whatSport(String sport)
    {
        if (sport == "Hockey" || sport == "hockey")
            return "You are probably from Canada";
        else if (sport == "Football" || sport == "football")
            return "You are probably from the United States";
        else if (sport == "Soccer" || sport == "soccer" || sport == "Futbol" || sport == "futbol")
            return "You are probably from Europe or South America";
        else
            return "You are probably from a different part of the world";
    }

}
