package br.com.caroline.pessoas;

import br.com.caroline.composicao.Endereco;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private String telsContato;


    public void cadastrarPessoa(String nome, LocalDate dataNascimento, Endereco endereco, String telsContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
    }

    public int obterIdade() {
        int idade = 0;

        //subtrair ano atual do ano de nascimento
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return idade = periodo.getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(String telsContato) {
        this.telsContato = telsContato;
    }

}
