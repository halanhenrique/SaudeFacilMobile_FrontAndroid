package com.example.saudefacil;

import java.util.Date;

public class Pessoa {


    private Integer pessoaId;


    private String cpf;


    private String rg;


    private String sexo;


    private String nome;


    private Date dataNascimento;


    private String tipoSanguineo;

    public Integer getPessoaId() {
        return pessoaId;
    }

    public Pessoa(Integer pessoaId, String cpf, String rg, String sexo, String nome, Date dataNascimento,
                  String tipoSanguineo) {
        super();
        this.pessoaId = pessoaId;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipoSanguineo = tipoSanguineo;
    }

    public Pessoa() {

    }

    public void setPessoaId(Integer pessoaId) {
        this.pessoaId = pessoaId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    @Override
    public String toString() {
        return "Pessoa [pessoaId=" + pessoaId + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + ", nome=" + nome
                + ", dataNascimento=" + dataNascimento + ", tipoSanguineo=" + tipoSanguineo + "]";
    }
}
