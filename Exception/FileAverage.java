import java.io.*;

public class FileAverage {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))) {

            String line;
            int sum = 0, count = 0;

            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line);
                sum += num;
                count++;
            }

            System.out.println("Average: " + (sum / count));

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in file");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}