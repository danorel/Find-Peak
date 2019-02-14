public class Algorithm {
    public static Integer findPeak(Integer []Array){
        return getPeak(Array, 0, Array.length / 2, Array.length - 1);
    }

    private static Integer getPeak(Integer []Array, int start, int middle, int end){
        int peak = Array[middle];
        if(middle != start && Array[middle] < Array[middle - 1]){
            peak = getPeak(Array, start, middle - 1, middle);
        } else if(middle != end && Array[middle] < Array[middle + 1]){
            peak = getPeak(Array, middle, middle + 1, end);
        }
        return peak;
    }

    public static Integer findPeak(Integer [][]Array){
        return getPeak(Array, Array.length, Array[0].length / 2 ,Array[0].length);
    }

    private static Integer getPeak(Integer [][]Array, int row, int middle, int column){
        int MAX = findMaximumInColumn(Array, middle);
        if(Array[MAX][middle] < Array[MAX][middle - 1]){
            return getPeak(Array, row, middle - 1, column);
        } else if(Array[MAX][middle] < Array[MAX][middle + 1]){
            return getPeak(Array, row,middle + 1, column);
        }
        return Array[MAX][middle];
    }

    public static Integer findMaximumInColumn(Integer [][]Array, int column){
        Integer MAX_index = 0;
        for(int index = 1; index < Array.length; index++){
           if(Array[index][column] > Array[MAX_index][column]){
               MAX_index = index;
           }
        }
        return MAX_index;
    }
}