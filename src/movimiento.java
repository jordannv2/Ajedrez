public class movimiento {
    private final posicion posInicial;
    private final posicion posFinal;

    public movimiento(posicion posInicial, posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    public boolean esVertical() {
        return posInicial.getCol() == posFinal.getCol();
    }

    public boolean esHorizontal() {
        return posInicial.getFila() == posFinal.getFila();
    }

    public boolean esDiagonal() {
        return Math.abs(posInicial.getCol() - posFinal.getFila()) == Math.abs(posInicial.getCol() - posFinal.getCol() );
    }

    public posicion getPosInicial() {
        return posInicial;
    }

    public posicion getPosFinal() {
        return posFinal;
    }

    public int saltoHorizontal() {
        return Math.abs(posInicial.getFila() - posFinal.getFila());
    }

    public int saltoVertical() {
        return Math.abs(posInicial.getCol() - posFinal.getCol());
    }
}