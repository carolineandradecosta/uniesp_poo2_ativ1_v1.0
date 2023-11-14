package br.com.caroline.estruturas;

import br.com.caroline.composicao.Telefone;

import java.util.Iterator;


public class ListaDeTelefonesNaoOrdenados {

    // estrutura de dados de forma básica, sem usar a api List do java
    private Telefone[] telefones;
    private int tamanho;

    // é static para não permitir instâncias
    private static final int CAPACIDADE_PADRAO = 10;
    int indexTel;

    public ListaDeTelefonesNaoOrdenados() {
        this.telefones = new Telefone[CAPACIDADE_PADRAO];
        this.tamanho = 0;
        indexTel = -1;
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public void addTelefone(Telefone telefone) {


        telefones[indexTel++] = telefone;
        indexTel = indexTel + 1;
        this.tamanho = tamanho + 1;
    }

    public void removerTelefone(Telefone telefone) {
        int index = buscarTelefoneIndex(telefone);
        if (index != -1) {
            for (int i = index; i < tamanho; i++) {
                telefones[i] = telefones[i + 1];
            }
            telefones[--tamanho] = null;
        }
    }

        private int  buscarTelefoneIndex(Telefone telefone) {
            for(int i = 0; i < tamanho; i++) {
                if(telefones[i].equals(telefone)) {
                    return i;
                }
            }
            return -1;
        }

    public void exibirTelefones() {

        //CRIE: a validação de vazio, se tiver vazio, nem entre no "for"

        for(int i = 0; i < tamanho; i++) {
            System.out.println(telefones[i]);
        }
    }

}
