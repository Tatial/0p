import java.util.Scanner;
import task3.Student;
import task3.StudentCollection;

public class Main {
    public static void main(String[] args) {


//task1

       /* task1 task = new task1();


        //int[] Numberz = {10, 5, 9, 3, 12, 8, 20};
        //int result = task.Result(Numberz);
        //System.out.println("Product of the three largest numbers: " + result);

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        if (n < 3) {
            System.out.println("Array must contain at least three elements.");
            scan.close();
            return;
        }


        int[] Numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            Numbers[i] = scan.nextInt();
        }

        // Create an instance of Task1 and call the method
        task1 Task = new task1();
        int result = Task.Result(Numbers);

        System.out.println("Product of the three largest numbers: " + result);
        scan.close();

*/


//task2


        /* task2 palidromeTest = new task2();


        Scanner P = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int userInput = P.nextInt();

        int closestPalindrome = palidromeTest.palindroma(userInput);

        System.out.println("Closest palindrome to " + userInput + " is: " + closestPalindrome);
        P.close();

        */

        //task 3


        StudentCollection studentCollection = new StudentCollection();
        Scanner scanner = new Scanner(System.in);

        //studentCollection.addStudent("Alice", 1);

        // User interaction to add a student
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student ID:");
        int id = scanner.nextInt();
        System.out.println("Enter student score (enter -1 for default):");
        int score = scanner.nextInt();

        // Add student based on input
        if (score == -1) {
            studentCollection.addStudent(name, id);
        } else {
            studentCollection.addStudent(name, id, score);
        }

        scanner.close();

/*   // Display all students
        System.out.println("All students:");
        for (Student student : studentCollection.displayAllStudents()) {
            if (student != null) { // Ensure to skip null entries
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Score: " + student.getPoint());
            }
        }

        // Calculate average score
        double averageScore = studentCollection.getAverageGrade();
        System.out.println("Average score: " + averageScore);
        */

 ///




    }
}

