import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);

        int num1;

        System.out.println("Digite el primer numero");
        num1=x.nextInt();

        if(num1%2==0){
          System.out.println("El numero "+num1+ " Es par");
        }else{
            System.out.println("El numero "+num1+ " No es par");
        }

        x.close();
    }
}
