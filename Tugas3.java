import java.util.Scanner;
/**
 * Tugas3
 */
public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari : ");
        String cariMakanan = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMakanan)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan tersebut tersedia di menu.");
        } else {
            System.out.println("Maaf, makanan yang dicari tidak ada di menu.");
        }

        sc.close();
    }
}
