package com.bordergames.gol;

public interface CellularAutomaton<C extends Cells> {
    C nextGen(C currentGen);

    void nextGen();

    void render(C cells);

    void render();
}
