//For every player we need a name and position of the player in game.
//Thus Player class contains name and location as memeber variables.
public class Player {
    private String name;
    private int location;
    public Player(String name){
        this.name = name;
    }
  //To get player name
    public String getName(){
        return name;
    }
    public void  setPlayerLocation(int pos){
        this.location = pos;
    }
    public int getPlayerLocation(){
        return this.location; 
    }
    
}
