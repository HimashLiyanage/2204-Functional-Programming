object upperLower extends App{

    println(formatName("Benny",toUpper))
    println(formatName("Niroshan",oneAndTwoUpper))
    println(formatName("Saman",toLower))
    println(formatName("Kumara",firstAndLastUpper))

    def toLower(text:String):String = {
        text.toLowerCase()
    }
    
    def toUpper(text:String):String = {
        text.toUpperCase()
    }

    def oneAndTwoUpper(text: String): String = {
        toUpper(text.substring(0,2)) + toLower(text.substring(2, text.length()))
    }

    def firstAndLastUpper(text: String): String = {
        toUpper(text.substring(0, 1)) + toLower(text.substring(1, text.length() - 1)) 
        + toUpper(text.substring(text.length() - 1, text.length()))
    }
        
    def formatName(text: String, format: String => String): String = {
        format(text)
    }

}