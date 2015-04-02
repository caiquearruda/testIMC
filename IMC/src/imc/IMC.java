import java.util.Scanner;


public class IMC {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
     
        float peso1, altura1;
        float imc1, imc2;
        String classifica1;

      
        System.out.println("Peso(kg): ");
        peso1 = ler.nextFloat();
        System.out.println("Altura (m): ");
        altura1 = ler.nextFloat();
        ler.nextLine();


        imc1 = calcularIMC(peso1, altura1);
      

        classifica1 = resultadoIMC(imc1);
        

        System.out.printf("IMC da Pessoa 1 = %.1f - %s\n", imc1, classifica1);       

     
 
    }

    static float calcularIMC(float p, float h) {
        return p / (h * h);
    }

    static String resultadoIMC(float imc) {
        String result;
        if (imc <= 19) {
            result = "Abaixo do Peso";
        } else if (imc <= 25) {
            result = "Peso ideal";
        } else if (imc <= 30) {
            result = "Acima do Peso";
        } else if (imc <= 35) {
            result = "Obesidade Leve";
        } else {
            result = "Obesidade";
        }
        return result;
    }

}
