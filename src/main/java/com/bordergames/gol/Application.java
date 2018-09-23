package com.bordergames.gol;

import com.bordergames.gol.array.ArrayAutomaton;

public class Application {
    public static void main(String[] args) {
        Engine engine = new AbstractEngine<ArrayAutomaton>(new ArrayAutomaton()) {
            @Override
            public void readInput() {
                // ignore
            }
        };
        new Thread(engine).start();
    }

}