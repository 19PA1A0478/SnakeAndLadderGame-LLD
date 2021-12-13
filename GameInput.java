import java.util.*;
import java.util.Scanner;
// To start the game and giving inputs to construct game board

class GameInput{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Let's play the game");
            System.out.println();
            System.out.println("Enter the BoardSize");
            int sizeOfBoard = input.nextInt();

            System.out.println("Please enter number of Dices required");
            int diceCount = input.nextInt();
            Dice dice = new Dice(diceCount);

            System.out.println("Enter the number of snakes required");
            int noOfSnakes = input.nextInt();
        
          // To give Snake Positions
            HashMap<Integer, Snake> snakeMap = new HashMap<Integer, Snake>();
            input.nextLine();
            for (int i = 0; i < noOfSnakes; i++) {
                System.out.println("Enter head and tail position of Snake "+(i+1));
                String[] snakeArray = input.nextLine().split(" ");
                int start = Integer.parseInt(snakeArray[0]);
                int end = Integer.parseInt(snakeArray[1]);
                Snake snakeRef = new Snake(start, end);
                snakeMap.put(start, snakeRef);
            }
            
            System.out.println("Enter the number of ladders required");
            int noOfLadders = input.nextInt();
            
          //To give Ladder positions
            HashMap<Integer, Ladder> LadderMap = new HashMap<Integer, Ladder>();
            input.nextLine();
            for(int i = 0;i<noOfLadders;i++){
                System.out.println("Enter start and end position of Ladder "+(i+1));
                String[] ladderArray = input.nextLine().split(" ");
                int start = Integer.parseInt(ladderArray[0]);
                int end = Integer.parseInt(ladderArray[1]);
                Ladder ladderRef = new Ladder(start,end);
                LadderMap.put(start,ladderRef);
            }


            System.out.println("Enter number Of Players");
            int noOfPlayers = input.nextInt();

            Queue<Player> playersTurn = new LinkedList<>();
            
          
          //To give player names
          
            for(int i =0;i<noOfPlayers;i++){
                System.out.println("Please enter your name");
                String name = input.next();
                Player p = new Player(name);
                playersTurn.add(p);

            }
            GameBoard board = new GameBoard(dice, sizeOfBoard, snakeMap, LadderMap, playersTurn);
            board.PlayerPosition();
        } 
      
      catch (NumberFormatException e) {
            e.printStackTrace();
        }



    }
} 
