public class exercicio01_conversorDeTemperaturas {
    public static void main(String[] args){
        //Defininfo as variáveis
        double tempGrausC,tempGarusF;
        int tempGrausFinteiro;

        //Cálculo
        tempGrausC = 36;
        tempGarusF = (tempGrausC * 1.8) + 32;
        
        //Sem casas decimais
        tempGrausFinteiro = (int) tempGarusF;

        //Imprimindo
        System.out.println("A temperatura em Celsius " + tempGrausC + " convertida para Fahrenheit é " + tempGarusF);
        System.out.println("A temperatura em Fahrenheit sem decimais é: " + tempGrausFinteiro);
    }
    
}
