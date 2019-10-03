package com.company;

public class Main {

    public static void main(String[] args) {
        Creature myCreature = new Creature(1,30,"Michou", 10,12,"eau");
        Creature ennemyCreature = new Creature(1,30,"Patrick", 20,10),"feu";
        Fight fight = new Fight(myCreature, ennemyCreature);
        System.out.println(fight.startfight());
    }


    public Creature generateCreature(Creature myCreature)
    {

    }
}
