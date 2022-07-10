@main def hello: Unit = 

  def Attendence(TPrice:Double):Double = 120 + (15-TPrice) / 5*20

  def Income(TPrice:Double):Double = Attendence(TPrice) * TPrice

  def Cost(TPrice:Double):Double= 500 + 3 * Attendence(TPrice)
  
  def Profit(TPrice:Double):Double = Income(TPrice) - Cost(TPrice)

  println("If price decreased by Rs.5")
  println(Attendence(10))
  println(Income(10))
  println(Cost(10))
  println(Profit(10))

  println("If price increased by Rs.5")
  println(Attendence(20))
  println(Income(20))
  println(Cost(20))
  println(Profit(20))
