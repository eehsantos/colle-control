package com.colle.control.collecontrol.domain;


import java.util.Scanner;

public abstract class PessoaDomain implements ICadastroDomain {

    private String nome;

    private String email;

    private String telefone;

    private String endereco;

    private Integer numero;

    private String complemento;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    protected boolean ativo (String valor){
      return "AT".equalsIgnoreCase(valor) ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override
    public void cadastro() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o Nome!");
        this.nome = leitor.nextLine();

        System.out.println("Digite o Email!");
        this.email = leitor.nextLine();

        System.out.println("Digite o Telefone!");
        this.telefone = leitor.nextLine();

        System.out.println("Digite o Endereco!");
        this.endereco = leitor.nextLine();

        System.out.println("Digite o Bairro!");
        this.bairro = leitor.nextLine();

        System.out.println("Digite o Complemento!");
        this.complemento = leitor.nextLine();

        System.out.println("Digite o Cidade!");
        this.cidade = leitor.nextLine();

        System.out.println("Digite o Estado!");
        this.estado = leitor.nextLine();

        System.out.println("Digite o Cep!");
        this.cep = leitor.nextLine();

        System.out.println("Digite o Numero!");
        this.numero = leitor.nextInt();
    }
}
