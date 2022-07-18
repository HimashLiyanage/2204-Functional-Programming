@main def hello: Unit =
    def EPtime(d:Int):Int = 8*d
    def TPtime(d:Int):Int = 7*d

    println(EPtime(4)+TPtime(3));
