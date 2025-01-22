package com.lin.test1;

/**
 * @author ：lin
 * @date ：Created in 2025/1/22
 * @description ：
 * @version: 1.0
 */
public class GameTest {
    public static void main(String[] args) {
        // 1. Create your first role
        Role r1 = new Role("Tom",100);
        // 2. Create a second role
        Role r2 = new Role("Jerry",100);

        // 3. Start fighting Round game
        while(true){
            // r1 starts attacking r2
            r1.attack(r2);
            // Determine how much blood is left in r2
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + " defeated " + r2.getName() + ".");
                break;
            }

            // r2 starts attacking r1.
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + " defeated " + r1.getName() + ".");
                break;
            }
        }
    }
}
