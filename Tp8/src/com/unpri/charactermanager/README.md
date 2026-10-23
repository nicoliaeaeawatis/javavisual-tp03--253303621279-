## TP8 — Character Manager GUI dan MVC

### 1. Hasil Implementasi

Program Character Manager dikembangkan menggunakan Java Swing untuk menampilkan data karakter melalui antarmuka grafis. Jendela aplikasi dibuat menggunakan kelas `MainWindow` yang mewarisi `JFrame`. Daftar karakter ditampilkan menggunakan perulangan sehingga jumlah karakter yang ditampilkan mengikuti data yang diterima. Aplikasi juga menampilkan statistik rata-rata level karakter.

### 2. Screenshot Program

**Sebelum perubahan data**

![alt text](<WhatsApp Image 2026-10-23 at 16.56.31.jpeg>)

**Sesudah perubahan data**

![alt text](<Screenshot 2026-10-23 165707.png>)

### 3. Alur Data dan Konsep MVC

Kelas `Main` membuat objek `CharacterManager` dan menambahkan data karakter ke dalamnya. Setelah data siap, `Main` mengambil daftar karakter melalui method `getAllCharacters()` dan mengirimkannya ke `MainWindow`. Kelas `MainWindow` berperan sebagai View yang menampilkan daftar karakter dan statistik rata-rata level menggunakan komponen Swing. `Character` merepresentasikan data karakter, sedangkan `CharacterManager` mengelola kumpulan karakter; pembagian ini mendukung pemisahan tanggung jawab dalam konsep MVC.

### 4. Karakter Baru

- **Luna — MAGE, Level 4:** dipilih sebagai karakter penyihir dengan level lebih tinggi untuk menambah variasi data dan menguji perhitungan rata-rata level.
- **Shadow — ASSASSIN, Level 3:** dipilih sebagai karakter dengan tipe dan level berbeda agar daftar karakter lebih bervariasi.

### 5. Analisis GUI dan MVC

Dokumen analisis Google Docs:

https://docs.google.com/document/d/1WgdkmDLjdXs29X6b9svGmMbkJYP3vYm12wEynH6O9p8/edit?usp=sharing