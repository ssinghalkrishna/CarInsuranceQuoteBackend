package code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsC {
    public static void main(String[] args) {
        List<Double> myFirstList = Arrays.asList(100.00, 400.00, 900.00, 1600.00, 2500.00, 3600.00);
        Stream<Double> myFirstStream = myFirstList.stream();
        List<Double> myListOfSquareRoots = myFirstStream
                .map(Math::sqrt)
                .collect(Collectors.toList());

        myListOfSquareRoots.forEach(System.out::println);
        /*
        The stream myFirstStream becomes not usable after the terminal operation
        In Java Streams, once a terminal operation is performed, the stream is considered consumed
        and cannot be reused. In example above, terminal operation is .collect(Collectors.toList());
        If we try to use stream after terminal operation, u will get an exception.
        List<Double> myListOfSquareRoots = myFirstStream
                .map(Math::sqrt)
                .collect(Collectors.toList());
                will throw an exception
         */

        List<Double> mySecondList = Arrays.asList(100.00, 400.00, 900.00, 1600.00, 2500.00, 3600.00);
        Stream<Double> mySecondStream = mySecondList.stream();
        List<Double> myListOfNumbersGreaterThan400 = mySecondStream
                .filter(num -> num > 400)
                .collect(Collectors.toList());
        myListOfNumbersGreaterThan400.forEach(System.out::println);


        List<Double> myThirdList = Arrays.asList(100.00, 400.00, 900.00, 1600.00, 2500.00, 3600.00);
        Stream<Double> myThirdStream = myThirdList.stream();
        double sumOfNums = myThirdStream.reduce(0.0, Double::sum); //0.0 is starting sum, mandatory item
        System.out.println("Sum: " + sumOfNums);

        List<String> names = Arrays.asList("David", "Gerry", "Sony", "Krish");
        List<String> filteredNames = names.stream()
                .map(String::toUpperCase) //convert each name to uppercase
                .filter(name -> name.startsWith("D") || name.startsWith("S"))
                .collect(Collectors.toList());
        filteredNames.forEach(System.out::println);
    }
}
