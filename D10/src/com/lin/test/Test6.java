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
If it exists, return true
If it does not exist, return false */
public class Test6 {
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

        // 4. Call the method to see if the id exists
        boolean flag = contains(list, "ct0010");

        // 5. Print results
        System.out.println(flag);

    }

    // 1. What am I going to do?   Find the user by id
    // 2. What do I need to do this to get it done?   list id
    // 3. Do I need to use the result of the method at the call? Returns
    public static boolean contains(ArrayList<User> list, String id){
       /* for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                // Returns true if found
                return true;
            }
        }
        // When the loop finishes indicating that all the elements in the set have been compared and there are no equal ones, then returning false is sufficient.
        return false;*/

        return getIndex(list,id) >= 0;

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
