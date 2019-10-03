package com.company;

public class Fight {
    public Creature myCreature ;
    public Creature ennemyCreature ;




    public Fight(Creature myCreature, Creature ennemyCreature)
    {
        this.myCreature = myCreature ;
        this.ennemyCreature = ennemyCreature ;
    }




    public String startfight() {
        int myInitiative = myCreature.getSpeed() ;
        int ennemyInitiative = ennemyCreature.getSpeed() ;

        while(isAlive() == true ) {
            System.out.println(myCreature.getLife() + " | " + ennemyCreature.getLife());
            if (myInitiative > ennemyInitiative) {
                ennemyCreature.Ouille(myCreature.getDamages());
                myInitiative = 0 ;
                ennemyInitiative = ennemyCreature.getSpeed() ;
                System.out.println("First");

            }
            else {
                myCreature.Ouille(ennemyCreature.getDamages());
                ennemyInitiative = 0 ;
                myInitiative = myCreature.getSpeed() ;
                System.out.println("Second");

            }

        }
        System.out.println(myCreature.getLife() + " | " + ennemyCreature.getLife());

        if (myCreature.getLife() <= 0 ) {
            return "T nul " ;
        }
        else return "GG" ;

    }



    private Boolean isAlive() {
        if (myCreature.getLife() > 0 && ennemyCreature.getLife() > 0) {
            return true ;
        }

        return false ;
    }




}
