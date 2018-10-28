package com.gmail.tsikalenko.nikita.stream.model;


import com.gmail.tsikalenko.nikita.stream.util.Util;
import com.gmail.tsikalenko.nikita.stream.view.View;

import java.util.Random;
import java.util.Scanner;


public class Model {

    private int[] arr;
    private View view = new View();
    private static final int MAX_NUMBER_FOR_RANDOM = 20;
    private static final int MIN_NUMBER_FOR_RANDOM = -10;

    public Model() {
    }

    public Model(View view) {
        this.view = view;
    }

    public int[] getArr() {
        return arr;
    }

    public Model(int[] arr) {
        this.arr = arr;
    }


    public int inputNumber() {
        View view = new View();
        Scanner sc = new Scanner(System.in);
        view.showMesage(Util.INPUT_NUMBER);
        return sc.nextInt();
    }

    private int inputIntValueValidation() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            view.showMesage(Util.INCORRECT_INPUT);
            sc.next();
        }
        return sc.nextInt();
    }

    private int inputLenghtArray() {
        view.showMesage(Util.INPUT_LENGHT_ARRRAY);
        return inputIntValueValidation();
    }

    public void createArr() {
        arr = new int[inputLenghtArray()];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(MAX_NUMBER_FOR_RANDOM) + MIN_NUMBER_FOR_RANDOM;
        }
    }

}
