package com.company.controller;

import com.company.model.Model;
import com.company.view.View;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Женя on 08.05.2016.
 */
public class Controller {

    Model model;
    View view;

    // Constructor
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    // The work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.ASK_ARRAY_SIZE);
        model.setSize(checkInputIntegerValue(sc));
        model.newArray();
        fillArray(sc, model.getSize(), model.getArray());
        view.printMessage(model.getArray());
        view.printMessage(View.ARRAY_SUM + model.arraySum());
        view.printMessage(View.ARRAY_MAX_VALUE + model.maxArrayElement());
        view.printMessage(View.ARRAY_MAX_VALUE_POS + model.getMaxValuePos());
        view.printMessage(View.ARRAY_MIN_VALUE + model.minArrayElement());
        view.printMessage(View.ARRAY_MIN_VALUE_POS + model.getMinValuePos());
        view.printMessage(View.ARRAY_AVERAGE_VALUE + model.averageValue());
        view.printMessage(View.ASK_ELEMENT);
   //     view.printMessage(View.ARRAY_COUNT_SAME_ELEMENTS
    //            + model.findQuantityOfSameElements(checkInputIntegerValue(sc)));
        view.printMessage(View.ARRAY_ZERO_ELEMENTS + model.findElementsEqualZero());
        view.printMessage(View.ARRAY_POSITIVE_ELEMENTS + model.findPositiveElements());
        view.printMessage(View.ASK_MULTIPLIER);
    //    model.multiplyEveryElement(checkInputIntegerValue(sc));
        model.sumIndexWithElement();
        view.printMessage(model.getArray());
     //   model.resetEvenValueElement();
        view.printMessage(model.getArray());
      //  model.resetElemWithOddIndex();
        view.printMessage(model.getArray());
        view.printMessage(View.FIRST_POSITIVE_ELEMENT + model.findFirstPositiveElement());
        view.printMessage(View.LAST_NEGATIVE_ELEMENT + model.findLastNegativeElement());
        view.printMessage(View.ASK_INTEGER_VALUE);
        view.printMessage(View.ELEMENT_INDEX + model.findIndexesOfElement(checkInputIntegerValue(sc)));
    }

    /**
     * This method checks input integer
     * @param sc number
     * @return integer value
     */
    private int checkInputIntegerValue(Scanner sc){
        while(!sc.hasNextInt()){
            view.printMessage(View.WRONG_INTEGER);
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * This method fills array by entered values
     * @param sc input number
     * @param size array size
     * @param array array that fills
     */
    private void fillArray(Scanner sc, int size, int[] array){
        for (int i = 0; i < size; i++){
            view.printMessage(View.ASK_INTEGER_VALUE);
            array[i] = checkInputIntegerValue(sc);
        }
    }



}
