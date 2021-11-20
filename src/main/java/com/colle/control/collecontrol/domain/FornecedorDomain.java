package com.colle.control.collecontrol.domain;

import java.util.Scanner;

public class FornecedorDomain extends PessoaJuridicaDomain implements ICadastroDomain {

    private String contato;

    private boolean status;

    public FornecedorDomain() {
        this.cadastro();
    }

    public String getContato() {
        return contato;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public void cadastro() {
        super.cadastro();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o contato do fornecedor!");
        this.contato = leitor.nextLine();

        System.out.println("Digite o status do fornecedor!");
        this.status = super.ativo(leitor.nextLine());
    }
}
