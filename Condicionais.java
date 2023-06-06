public class Condicionais {
    public static void main(String[] args){
        //variáveis
        int anoDeLancamento = 2012;
        boolean incluidoNoPlano, liberacaoAcesso;
        double notaDoFilme = 8.13;

        //codigo
        incluidoNoPlano = true;
        liberacaoAcesso = true;

if (incluidoNoPlano == true) {
    liberacaoAcesso = true;
    System.out.println("Você tem acesso a este filme");
    
}
else{
    liberacaoAcesso = false;
    System.out.println("Você não tem acesso a este filme");
} 


/*Uma alternativa ao if/else é o switch case, que é uma estrutura de controle de 
fluxo que permite executar diferentes ações com base no valor de uma expressão. 
É uma forma mais simplificada e legível de escrever vários blocos if/else encadeados.*/


/*int dia = 3;
String nomeDia;

switch (dia) {                  //Programa está basicamente repetindo if (dia == 1) ou if (if dia == 2) 
   case 1:                      //Provavelmente porque não temos o elif como no python
      nomeDia = "domingo";
      break;
   case 2:
      nomeDia = "segunda-feira";
      break;
   case 3:
      nomeDia = "terça-feira";
      break;
   case 4:
      nomeDia = "quarta-feira";
      break;
   case 5:
      nomeDia = "quinta-feira";
      break;
   case 6:
      nomeDia = "sexta-feira";
      break;
   case 7:
      nomeDia = "sábado";
      break;
   default:
      nomeDia = "Dia inválido";
      break;
    }

System.out.println("O dia " + dia + " é " + nomeDia);*/


    }
}

