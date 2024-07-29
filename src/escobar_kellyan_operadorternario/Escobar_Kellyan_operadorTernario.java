package escobar_kellyan_operadorternario;
import java.util.Scanner;
public class Escobar_Kellyan_operadorTernario {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
 /**El operador ternario es una abreviatura de la declaracion if-else. 
 *"Operador Ternario":
 'Simplicidad y concisión': es útil cuando se trata de expresiones simples y breves. Puede hacer que el código sea 
  más compacto y fácil de leer en situaciones donde la lógica es directa y no involucra múltiples ramificaciones.
 'Asignaciones directas': es ideal para asignaciones directas basadas en una condición.
 Se necesitan tres operandos:     
 1. Una condicion a evaluar(Condicion Booleana).
 2. El valor a asignar si la condición es verdadera (Valor Verdadera).
 3. El valor a asignar si la condición es falsa (Valor Falso).*/
 
      //El uso de valor constante
      int numero;
      System.out.println("Ingrese un numero: ");
      numero=scanner.nextInt();
      String resultado=(numero>10)?" Mayor que 10":" Menor o igual que 10";
      System.out.println("Resultado:"+resultado+
                         "\n --------------------------------------------");
      
      
      //Con variables
      System.out.print("Ingrese su nombre: ");
      String nombre=scanner.next();
      System.out.print("Ingrese su altura en metros: ");
      double altura=scanner.nextDouble();
      System.out.print("Ingrese su edad: ");
      int edad=scanner.nextInt();
      String mensaje=(altura >=1.5)? "Hola " + nombre + " Tu altura es de " + altura + " metros y tienes " + edad + " años.": "Hola " + nombre + " Tu altura es menor a 1.5 metros y tienes " + edad + " años.";
      System.out.println(mensaje+
                         "\n ----------------------------------------------");
      
      
      //Con formulas
     
      double CostoComida=3.55;
      int CantidadComida=5;
      System.out.println("Ingrese una mascota (Ganso/Gallina/Pato): ");
       String Mascota = scanner.next();
      System.out.println("Ingrese la cantidad de comida para su mascota");
      CantidadComida=scanner.nextInt();  
      double TotalCosto=(Mascota.equalsIgnoreCase("Ganso"))? CostoComida*CantidadComida*25.06:
                        (Mascota.equalsIgnoreCase("Gallina"))? CostoComida*CantidadComida*35.05:
                        (Mascota.equalsIgnoreCase("Pato"))? CostoComida*CantidadComida*12.45: 0;
      System.out.println("El total del costo de la comida para "+Mascota+" es de: L. "+TotalCosto);
         
    }
}