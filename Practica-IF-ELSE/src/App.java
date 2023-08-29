import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada=new Scanner(System.in);

        int num1,num2;

        System.out.println("Digite el valor de num1");
        num1=entrada.nextInt();

        System.out.println("Digite el valor de num2");
        num2=entrada.nextInt();

        if(num1>num2){
            System.out.println("El mayor es: "+num1);
        }else if(num1<num2){
            System.out.println("El mayor es: "+num2);

        }else{
            System.out.println("Los numeros son iguales");

        }
        entrada.close();
    }
}
