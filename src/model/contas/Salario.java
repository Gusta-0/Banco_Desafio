package model.contas;

public class Salario extends Conta{

    public void creditar(double valor) {
        setSaldo(getSaldo() + valor);
    }
}
