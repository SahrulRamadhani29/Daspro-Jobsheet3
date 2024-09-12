import java.util.Scanner;

public class KwhListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tarif_Kwh = 1500.0; 
        int batas_Kwh = 500;  
        double penggunaanKwh, totalTagihan;
        boolean melebihiBatasKwh;
        System.out.print("Masukkan jumlah penggunaan listrik (dalam kWh): ");
        penggunaanKwh = input.nextDouble();
        totalTagihan = penggunaanKwh * tarif_Kwh;
        melebihiBatasKwh = penggunaanKwh > batas_Kwh;
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Penggunaan Listrik melebihi 500 kWh: " + melebihiBatasKwh);
    }
}
