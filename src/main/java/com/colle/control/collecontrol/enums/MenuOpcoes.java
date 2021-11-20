package com.colle.control.collecontrol.enums;

public enum MenuOpcoes {

     CADASTRO_PROFESSOR(1, "1  - Cadastro Professor"),
     CADASTRO_FORNECEDOR(2, "2  - Cadastro Fornecedor"),
     CADASTRO_ALUNO(3, "3  - Cadastro Aluno"),
     CONSULTA_PROFESSOR(4, "4  - Consulta Professor"),
     CONSULTA_FORNECEDOR(5, "5  - Consulta Fornecedor"),
     CONSULTA_ALUNO(6, "6  - Consulta Aluno"),
     SAIR(0, "0  - Sair");

     private final int opcao;

     private final String dsOpcao;

     MenuOpcoes(int opcao, String dsOpcao) {
          this.opcao = opcao;
          this.dsOpcao = dsOpcao;
     }

     public int getOpcao() {
          return opcao;
     }

     public String getDsOpcao() {
          return dsOpcao;
     }

     public static void printMenu() {
          for (MenuOpcoes option : MenuOpcoes.values()) {
               System.out.println(option.dsOpcao);
          }
          System.out.print("Escolha a opção desejada: ");
     }

     public static MenuOpcoes getOpcao(int opcao) {
          for (MenuOpcoes option : MenuOpcoes.values()) {
              if (option.opcao == opcao){
                   return option;
              }
          }
         return null;
     }
}
