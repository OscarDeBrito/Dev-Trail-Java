package src.lista04.questao04;

public abstract class AnimalAB implements AnimalIF {

    private int comidaIngerida;
    private int caminhoPercorrido;
    private int horasDormidas;

    @Override
    public abstract int comer(int quantidadeComida);


    @Override
    public abstract int moverse(int caminhoPercorrido);

    @Override
    public abstract int dormir(int quantidadeHoras);

    public int getComidaIngerida() {
        return comidaIngerida;
    }

    public void setComidaIngerida(int comidaIngerida) {
        this.comidaIngerida = comidaIngerida;
    }

    public int getCaminhoPercorrido() {
        return caminhoPercorrido;
    }

    public void setCaminhoPercorrido(int caminhoPercorrido) {
        this.caminhoPercorrido = caminhoPercorrido;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }
}
