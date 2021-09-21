package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("" + "**********************************************\n"
                + "** SEJA BEM VINDO A NOSSA REDE DE CONSULTAS **\n");


        System.out.println("POR FAVOR, PREENCHA OS CAMPOS ABAIXO:");
        System.out.print("NOME: ");
        String nome = sc.nextLine();
        System.out.print("SOBRENOME: ");
        String sobre = sc.nextLine();
        System.out.printf("CERTO, %s, ESCOLHA NO MENU ABAIXO QUAL GRUPO DE SINTOMAS SE APROXIMA MAIS COM O QUE VOCÊ ESTÁ SENTINDO:\n", nome);
        System.out.println(""+
                "GRUPO 1:\n"+
                "- FEBRE\n" +
                "- TOSSE SECA\n" +
                "- CANSAÇO\n"+
                "– CORIZA\n" +
                "– DOR DE GARGANTA\n" +
                "– DIFICULDADE PARA RESPIRAR\n"+
                "- PERDA DE FALA OU MOVIMENTO\n");
        System.out.println(""+
               "GRUPO 2\n"+
               "GRUPO 2:\n"+
               "- TOSSE COM OU SEM CATARRO\n" +
                "- DOR NO PEITO\n" +
                "- FALTA DE AR\n" +
                "- FEBRE\n" +
                "- DOR DE CABEÇA E NO CORPO\n" +
                "- MAL-ESTAR\n" +
                "- FALTA DE APETITE\n");
        System.out.println(""+
                "GRUPO 3\n"+
                "GRUPO 3:\n"+
                "- FEBRE\n"+
                "- FADIGA\n"+
                "- MAL-ESTAR\n"+
                "- PERDA DE APETITE\n"+
                "- TREMOR OU SUOR\n"+
                "- MANCHAS AVERMELHADAS OU NÁUSEA\n"+
                "- DORES NOS MÚCULOS OU OSSOS\n");
        System.out.print("GRUPO: ");
        int grup = sc.nextInt();
        if (grup == 1) {
            System.out.print("VOCÊ PODE ESTAR COM COVID, PROCURE UM MÉDICO OU O HOSPITAL MAIS PRÓXIMO!");
        }
        else if (grup == 2) {
            System.out.print("VOCÊ PODE ESTAR COM PNEUMONIA, PROCURE UM MÉDICO OU O HOSPITAL MAIS PRÓXIMO!");
        }
        else if (grup == 3) {
            System.out.print("VOCÊ PODE ESTAR COM DENGUE, PROCURE UM MÉDICO OU O HOSPITAL MAIS PRÓXIMO!");
        }
        else if (grup > 3) {
            System.out.print("COMANDO NÃO RECONHECIDO, TENTE NOVAMENTE.");
        }
        else if (grup <= 0) {
            System.out.print("COMANDO NÃO RECONHECIDO, TENTE NOVAMENTE.");
        }


        sc.close();
    }
    }

