import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/31
 * @description ：
 * @version: 1.0
 */
public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-----------------Welcome to Student Management System-------------------");
            System.out.println("1:Add student");
            System.out.println("2:Delete student");
            System.out.println("3:Modify student");
            System.out.println("4:Search student");
            System.out.println("5:Exit");
            System.out.println("Please enter your choice:");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("Exit.");
                    //break loop;
                    System.exit(0);// Stop the virtual machine from running
                }
                default -> System.out.println("Not a valid choice.");
            }
        }
    }

    // Add student
    public static void addStudent(ArrayList<Student> list) {
        // Create student object
        Student s = new Student();

        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("Please enter the student id:");
            id = sc.next();
            boolean flag = contains(list, id);
            if(flag){
                // Indicates that the id already exists and needs to be re-entered
                System.out.println("The id already exists, please re-enter it.");
            }else{
                // Indicates that the id does not exist, indicating that it is possible to use
                s.setId(id);
                break;
            }
        }

        System.out.println("Please enter the name of the student:");
        String name = sc.next();
        s.setName(name);

        System.out.println("Please enter the age of the student:");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("Please enter the address of the student:");
        String address = sc.next();
        s.setAddress(address);


        // Add student to the list
        list.add(s);

        // Inform user
        System.out.println("Student information added successfully.");
    }

    // Delete student
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the student id to be deleted:");
        String id = sc.next();
        // Query id index in collection
        int index = getIndex(list, id);
        // Make a judgment on index
        // If -1, it means it doesn't exist, ending the method and returning to the initial menu.
        if(index >= 0){
            // If it is greater than or equal to 0, it means it exists and is deleted directly.
            list.remove(index);
            System.out.println("Student with id "+ id +" deleted successfully.");
        }else{
            System.out.println("id does not exist, delete failed.");
        }
    }

    // Modify student
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the id of the student you want to modify:");
        String id = sc.next();

        int index = getIndex(list, id);

        if(index == -1){
            System.out.println("The id "+ id +" you want to modify does not exist, please re-enter it.");
            return;
        }

        // When the code executes here, what does it indicate? Indicates that the current id exists.
        // Get the student object to be modified
        Student stu = list.get(index);

        // Enter additional information and modify
        System.out.println("Please enter the name of the student to be modified:");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("Please enter the age of the student to be modified:");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("Please enter the address of the student to be modified:");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("Student Information Modification Successful.");


    }


    // Query student
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("There is no student information at the moment, please add it and then check again.");
            // Finish
            return;
        }

        // Print table header information
        System.out.println("id\t\tName\tAge\tAddress");
        // When the code executes here, it indicates that there is data in the collection
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }


    // Determine if the id exists in the collection
    public static boolean contains(ArrayList<Student> list, String id) {
        // Loop over the collection to get every student object in it.
        return getIndex(list,id) >= 0;
    }

    // Methods to get indexes by id
    public static int getIndex(ArrayList<Student> list, String id){
        // Iterate over the list
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if(sid.equals(id)){
                // If it's the same, then return the index
                return i;
            }
        }
        // When it is not found after the end of the loop, it means it does not exist and returns -1.
        return -1;
    }
}
