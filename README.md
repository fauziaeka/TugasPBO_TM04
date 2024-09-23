# Pemrograman Berorientasi Objek – Pertemuan Keempat

## Topik Utama
- 🗄️  CRUD (Create, Read, Update, Delete)
- ⚠️ Exception Handling (Try-Catch, Throws) 
- 🛠️ Custom Exception 

---

## 📑 Table of Contents
- CRUD (Create, Read, Update, Delete)[TugasPBO_TM04/PBO_PertemuanKeempat.java](https://github.com/fauziaeka/TugasPBO_TM04/blob/main/PBO_PertemuanKeempat.java)
- Exception Handling (Try-Catch dan Throws)[TugasPBO_TM04/Throws_Try_Catch.java](https://github.com/fauziaeka/TugasPBO_TM04/blob/main/Throws_Try_Catch.java)
- Custom Exception[TugasPBO_TM04/Exception_Zia.java](https://github.com/fauziaeka/TugasPBO_TM04/blob/main/Exception_Zia.java)

---

## 📝 CRUD (Create, Read, Update, Delete)

**PBO_PertemuanKeempat** adalah contoh aplikasi Java yang digunakan untuk mengelola data tiket. Aplikasi ini memungkinkan pengguna untuk melakukan operasi dasar CRUD seperti Create (membuat), Read (menampilkan), Delete (menghapus) dan Update (memperbarui) data tiket dalam basis data PostgreSQL.  

### Langkah-langkah
1. Buat database baru di PostgreSQL dengan nama 'PBO_PertemuanKeempat`. 
2. Sambungkan PostgreSQL dan NetBeans. 
3. Buat tabel 'karcis' pada database yang telah dibuat. 
4. Isi variabel user dan password sesuai pengaturan PostgreSQL. 
5. Pilih menu yang diinginkan dengan memasukkan angka yang sesuai:
   - Pilih opsi 1 untuk menambah tiket dan masukkan semua informasi yang diminta 
   - Pilih opsi 2 untuk menampilkan data tiket 
   - Pilih opsi 3 untuk menghapus tiket dan masukkan ID tiket yang ingin dihapus 
   - Pilih opsi 4 Untuk memperbarui tiket dan masukkan ID tiket serta informasi baru yang ingin diperbarui 

### Operasi CRUD

#### ➕ CREATE (Menambah Data) 
Menambahkan data baru ke dalam database, termasuk ID tiket, nama event, tanggal, harga, jumlah, dan lokasi event. Data disimpan menggunakan perintah 'insert'.

#### 📖 READ (Menampilkan Data) 
Menampilkan semua data yang telah ditambahkan, termasuk ID tiket, nama event, tanggal, harga, jumlah, dan lokasi event.

#### 🔄 UPDATE (Memperbarui Data) 
Memperbarui data yang telah ditambahkan dengan mengisi primary key (ID tiket) dan data baru (nama event, tanggal, harga, jumlah, dan lokasi event).

#### ❌ DELETE (Menghapus Data) 
Menghapus data dengan memilih ID tiket yang diinginkan. Pesan akan muncul untuk mengonfirmasi penghapusan atau menunjukkan kesalahan jika gagal.

---

## ⚠️ Exception Handling (Try-Catch dan Throws)

Exception Handling adalah proses menangani kesalahan yang tidak terduga selama eksekusi program.

### Try-Catch
Digunakan untuk menangkap kesalahan yang mungkin terjadi. Blok Try menempatkan kode yang rawan kesalahan, dan jika terjadi kesalahan, blok Catch akan menangkapnya.

### Throws
Digunakan untuk melempar exception secara eksplisit dari suatu metode atau blok kode.

### Penjelasan Kode
- **Method KonversiTryCatch**: Mencoba mengonversi String menjadi Integer. Jika konversi gagal (misalnya, memasukkan huruf), `NumberFormatException' akan ditangkap dan pesan kesalahan dicetak. 
- **Method KonversiThrows**: Mengonversi string menjadi integer tanpa menangkap kesalahan di dalam metode itu sendiri. Jika konversi gagal, `NumberFormatException' akan dilemparkan ke pemanggil metode. 
- **Method Main**: Memanggil kedua metode dengan argumen valid dan tidak valid. 

---

## 🛠️ Custom Exception

Custom exception adalah jenis exception yang didefinisikan oleh pengguna untuk menangani kondisi kesalahan spesifik yang tidak tercakup oleh exception standar.

### Contoh
- **Exception_Zia** Turunan dari `NumberFormatException' yang menangkap kondisi khusus (angka kurang dari 200) dan memberikan pesan kesalahan yang relevan. 

---

## 📝 Kesimpulan

- **CRUD** adalah operasi dasar untuk menambahkan, menampilkan, memperbarui, dan menghapus data. 
- **Exception Handling**: Try-Catch menangani kesalahan secara langsung, sedangkan Throws digunakan untuk melempar exception secara eksplisit dari metode. 
- **Custom Exception**: Menangani kondisi kesalahan yang spesifik dan relevan dengan aplikasi, membuat penanganan kesalahan lebih tepat sasaran. 
