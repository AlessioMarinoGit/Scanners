import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Average each row of ten test scores
 */
public class ScannerReadCSVFile
{
    public void run() throws FileNotFoundException {
        File dataFile = new File("TestScoresByClass.csv");

        Scanner scanner = new Scanner(dataFile);
        scanner.useDelimiter("\n");

        int i = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            
            if (i != 1) {                
                Scanner scanline = new Scanner(line);
                scanline.useDelimiter(",");
                int classroom = 0;
                boolean setclass = false;
                int avg = 0;
                int grades = 0;
                while (scanline.hasNextInt()) {
                    if (setclass == false) {
                        classroom = scanline.nextInt();
                        setclass = true;
                    } else {
                        avg += scanline.nextInt();
                        grades++;
                    }
                }
                System.out.println(classroom + ": " + avg/grades);
            }
            i++;
        }
    }

    public static void main (String[] args) {
        try {
            ScannerReadCSVFile srCsv = new ScannerReadCSVFile();
            srCsv.run();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("There's an error someplace. Try using the debugger to find it!");

        }
    }
}
