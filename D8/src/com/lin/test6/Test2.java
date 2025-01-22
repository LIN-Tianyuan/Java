package com.lin.test6;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        /* Define an array of length 3, the array stores 1~3 student objects as initial data, the student objects have different student number, name.
        Attributes of students: student number, name, age.

        Requirement 3: Delete student information by id
            If it exists, it will be deleted. If it does not exist, the deletion fails.
        Requirement 4: Iterate through all student information after deletion is complete.

        Requirement 5: Query the student whose id is “2”, if it exists, add his age + 1 year. */


        // 1. Create an array to store the student objects.
        Student[] arr = new Student[3];
        // 2. Create a student object and add it to the array.
        Student stu1 = new Student(1, "tom", 23);
        Student stu2 = new Student(2, "luna", 24);
        Student stu3 = new Student(3, "jerry", 25);

        // 3. Add student objects to the array.
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        /* Requirement 3: Delete student information by id
        If it exists, it is deleted, if it doesn't exist, the deletion fails. */

        // To find the index corresponding to the id in the array
        int index = getIndex(arr, 2);
        if (index >= 0){
            // Delete if present
            arr[index] = null;
            // Iterate over the array
            printArr(arr);
        }else{
            // If it does not exist, the deletion fails
            System.out.println("Current id does not exist, delete failed.");
        }
    }



    // 1. What am I going to do?  Find the index of the id in the array
    // 2. What do I need? Array id
    // 3. Do I need to continue using the result of the method at the call? Do I need to
    public static int getIndex(Student[] arr , int id){
        for (int i = 0; i < arr.length; i++) {
            // Get each student object in turn
            Student stu = arr[i];
            // Perform a non-null judgment on stu
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return i;
                }
            }
        }

        // When the loop ends and it is not found, it means it does not exist.
        return -1;
    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
            }
        }
    }
}
