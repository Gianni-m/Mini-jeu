package com.company;

import java.util.ArrayList;
import java.util.List;

public class Type {
    private String name ;
    //private List<Type> weakness = new ArrayList<>;
    //private List<Type> strength = new ArrayList<>;


    public Type (String name) {
        //, List<Type> weakness , List<Type> strength
        this.name = name;
        //this.strength = strength ;
        //this.weakness = weakness;
    }


    public String getName()
    {
        return this.name;
    }
    public Boolean isWeak(Type type)
    {
        if(this.name.equals("Feu") && type.getName().equals("Eau"))
           return true;
        if(this.name.equals("Eau") && type.getName().equals("Plante"))
            return true;
        if(this.name.equals("Plante") && type.getName().equals("Feu"))
            return true;
        return false;
    }

    public Boolean isResistant(Type type )
    {
        if(this.name.equals("Eau") && type.getName().equals("Feu") )
            return true ;
        if(this.name.equals("Feu") && type.getName().equals("Plante") )
            return true ;
        if(this.name.equals("Plante") && type.getName().equals("Eau") )
            return true ;
        return false;

    }
}

