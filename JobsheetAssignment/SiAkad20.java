package JobsheetAssignment;
import java.util.Scanner;

public class SiAkad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Enter name: ");
        nama = sc.nextLine();
        System.out.print("Enter NIM: ");
        nim = sc.nextLine();
        System.out.print("Enter class: ");
        kelas = sc.nextLine();
        System.out.print("Enter absen number: ");
        absen = sc.nextByte();

        System.out.print("Enter quiz scores: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Enter assignment scores: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Enter UTS scores: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Enter UAS scores: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

        System.out.println();
        System.out.print("Name: " + nama + " | NIM: " + nim);
        System.out.println(" | Class: " + kelas + " | Absen number: " + absen);
        System.out.println("Final Scores: " + nilaiAkhir);
    }
}
