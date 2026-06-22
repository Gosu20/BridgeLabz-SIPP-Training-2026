import java.io.*;
import java.util.*;

public class StudentReport {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));

                // true => append mode
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(outputFile, true))
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int total = 0;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double average = (double) total / (data.length - 1);

                bw.write("Student Name : " + name);
                bw.newLine();

                bw.write("Average Marks: " + String.format("%.2f", average));
                bw.newLine();

                bw.write("----------------------------");
                bw.newLine();
            }

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {

            System.out.println("Input file not found: " + inputFile);

        } catch (IOException e) {

            System.out.println("Error while processing files.");
        }
    }
}