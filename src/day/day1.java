//package day;
//
//import common.day;
//import common.dayControl;
//
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//List<String> elements = Stream.of("a", "b", "c");
//
//public class day1 extends day {
//
//    public day1 (){
//        super(1);
//        dayControl.addDay(this.getClass());
//    }
//
//    static final String PATHFILE = "/Users/cxb0419/IdeaProjects/advent-code-2021/bin/sonar";
////    Path path = Paths.get("C:\\file.txt");
//
//    public static void main(String[] args) {
//        var day1 = new day1();
//        day1.exec(day1);
//    }
//
//    public void exec(this) {
//        Scanner myObj = null;
//        try {
//            myObj = class.readLineByLine(PATHFILE);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        String line;
//        Integer before = null;
//        Integer counter = 0;
//        while(true) {
//            line = String.valueOf(day1.readLineByLine(myObj));
//            if(line == null){
//                break;
//            }
//            try {
//                int number = Integer.parseInt(line);
//                if(before == null){
//                    before = number;
//                    continue;
//                }
//                if(number > before){
//                    counter++;
//                }
//                before = number;
//            } catch (NumberFormatException ex) {
//                ex.printStackTrace();
//            }
//        }
//        System.out.println(counter);
//    }
//}
