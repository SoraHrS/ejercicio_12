import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        double horasTrabajadas, valorHoraNormal, horasExtrasTrabajadas, hET8, salario;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el número de horas trabajadas: ");
        horasTrabajadas = sc.nextDouble();
        System.out.print("Ingrese el valor de la hora normal trabajada: ");
        valorHoraNormal = sc.nextDouble();

        if (horasTrabajadas>40){
            horasExtrasTrabajadas = horasTrabajadas - 40;
            if (horasExtrasTrabajadas>8){
                hET8 = horasExtrasTrabajadas - 8;
                salario = 40 * valorHoraNormal + 16 * valorHoraNormal + hET8 * 3 * valorHoraNormal;
            }else{
                salario = 40 * valorHoraNormal + horasExtrasTrabajadas * 2 * valorHoraNormal;
            }
        }else{
            salario = horasTrabajadas * valorHoraNormal;
        }
    System.out.println("El trabajador " + nombre + " devengó: $ "+ salario);
    }
}