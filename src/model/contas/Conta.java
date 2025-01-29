package model.contas;

public abstract class Conta {
    private String numeroConta;
    private int agencia;
    private double saldo;
    private double chequeEspecial;

    public Conta(String numeroConta, int agencia, double saldo,
                 double chequeEspecial) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public Conta (double saldo, double chequeEspecial) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public Conta(){

    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public abstract void creditar (double valor);

    public void debitar(double valor){
        this.saldo = saldo - valor;
    }

    public String toString(){
        return "Conta: " + getNumeroConta() + "-"
            + "Agencia: " + getAgencia() + "-"
            + "Saldo: " + getSaldo() + "-"
            + "Cheque especial: " + getChequeEspecial() + " - ";
    }
}
