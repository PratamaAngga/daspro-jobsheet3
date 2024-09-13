package JobsheetAssignment;
import java.util.Scanner;

public class Kafe20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;

        System.out.println();
        System.out.print("Enter membership (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Enter the amount of coffee purchased: ");
        jmlKopi = input.nextInt();
        System.out.print("Enter the amount of tea purchased: ");
        jmlTeh = input.nextInt();
        System.out.print("Enter the amount of beard purchased: ");
        jmlRoti = input.nextInt();

        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        byte totalByte = (byte) totalHarga;

        double nominalBayar = totalHarga - (diskon * totalHarga);

        int nominalInt = (int) nominalBayar;

        System.out.println();
        System.out.println("Customer Membership: " + keanggotaan);
        System.out.println("Purchase items: " + jmlKopi + " Kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti");
        System.out.println("Total amount (double): " + totalHarga);
        System.out.println("Total amount (byte): " + totalByte);
        System.out.println("Payment amount (double): " + nominalBayar);
        System.out.println("Payment amount (int): " + nominalInt);
        System.out.println();
    }
}
