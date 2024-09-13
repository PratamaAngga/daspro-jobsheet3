package JobsheetAssignment;
import java.util.Scanner;

public class Assignment1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //declaration scanner java

        int hargaListrik = 1500; //declaration variabel electricity tariff
        
        System.out.println("How much is your electricity usage ?");
        double penggunaanKwh = sc.nextDouble(); //read input from user (user's electricity usage)

        double totalPembayaran = penggunaanKwh * hargaListrik; // to calculation total amount/tariff of user's bill
        boolean pengecekan = penggunaanKwh > 500; //to check, user's electricity usage is more than 500 kWh or not

        System.out.println();
        System.out.println("----- Electricity Bill -----");
        System.out.println("Your electricity usage: " + penggunaanKwh); //to display user's electricity usage
        System.out.println("Total amount/tariff of your bill: " + totalPembayaran); //to display total amount/tariff of user's bill
        System.out.println("Is your electricity usage more than 500 kWh ? " + pengecekan); //to display, user's electricity usage is more than 500 or not
        System.out.println();
    }
}
