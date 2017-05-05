package sg.edu.rp.c347.demoexplicitintent;

import java.io.Serializable;

/**
 * Created by 15017171 on 5/5/2017.
 */

//we cannot pass just any type of object in the intent.
// One of the condition of passing object is it must implement Serializable.
// It can be easily done by opening Hero.java and adding implements Serializable.

public class Hero implements Serializable {
    private String name;
    private int strength;
    private int technicalProwess;

    public String getName() {
        return name;
    }
    public int getStrength() {
        return strength;
    }
    public int getTechnicalProwess() {
        return technicalProwess;
    }
    public Hero(String name, int strength,
                int technicalProwess) {
        this.name = name;
        this.strength = strength;
        this.technicalProwess = technicalProwess;
    }
}
