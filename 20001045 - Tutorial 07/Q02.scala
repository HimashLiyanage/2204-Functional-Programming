object Q2 extends App {
    val x = new RationalNum(3,4)
    val y = new RationalNum(5,8)
    val z = new RationalNum(2,7)
  
    val a = x-y-z
    
    println(a)
}

class RationalNum(n:Int, d:Int) {
    require(d > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d
    def neg = new RationalNum(-this.numer, this.denom)
    def add(r:RationalNum) = new RationalNum(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    def -(r:RationalNum) = this.add(r.neg)

    override def toString(): String = numer + "/" + denom
}
