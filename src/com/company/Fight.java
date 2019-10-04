package com.company;

public class Fight {
    public Creature myCreature ;
    public Creature enemyCreature ;




    public Fight(Creature myCreature, Creature enemyCreature)
    {
        this.myCreature = myCreature ;
        this.enemyCreature = enemyCreature ;
    }




    public String startfight() {
        int myInitiative = myCreature.getSpeed() ;
        int enemyInitiative = enemyCreature.getSpeed() ;

        while(isAlive() ) {
            System.out.println(myCreature.getLife() + " | " + enemyCreature.getLife());
            if (myInitiative > enemyInitiative) {
                enemyCreature.Ouille(myCreature.getForce(), myCreature.getType());
                myInitiative = 0 ;
                enemyInitiative = enemyCreature.getSpeed() ;
                System.out.println("First");

            }
            else {
                myCreature.Ouille(enemyCreature.getForce() , enemyCreature.getType());
                enemyInitiative = 0 ;
                myInitiative = myCreature.getSpeed() ;
                System.out.println("Second");

            }

        }
        System.out.println(myCreature.getLife() + " | " + enemyCreature.getLife());

        if (myCreature.getLife() <= 0 ) {
            return "T nul " ;
        }
        else{
            myCreature.Levelup();
            System.out.println (myCreature.getName() + "\n est monté au niveau " + myCreature.getLife() ) ;
            return "GG" ;}

    }



    private Boolean isAlive() {
        if (myCreature.getLife() > 0 && enemyCreature.getLife() > 0) {
            return true ;
        }

        return false ;
    }




}
