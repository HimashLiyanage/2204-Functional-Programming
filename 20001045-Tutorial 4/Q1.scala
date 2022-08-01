object interest extends App {

    print("Enter amount: ");
    var value = scala.io.StdIn.readDouble();
    println("Interest: " + interest(value))

    def interest(value: Double): Double = value match
    {
        case x if value<=20000 => x*0.02
        case x if value<=200000 => x*0.04
        case x if value<=2000000 => x*0.035
        case x if value>2000000 => x*0.065
    }
}