import java.util.Scanner;

public class calculadora {

public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("Gostaria de converter de CELSIUS para FARENHEIT(1) ou o oposto(2)?");

            double resposta = scanner.nextDouble();

            if(resposta == 1){
                System.out.println("Digite o valor a ser convertido:");

                double a = scanner.nextDouble();

                System.out.println("O resultado da sua conversão de "+ a +"C é de:"+calculadoraFarenheit(a)+"F.");

            } else if(resposta == 2) {
                System.out.println("Digite o valor a ser convertido:");

                double b = scanner.nextDouble();

                System.out.println("O resultado da sua conversão de "+ b +"F é de:"+ calculadoraCelsius(b)+"C.");

            } else{
                System.out.println("Opção inválida. Tente 1 ou 2.");
                System.exit(0);

            }


        }
    }
    public static double calculadoraFarenheit(double a){
        double converterFarenheit = (a*1.8)+32;
        return converterFarenheit;

        }

    public static double calculadoraCelsius(double b){
        double converterCelsius = (b-32)/1.8;
        return converterCelsius;

            }
}




