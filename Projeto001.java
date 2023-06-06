package Projetos;

import java.util.Scanner;

public class Projeto001 {
    public static void main(String[] args) {

        //declarações
        Scanner input = new Scanner(System.in);

        //variáveis
        boolean stopCondition = true, stopDpst;
        int keepgoing,answer;
        double deposit,withdraw;
        String accountType = "";

        String operations = """
                    ********Operações********

                    1 - Consultar saldo
                    2 - Depósito
                    3 - Saque

                    *************************
                    \n""";

        String menu = """
            Nome:               %s   
            Tipo conta:         %s   
            Saldo inicial:      %.2f
            \n""";            
        
        //código
        
        //cadastrando usuário

        System.out.println("Forneça o seu nome completo \n");
        String completeName = input.nextLine();
        System.out.println();

        while (stopCondition){
            System.out.println("Qual o tipo da sua conta bancária? (ESCOLHA ENTRE 0 OU 1) \n[0] para CORRENTE \n[1] para POUPANÇA \n ");
            int accountTypeTemp = input.nextInt();
        
            if (accountTypeTemp == 0){
                accountType = "CORRENTE";
                break;
            }

            else if (accountTypeTemp == 1){
                accountType = "POUPANÇA";
                break;
            }

            else{
                System.out.println("OPÇÃO INVÁLIDA \n");
            }
        }   
        System.out.println();

        System.out.println("Qual o saldo inicial para a sua conta corrente? \n");
        double balance = input.nextDouble();
        System.out.println();
        
        System.out.println("CADASTRO REALIZADO \n");

        System.out.printf(menu + "\n",completeName,accountType,balance );


        //Looping de funcionamento

        while (stopCondition){

            //Recebendo dados do usuário
            System.out.println(operations);
            answer = input.nextInt();

            //menu
            if (answer == 1){
                System.out.printf(menu + "\n",completeName,accountType,balance ); 
            }

            //depósito
            else if (answer == 2) {
                stopDpst = true;
                while (stopDpst){
                    System.out.println("Informe o valor do depósito \n");
                    deposit = input.nextDouble();

                    System.out.printf("Confirme que deseja depositar o valor de R$ %.2f \n [0] para SIM \n [1] para NÃO \n",deposit);
                    int dpstAnswer = 0;
                    dpstAnswer = input.nextInt();

                    if (dpstAnswer == 0){
                        balance += deposit;
                        break;
                    }
                    else if (dpstAnswer == 1){
                        System.out.println("Depósito cancelado. \n");
                        break;
                    }
                    else {
                        System.out.println("RESPOSTA INVÁLIDA \n");  
                    }   
                }
            }
            //saque
            else if (answer == 3){
                stopDpst = true;
                while (stopDpst){
                    System.out.println("Informe o valor do saque \n");
                    withdraw = input.nextDouble();
                    //validação de erro 1 - saldo isuficiente
                    while (stopDpst){
                        if (withdraw > balance){
                            System.out.printf("ERRO! Permitido sacar até %.2f \n",balance);
                            System.out.println("Informe o valor do saque \n");
                            withdraw = input.nextDouble();
                            if (withdraw < balance){
                                break;
                            }
                        }
                        else{
                            break;
                        }
                    }

                    System.out.printf("Confirme que deseja sacar o valor de R$ %.2f \n [0] para SIM \n [1] para NÃO \n",withdraw);
                    int wtdrwAnswer = 0;
                    wtdrwAnswer = input.nextInt();

                    if (wtdrwAnswer == 0){
                        balance -= withdraw;
                        break;
                    }
                    else if (wtdrwAnswer == 1){
                        System.out.println("Depósito cancelado. \n");
                        break;
                    }
                    else {
                        System.out.println("RESPOSTA INVÁLIDA \n");
                    }
                }
            }

            else{
                System.out.println("ERRO! VALOR INVÁLIDO");
            }

            //Continuar ou parar programa
            keepgoing = 0;
            System.out.println("Realizar nova operação? \n[0] Sim \n[1] Não \n");
            keepgoing = input.nextInt();
            if (keepgoing == 1) {
                stopCondition = false;
            }
        }
    }
}
