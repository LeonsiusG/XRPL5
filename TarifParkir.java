import java.util.Scanner;

public class TarifParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("lama waktu parkir jam: ");
        double jamParkir = scanner.nextDouble();
        
        int tarif;
        
        if (jamParkir <= 1) {
            tarif = 5000;
        } else if (jamParkir <= 2) {
            tarif = 8000;
        } else if (jamParkir <= 4) {
            tarif = 12000;
        } else {
            tarif = 20000;
        }
        
        System.out.println("Tarif parkir : Rp " + tarif);
        
        scanner.close();
    }
}
