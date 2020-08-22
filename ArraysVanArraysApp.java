package be.intecbrussel.hoofdstuk7.arraysVanArrays;

import java.util.Arrays;

public class ArraysVanArraysApp
{
    public static void main(String[] args)
    {
        int [][] array2D = {{3, 6, 7}, {2, 1, 8}, {8, 0, 5}};
        System.out.println(array2D[1][2]);
        for (int i = 0; i < array2D.length; i++)
        {
            for (int j = 0; j < array2D[i].length; j++)
            {
                System.out.println(array2D[i][j]);
            }
        }
        for (int[] i: array2D)
        {
            for (int j: i)
            {
                System.out.println(j);
            }
        }
    }
}
