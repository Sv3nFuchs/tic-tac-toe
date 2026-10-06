public class TicTacToe 
{
    private String[][] gameBoard = new String[3][3];
    private boolean gameOver;
    private String winner;
    
    public TicTacToe()
    {
        for(int r = 0; r < gameBoard.length; r++)
            for(int c = 0; c < gameBoard[0].length; c++)
                gameBoard[r][c] = " ";
        gameOver = false;
    }
    
    public String getWinner()
    {
        return winner;
    }
    
    public boolean getGameOver()
    {
        return gameOver;
    }
    
    public void play(int player, int r, int c)
    {
        String value;
        if(player == 1)
            value = "X";
        else
            value = "O";
        
        while(!gameBoard[r][c].equals(" "))
            r--;
        gameBoard[r][c] = value;
    }
    
    public boolean checkWinner()
    {
        for(int c = 0; c < gameBoard[0].length; c++)
        {
            for(int r = 0; r < 3; r++)
            {
                if(!gameBoard[0][c].equals(" ") &&
                    gameBoard[0][c].equals(gameBoard[1][c])
                    && gameBoard[0][c].equals(gameBoard[2][c]))
                {
                    if(gameBoard[0][c].equals("X"))
                    {
                        gameOver = true;
                        winner = "Player 1";
                        return true;
                    }
                    if(gameBoard[r][c].equals("O"))
                    {
                        gameOver = true;
                        winner = "Player 2";
                        return true;
                    }
                }
            }
        }

        for(int r = 0; r < gameBoard.length; r++)
        {
            for(int c = 0; c < 3; c++)
            {
                if(!gameBoard[r][0].equals(" ") &&
                    gameBoard[r][0].equals(gameBoard[r][1])
                    && gameBoard[r][0].equals(gameBoard[r][2]))
                {
                    if(gameBoard[r][c].equals("X"))
                    {
                        gameOver = true;
                        winner = "Player 1";
                        return true;
                    }
                    if(gameBoard[r][c].equals("O"))
                    {
                        gameOver = true;
                        winner = "Player 2";
                        return true;
                    }
                }
            }
        }

        for(int r = 0; r < 3; r++)
        {
            for(int c = 0; c < 3; c++)
            {
                if(!gameBoard[0][0].equals(" ") && 
                    gameBoard[0][0].equals(gameBoard[1][1])
                    && gameBoard[1][1].equals(gameBoard[2][2]))
                {
                    if(gameBoard[r][c].equals("X"))
                    {
                        gameOver = true;
                        winner = "Player 1";
                        return true;
                    }
                    if(gameBoard[r][c].equals("O"))
                    {
                        gameOver = true;
                        winner = "Player 2";
                        return true;
                    }
                }
            }
        }

        for(int r = 0; r < 3; r++)
        {
            for(int c = 2; c >= 0; c--)
            {
                if(!gameBoard[0][2].equals(" ") && 
                    gameBoard[0][2].equals(gameBoard[1][1])
                    && gameBoard[1][1].equals(gameBoard[2][0]))
                {
                    if(gameBoard[r][c].equals("X"))
                    {
                        gameOver = true;
                        winner = "Player 1";
                        return true;
                    }
                    if(gameBoard[r][c].equals("O"))
                    {
                        gameOver = true;
                        winner = "Player 2";
                        return true;
                    }
                }
            }
        }

        boolean completeTable = true;
        for(String[] row : gameBoard)
            for(String i : row)
                if(i.equals(" "))
                    completeTable = false;

        if(completeTable)
        {
            gameOver = true;
            winner = "Tie.";
            return true;
        }
        return false;
    }

    public void printGameBoard()
    {
        System.out.println("           Col 0:     Col 1:     Col 2:");
        for(int r = 0; r<gameBoard.length; r++)
        {
            System.out.print("Row " + r + ":  | ");
            System.out.println("         |          |          |        ");
            for(int c = 0; c < gameBoard[r].length; c++)
            {
                if(c==0)
                    System.out.print("        |  ");
                System.out.print("   " + gameBoard[r][c] + "    |  ");
            }
            System.out.println();
            System.out.println("        |__________|__________|__________|  ");
        }
    }
}
