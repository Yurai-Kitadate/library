//https://onlinejudge.u-aizu.ac.jp/problems/NTL_1_A
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