"# Kelompok1" 

Anggota Kelompok:
1. Alvian Prasetya
2. Yohanes Bintang
3. Blasius Kleden
4. Ignatius Christian
5. Nicholas Rio

Ringkasan Kasus:
Mahasiswa membutuhkan aplikasi untuk mencatat arus kas bulanan. Ada transaksi yang menambah saldo (misalnya uang saku dari orang tua, honor asisten praktikum) dan ada transaksi yang mengurangi saldo (misalnya pembayaran UKT/SKS dengan biaya admin tetap, atau biaya hiburan dengan PPN 11%).

Tujuan:
Membuat satu buku kas terpadu yang menyimpan semua riwayat transaksi. Sistem harus bisa menghitung otomatis saldo akhir sesuai aturan tiap transaksi.

Proses:
1. Mahasiswa mencatat setiap transaksi ke dalam buku kas.
2. Transaksi pemasukan menambah saldo.
3. Transaksi pengeluaran mengurangi saldo dengan tambahan biaya (admin/PPN).
4. Di akhir bulan, pengguna menekan tombol “Rekap”.
5. Sistem membaca seluruh transaksi, menghitung total pemasukan dan pengeluaran, lalu menampilkan saldo akhir beserta rinciannya.


Rancangan Kelas:
1. Transaksi
   - Atribut:
     tanggal: String
     deskripsi: String
     nominal: double
   - Method:
     hitungTotal(): double
     Getter dan Setter untuk semua atribut
2. Pemasukkan
   - Atribut tambahan:
     sumber: String
   - Method
     Construcctor dengan parameter tambahan sumber
     Getter dan Setter sumber
     Override hitungSaldo(). return nominal
3. Pengeluaran
   - Atribut:
     jenis: String
     adaAdmin: boolean
     kenaPPN: boolean
   - Method:
     Constructor dengan parameter tambahan jenis, adaAdmin, kenaPPN
     Getter dan Setter untuk atribut tambahan
     Override hitungSaldo() untuk atribut tambahan
4. BukuKas
   - Atribut
     daftarTransaksi: ArrayList<Transaksi>
   - Method
     tambahTransaksi(Transaksi t). menambahkan transaksi ke daftar
     rekapSaldo(). menghitung saldo akhir dengan membaca semua transaksi
     cetakLaporan(). menampilkan detail transaksi dan saldo akhir
