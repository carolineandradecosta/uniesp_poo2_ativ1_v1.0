package br.com.caroline.estruturas;

import br.com.caroline.composicao.Telefone;

import java.util.Iterator;


public class ListaDeTelefonesNaoOrdenados {

    // estrutura de dados de forma básica, sem usar a api List do java
    private Telefone[] telefones;
    // variável tamanho para realizar o controle do tamanho
    private int tamanho;

    // é static para não permitir instâncias
    // a capacidade pode ser alterada depois
    private static final int CAPACIDADE_PADRAO = 10;

    // Construtor da lista
    public ListaDeTelefonesNaoOrdenados() {
        this.telefones = new Telefone[CAPACIDADE_PADRAO];
        this.tamanho = 0;
    }

    // Verificador de vazio
    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    // Adicionando um telefone a lista
    public void addTelefone(Telefone telefone) {
        // Caso a CAPACIDADE_PADRAO seja alterada, o length vai pegar a capacidade atual, em tempo de execução
        if (tamanho < telefones.length) {
            // o tamanho já é o index, portanto não precisamos trabalhar com index também
            telefones[tamanho] = telefone;
            // incremento do tamanho
            this.tamanho = tamanho + 1;
        }
    }

    // Para remover um telefone, precisar primeiro buscar o index
    public void removerTelefone(Telefone telefone) {
        int index = buscarTelefoneIndex(telefone);
        if (index != -1) {
            for (int i = index; i < tamanho; i++) {
                telefones[i] = telefones[i + 1];
            }
            telefones[--tamanho] = null;
        }
    }

    // Encontra o index do telefone que se deseja remover
    private int buscarTelefoneIndex(Telefone telefone) {
        for (int i = 0; i < tamanho; i++) {
            // verifica se os telefones são iguais
            if (telefones[i].equals(telefone)) {
                // retorna o index se forem iguais
                return i;
            }
        }
        // retorna -1 se não encontrar
        System.out.println("Telefone não encontrado!");
        return -1;
    }

    // Imprime os objetos que colocamos o "toString" lá na classe Telefone
    public void exibirTelefones() {

        //CRIE: a validação de vazio, se tiver vazio, nem entre no "for"
        // criei usando o if (!isEmpty())

        if (!isEmpty()) {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(telefones[i]);
            }
        }
    }
}
