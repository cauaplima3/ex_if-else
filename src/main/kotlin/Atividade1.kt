class Atividade1 {
    fun atividade1():Unit{
        println("Digite o primeiro número:")
        val a = readLine()!!.toFloat()
        println("Digite o segundo número:")
        val b = readLine()!!.toFloat()
        println("Digite o terceiro número")
        val c = readLine()!!.toFloat()

        if (a + b > c && a + c > b && b + c > a) {
            println("Os lados formam um triangulo!");
            if (a == b && a == c)
                println("Equilátero");
            else if (a == b || a == c || b == c)
                println("Isósceles");
            else
                println("Escaleno");
        }
        else
            println("Os lados não formam um triangulo!");
    }
}