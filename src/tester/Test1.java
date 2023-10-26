package tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             BufferedReader br = new BufferedReader(
                     new FileReader("C:\\Users\\Kshitij\\OneDrive\\Documents\\Core Java\\day15-data\\day15_help\\sequence.txt"));
             PrintWriter pw = new PrintWriter("C:\\Users\\Kshitij\\OneDrive\\Documents\\copy.txt"))
        {	br.lines()
        	.filter(line->line.length()>40)
        	.forEach(line->System.out.println(line));
        
            br.lines().forEach(lin -> pw.println(lin));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
