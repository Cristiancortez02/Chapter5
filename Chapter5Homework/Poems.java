package Chapter5Homework;

/**
 * Class: Poems
 * Author: Cristian Cortez
 * Course:ITEC 2150 section 03
 * Version: 1.0
 * Description: Write a Java program to read in the 10 numbers in the example file Book1.csv provided above.
 * The program should sum all the numbers, find the lowest number, find the highest number, and computer the average.
 * Upon completion of the processing, the program should write a new text file named stats.txt with the information
 * found in the following format where xxx represents a number calculated above.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Poems extends Poem{
    public static void main(String[] args) throws IOException {
        //create file
        File file1 = new File("src/Chapter5Homework/Poem.txt");
        //create PrintWriter to open and write in file
        PrintWriter pw1 = new PrintWriter("Poem.txt");

        //create objects and set names and poets for each object
        Poem p1 = new Poem();
        p1.setName("We Real Cool");
        p1.setPoet("Gwendolyn Brooks");
        pw1.print(p1);
        Poem p2 = new Poem();
        p2.setName("I Know Why the Caged Bird Sings");
        p2.setPoet("Maya Angelou");
        pw1.print(p2);
        Poem p3 = new Poem();
        p3.setName("Hope is the Thing with Feathers");
        p3.setPoet("Emily Dickinson");
        pw1.print(p3);
        Poem p4 = new Poem();
        p4.setName("The Road Not Taken");
        p4.setPoet("Robert Frost");
        pw1.print(p4);

        //read from text file

        try {
            File file = new File("src/Chapter5Homework/Poem2.txt");
            try (Scanner sc = new Scanner(file);) {
                while (sc.hasNextLine()) {
                    String p = sc.nextLine();
                    System.out.println(p);
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println("error " + e);
        }
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }
}
