import org.junit.Assert;
import java.util.ArrayList;

public class AlgorithmTest {

    private ArrayList<Integer[]> Arrays1D;
    private ArrayList<Integer[][]> Arrays2D;
    private ArrayList<Integer> Results1D;
    private ArrayList<Integer> Results2D;

    @org.junit.Before
    public void setUp() throws Exception {
        Arrays1D = new ArrayList<>();
        Arrays2D = new ArrayList<>();
        Results1D = new ArrayList<>();
        Results2D = new ArrayList<>();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        // Defining the 1D arrays
        Integer []firstTest1D = {5, 3, 0, -1, 5, 7};
        Integer []secondTest1D = {0};
        Integer []thirdTest1D = {};
        Integer []fourthTest1D = {100, 50, 25, 12, 6, 3, 1};
        Arrays1D.add(firstTest1D);
        Arrays1D.add(secondTest1D);
        Arrays1D.add(thirdTest1D);
        Arrays1D.add(fourthTest1D);
        // Defining the 2D arrays
        Integer [][]firstTest2D = {
                {5, 3, 0},
                {-1, 5, 7}
        };
        Integer [][]secondTest2D = {

        };
        Integer [][]thirdTest2D = {
                {0},
                {0}
        };
        Integer [][]fourthTest2D = {
                {5, 3, 1},
                {1, 3, 5},
                {-5, 4, 0}
        };
        Arrays2D.add(firstTest2D);
        Arrays2D.add(secondTest2D);
        Arrays2D.add(thirdTest2D);
        Arrays2D.add(fourthTest2D);
        // Setting up the results
        Results1D.add(5);
        Results1D.add(0);
        Results1D.add(null);
        Results1D.add(100);

        Results2D.add(7);
        Results2D.add(null);
        Results2D.add(0);
        Results2D.add(4);
    }

    @org.junit.Test
    public void findPeak1D() {
        for(int index = 0; index < Arrays1D.size(); index++){
            Assert.assertEquals(Results1D.get(index), Algorithm.findPeak(Arrays1D.get(index)));
        }
    }

    @org.junit.Test
    public void findPeak2D() {
        for(int index = 0; index < Arrays1D.size(); index++){
            Assert.assertEquals(Results2D.get(index), Algorithm.findPeak(Arrays2D.get(index)));
        }
    }
}
