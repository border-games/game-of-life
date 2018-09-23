package com.bordergames.gol;

public abstract class AbstractEngine<A extends CellularAutomaton<? extends Cells>> implements Engine {
    private final A automaton;
    private boolean isRunning;

    public AbstractEngine(A automaton) {
        this.automaton = automaton;
    }

    @Override
    public void stop() {
        isRunning = false;
    }

    @Override
    public void run() {
        isRunning = true;
        while (isRunning()) {
            readInput();
            render();
            nextGen();
        }
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public void nextGen() {
        automaton.nextGen();
    }

    @Override
    public void render() {
        automaton.render();
    }

    @Override
    public A getAutomaton() {
        return null;
    }
}
