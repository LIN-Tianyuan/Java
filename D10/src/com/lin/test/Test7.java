package com.lin.test;

import java.util.ArrayList;

/**
 * @author ：lin
 * @date ：Created in 2025/1/25
 * @description ：
 * @version: 1.0
 */

/* Requirements:
1. Define a collection in the main method that deposits three user objects.
      The user attributes are: id, username, password
2. Requirement: define a method to find the corresponding user information based on id.
      If it exists, return the index.
      If it does not exist, return -1
*/
public class Test7 {
    public static void main(String[] args) {
        // 1. Create a collection
        ArrayList<User> list = new ArrayList<>();

        // 2. Create three user objects
        User u1 = new User("ct001","tom","123456");
        User u2 = new User("ct002","alex","12345678");
        User u3 = new User("ct003","luna","1234qwer");

        // 3. Add the user object to the collection
        list.add(u1);
        list.add(u2);
        list.add(u3);

        // 4. Find Index
        int index = getIndex(list, "ct004");

        // 5. Print
        System.out.println(index);

    }


    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                return i;
            }
        }

        return -1;
    }
}
