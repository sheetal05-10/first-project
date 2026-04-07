import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter marks of 5 subjects:");

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;

        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        // Grade System using if-else
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        // Pass/Fail check
        if (m1 < 33 || m2 < 33 || m3 < 33 || m4 < 33 || m5 < 33) {
            System.out.println("Status: Fail (One or more subjects below 33)");
        } else {
            System.out.println("Status: Pass");
        }

        // Extra condition
        if (percentage >= 90) {
            System.out.println("Excellent Performance 🎉");
        } else if (percentage >= 75) {
            System.out.println("Very Good 👍");
        } else if (percentage >= 50) {
            System.out.println("Good 😊");
        } else {
            System.out.println("Need Improvement 📚");
        }

        sc.close();
    }
}