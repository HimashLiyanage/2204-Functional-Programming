object Q1 extends App {
    val obj = new RationalNum(3,7)
    println(obj.neg)
}

class RationalNum(n:Int, d:Int) {
    require(d != 0, "denominator must be non-zero") 
    def numer = n
    def denom = d

    def neg = new RationalNum(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
}