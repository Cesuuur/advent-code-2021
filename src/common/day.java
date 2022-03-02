//package common;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Optional;
//import java.util.Scanner;
//
///* Common class to each day challenge */
//public abstract class day {
//
//    private final int year = 2021;
//    private final int day;
//
//    public day (int day) {
//        this.day = day;
//    }
//
//    /**
//     * Open a file, return one file line.
//     * @param pathFile
//     * @return Scanner object
//     */
//    public Scanner readLineByLine (String pathFile) throws FileNotFoundException {
//        File myObj = new File(pathFile);
//        return new Scanner(myObj);
//    }
//
//    /**
//     * Return one file line.
//     * * @return line
//     */
//    public Optional<String> readLineByLine (Scanner myReader) {
//        if (myReader.hasNextLine()) {
//            return Optional.ofNullable(myReader.nextLine());
//        } else {
//            myReader.close();
//            return null;
//        }
//    }
//
//    public abstract void exec();
//}