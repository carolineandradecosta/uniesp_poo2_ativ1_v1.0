package br.com.caroline.pessoas;

import br.com.caroline.composicao.Endereco;
import br.com.caroline.composicao.Cargo;

import java.time.LocalDate;
import java.time.Month;

public class Funcionario extends Pessoa{
    private int matricula;
    private Cargo cargo;
    private double salario;
    private String dataAdmissao;

    public void cadastrarFuncionario(int matricula, Cargo cargo,
                                     double salario, String dataAdmissao,
                                     String nome, LocalDate dataNascimento,
                                     Endereco endereco, String telsContato) {
            this.matricula = matricula;
            this.cargo = cargo;
            this.salario = salario;
            this.dataAdmissao = dataAdmissao;
            setNome(nome);
            setDataNascimento(dataNascimento);
            setEndereco(endereco);
            setTelsContato(telsContato);
        }

        public void reajutarSalario(double percentual) {
            this.salario = this.salario * percentual;
        }

        public void promover(Cargo novoCargo) {
            this.cargo = novoCargo;
        }
        public int getMatricula() {
            return matricula;
        }
        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }
        public String getDataAdmissao() {
            return dataAdmissao;
        }
        public void setDataAdmissao(String dataAdmissao) {
            this.dataAdmissao = dataAdmissao;
        }
        public Cargo getCargo() {
            return cargo;
        }
        public double getSalario() {
            return salario;
        }
}
