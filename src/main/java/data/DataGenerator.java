package data;

import mountain.Mountain;

public interface DataGenerator{
    static Integer[] generate1D(int amount){
        Integer []Array = new Integer[amount];
        for(int index = 0; index < amount; index++)
            Array[index] = (int) (Math.random() * Mountain.MAX_HEIGHT);
        return Array;
    }

    static Integer[][] generate2D(int rows, int columns){
        Integer [][]Array = new Integer[rows][columns];
        for(int row = 0; row < rows; row++){
            for(int column = 0; column < columns; column++){
                Array[row][column] = (int)(Math.random() * Mountain.MAX_HEIGHT);
            }
        }
        return Array;
    }
}
