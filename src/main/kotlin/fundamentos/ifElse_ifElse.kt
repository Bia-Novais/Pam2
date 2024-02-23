fun main(args: Array<String>){
    val nota = 9
//Usando operador range
    if (nota in 9<=..<=10){
        println("Fantástico")
    }else if (nota in 7 <=..<=8){
        println("Parabéns")
    }else if (nota in 4<=..<=6){
        println("tem como recuperar")
    } else if (nota in 0<=..<=3){
        println("te vejo no próximo ano")
    } else {
        println("Nota inválida")
    }
}