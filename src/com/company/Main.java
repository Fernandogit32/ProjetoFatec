package com.company;

public class Main {

    public static void main(String[] args) {
        Veiculo v1,v2;
        Aluno a1,a2;
        Docente d1,d2;
        Administrativo ad1,ad2;

      v1 =  new Veiculo();
      v2 = new Veiculo();
      a1 = new Aluno();
      a2 = new Aluno();
      d1 = new Docente();
      d2 = new Docente();
      ad1 = new Administrativo();
      ad2 = new Administrativo();


      v1.entrou();
      v2.entrou();
      v2.saiu();
      a1.entrou();
      d2.entrou();
      ad1.entrou();
      ad2.entrou();



        System.out.println("quantidade de de pessoas que entraram na fatec");
        System.out.println(GerenciarEntrada.adentros.size());


        int cont1 =0;
        int cont2 =0;
        int cont3 =0;
        int cont4 =0;

        for (Entravel obj: GerenciarEntrada.adentros) {

          if ( obj.getClass().toString().equalsIgnoreCase("class com.company.Veiculo")){
              cont1++;
          }
            if ( obj.getClass().toString().equalsIgnoreCase("class com.company.Aluno")){
                cont2++;
            }
            if ( obj.getClass().toString().equalsIgnoreCase("class com.company.Docente")){
                cont3++;
            }
            if ( obj.getClass().toString().equalsIgnoreCase("class com.company.Administrativo")){
                cont4++;
            }
        }
        System.out.println("quantidade de veiculos que entrou é "+ cont1);
        System.out.println("quantidade de Alunos que entrou é "+ cont2);
        System.out.println("quantidade de Docentes que entrou é "+ cont3);
        System.out.println("quantidade de Administrativos que entrou é "+ cont4);

    }
}
