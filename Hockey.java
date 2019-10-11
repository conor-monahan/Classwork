
/**
 * Write a description of class Hockey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hockey
{
    // instance variables are the adjectives to describe your object
    private String matchup;
    private int scoreOfHomeTeam;
    private int scoreOfAwayTeam;
    
    // constructor definition
    public Hockey(String match, int scoreOfHome, int scoreOfAway)
    {
        matchup = match;
        scoreOfHomeTeam = scoreOfHome;
        scoreOfAwayTeam = scoreOfAway;
    }
    // mutator method for changing private data
    
    public void setMatchup(String match)

    { matchup = match; }
    
    public void setScoreHome(int scoreOfHome)

    {   scoreOfHomeTeam = scoreOfHome; }
    
    public void setScoreAway(int scoreOfAway)

    {   scoreOfAwayTeam = scoreOfAway; }
    
    public String getMatchup()

    {   return matchup;   }
    
    public int getScoreHome()

    {   return scoreOfHomeTeam;   }
    
    public int getScoreAway()

    {   return scoreOfAwayTeam;   }
}
    
    
    
    
