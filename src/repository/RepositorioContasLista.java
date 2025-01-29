package repository;

import inferfaces.RepositorioContas;
import model.contas.Conta;

import java.util.ArrayList;
import java.util.List;

public class RepositorioContasLista implements RepositorioContas {
    List<Conta> contas;

    public RepositorioContasLista() {
        contas = new ArrayList<Conta>();
    }

    @Override
    public void criar(Conta conta) {
        contas.add(conta);
    }

    @Override
    public Conta procurarPorNumero(String numConta) {
        Conta contaProcurada = null;
        for (Conta conta : contas) {
            if(conta.getNumeroConta().equals(numConta)){
                contaProcurada = conta;
            }
        }
        return contaProcurada;
    }

    @Override
    public void remover(String numConta) {
        int posicao = -1;
        for (Conta conta : contas) {
            if(conta.getNumeroConta().equals(numConta)){
                posicao = contas.indexOf(conta);
            }
        }
        if(posicao != -1){
            contas.remove(posicao);
        }
    }

    @Override
    public void atualizar(Conta conta) {

    }

    @Override
    public List<Conta> listarTodas() {
        return this.contas;
    }
}
