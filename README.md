"# Kelompok1" 

Anggota Kelompok:

Narasi Kasus:


Rancangan Kelas:
1. Transaksi
   - Atribut: tanggal, deskripsi, nominal
   - Method abstrak: hitungTotal()
2. Pengeluaran
   - Override hitungTotal(). return nominal + biayaAdmin atau nominal + (nominal * 0.11)
3. Pemasukkan
   - Atribut:
     tanggal: String
     deskripsi: String
     nominal: double

Method:

hitungTotal(): double (abstract → wajib di-override oleh subclass)

Getter & Setter untuk semua atribut
4. BukuKas
