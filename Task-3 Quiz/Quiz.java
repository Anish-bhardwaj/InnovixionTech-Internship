import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println();
        System.out.println("-------------------------------------Welcome to the Quiz World!-------------------------------------");
            // Question 1
            System.out.println();
            System.out.println("Question 1: Who is the creater of C language?");
            System.out.println("a. Dennis Ritchie");
            System.out.println("b. Bjarne Stroustrup");
            System.out.println("c. James Gosling");
            System.out.println("d. None of the above");
            String answer1 = sc.nextLine().toLowerCase();
            if (answer1.equals("a")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("OOPS, the correct answer is Dennis Ritchie.");
            }

            // Question 2
            System.out.println();
            System.out.println("Which SQL statement is used to extract data from a database?");
            System.out.println("a. Select");
            System.out.println("b. Extract");
            System.out.println("c. Open");
            System.out.println("d. Get");
            String answer2 = sc.nextLine().toLowerCase();
            if (answer2.equals("a")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("OOPS, the correct answer is Select.");
            }

            // Question 3
            System.out.println();
            System.out.println("Question 3: With SQL, how do you select a column named \"FirstName\" from a table named \"Persons\"?");
            System.out.println("a. EXTRACT FirstName FROM Persons");
            System.out.println("b. SELECT Persons.FirstName");
            System.out.println("c. SELECT FirstName FROM Persons  ");
            System.out.println("d. SELECT * FROM Persons");
            String answer3 = sc.nextLine().toLowerCase();
            if (answer3.equals("c")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is SELECT FirstName FROM Persons .");
            }

            // Question 4
            System.out.println();
            System.out.println("Question 4: With SQL, how do you select all the records from a table named \"Persons\" where the value of the column \"FirstName\" is \"Peter\"?");
            System.out.println("a. SELECT * FROM Persons WHERE FirstName<>'Peter'");
            System.out.println("b. SELECT [all] FROM Persons WHERE FirstName LIKE 'Peter'");
            System.out.println("c. SELECT [all] FROM Persons WHERE FirstName='Peter");
            System.out.println("d. SELECT * FROM Persons WHERE FirstName='Peter'");
            String answer4 = sc.nextLine().toLowerCase();
            if (answer4.equals("d")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is SELECT * FROM Persons WHERE FirstName='Peter'");
            }

            // Question 5
            System.out.println();
            System.out.println("Question 5: Which SQL keyword is used to sort the result-set?");
            System.out.println("a. ORDER BY");
            System.out.println("b. GROUP BY");
            System.out.println("c. BETWEEN");
            System.out.println("d. SORT");
            String answer5 = sc.nextLine().toLowerCase();
            if (answer5.equals("a")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is ODRER BY.");
            }

            //Question 6
            System.out.println();
            System.out.println("Question 6: Which method is used to find the length of an array(arr) in java?");
            System.out.println("a. arr.len()");
            System.out.println("b. arr.length()");
            System.out.println("c. arr.length");
            System.out.println("d. arr.size()");
            String answer6 = sc.nextLine().toLowerCase();
            if (answer6.equals("c")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is arr.length.");
            }
            //Question 7
            System.out.println();
            System.out.println("Question 7: Which statement is true about class?");
            System.out.println("a. Class is an user defined data type.");
            System.out.println("b. Class is blue print of an object.");
            System.out.println("c. Class can  extend another class.");
            System.out.println("d. All of the above");
            String answer7 = sc.nextLine().toLowerCase();
            if (answer7.equals("d")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry, the correct answer All of the above.");
            }
            //Question 8
            System.out.println();
            System.out.println("Question 8: Which type of inheritance is not supported in java?");
            System.out.println("a. Single");
            System.out.println("b. Multiple");
            System.out.println("c. Multilevel");
            System.out.println("d. Hierarchical");
            String answer8 = sc.nextLine().toLowerCase();
            if (answer8.equals("b")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is multiple.");
            }
            //Question 9
            System.out.println();
            System.out.println("Question 9: Which class is the parent class of all the classes in java by default?");
            System.out.println("a. String");
            System.out.println("b. System");
            System.out.println("c. Object");
            System.out.println("d. Exception");
            String answer9 = sc.nextLine().toLowerCase();
            if (answer9.equals("c")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is object.");
            }
            //Question 10
            System.out.println();
            System.out.println("Question 10: How to create an object of class \"Person\" in java ");
            System.out.println("a. Person obj;");
            System.out.println("b. Person obj()");
            System.out.println("c. Person obj=new Person()");
            System.out.println("d. Person obj=new obj()");
            String answer10 = sc.nextLine().toLowerCase();
            if (answer10.equals("c")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is Person obj=new Person().");
            }
            // Display final score & Wishes
            System.out.println();
            System.out.println("Your final score is: " + score+"/ 10");
            System.out.println("thank you to participate ");
            System.out.println();
            sc.close();

        }
    }