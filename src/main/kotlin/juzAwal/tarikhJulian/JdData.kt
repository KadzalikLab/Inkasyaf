package juzAwal.tarikhJulian

class JdData (
    //Constructor
    var pukul: Double = 0.0,
    var tanggal: Int = 10,
    var bulan: Int = 6,
    var tahun: Int = 2021,

){

    //Properties
    val bulanHisab = if (bulan<3.0) bulan+12 else bulan
    val tahunHisab = if (bulan<3.0) tahun-1 else tahun
    val a = (tahunHisab / 100.0).toInt()
    val ak = (a / 4.0).toInt()
    val b = 2 + ak - a
    val ac = (365.25 * tahunHisab).toInt()
    val bc = (30.6001 * (bulanHisab + 1)).toInt()
    val jd = 1720994.5 + ac + bc + tanggal + b + pukul / 24.0

}

fun main (){
    val jd = JdData(tahun = 2025)
//    jd.tahun=2024
    println(jd.tahun)


}