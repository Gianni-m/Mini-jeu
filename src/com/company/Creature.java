package com.company;

public class Creature {
    private int level ;
    private int force ;
    private int life ;
    private int speed ;
    private int forceMult ;
    private String name ;
    private Type type;

    public Creature(int level , int life , String name , int force, int forceMult , int speed, Type type  )
    {

        this.level = level;
        this.life = life ;
        this.name = name ;
        this.force = force;
        this.speed = speed;
        this.type = type;
        this.forceMult = forceMult ;

    }
    public String getName() { return this.name ; }

    public int getLife() {
        return this.life ;
    }

    public int getSpeed() {
        return this.speed ;
    }

    public Type getType() {return this.type ; }

    public int getForce() { return this.force ;}


    public void Ouille(int force , Type type ) {
        if (this.type.isWeak(type) ) {
            life = life - force*2;
        }
        if (this.type.isResistant(type) ) {
            life = life - force/2;
        }
        else life = life - force;
    }

   public void Levelup () {
        level++ ;
        force = force + forceMult ;
   }











}
