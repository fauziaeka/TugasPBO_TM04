/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author win 10
 */
public class Throws_Try_Catch {

    // Metode dengan try-catch
    public void konversiTryCatch(String angkaStr) {
        try {
            int angka = Integer.parseInt(angkaStr);
            System.out.println("Hasil konversi: " + angka);
        } catch (NumberFormatException ex) {
            System.out.println("Kesalahan: Format angka tidak valid.");
        }
    }

    // Metode dengan throws
    public void konversiThrows(String angkaStr) throws NumberFormatException {
        int angka = Integer.parseInt(angkaStr);
        System.out.println("Hasil konversi: " + angka);
    }

    public static void main(String[] args) {
        Throws_Try_Catch konversi = new Throws_Try_Catch();

        // try-catch
        konversi.konversiTryCatch("200");
        konversi.konversiTryCatch("abc");
        System.out.println(" ");

        // throws
        try {
            konversi.konversiThrows("300");
            konversi.konversiThrows("xyz"); // Ini akan melempar kesalahan ke pemanggil
        } catch (NumberFormatException ex) {
            System.out.println("Kesalahan: Format angka tidak valid.");
        }
    }
}