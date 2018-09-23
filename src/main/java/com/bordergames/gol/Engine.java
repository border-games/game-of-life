package com.bordergames.gol;

public interface Engine extends Runnable {
    boolean isRunning();

    void stop();

    void nextGen();

    void render();

    void readInput();

    CellularAutomaton<? extends Cells> getAutomaton();
}
