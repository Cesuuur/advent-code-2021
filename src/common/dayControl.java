package common;

import java.util.Hashtable;

/**
 * Selecting a class dynamically at runtime
 * https://stackoverflow.com/questions/5089726/selecting-a-class-dynamically-at-runtime
 */
public class dayControl {

    private static Hashtable<String, Class<?>> day_list;

    public static void addDay (Class<?> day_class){
        dayControl.day_list.put(day_class.getClass().toString(), day_class.getClass());
    }

    public static Class<?> classType (String dayClass){
        return dayControl.day_list.get(dayClass);
    }
}
