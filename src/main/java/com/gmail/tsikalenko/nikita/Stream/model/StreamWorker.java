package com.gmail.tsikalenko.nikita.Stream.model;

import com.gmail.tsikalenko.nikita.Stream.view.View;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamWorker {

    private View view = new View();
    private Model model = new Model(view);

    public StreamWorker() {
    }

    public double midleNumber(int[] array) {
        return IntStream.of(array).average().getAsDouble();
    }

    public int minNumber(int[] array) {
        return IntStream.of(array).min().getAsInt();
    }

    public int minIdex(int[] array) {
        return IntStream.of(array).boxed().collect(Collectors.toList()).indexOf(minNumber(array));
    }

    public int cuontityOfZero(int[] array) {
        return (int) IntStream.of(array).filter(arr -> arr == 0).count();
    }

    public int moreOfZero(int[] array) {
        return (int) IntStream.of(array).filter(arr -> arr > 0).count();
    }

    public IntStream multipleAllElements(int[] array, int number) {
        return IntStream.of(array).map(arr -> arr * number);
    }

    public void callAllStreamMethods(int[] arr) {
        view.showMesage(midleNumber(arr));
        view.showMesage(minNumber(arr));
        view.showMesage(minIdex(arr));
        view.showMesage(cuontityOfZero(arr));
        view.showMesage(moreOfZero(arr));
        view.showStream(multipleAllElements(arr, model.inputNumber()));
    }
}
