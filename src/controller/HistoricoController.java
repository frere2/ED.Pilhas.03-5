package controller;

import br.edu.fateczl.pilha.PilhaString;

public class HistoricoController {
    public void inserirEndereco(PilhaString pilha, String endereco) {
        if (isEnderecoValido(endereco)) {
            pilha.push(endereco);
            System.out.println("Endereço inserido com sucesso.");
        } else {
            System.out.println("Endereço inválido.");
        }
    }

    public void removerUltimoEndereco(PilhaString pilha) throws Exception {
        if (pilha.isEmpty()) {
            System.out.println("Erro: Histórico vazio.");
        } else {
            String enderecoRemovido = pilha.pop();
            System.out.println("Endereço removido: " + enderecoRemovido);
        }
    }

    public void consultarUltimoEndereco(PilhaString pilha) throws Exception {
        if (pilha.isEmpty()) {
            System.out.println("Erro: Histórico vazio.");
        } else {
            String ultimoEndereco = pilha.top();
            System.out.println("Último endereço: " + ultimoEndereco);
        }
    }

    private boolean isEnderecoValido(String endereco) {
        return (endereco.startsWith("http://") || endereco.startsWith("https://")) && endereco.contains("www.");
    }
}