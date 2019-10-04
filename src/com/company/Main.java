package com.company;

public class Main {

    public static void main(String[] args) {
        Creature myCreature = new Creature(1,30,"Michou", 10,1, 10,new Type ("Eau"));
        Creature enemyCreature = new Creature(1,50,"Patrick", 20, 1, 10 , new Type( "Feu"));
        Fight fight = new Fight(myCreature, enemyCreature);
        System.out.println(fight.startfight());
    }


    /*public Creature generateCreature(Creature myCreature)
    {

    }*/




}
