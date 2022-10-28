package Chapter5Homework;
/**
 * Class: ReadBook1File
 * Author: Cristian Cortez
 * Course:ITEC 2150 section 03
 * Version: 1.0
 * Description: Write a Java program to read in the 10 numbers in the example file Book1.csv provided above.
 * The program should sum all the numbers, find the lowest number, find the highest number, and computer the average.
 * Upon completion of the processing, the program should write a new text file named stats.txt
 * with the information found in the following format where xxx represents a number calculated above.
 */
import java.io.*;
import java.util.*;

public class ReadBook1File {
    public static void main(String[] args) {
        Scanner inputFile = null;
        int sum = 0;
        int max = 0;
        int min = 0;
        double average = 0;
        String regex = ",";

        //try/catch for file not found exception
        try {
            inputFile = new Scanner(new File("src/Chapter5Homework/Book1.csv"));
            inputFile.useDelimiter(regex);
            while (inputFile.hasNext()) {
                String numString = inputFile.next();
                int num = Integer.parseInt(numString);
                sum = sum + num;

                if (sum > max) {
                    max = num;
                } else if (sum < max){
                    min = num;
                } else if (sum == 55){
                    average = sum / 10;
                }
                System.out.print(numString);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Can not open or read file.");
        } finally {
            inputFile.close();
        }
        System.out.println();
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The Lowest Number is: " + min);
        System.out.println("The Highest number is: " + max);
        System.out.println("The average of the numbers is: " + average);


    }
}

