package com.lin.test6;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        /* Define an array of length 3, the array stores 1~3 student objects as initial data, the student objects have different student numbers and names.
        Attributes of the student: school number, name, age.
        Requirement 1: Add a student object again and make a uniqueness determination of the student number when adding it.
        Requirement 2: After adding, iterate through all the student information.

        Requirement 3: Delete student information by id
        If it exists, it is deleted, if it does not exist, the deletion fails.
        Requirement 4: After deletion, iterate through all the student information.
        Requirement 5: Query the student whose id is “luna”, if it exists, add his age + 1 year. */


        // 1.Create an array to store student objects
        Student[] arr = new Student[3];
        // 2.Create a student object and add it to the array
        Student stu1 = new Student(1, "tom", 23);
        Student stu2 = new Student(2, "jerry", 24);

        // 3.Add Student Objects to an Array
        arr[0] = stu1;
        arr[1] = stu2;


        // Requirement 1: Add a student object again and make a uniqueness determination of the student number when adding it.
        Student stu4 = new Student(3, "luna", 26);

        // Uniqueness judgment
        // already exists --- no need to add
        // Does not exist --- then you can add the student object to the array.
        boolean flag = contains(arr, stu4.getId());
        if(flag){
            // Already exists -- no need to add
            System.out.println("The current id is duplicated, please change the id and then add again.");
        }else{
            // Not present --- then can add the student object to the array
            // Add stu4 to the array.
            // 1. The array is full --- can only create a new array, the length of the new array = the old array + 1
            // 2. The array is not full --- just add it.
            int count = getCount(arr);
            if(count == arr.length){
                // Already full
                // Create a new array, length = length of old array + 1
                // Then copy the elements of the old array into the new one.
                Student[] newArr = creatNewArr(arr);
                // Add stu4 to the list.
                newArr[count] = stu4;

                // Requirement 2: After adding, iterate through all the student information.
                printArr(newArr);

            }else{
                // [stu1,stu2,null]
                // [stu1,stu2,null]
                // getCount is 2, which means there are already 2 elements in the array.
                // There's another layer of meaning: if want to add data next time, add it at index 2.
                arr[count] = stu4;
                // Requirement 2: After adding, iterate through all the student information.
                printArr(arr);

            }
        }
    }


    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
            }
        }
    }

    // Create a new array, length = length of old array + 1
    // Then copy the elements of the old array into the new one.
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];

        // Loop traversal to get every element in the old array
        for (int i = 0; i < arr.length; i++) {
            // Adds elements from the old array to the new one.
            newArr[i] = arr[i];
        }

        // Return the new array
        return newArr;

    }

    // Define a method to determine how many elements have been stored in an array.
    public static int getCount(Student[] arr){
        // Define a counter to count
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        // Once the loop is over, I know how many elements are in the array
        return count;
    }


    // 1. What am I going to do?  Uniqueness judgment
    // 2. What do I need to do this thing in order to accomplish it? Array id
    // 3. Does the caller need to continue to use the result of the method? Must return
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            // Get each student object in the array in turn.
            Student stu = arr[i];
            if(stu != null){
                // Get the id of the student object in the array
                int sid = stu.getId();
                // Compare
                if(sid == id){
                    return true;
                }
            }
        }

        // When the loop ends and the same has not been found, then it means that the id to be found in the array does not exist.
        return false;
    }
}
