import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kelamin, nama;
        int tahun = 0, bulan = 0, hari = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Data Diri");
        System.out.print("Nama: ");
        nama = keyboard.nextLine();

        System.out.print("Jenis Kelamin L/P: ");
        kelamin = keyboard.nextLine();


        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahir = keyboard.nextLine();
        LocalDate birthDate = LocalDate.parse(tanggalLahir);

        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("----------------");
        System.out.println("Nama: " + nama);
        if (kelamin.equals("L")) {
            System.out.println("Jenis Kelamin : Laki-laki");
        } else if (kelamin.equals("P")) {
            System.out.println("Jenis Kelamin : Perempuan");
        } else {
            System.out.println("Input salah !");
        }
        System.out.printf("Umur anda: %d tahun, %d bulan, %d hari%n", years, months, days);
    }
}
