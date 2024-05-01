package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        String dobString = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobString);
        int age = calculateAge(dob);
        System.out.println("Your age is: " + age);
        scanner.close();
    }

    public static int calculateAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }
}
