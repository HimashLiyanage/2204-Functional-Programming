@main def hello: Unit = 

  def Basic(h:Int):Double= h * 250.00  

  def OT(h:Int):Double = h * 85.00

  def Total(normal:Double, ot:Double):Double = normal + ot

  def tax(income:Double):Double = income * 12/100

  def salary(income:Double, tax:Double):Double = income - tax
  
  println(Basic(40))
  println(OT(30))
  println(Total(Basic(40),OT(30)))
  println(tax(Total(Basic(40),OT(30))))
  println(salary(Total(Basic(40),OT(30)),tax(Total(Basic(40),OT(30)))))