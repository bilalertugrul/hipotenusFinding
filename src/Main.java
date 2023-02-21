import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        /*
        Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */

        // Dik Üçgenin Hipotenüsünü ve alanını bulma
        
        double a, b, hipotenus, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("a kenarının uzunluğunu giriniz : ");
        a = input.nextDouble();
        System.out.print("b kenarının uzunluğunu giriniz : ");
        b = input.nextDouble();

        hipotenus = (a*a) + (b*b);

        alan = (a*b)/2;

        System.out.println("Dik Üçgenin Hipotenüs Uzunluğu : " + Math.sqrt(hipotenus));
        System.out.println("Dik Üçgenin Alanı : " + alan);









    }
}