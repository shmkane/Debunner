import Universe.Galaxy.Earth.NA.USA.NC.humans;

public class Debunning extends Humans{
	
public static void main(String args[]) {
    Daniel dan = HumanFinderAPI.findHuman("Dan K____");
    Scissors s = new RustyScissors();
    if(dan == null) {
	    //Should never happen since this person exists.
	    exit(1);
    }
  
    try{
    	deBun(dan, s);
    }catch(AngryDanielException ade) {
	    // Run!
    }
}

public boolean isBunned(Daniel dan) {
    return dan.hasBun();
}

public void deBun(Daniel dan, Scissors s) throws AngryDanielException{

    if(isBunned(dan)) {
      
        Bun b = (HoneyBun) dan.getBun(); // get casted to a honey bun nerd!
        s.cut(b); //Later!
		if(dan.isAnrgry)
			throw new AngryDanielException("You call this a haircut?!");
	
     }else{
 
        System.out.println("This is already a real man. No buns found here");
        System.out.println("Look for a new Daniel BunManiel");
    }
  
}

}
