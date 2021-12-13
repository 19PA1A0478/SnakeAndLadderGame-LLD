
public class Dice {
    private int NoOfDices = 0;
    Dice(int NoOfDices){
        this.NoOfDices = NoOfDices;
    }
    public int diceRoll(){
        return ((int)(Math.random()*(6*NoOfDices-1*NoOfDices)))+1;
    }
}
