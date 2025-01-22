package com.lin.test1;

import java.util.Random;

/**
 * @author ：lin
 * @date ：Created in 2025/1/22
 * @description ：
 * @version: 1.0
 */
public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }


    // Define a method for attacking someone
    // Think: who attacks whom?
    // Role r1 = new Role();
    // Role r2 = new Role();
    // r1.attack(r2).
    // The caller of the method goes to attack the parameter
    public void attack(Role role) {
        // Calculation of damage done 1 ~ 20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        // Remaining blood
        int remainBlood = role.getBlood() - hurt;
        // Do a validation of the remaining blood, and if it's negative, change it to 0.
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        // Modify the blood level of the person getting punched
        role.setBlood(remainBlood);

        // this represents the caller of the method
        System.out.println(this.getName() + " raises his fist and hits " + role.getName() + " for " + hurt + " points of damage, " +
                role.getName() + " has " + remainBlood + " points of blood remaining.");
    }
}
