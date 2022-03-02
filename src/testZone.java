import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Class for develop meanwhile we improve
// program skeleton
public class testZone {

    private static long counter;

    public void testZone(long counter){
        this.counter = 0;
    }

    private static void wasCalled() {
        testZone.counter++;
        System.out.println(testZone.counter);
    }
    public static void main(String[] args) {
        testingStreams();
    }

    public static void testingStreams() {
        testZone main = new testZone();
        List<String> list = Arrays.asList("abc1", "abc2", "abc3");

        main.counter = 0;
        String prueba = list.stream()
                .map(element -> {
                    testZone.wasCalled();
                    return element.substring(0, 3);
                });
        System.out.println(prueba);
        IntStream
    }
}
