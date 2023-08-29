import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);

        byte edad;
        char sexo;
        //String Verificacion;
        char Verificacion;
        System.out.println("¿Lleva armas consigo? (S/N)");
        Verificacion=x.next().charAt(0);

        if(Verificacion == 'S' || Verificacion== 's'){
            System.out.println("No puede entrar. Las armas son prohibidas");
        }else{

        System.out.println("Digite su edad");
        edad=x.nextByte();

        if(edad<=0){
           System.out.println("Usted no ha nacido");
        }else if(edad<18){
           System.out.println("Es menor de edad, aun no puede entrar");
         }else{
        System.out.println("Digite su sexo (m/f)");
        sexo=x.next().charAt(0);
          
         if((sexo =='f' || sexo =='F') && edad>=18){
            System.out.println("Usted es una mujer, tiene la edad de: "+edad+ " Años, puede entrar a la disco y tomar alcohol");
         }else if((sexo == 'm'|| sexo =='M') && edad>=18 && edad<=21){
            System.out.println("Usted es un hombre, tiene la edad de: "+edad+ " Años, puede entrar a la disco pero no puede consumir alcohol");

         }else if((sexo == 'm'|| sexo =='M') && edad>21){
            System.out.println("Usted es un hombre, tiene la edad de: "+edad+ " Años, puede entrar a la disco y puede consumir alcohol ");
         }

         }
        }
        
      x.close();
    }

}
