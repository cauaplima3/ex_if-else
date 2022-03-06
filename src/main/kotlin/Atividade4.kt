class Atividade4 {
    fun atividade4():Unit {
        println("Qual o tipo de combustivel? :")
        var a = readLine()!!.toFloat()
        var g = readLine()!!.toFloat()
        var combustivel = readLine()!!.toFloat()
        println("Quantos litros ? :: ")
        var litro = readLine()!!.toFloat()
        var desconto1 = readLine()!!.toFloat()
        var desconto2 = readLine()!!.toFloat()
        var desconto3 = readLine()!!.toFloat()
        var desconto4 = readLine()!!.toFloat()
        var custo = readLine()!!.toFloat()
        var gasolina = readLine()!!.toFloat()

        if ((combustivel == a) && (litro <= 20) && (custo == 3.5F))
            desconto1 = (custo * 3) / 100

        println("Desconto do Combustivel")


        if ((combustivel== a) && (litro >= 20 ) && (custo == 4.6F))
            desconto2 = (custo * 5) / 100

        println("Desconto de Combustivel")


        if  ((combustivel == g ) && (litro<=20 ) && (custo==5.3F))
            desconto3 = (custo * 4)/100

        else ((combustivel == g) && (litro>=20) && (custo==5.6F))
        desconto4 = (custo * 6) / 100
    }
}
