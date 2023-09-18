import java.util.Scanner;

public class LuasDanKeliling27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //luas dan keliling persegi panjang

        System.out.println("Masukkan Nilai Panjang");
        int panjang = sc.nextInt();

        System.out.println("\nMasukkan Nilai Lebar");
        int lebar = sc.nextInt();

        int luasPersegiPanjang = panjang * lebar;
        int kelilingPersegiPanjang = (panjang + lebar) * 2;

        System.out.println("\nLuas Persegi Panjang = " + (luasPersegiPanjang));
        System.out.println("\nKeliling Persegi Panjang = " + (kelilingPersegiPanjang));

        //luas dan keliling lingkaran

        double pi = 3.141592653589793238462643383279502884197169399375105820974944592307816406286;

        System.out.println("\nMasukkan Nilai Radius");
        double radius = sc.nextDouble();

        double luasLingkaran = pi * radius * radius;
        double kelilingLingkaran = 2 * pi * radius;

        System.out.println("\nLuas Lingkaran = " + (luasLingkaran));
        System.out.println("\nKeliling Lingkaran = " + (kelilingLingkaran));

        //luas dan keliling segitiga

        System.out.println("\nMasukkan Nilai Alas");
        float alasSegitiga = sc.nextFloat();

        System.out.println("\nMasukkan Nilai Tinggi");
        float tinggiSegitiga = sc.nextFloat();

        System.out.println("\nMasukkan Nilai Sisi");
        float sisiSegitiga = sc.nextFloat();

        float luasSegitiga = (alasSegitiga * tinggiSegitiga) / 2;
        float kelilingSegitiga = 3 * sisiSegitiga;

        System.out.println("\nLuas Segitiga = " + (luasSegitiga));
        System.out.println("\nKeliling Segitiga = " + (kelilingSegitiga));
    }
}
