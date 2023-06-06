import java.util.Scanner;

public class Loop {
    /**
     * @param args
     */
    public static void main(String[] args) {

        //objetos
        Scanner entrada = new Scanner(System.in);
        //variáveis
        double notas;
        int cont;
        double temporario, somaNota;

        //código
        somaNota = 0;
        for (temporario = cont = 1;cont <= 3; cont++){
            System.out.printf("Insira a %d nota \n",cont); 
            temporario = entrada.nextDouble();
            somaNota += temporario;
        } 
        System.out.printf("A média final foi %.2f",(somaNota/3));
