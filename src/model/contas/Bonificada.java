package model.contas;

public class Bonificada extends Conta{
    private double bonus;

    public Bonificada(String numeroConta, int agencia, double saldo, double chequeEspecial) {
        super(numeroConta, agencia, saldo, chequeEspecial);
    }

    public double getBonus() {
        return bonus;
    }

    public void renderBonus(){
        this.bonus = bonus + 0.01;
    }

    public void creditar(double valor){
        this.bonus = this.bonus + (valor * 0.5);
        setSaldo(bonus + valor);
    }
}
