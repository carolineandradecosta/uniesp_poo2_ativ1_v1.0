package br.com.caroline.pessoas;

import br.com.caroline.composicao.Endereco;
import br.com.caroline.composicao.Profissao;

import java.time.LocalDate;
import java.time.Month;

public class Cliente extends Pessoa{
    private String codigo;
    private Profissao Profissao;

    public void cadastrarCliente(String codigo, Profissao profissao,
                                 String nome, LocalDate dataNascimento,
                                 Endereco endereco, String telsContato) {
            this.codigo = codigo;
            this.Profissao = profissao;
            setNome(nome);
            setDataNascimento(dataNascimento);
            setEndereco(endereco);
            setTelsContato(telsContato);
        }

        public String getCodigo() {
            return codigo;
        }
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
        public Profissao getProfissao() {
            return Profissao;
        }
        public void setProfissao(Profissao profissao) {
            Profissao = profissao;
        }
}
