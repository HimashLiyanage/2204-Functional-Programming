@main def hello: Unit =

    def Cost(NoCopies:Int):Double = NoCopies match{
        case x if x<=50 => x*24.95*0.6 + 3
        case x if x>50 =>x*24.95*0.6 + (x-50)*0.75 + 3
    }

    println(Cost(60));

