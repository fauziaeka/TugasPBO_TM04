/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author win 10
 */
// Kelas yang merepresentasikan exception yang didefinisikan pengguna
public class Exception_Zia extends NumberFormatException {

    public Exception_Zia(String message) {
        super(message);
    }

    // Kelas utama yang menggunakan Exception_Zia
    public static void main(String[] args) {
        String[] inputAngka = {"123", "abc", "456"};

        for (String angkaStr : inputAngka) {
            try {
                // Mencoba untuk mengonversi string ke integer
                int angka = Integer.parseInt(angkaStr);
                System.out.println("Hasil Konversi: " + angka);
                
                // Melempar Exception_Zia jika angka kurang dari 200
                if (angka < 200) {
                    throw new Exception_Zia("Angka kurang dari 200: " + angka);
                }

            } catch (Exception_Zia ea) {
                System.out.println("Exception ditangkap");
                System.out.println(ea.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println("Kesalahan: Format angka tidak valid.");
            }
        }
    }
}