package com.company.view;

import java.util.Arrays;

/**
 * Created by Женя on 08.05.2016.
 */
public class View {
    // Text's Constants
    public final static String ASK_ARRAY_SIZE = "Enter array size";
    public final static String ASK_INTEGER_VALUE = "Enter integer value";
    public final static String WRONG_INTEGER = "Wrong integer value";
    public final static String ARRAY_SUM = "The sum of elements is ";
    public final static String ARRAY_MAX_VALUE = "The max value is ";
    public final static String ARRAY_MAX_VALUE_POS = "The max value position is ";
    public final static String ARRAY_MIN_VALUE = "The min value is ";
    public final static String ARRAY_MIN_VALUE_POS = "The min value position is ";

    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     * This method prints integer array
     * @param message integer array
     */
    public void printMessage(int[] message){
        System.out.println(Arrays.toString(message));
    }

}
