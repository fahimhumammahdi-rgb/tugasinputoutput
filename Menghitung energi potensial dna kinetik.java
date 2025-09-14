import java.util.*;
import java.lang.Math;

public class MengitungEnergi {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double massa, kecepatan, tinggi, ep, ek, em;

        System.out.println("Masukkan massa : ");
        massa = input.nextDouble();
        System.out.println("Masukkan kecepatan: ");
        kecepatan = input.nextDouble();
        System.out.println("Masukkan tinggi : ");
        tinggi = input.nextDouble();
        ep = massa * 10 * tinggi;
        ek = massa * kecepatan * kecepatan / 2;
        em = ep + ek;
        System.out.println("massa = ");
        System.out.println(massa);
        System.out.println("kecepatan : ");
        System.out.println(kecepatan);
        System.out.println("tinggi : ");
        System.out.println(tinggi);
        System.out.println("Energi potensial : ");
        System.out.println(ep);
        System.out.println("Enerhi kinetik : ");
        System.out.println(ek);
        System.out.println("Enerhi mekanik : ");
        System.out.println(em);
    }
}
