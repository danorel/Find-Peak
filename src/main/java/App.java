import data.DataGenerator;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer []Array1D = DataGenerator.generate1D(10);
        Arrays.asList(Array1D)
                .forEach(System.out::println);
        System.out.println();
        System.out.println(Algorithm.findPeak(Array1D));
        System.out.println();
        Integer [][]Array2D = DataGenerator.generate2D(5, 5);
        Arrays.asList(Array2D)
                .forEach(row -> {
                    Arrays.asList(row)
                            .forEach(column -> {
                                System.out.print(column + " ");
                            });
                    System.out.println();
                });
        System.out.println();
        System.out.println(Algorithm.findPeak(Array2D));
    }
}
