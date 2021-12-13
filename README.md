# SnakeAndLadderGame-LLD

 ### Problem Statement

Create a snake and ladder application.

The application should take as input (from the command line or a file):

- The size of the board

- Number of Dices.

- Number of snakes (s) followed by s lines each containing 2 numbers denoting the head and tail positions of the snake.

- Number of ladders (l) followed by l lines each containing 2 numbers denoting the start and end positions of the ladder.

- Number of players (p) followed by p lines each containing a name.

After taking these inputs, you should print all the moves in the form of the current player name followed by a random number .

When someone wins the game, print that the player won the game.

### Rules of the game

- Each player has a piece which is initially kept outside the board (i.e., at position 0).

- Each player rolls the dice when their turn comes.

- Based on the dice value, the player moves their piece forward that number of cells.

- A player wins if it exactly reaches the position equal to board size and the game ends there.

- After the dice roll, if a piece is supposed to move outside position of board size, it does not move.

- The board also contains some snakes and ladders.

- Each snake will have its head at some number and its tail at a smaller number.

- Whenever a piece ends up at a position with the head of the snake, the piece should go down to the position of the tail of that snake.

- Each ladder will have its start position at some number and end position at a larger number.

- Whenever a piece ends up at a position with the start of the ladder, the piece should go up to the position of the end of that ladder.

- There could be another snake/ladder at the tail of the snake or the end position of the ladder and the piece should go up/down accordingly.

### Link for Video
https://youtu.be/t-FfhYmdiC8

### Output

![image](https://user-images.githubusercontent.com/60468171/145785986-5991b686-e51f-4941-8f83-78fa81a8ef6d.png)


![image](https://user-images.githubusercontent.com/60468171/145785929-bcb411cd-bf35-431e-8c98-bae5661fa500.png)






