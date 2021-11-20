package com.colle.control.collecontrol.domain;

import java.util.Scanner;

public class PessoaJuridicaDomain extends PessoaDomain implements IValidacaoDomain<PessoaJuridicaDomain>, ICadastroDomain{

    private String razaoSocial;

    private String cnpj;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public Boolean validarChave(PessoaJuridicaDomain domain) {
        return null;
    }

    @Override
    public void cadastro() {
        super.cadastro();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a Razão Social!");
        this.razaoSocial = leitor.nextLine();

        System.out.println("Digite o CNPJ!");
        this.cnpj = leitor.nextLine();
    }
}
