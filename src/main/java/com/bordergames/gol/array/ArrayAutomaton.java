package com.bordergames.gol.array;

import com.bordergames.gol.AbstractAutomaton;

public class ArrayAutomaton extends AbstractAutomaton<ArrayCells> {
    public ArrayAutomaton() {
        cells = new ArrayCells();
    }

    @Override
    public ArrayCells nextGen(ArrayCells currentGen) {
        return null;
    }

    @Override
    public void render(ArrayCells cells) {

    }
}
