class Atividade3 {
    fun atividade3(): Unit {
        println("Telefonou para a vítima? 1/Sim ou 0/Não")
        val resposta1 = readLine()!!.toInt()
        println("Esteve no local do crime? 1/Sim ou 0/Não")
        val resposta2 = readLine()!!.toInt()
        println("Mora perto da vítima? 1/Sim ou 0/Não")
        val resposta3 = readLine()!!.toInt()
        println("Devia para a vítima? 1/Sim ou 0/Não")
        val resposta4 = readLine()!!.toInt()
        println("Já trabalhou com a vítima? 1/Sim ou 0/Não")
        val resposta5 = readLine()!!.toInt()

        val somaDasRespostas = resposta1 + resposta2 + resposta3 + resposta4 + resposta5
        if (somaDasRespostas == 5)
            println("Assassino")
        else if (somaDasRespostas >= 3)
            println("Cúmplice")
        else if (somaDasRespostas == 2)
            println("Suspeito")
        else
            println("Inocente")


    }
}