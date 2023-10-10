package model;

public class Transporte {
    protected int capacidadePessoas;

    public Transporte(int capacidadePessoas) {
        super();
        this.capacidadePessoas = capacidadePessoas;
    }

    public String mostrarDados() {
        return "Capacidade de pessoas: " + this.capacidadePessoas + "\n";
    }
}
