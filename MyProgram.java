import java.util.Scanner;

public class MyProgram
{

    public static void playTic()
    {
        Scanner scan = new Scanner(System.in);
        Scanner scanTwo = new Scanner(System.in);
        TicTacToe TicTac = new TicTacToe();
        TicTac.printGameBoard();

        int player = 1;
        while(!TicTac.checkWinner())
        {
            System.out.println("");
            System.out.println("It is now Player " + player + "'s turn. What row and colum would you like to play in?");
            TicTac.play(player, scan.nextInt(), scanTwo.nextInt());
            System.out.println("");
            TicTac.printGameBoard();
            
            if(player == 1)
                player=2;
            else
                player = 1;
        }
        
        System.out.println("");
        if(TicTac.getWinner().equals("Tie."))
             System.out.println("The result was a tie.");
        else
            System.out.println("Congratulations to " + TicTac.getWinner() + ". You won the game!");

    }
    
    public static void main(String[] args)
    {
        boolean continueGame = true;
        while(continueGame)
        {
            playTic();
            System.out.println("Would you like to play again? Type YES or NO.");
            System.out.println("");
            Scanner scanThree = new Scanner(System.in);
            String userInput = scanThree.nextLine();
            if(userInput.equals("YES"))
            {
                continueGame = true;
            }
            else
            {
                continueGame = false;
            }
        }
    }
}
