/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_pertemuankeempat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author win 10
 */
public class PBO_PertemuanKeempat {

    /**
     * @param args the command line arguments
     */
    Connection conn;
    Statement stmt;
    PreparedStatement pstmt = null;

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/PBO_PertemuanKeempat";
    String user = "postgres";
    String password = "123456";
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(inputStreamReader);

    public void tambah() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(koneksi, user, password);
            conn.setAutoCommit(false); // Nonaktifkan otomatis commit

            String sql = "INSERT INTO tiket(id_tiket, nama_event, tanggal, harga, jumlah, lokasi) VALUES(?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);

            boolean selesai = false;
            while (!selesai) {
                System.out.println("MASUKKAN DATA TIKET ");
                System.out.print("");
                System.out.print("ID Tiket : ");
                String id_tiket = input.readLine().trim();
                System.out.print("Nama Event : ");
                String nama_event = input.readLine().trim();
                System.out.print("Tanggal (YYYY-MM-DD) : ");
                String tanggal = input.readLine().trim();
                System.out.print("Harga : ");
                String harga = input.readLine().trim();
                System.out.print("Jumlah : ");
                String jumlah = input.readLine().trim();
                System.out.print("Lokasi : ");
                String lokasi = input.readLine().trim();
                

                pstmt.setLong(1, Long.parseLong(id_tiket));
                pstmt.setString(2, nama_event);
                pstmt.setDate(3, java.sql.Date.valueOf(tanggal));
                pstmt.setBigDecimal(4, new java.math.BigDecimal(harga));
                pstmt.setInt(5, Integer.parseInt(jumlah));
                pstmt.setString(6, lokasi);
                pstmt.executeUpdate();

                System.out.print("Apakah Anda ingin memasukkan data tiket lainnya? (iya/tidak): ");
                String pilihan = input.readLine().trim();
                if (!pilihan.equalsIgnoreCase("iya")) {
                    selesai = true; // Ubah ke true agar loop berhenti jika tidak ingin memasukkan data lagi
                }
            }

            conn.commit(); // Commit transaksi setelah sejumlah operasi-insert berhasil
            pstmt.close();
            conn.close();
            System.out.println("Sukses dalam satu transaksi.");
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            System.out.println("Terjadi kesalahan saat melakukan operasi insert dalam loop.");
            ex.printStackTrace();
            try {
                if (conn != null) {
                    conn.rollback(); // Batalkan transaksi jika terjadi kesalahan
                }
            } catch (SQLException e) {
                System.out.println("Gagal melakukan rollback transaksi.");
                e.printStackTrace();
            }
        }
    }

    public void tampil() {
        try {
            // TODO code application logi
            Class.forName(driver);
            String sql = "SELECT * FROM tiket";
            conn = DriverManager.getConnection(koneksi, user, password);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                ResultSet rs;
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(String.valueOf(rs.getObject(1)) + " " + String.valueOf(rs.getObject(2)) + " " + String.valueOf(rs.getObject(3)) 
                           + " " + String.valueOf(rs.getObject(4)) + " " + String.valueOf(rs.getObject(5)) + " " + String.valueOf(rs.getObject(6)));
                }
                conn.close();
            }

            stmt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PBO_PertemuanKeempat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PBO_PertemuanKeempat.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void hapus() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(koneksi, user, password);

            // Prompt the user for the dogtag of the record they want to delete
            System.out.print("Masukkan ID Tiket yang akan dihapus : ");
            String dogtagToDelete = input.readLine().trim();

            // Delete the record from the database
            String deleteSql = "DELETE FROM tiket WHERE id_tiket = ?";
            pstmt = conn.prepareStatement(deleteSql);
            pstmt.setLong(1, Long.parseLong(dogtagToDelete));
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("ID Tiket " + dogtagToDelete + " Penghapusan berhasil!");
            } else {
                System.out.println("ID Tiket" + dogtagToDelete + " tidak ada.");
            }

            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(PBO_PertemuanKeempat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {
        try {
            Class.forName(driver);
            String sql = "UPDATE tiket SET nama_event = ?, tanggal = ?, harga = ?, jumlah = ?, lokasi = ? WHERE id_tiket = ?";
            conn = DriverManager.getConnection(koneksi, user, password);
            pstmt = conn.prepareStatement(sql);

            System.out.print("Masukkan ID Tiket yang akan diupdate: ");
            String idTiketBaru = input.readLine().trim();
            System.out.print("Nama Event baru: ");
            String namaEventBaru = input.readLine().trim();
            System.out.print("Tanggal baru(YYYY-MM-DD): ");
            String tanggalBaru = input.readLine().trim();
            System.out.print("Harga baru: ");
            String hargaBaru = input.readLine().trim();
            System.out.print("Jumlah baru: ");
            String jumlahBaru = input.readLine().trim();
            System.out.print("Lokasi baru: ");
            String lokasiBaru = input.readLine().trim();

            pstmt.setString(1, namaEventBaru);
            pstmt.setDate(2, java.sql.Date.valueOf(tanggalBaru));
            pstmt.setBigDecimal(3, new java.math.BigDecimal(hargaBaru));
            pstmt.setInt(4, Integer.parseInt(jumlahBaru));
            pstmt.setString(5, lokasiBaru);
            pstmt.setInt(6, Integer.parseInt(idTiketBaru));
            
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data berhasil diupdate.");
            } else {
                System.out.println("Data tidak ditemukan.");
            }

            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(PBO_PertemuanKeempat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void menu() {
        boolean running = true; //tambahkan flag untuk memutuskan apakah program terus berjalan
        while (running){ //Loop sampai pengguna memilih untuk keluar
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Input Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Update Data");
        System.out.println("0. keluar");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());
            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    tambah();
                    break;
                case 2:
                    tampil();
                    break;
                case 3:
                    hapus();
                    break;
                case 4:
                    update();
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        } catch (IOException ex) {
            Logger.getLogger(PBO_PertemuanKeempat.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

    public static void main(String[] args) {
        new PBO_PertemuanKeempat().menu();
    }
}
