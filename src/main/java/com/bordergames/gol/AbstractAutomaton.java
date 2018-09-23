package com.bordergames.gol;

public abstract class AbstractAutomaton<C extends Cells> implements CellularAutomaton<C> {
    protected C cells;

    @Override
    public void nextGen() {
        cells = nextGen(cells);
    }

    @Override
    public void render() {
        render(cells);
    }
}
