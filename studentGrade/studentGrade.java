import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {

    public static int[][] getScores(int students, int numberOfSubjects) {
        Scanner userInput = new Scanner(System.in);

        int[][] studentScores = new int [students][numberOfSubjects];
        for (int student = 0; student < students; student++) {
            System.out.println("\n-------------------------");
            for (int count = 0; count < numberOfSubjects; count++) { 
                System.out.printf("Entering score for student %d...%n", (student + 1));
                System.out.printf("Enter score for subject %d:%n", (count + 1));

                // constraint handling
                while (!userInput.hasNextInt()){
                    userInput.next();
                    System.out.println("Input must be an integer. Try again: ");
                }

                int score = userInput.nextInt();
                while (score < 0 || score > 100) {
                    System.out.println("Input must be between 0 and 100. Try again: ");
                    while(!userInput.hasNextInt()) {
                        System.out.println("Input must be an integer. Try again: ");
                        userInput.next();
                    }
                    score = userInput.nextInt();
                }

                studentScores[student][count] = score;

                System.out.println("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved successfully");

                }
            }

        return studentScores;
    }


    public static void printResults(int[][] studentScores) {

        int students = studentScores.length;
        int numberOfSubjects = studentScores[0].length;

        int[] totals = new int[students];
        for (int student = 0; student < students; student++) {
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                totals[student] += studentScores[student][subject];
            }
        }

        int[] positions = new int[students];
        for (int student = 0; student < students; student++) {
            int rank = 1;
            for (int otherStudent = 0; otherStudent < students; otherStudent++) {
                if (totals[otherStudent] > totals[student]) rank++;
            }
            positions[student] = rank;
        }

        System.out.println("-------------------------");
        System.out.println("\n=====================================================");
        System.out.printf("%-14s", "STUDENT");
        for (int subject = 0; subject < numberOfSubjects; subject++) {
            System.out.printf("%-6s", "SUB" + (subject + 1));
        }


        System.out.printf("%-6s%-8s%-5s%n", "TOT", "AVE", "POS");
        System.out.println("=====================================================");

        for (int student = 0; student < students; student++) {
            System.out.printf("%-14s", "Student " + (student + 1));
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                System.out.printf("%-6d", studentScores[student][subject]);
            }

            double average = (double) totals[student] / numberOfSubjects;
            System.out.printf("%-6d%-8.2f%-5d%n", totals[student], average, positions[student]);
        }
        System.out.println("=====================================================");
    }

    public static void printSubjectSummary(int[][] studentScores) {

        int students = studentScores.length;
        int numberOfSubjects = studentScores[0].length;
        int lowest = studentScores.length;
        int hardestSubject = 0;
        int easiestSubject;

        System.out.println("\nSUBJECT SUMMARY");
        System.out.println("---------------\n");
        for (int subject = 0; subject < numberOfSubjects; subject++) {
            int highScore = studentScores[0][subject];
            int lowScore = studentScores[0][subject];
    
            int highStudent = 0;
            int lowStudent = 0;
            int subTotal = 0;
            int passes = 0;
            int failures = 0;

            for (int student = 0; student < numberOfSubjects; student++) {
                int score = studentScores[student][subject];
                subTotal += score;
                if (score > highScore) { 
                    highScore = score; highStudent = student;
                }
                if (score < lowScore) { 
                    highScore = score; highStudent = student;
                }
                if (score >= 50) passes++;
            }
            failures = students - passes;

            if (failures > passes) {
                lowest = passes;
                hardestSubject = subject;
            }

            System.out.printf("Subject %d:%n", subject + 1);
            System.out.println("-----------");
            System.out.printf("Highest scoring student is:  Student %d scoring %d%n", highStudent + 1, highScore);
            System.out.printf("Lowest Scoring student is: student %d scoring %d%n", lowStudent + 1, lowScore);
            System.out.printf("Total Score is:  %d%n", subTotal);
            System.out.printf("Average score is: %.2f%n", (double) subTotal / students);
            System.out.printf("Number of passes: %d%n", passes);
            System.out.printf("Number of Fails: %d%n", students - passes);
        }

        System.out.printf("The hardest subject is Subject %d with %d failures", hardestSubject + 1, lowest);
        System.out.printf("The easiest subject is Subject %d with %d passes", );
        System.out.printf("The hardest subject is Subject %d with %d failures", );

    }


    public static void printClassSummary() {


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you have? ");
        int students = scanner.nextInt();

        System.out.print("How many subjects do they offer? ");
        int numberOfSubjects = scanner.nextInt();

        int[][] studentScores = getScores(students, numberOfSubjects);
        printResults(studentScores);
        printSubjectSummary(studentScores);



//
//        // --- Class summary ---
//        int bestTotal = totals[0], worstTotal = totals[0];
//        int bestStudent = 0, worstStudent = 0, classTotal = 0;
//        for (int s = 0; s < numStudents; s++) {
//            classTotal += totals[s];
//            if (totals[s] > bestTotal)  { bestTotal  = totals[s]; bestStudent  = s; }
//            if (totals[s] < worstTotal) { worstTotal = totals[s]; worstStudent = s; }
//        }
//
//        System.out.println("\nCLASS SUMMARY");
//        System.out.println("=".repeat(50));
//        System.out.printf("Best Graduating Student is: Student %d scoring %d%n", bestStudent + 1, bestTotal);
//        System.out.println("=".repeat(50));
//        System.out.println("!".repeat(50));
//        System.out.printf("Worst Graduating Student is: Student %d scoring %d%n", worstStudent + 1, worstTotal);
//        System.out.println("!".repeat(50));
//        System.out.println("=".repeat(50));
//        System.out.printf("Class total score is: %d%n", classTotal);
//        System.out.printf("Class Average score is: %.1f%n", (double) classTotal / numStudents);
//        System.out.println("=".repeat(50));
    }
}
