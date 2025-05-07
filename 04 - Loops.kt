fun main() {
//    Membuat segitiga terbalik dari bintang perulangan
    val jumlah = 5
    for (i in jumlah downTo 1) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}
