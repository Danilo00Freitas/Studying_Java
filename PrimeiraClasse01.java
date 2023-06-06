public class PrimeiraClasse01 {
        public static void main(String[] args){
// System.out.println("Esse é o NETFLIX 2");
// System.out.println("Filme: Django livre");
     
// String movieName = "Filme: Djando Livre ";
//int releaseDate = 2012;
//boolean premiumUser = true;
//double score = 9.3;
//System.out.println(movieName + releaseDate);
     
             
     
/*De forma parecida com Python podemos usar strings formatadas. Basta definirmos os tipos de variável
* e utilizarmos os "operadores" correspondendes. 
* %s para string
* %d para inteiro
* %f para decimal... neste caso podemos usar ".valor" para informar quantas casas decimais ex %.2f = duas casas
 */
     
 //String nomePessoa = "Danilo";
//        int idade = 21;
//      double peso = 102.3;
//
//        System.out.println(String.format("Olá meu nome é %s, eu tenho %d anos e peso %.2f Kgs",nomePessoa,idade,peso));
     
     
/*De forma similar podemos formatar os text blocks usando o método da classe string ".formatted
Os opradores são os mesmos do string.format
A diferença é que usamos .formatted(variáveis) no final do código ao invés das vírgulas" 
*/        
     
//    String nome = "Danilo";
//     int qtdBeijosNaBunda = 3;
//     
//     final String mensagem = """
//     Olá %s, seja bem vindo ao meu exemplo.
//     Vc merece %d beijos na bunda""".formatted(nome,qtdBeijosNaBunda);
//     System.out.println(mensagem); 


/* Quando trabalhamos com Java precisamos sempre nos preocupar com a conversão dos tipodes de varíavel
 * Isso causa situações onde eu preciso realizar o cast da variável para prosseguir com uma operação
 * Exemplo eu quero salvar uma operação feita em double numa variável int
 * Para isso é necessário usar o cast (int) (operação)
 * exemplo:
 * O problema é que essa conversção feita pelo cast não é exata... veja que a nota em estrelas correta seria 
 * 4,25, porém a nota recebida é 4. Ele basicamente IGNOROU as casas decimais.
 */

/*
double media = (9.5 + 8.4 + 7.6)/3;
double estrelasCerto = media / 2;
int estrelas = (int)(media / 2);
System.out.println("O correto seria " + estrelasCerto);
System.out.println("O filme tem uma nota de " + estrelas + " estrelas");
*/



        }      
}
