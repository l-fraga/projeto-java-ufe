package ultimate_fight_emoji;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        } else {

            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: //Empate
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
                case 1: //Desafiado vence
                System.out.println("Vitório do " + this.desafiado);
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
                case 2: //Desafiante vence
                System.out.println("Vitório do " + this.desafiante);
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    // Getter and Setters

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
