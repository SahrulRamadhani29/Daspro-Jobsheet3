/**
 * main
 */
import java.util.Scanner;
public class Siakad24 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nama, nim;
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUas, nilaiUts, nilaiAkhir;
    System.out.print("Masukan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukan NIM: ");
    nim = sc.nextLine();
    System.out.print("Masukan Kelas: ");
    kelas = sc.nextLine().charAt(0);
    System.out.print("Masukan nomor absen: ");
    absen = sc.nextByte();
    System.out.print("Masukan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukan nilai Uas: ");
    nilaiUas = sc.nextDouble();
    System.out.print("Masukan nilai uts: ");
    nilaiUts = sc.nextDouble();
    nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUts * 0.30) + (nilaiUas * 0.35);
    System.out.println("Nama: " + nama + "NIM: " + nim);
    System.out.println("Kelas: " + kelas + "Absen: " + absen);
    System.out.println("Nilai Akhir:" + nilaiAkhir);
}
    
}