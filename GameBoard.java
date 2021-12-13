import java.util.*;
//To construct Game Board we require Snakes, Ladders, boardSize
//To play we require Players and Dices

public class GameBoard {
    private Dice dice;
    private int boardSize;
    private HashMap<Integer, Snake>Snakes;
    private HashMap<Integer, Ladder>Ladders;
    private Queue<Player>playersTurn;
    public GameBoard(Dice dice,int boardSize,HashMap<Integer, Snake>Snakes, HashMap<Integer, Ladder>Ladders,Queue<Player>playersTurn ){
        this.dice = dice;
        this.boardSize = boardSize;
        this.Snakes = Snakes;
        this.Ladders = Ladders;
        this.playersTurn = playersTurn;
    }
  
  
  // Here we written a method named PlayerPosition is used to set Position of the player for every chance of playersTurn.
  //For number of players we used a queue
  
    public void PlayerPosition(){
        while(true){
            Player p = playersTurn.poll();//returns and removes the PlayersTurn
            int prevpos = p.getPlayerLocation();
            int newpos = prevpos+dice.diceRoll();
          
            if(newpos <= boardSize){
              //To check the current position contains snake or not
                if(Snakes.containsKey(newpos)){
                    System.out.println("OOPs! "+p.getName()+" you are bitten by snake");
                    Snake ref = Snakes.get(newpos);
                    newpos = ref.getEnd();
                }
               //To check the current position contains Ladder or not
                else if(Ladders.containsKey(newpos)){
                    System.out.println("Hurray! "+p.getName()+" you got a ladder");
                    Ladder ref = Ladders.get(newpos);
                    newpos = ref.getEnd();
                }
                prevpos = newpos;
                System.out.println(p.getName()+"  your current position is  "+newpos);
              
              //if the player is at boardSize the player won the game.
                if(prevpos == boardSize){
                    System.out.println();
                    System.out.println(p.getName() + "  won the Game!!");
                    break;
                }
                p.setPlayerLocation(newpos);
            }
            playersTurn.add(p);


        }
    }
    
}
