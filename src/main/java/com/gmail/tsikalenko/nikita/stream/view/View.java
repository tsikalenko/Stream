package com.gmail.tsikalenko.nikita.stream.view;

import java.util.stream.IntStream;

public class View {
    public View() {
    }

    public void showMesage(String mesege) {
        System.out.println(mesege);
    }

    public void showMesage(int mesege) {
        System.out.println(mesege);
    }

    public void showMesage(double mesege) {
        System.out.println(mesege);
    }

    public void showStream(IntStream str) {
        str.forEachOrdered(System.out::println);
    }

    public void nextLine() {
        System.out.println();
    }
}
