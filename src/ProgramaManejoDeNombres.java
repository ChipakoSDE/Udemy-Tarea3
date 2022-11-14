import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer nombre");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese el segundo nombre");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese el tercer nombre");
        String nombre3 = scanner.nextLine();
        String nombre10 = nombre1.toUpperCase();
        String nombre11 = nombre10.charAt(1) + "." + nombre1.substring(nombre1.length()-2);
        String nombre20 = nombre2.toUpperCase();
        String nombre21 = nombre20.charAt(1) + "." + nombre2.substring(nombre2.length()-2);
        String nombre30 = nombre3.toUpperCase();
        String nombre31 = nombre30.charAt(1) + "." + nombre3.substring(nombre3.length()-2);
        String nombreFinal = nombre11.concat("_").concat(nombre21.concat("_")).concat(nombre31);
        System.out.println(nombreFinal);

    }
}
