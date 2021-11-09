package de.unistuttgart.iste.sqa.pse.sheet03.homework;
import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 * This class implements the mysterious hamster from exercise 1.
 * Notice that something is horribly wrong with the name of this class...
 * You do not need to alter anything in this class. Well, perhaps except for its name...
 */
public final class mysterioushamster {
    private Integer stepCounter = 0;
    private Hamster hamster;

    /**
     * This constructor allows to access methods of a mysterous hamster on a specified hamster.
     * @param hamster A mysterioshamster-object will be created from this hamster.
     */
    public mysterioushamster(final Hamster hamster){
        this.hamster = hamster;
    }

    /**
     * Please describe this method here.
     */
    void doSomething1(){
        hamster.turnLeft();
    }

    /**
     * Please describe this method here.
     */
    void doSomething2(){
        hamster.move();
        stepCounter++;
        hamster.write("I have already walked " + stepCounter + " steps.");
    }
    
    /**
     * Please describe this method here.
     */
    void doSomething3(){
        hamster.turnLeft();
        hamster.turnLeft();
        hamster.turnLeft();
    }

    /**
     * Please describe this method here.
     */
    void doSomething4(){
        hamster.turnLeft();
        hamster.turnLeft();
    }
    
    /**
     * Please describe this method here.
     */
    int doSomething5(){
        return stepCounter;
    }
    
    /**
     * Please describe this method here.
     */
    void doSomething6(){
        hamster.write(stepCounter.toString());
    }
    
    /**
     * Please describe this method here.
     */
    void doSomething7(){
        hamster.pickGrain();
    }

    /**
     * Please describe this method here.
     */
    void doSomething8(){
        hamster.write("I'm done! :)");
    }

    /**
     * Please describe this method here.
     */
    void doSomething9(){
        hamster.move();
        stepCounter++;
        boolean hadGrain = !hamster.mouthEmpty();
        while(!hamster.mouthEmpty()){
            hamster.putGrain();
        }
        hamster.move();
        stepCounter++;
        if(hadGrain){
            hamster.write("Oops! I guess I was too fast there!");
        }
    }
    /**
     * This method is used to grant mysterioushamster-objects access the {@link Hamster#write(String)} method.
     * @param text This text will be printed out in the game log.
     */
    void write(final String text){
        hamster.write(text);
    }
}
