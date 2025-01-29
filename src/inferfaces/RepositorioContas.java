package inferfaces;

import model.contas.Conta;

import java.util.List;

public interface RepositorioContas {
    void criar(Conta conta);
    Conta procurarPorNumero(String numConta);
    void remover(String numConta);
    void atualizar(Conta conta);
    List<Conta> listarTodas();
}
