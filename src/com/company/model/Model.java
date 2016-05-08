package com.company.model;

/**
 * Created by Женя on 08.05.2016.
 */
public class Model {

    private int[] array;
    private int size; // number of array elements
    private int maxValuePos;
    private int minValuePos;

    /**
     * This method summarizes all elements of array
     *
     * @return sum of array
     */
    public int arraySum() {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    /**
     * This method defines maximum element of array and it's position
     *
     * @return element with maximum value of array
     */
    public int maxArrayElement() {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i]) {
                max = array[i];
                maxValuePos = i;
            }
        }
        return max;
    }

    /**
     * This method defines minimum element of array and it's position
     *
     * @return element with maximum value of array
     */
    public int minArrayElement(){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
                minValuePos = i;
            }
        }
        return min;
    }

    public void newArray(){
        array = new int[size];
    }

    public int[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxValuePos() {
        return maxValuePos;
    }

    public int getMinValuePos() {
        return minValuePos;
    }

}
