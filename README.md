# Pemrograman Berorientasi Objek – Pertemuan Keempat

## Topik Utama
- 🗄️  CRUD (Create, Read, Update, Delete)
- ⚠️ Exception Handling (Try-Catch, Throws) 
- 🛠️ Custom Exception 

---

## 📑 Daftar Isi 
- [CRUD (Create, Read, Update, Delete)](https://github.com/fauziaeka/TugasPBO_TM04/blob/main/PBO_PertemuanKeempat.java)
- [Exception Handling (Try-Catch dan Throws)](https://github.com/fauziaeka/TugasPBO_TM04/blob/main/Throws_Try_Catch.java)
- [Custom Exception](https://github.com/fauziaeka/TugasPBO_TM04/blob/main/Exception_Zia.java)
- Kesimpulan

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
Konsep operasi Create yakni menambahkan data baru ke dalam database. Pada program ini memasukkan data tiket seperti id tiket, nama event, tanggal, harga, jumlah serta lokasi event. Data kemudian disimpan dengan menggunakan perintah 'Insert'.  

#### 📖 READ (Menampilkan Data) 
Konsep operasi Read yakni menampilkan semua data yang telah ditambahkan. Dalam hal ini, yang akan ditampilkan adalah data tiket yang berisii ide tiket, nama event, tanggal, harga, jumlah, serta lokasi event.

#### 🔄 UPDATE (Memperbarui Data) 
Konsep operasi Update yakni memperbarui atau mengganti data yang sebelumnya telah ditambahkan dengan mengisi primary key (ide tiket) kemudian mengisi data dengan yang baru (nama event, tanggal, harga, jumlah maupun lokasi event).  

#### ❌ DELETE (Menghapus Data) 
Konsep operasi Delete yakni dengan memilih id tiket yang akan dihapus. Kemudian, akan muncul pesan yang menyatakan bahwa data telah berhasil dihapus. Apabila data tidak berhasil dihapus makan akan muncul pesan kesalahan.  

---

## ⚠️ Exception Handling (Try-Catch dan Throws)

Exception Handling adalah proses menangani kesalahan yang tidak terduga selama eksekusi program.

### Try-Catch
Pada Program ini, Try Catch digunakan untuk menangkap kesalahn yang mungkin terjadi. Blok Try digunakan untuk menempatkan kode yang rawan kesalahan kemudian, jika terjadi kesalahan maka blok catch akan menangkapnya. 

### Throws
Digunakan untuk melempar exception secara eksplisit dari suatu metode atau blok kode.

### Penjelasan Kode
- **Method KonversiTryCatch**: Pada method ini program mencoba untuk menonversi String angkastr menjadi Integer. Jika konversi gagal (misalnya memasukkan huruf bukan angka) maka akan menangkap NumberFormatException dan mencetak pesan kesalahan.  
- **Method KonversiThrows**: Pada method ini mengonversi string menjadi integer tetapi tidak menangkap kesalahan didalam method itu sendiri. Jika konversi gagal, NumberFormatException akan dilemparkan ke pemanggil method ini kemudian menangkap kesalahan tersebut.  
- **Method Main**: Pada method main ini object dikonversi dari class Throws_Try_Catch. Kemudian,
  Method konversiTryCatch dipanggil 2 kali : 
  - Dengan argumen "200" (valid) 
  - Dengan argumen "abc" (tidak valid karena merupakan huruf) 
  Method konversiThrows juga dipanggil 2 kali : 
  - Dengan argumen "300" (valid) 
  - Dengan argumen "xyz" (tidak valid). Kemudian, akan melemparkan NumberFormatException dan ditangkap dalam blok try-catch 
---

## 🛠️ Custom Exception

Custom exception adalah jenis exception yang didefinisikan oleh pengguna dalam program untuk menangani kondisi kesalahan yang spesifik dan tidak tercakup oleh exception standar yang disediakan oleh bahasa pemrograman. Program ini adalah custom exception 'Exception_Zia' yang merupakan turunan dari NumberFormatException.   
   - Exception_Zia menangkap kondisi khusus (angka kurang dari 200) 
   - NumberFormatException menangkap kesalahn saat format string tidak valid misalnya "abc" 


---

## 📝 Kesimpulan

- **CRUD** : operasi dasar untuk menambahkan, menampilkan, memperbarui, dan menghapus data. 
- **Exception Handling**: Try-Catch menangani kesalahan secara langsung, sedangkan Throws digunakan untuk melempar exception secara eksplisit dari metode. 
- **Custom Exception**: Menangani kondisi kesalahan yang spesifik dan relevan dengan aplikasi, membuat penanganan kesalahan lebih tepat sasaran. 
