package common;

import java.lang.reflect.InvocationTargetException;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        var adventDay = System.getenv("ADVENT_DAY");
        var dayClass = "day" + adventDay;
        dayControl.classType(dayClass);
//        day instance = (day) Class.forName("day.sbaars.adventofcode.year21.days.Day" + adventDay).getDeclaredConstructor().newInstance();
    }
}
