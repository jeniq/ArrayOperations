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

    /**
     * This method calculate average value of array
     *
     * @return integer value
     */
    public int averageValue() {
        int sum = 0;
        for (int curr : array) {
            sum += curr;
        }
        return sum / array.length;
    }

    /**
     * This method count every entry of input element
     * @param search input integer value
     * @return integer number
     */
    public int findQuantityOfSameElements(int search){
        int n = 0;
        for (int current : array){
            if (current == search){
                n++;
            }
        }
        return n;
    }

    /**
     * This method count elements that equal 0
     *
     * @return integer value
     */
    public int findElementsEqualZero(){
        int zero = 0;
        for (int current : array){
            if (current == 0){
                zero++;
            }
        }
        return zero;
    }

    /**
     * This element count positive elements
     *
     * @return integer value
     */
    public int findPositiveElements(){
        int n = 0;
        for (int current : array){
            if (current > 0){
                n++;
            }
        }
        return n;
    }

    /**
     * This method multiply every element by the input number
     * @param n input integer number
     */
    public void multiplyEveryElement(int n){
        for (int i = 0; i < array.length; i++){
            array[i] *= n;
        }
    }

    /**
     * This method summarize element's index with element value
     */
    public void sumIndexWithElement(){
        for (int i = 0; i < array.length; i++){
            array[i] += i;
        }
    }

    /**
     */
    public void resetEvenValueElement(){
        for (int i = 0; i < array.length; i++){
            if ((array[i] % 2)  == 0){
                array[i] = 0;
            }
        }
    }

    /**
     */
    public void resetElemWithOddIndex(){
        for (int i = 0; i < array.length; i+=2){
            array[i] = 0;
        }
    }

    /**
     * @return integer value
     */
    public int findFirstPositiveElement(){
        int positive = 0;
        for (int current : array){
            if (current > 0){
                positive = current;
                break;
            }
        }
        return positive;
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
