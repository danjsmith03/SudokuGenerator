/*
 * Created by: Dan Smith
 * This DifficultyLevel enum is used for the user to be able to select with level they want to play.
 */
package sudokugenerator;

public enum DifficultyLevel
{
    BEGINNER(34), EASY(40), MEDIUM(50), HARD(54), IMPOSSIBLE(60);
    
    private int _difficulty;
    
    private DifficultyLevel(int difficulty)
    { 
        this._difficulty = difficulty; 
    }
    
    public int getDifficultyLevel()
    {
        return _difficulty;
    }
}
