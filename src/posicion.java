public class posicion {
    private int fila;
    private int col;

    public posicion(int fila, int col) {
        this.fila = fila;
        this.col = col;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getFila() {
        return fila;
    }

    public int getCol() {
        return col;
    }

}
