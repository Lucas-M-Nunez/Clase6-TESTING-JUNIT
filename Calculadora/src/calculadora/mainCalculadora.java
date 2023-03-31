package calculadora;

import java.util.Scanner;

import Clases.Calculadora;

public class mainCalculadora {

public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String Operacion;
        double resultado;
        
        //creamos la calculadora
        Calculadora Calculadora = new Calculadora();
        
        // Seteo de los numeros
        System.out.print("Ingrese el 1er Número: ");
        Calculadora.setNum1(leer.nextDouble());
        System.out.println("Ahora, el 2do: ");
        Calculadora.setNum2(leer.nextDouble());
        
        //Menu de operaciones para la calculadora
        System.out.print("Ingrese la operación que desea realizar: ");
        System.out.println(" S - R - M - D");
        Operacion = leer.next();
        
        //operaciones Matemáticas
        if(Operacion.equalsIgnoreCase("S")){
            resultado = Calculadora.sumar(Calculadora.getNum1(),Calculadora.getNum2());
            System.out.println("El resultado de la suma es: "+ resultado);
        } else if( Operacion.equalsIgnoreCase("R")){
            resultado = Calculadora.restar(Calculadora.getNum1(),Calculadora.getNum2());
            System.out.println("El resultado de la resta es: "+resultado);
        } else if(Operacion.equalsIgnoreCase("M")) {
            resultado = Calculadora.multiplicar(Calculadora.getNum1(),Calculadora.getNum2());
            System.out.println("El resultado de la Multiplicación es: "+resultado);
        } else if (Operacion.equalsIgnoreCase("D")) {
            resultado = Calculadora.dividir(Calculadora.getNum1(),Calculadora.getNum2());
            System.out.println("El resultado de la División es: "+resultado);
        }
    }
}
