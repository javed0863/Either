package org.javedrpi;

import java.util.stream.Stream;

import static org.javedrpi.Either.lift;
import static org.javedrpi.Either.liftWithValue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
         * Handling and logging exception encountered during stream processing
         */
        System.out.println("Handling and logging exception:");
        Stream.of(0,1,2)
                .map(lift(n->10/n))
                .forEach(System.out::println);

        /**
         * Handling and logging exception(with values or parameters) encountered during stream processing
         */
        System.out.println("\nHandling and logging exception with values:");
        Stream.of(0,1,2)
                .map(liftWithValue(n->10/n))
                .forEach(System.out::println);

        /**
         * Creating a Either type with Left and Right values
         */
        Either<String, Integer> items = Either.Of("Macbook", 10);
        System.out.println(items.getLeft() + " : " + items.getRight());

        /**
         * Processing the Left and Right values of a Either type
         */
        System.out.println(
                items.mapLeft(String::toUpperCase).get()
        );
        System.out.println(
                items.mapRight(n -> n/2).get()
        );
    }
}
