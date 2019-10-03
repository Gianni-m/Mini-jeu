package com.company;

public class Creature {
    private Espece espece ;
    private int level ;
    private int force ;
    private int life ;
    private int speed ;
    private String name ;
    private Type type;

    public Creature(int level , int life , String name , int force , int speed, Type type  )
    {

        this.level = level;
        this.life = life ;
        this.name = name ;
        this.force = force;
        this.speed = speed;
        this.type = type;

    }

    public int getLife() {
        return this.life ;
    }

    public int getSpeed() {
        return this.speed ;
    }


    public void Ouille(int damages) {
        life = life - damages ;
    }

   public void Levelup () {
        level = level + 1 ;
   }

   public int getDamages() {
        return force * level;
   }









}
