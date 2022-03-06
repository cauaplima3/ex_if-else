class Atividade2 {
    fun atividade2():Unit {
        println("Digite um ano: ")
        val ano = readLine()!!.toInt()

        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0))
            print("$ano é ano bissexto")
        else
            print("$ano não é ano bissexto")
    }
}