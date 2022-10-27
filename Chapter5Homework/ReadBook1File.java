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
    public static void main(String[] args) throws IOException {
        int sum = 0;
        Scanner inputFile = null;

        //try/catch for file not found exception
        try {
            File myFile = new File("Chapter5Homework/Book1.csv");
            inputFile = new Scanner(new File("Chapter5Homework/Book1.csv"));
            while (inputFile.hasNextLine()){
                String numString = inputFile.nextLine();
                int num = Integer.parseInt(numString);
                sum = sum + num;
                System.out.println(numString);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Can not open or read file.");
        } finally {
            inputFile.close();
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
    }

