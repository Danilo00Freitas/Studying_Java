import java.util.Scanner;
import java.util.Random;

public class Exercicio002 {
    public static void main(String[] args) {
        
        //Declarando objetos
        Scanner input = new Scanner(System.in);

        //declarando variáveis
        boolean stopCondition = true;
        int answer,counter,systemAnswer;

        //código
        answer = 0;     //incializando variáveis
        counter = 1; 
        systemAnswer = new Random().nextInt(100);
        System.out.printf("PARA CONTROLE --> %d %n",systemAnswer);
        while (stopCondition){
    
            System.out.printf("Insira o seu %dº palpite. ",counter);
            answer = input.nextInt();

                if (answer != systemAnswer){
                    System.out.println("Você errou");

                    if (answer < systemAnswer) {
                        System.out.println("O número sorteado é maior do que o informado. ");
                    }

                    else {
                        System.out.println("O número sorteado é menor que o informado. ");
                    }
                }

                else {
                    System.out.printf("Parabéns, você acertou em %d tentativas. ",counter);
                    stopCondition = false;
                }

                if (counter > 5){
                    System.out.println("Numero de tentativas excedido. Você perdeu... ");
                    stopCondition = false;
                }
            ++counter;
        }
    } 
}
