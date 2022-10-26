//https://onlinejudge.u-aizu.ac.jp/courses/library/6/NTL/1/NTL_1_B
fun pow(a:Long,b:Long,mod:Long):Long{
    var now = 1L
    var exponent = b
    if (b == 0L)return 1L
    var p = 2L.shl(60)
    while (p > 0L){
        now *= now
        now %= mod
        if ((exponent and p) > 0){
            now *= a
            now %= mod
            exponent -= (exponent and p)
        }
        p /= 2L
    }
    return now.toLong()
}