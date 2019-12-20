import Universe.Galaxy.Earth.NA.NC.humans.Daniels;

public class Debunning extends Humans{

public boolean isBunned(Daniel dan) {
    return dan.hasBun();
}

public void deBun(Daniel dan) {

    if(isBunned(dan)) {
      
        Bun b = (HoneyBun) dan.getBun(); //get casted to a honey bun nerd
        Scissors s = new RustyScissors();
          
        try{
             s.cut(b); //Later loser
        }catch(AngryDaniel ad) {//Something's gone wrong, dan's mad!

            System.out.println("Error: Something went wrong. Error Code: ");
            System.out.println(ad.getExeption());
        }
	
        }else{
 
            System.out.println("This is already a real man. No buns found here");
            System.out.println("Look for a new Daniel BunManiel");
        }
  
    }

}
