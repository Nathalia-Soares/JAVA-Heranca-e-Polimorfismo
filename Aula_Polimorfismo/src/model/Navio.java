package model;

public class Navio extends Transporte {
    private int porteBruto;
    private int porteLiquido;

    public Navio(int capacidadePessoas, int porteBruto, int porteLiquido) {
        super(capacidadePessoas);
        this.porteBruto = porteBruto;
        this.porteLiquido = porteLiquido;
    }

    @Override
    public String mostrarDados() {
        return super.mostrarDados() + "Porte Bruto: " + this.porteBruto + "\nPorte Líquido: " + this.porteLiquido + "\n";
    }
}

