import java.util.Random;

public class Die {
   private String DieType; 
    private int DieSides;
    int CurrentSideUp;

    public Die(){
       
        DieType="d6";
        DieSides=6;
       rollDie();
     

    }
    public Die(int numberSides){
        System.out.println("Creating die with "+numberSides+" sides");
        DieType="d"+numberSides;
        DieSides=numberSides;
        rollDie();
      
        
    }
    public Die(int numberSides,String type){
        DieType=type;
        DieSides=numberSides;
        rollDie();
        
        
    }
    void rollDie() // created function for rolling dies 
    {
       
        Random rand = new Random(); // calling the random function to get a random number  and assinging it to rand variable 
        CurrentSideUp= rand.nextInt(DieSides)+1;// to remove 0
       

    }
    public int getCurrentSideUp(){
        return CurrentSideUp;
    }

}
