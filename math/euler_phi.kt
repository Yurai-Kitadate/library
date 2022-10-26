//https://onlinejudge.u-aizu.ac.jp/courses/library/6/NTL/1/NTL_1_D
fun euler_phi(n:Long):Long{
    var fac = factorization(n)
    var res = 1L
    for (i in fac){
        res *= i.first - 1
    }
    return res
}
fun factorization(n:Long):MutableList<Pair<Long,Long>>{
    var now = n
    var res : MutableList<Pair<Long,Long>> = mutableListOf()
    for (i in 2..sqrt(n.toDouble()).toLong() + 5){
        if (now == 1L)break
        if (now % i == 0L){
            var cnt = 0L
            while (now % i == 0L){
                now = now / i
                cnt += 1L
            }
            res.add(Pair(i,cnt))
        }
    }
    if (now != 1L){
        res.add(Pair(now,1))
    }
    return res
}