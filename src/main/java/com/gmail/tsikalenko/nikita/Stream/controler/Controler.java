package com.gmail.tsikalenko.nikita.Stream.controler;

import com.gmail.tsikalenko.nikita.Stream.model.Model;
import com.gmail.tsikalenko.nikita.Stream.model.StreamWorker;
import com.gmail.tsikalenko.nikita.Stream.view.View;

import java.util.stream.IntStream;

public class Controler {
    private View view = new View();
    private Model model = new Model(view);
    private StreamWorker sW = new StreamWorker();

    public Controler() {
    }

    public void userMethod() {
        model.createArr();

        view.showStream(IntStream.of(model.getArr()));
        view.nextLine();

        sW.callAllStreamMethods(model.getArr());
    }
}
