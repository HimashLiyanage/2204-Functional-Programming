object oddEven extends App {

    print("Enter number: ");
    var number = scala.io.StdIn.readInt();
    println(OddorEven(number))

    def OddorEven(number: Int): String =  number match
    {
        case x if number<=0 => "Input is negative or zero"
        case x if number%2==0 => "Input is an even number"
        case x if number%2!=0 => "Input is an odd number"
    }

}