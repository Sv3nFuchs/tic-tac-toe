# Tic-Tac-Toe:

Multi-player console Tic-Tac-Toe game written in Java.

## How it works:

Two players take turns placing X and O on a 3x3 Tic-Tac-Toe board in the terminal. With every turn, the player enters a row and column number (0 to 2). The board is then reprinted based on this move. After every move, the game checks all rows, columns, and both diagonals for a winner. If the board is full, it detects a tie. After a game is concluded, players can type YES to play again.

## Concepts used:

- 2D arrays to represent the board.
- User input with `Scanner`.
- Loops and methods for turn handling.
- Win and tie detection.
- Separate classes (`TicTacToe` holds the board and game logic, `MyProgram` runs the game loop).

## Running it:

Requires Java 17 or newer.

```
javac *.java
java MyProgram
```

Enter the row, press Enter, then enter the column and press Enter (0 to 2).

## Possible improvements:

- Reject occupied, non-numeric, or out-of-range inputs.
- Add a computer opponent.
- Add a graphical interface.
