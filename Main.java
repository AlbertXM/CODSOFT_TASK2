import java.util.Scanner;

/**
 * Main class that calculates the total marks, average percentage,
 *  and grade based on the marks obtained in subjects.
 * 
 * @author Manamela Machuene Albert
 * @version codsoft Task 2
 */
public class Main 
{

    /**
     * Main method, seen as the entry point of the program.
     * 
     */
    public static void main(String[] args) 
    {
        // Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // asking the user to enter the number of subjects
        System.out.println("Please enter the total number of subjects you want to count: ");
        // Read the number of subjects entered by the user
        int mySubjects = scan.nextInt();

        // Variable for storing the total marks obtained is initialized
        int myMarks = 0;
        // Variable for storing the average percentage
        double myAveragePercentage;
        // Variable for storing the grade
        String grade;

        // looping through each subject to input marks
        for (int i = 1; i <= mySubjects; i++) 
        {
            // Prompting the user to enter marks obtained in each subject
            System.out.println("Enter marks obtained in subject " + i + ":");
            // Reading the marks obtained in the current subject
            int marks = scan.nextInt();
            // Adding the marks obtained in the current subject to the previous total marks 
            myMarks += marks;
        }

        // finding the average percentage upcasting into a double
        myAveragePercentage = (double) myMarks / mySubjects;

        // Assigning a grade according to the conditions of the if statements
        if (myAveragePercentage >= 90)
        {
            grade = "A";
        }
        else if (myAveragePercentage >= 80) 
        {
            grade = "B";
        } 
        else if (myAveragePercentage >= 70) 
        {
            grade = "C";
        } 
        else if (myAveragePercentage >= 60) 
        {
            grade = "D";
        } 
        else 
        {
            grade = "F";
        }

        // Displaying the sum total of marks, average percentage, and grade
        System.out.println("Total Marks: " + myMarks);
        System.out.println("Average Percentage: " + myAveragePercentage);
        System.out.println("Grade: " + grade);

        // Closing the Scanner to prevent resource leak
        scan.close();
    }
}
