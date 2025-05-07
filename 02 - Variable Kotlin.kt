fun main() {
//    Deklarasi variabel tipe data dasar dengan menyamtumkan tipe data nya dengan val
    val nama: String = "Haryanto Nugroho"
    val umur: Int = 22
    val tinggi: Double = 175.5
    val berat: Float = 56.0f

//    Deklarasi variabel tanpa menyantumkan tipe data dan dengan jenis var (bisa diubah)
    var statusPelajar = true
    var golonganDarah = 'A'

//    Menampilkan variabel
    println("Nama: $nama")
    println("Umur: $umur tahun")
    println("Tinggi: $tinggi cm")
    println("Berat: $berat kg")
    println("Menikah: $statusPelajar")
    println("Golongan Darah: $golonganDarah")
    println("")

//    mengubah value dari var
    statusPelajar = false
    golonganDarah = 'O'

    if (!statusPelajar) {
        println("==========================")
        println("Kamu sudah LULUS")
        println("Golongan Darah : " + golonganDarah)
    }
}