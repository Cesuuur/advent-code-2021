import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1prueba {

    static String pathFile = "/Users/cxb0419/IdeaProjects/advent-code-2021/bin/sonar";

    public static String ReadLine() {
        try {
            File myObj = new File(day1prueba.pathFile);
            Scanner myReader = new Scanner(myObj);
            if (myReader.hasNextLine()) {
                return myReader.nextLine();
            } else {
                myReader.close();
                return null;
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String line;
        Integer before = null;
        Integer counter = 0;
        do {
            line = day1prueba.ReadLine();
            try {
                int number = Integer.parseInt(line);
                before = number;
                if(before == null)
                    continue;
                if(number > before){
                    counter++;
                }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        } while (line != null);
        System.out.println(counter);
    }
}
