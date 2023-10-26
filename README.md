# Tiket-Perjalanan-Liburan-OOP-Java
Studi Kasus: Liburan Pembelian Tiket Perjalanan
Deskripsi Masalah:
Sebuah agen perjalanan ingin membuat program untuk mengelola penjualan tiket perjalanan. Program ini akan melibatkan pemesanan tiket untuk berbagai tujuan liburan. Setiap tujuan memiliki berbagai jenis tiket yang dapat dibeli, seperti tiket pesawat, tiket kereta, dan tiket bus.

Class dan Hubungan:
1.	**Destinasi**:
    •	Properties:
      o	Nama Destinasi
      o	Deskripsi Destinasi
    Association:
      ->	Daftar Tiket (ArrayList)
2.	**Tiket**:
    •	Properties:
      o	Nama Tiket
      o	Harga Tiket
    Inheritance:
      ->	TiketPesawat
      ->	TiketKereta
      ->	TiketBus
3.	**TiketPesawat**:
    •	Properties:
      o	Maskapai
      o	Kelas
4.	**TiketKereta**:
    •	Properties:
      o	JenisKereta
      o	Kursi
5.	**TiketBus**:
    •	Properties:
      o	Tipe Bus



Menu Program:
Berikut ini adalah menu untuk program manajemen penjualan tiket:
1.	Tambah Destinasi
2.	Lihat Daftar Destinasi
3.	Pesan Tiket
4.	Lihat Tiket yang Dipesan
5.	Keluar
Implementasi:
Anda dapat mengimplementasikan program ini dengan menggunakan ArrayList untuk menyimpan destinasi dan tiket yang dipesan. Program akan meminta input dari pengguna untuk memilih opsi di menu, dan akan mengeksekusi perintah sesuai dengan pilihan pengguna.
