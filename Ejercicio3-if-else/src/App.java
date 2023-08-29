import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);

        int dividendo,divisor,operacion;

        System.out.println("Digite el Dividendo");
        dividendo=x.nextInt();

        System.out.println("Digite el divisor");
        divisor=x.nextInt();

        if(divisor!=0){
           operacion=dividendo/divisor;
           System.out.println("El resultado de la division es: "+operacion);
        }else{
            System.out.println("Error");
        }
        x.close();
    }
}
