package br.com.netshoes.cep.model;

import br.com.netshoes.model.ContentResponse;

/**
 * Created by cbrossa on 12/04/15.
 */
public class Endereco extends ContentResponse {

    public Endereco() {
    }

    public Endereco(String bairro, String logradouro, String cep, String estado, String cidade) {
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
    }

    private String bairro;
    private String logradouro;
    private String cep;
    private String estado;
    private String cidade;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
