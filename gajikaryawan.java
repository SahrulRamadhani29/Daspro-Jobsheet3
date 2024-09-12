import java.util.Scanner;
public class gajikaryawan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double jamKerja, gajiPerJam;
        double gajiBulanan, bonus, pajak, gajiSetelahPajak, pajakPersen = 0.05, bonusPersen = 0.10;
        System.out.print("Masukkan Total jam kerja: ");
        jamKerja = input.nextDouble();
        System.out.print("Masukkan Upah Per jam: ");
        gajiPerJam = input.nextDouble();
        gajiBulanan = jamKerja * gajiPerJam;
        bonus = gajiBulanan * bonusPersen;
        double totalGajiDanBonus = gajiBulanan + bonus;
        pajak = totalGajiDanBonus * pajakPersen;
        gajiSetelahPajak = totalGajiDanBonus - pajak;
        System.out.println("Gaji bulanan sebelum pajak: Rp " + gajiBulanan);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Gaji bulanan setelah pajak: Rp " + gajiSetelahPajak);

    }
}
