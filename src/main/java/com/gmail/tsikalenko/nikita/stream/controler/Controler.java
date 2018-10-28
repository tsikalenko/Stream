package com.gmail.tsikalenko.nikita.stream.controler;

import com.gmail.tsikalenko.nikita.stream.model.Model;
import com.gmail.tsikalenko.nikita.stream.model.StreamWorker;
import com.gmail.tsikalenko.nikita.stream.view.View;

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
