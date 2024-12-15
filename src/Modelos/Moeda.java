package Modelos;

public class Moeda {
    public String primeiraMoeda;
    public String segundaMoeda;
    public double valor;
    public double resultado;

    public Moeda(String primeiraMoeda, String segundaMoeda) {
        this.primeiraMoeda = primeiraMoeda;
        this.segundaMoeda = segundaMoeda;
    }

    public String getPrimeiraMoeda() {
        return primeiraMoeda;
    }

    public void setPrimeiraMoeda(String primeiraMoeda) {
        this.primeiraMoeda = primeiraMoeda;
    }

    public String getSegundaMoeda() {
        return segundaMoeda;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setSegundaMoeda(String segundaMoeda) {
        this.segundaMoeda = segundaMoeda;
    }

    public void calcularResultado(double valor, double primeiroRate, double segundoRate) {
        this.resultado = primeiroRate * valor * segundoRate;
    }

    @Override
    public String toString() {
        return "O valor de " + valor + " " + primeiraMoeda + " corresponde ao valor de " + resultado + " " + segundaMoeda;
    }
}
