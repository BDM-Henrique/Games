import br.com.alura.alugames.modelo.Gamer

fun main(){
    val gamer1 = Gamer(nome = "José", email = "josegomes@gmail.com")
    println(gamer1)

    val gamer2 = Gamer(
        nome = "Brenda",
        email = "brenda@email.com",
        dataNascimento = "11/11/2000",
        usuario = "papa")
    println(gamer2)

    gamer1.let {
        it.dataNascimento = "11/11/2000"
        it.usuario = "pepe"

    }.also { 
        println(gamer1.idInterno)
    }
    println(gamer1)
    gamer1.usuario = "pipi"
    println(gamer1)
}