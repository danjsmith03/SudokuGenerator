/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokugenerator;

/**
 *
 * @author J64880
 */
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
