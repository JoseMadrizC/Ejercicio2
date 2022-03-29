import Serie
import Videojuego
fun main(args: Array<String>) {
    println("Hello World!")
    var serie1 = Serie("Batman", 3, "Sangriento", "Josh")
    var serie2 = Serie("Superman", 3, "Sangriento", "Josh")
    var serie3 = Serie("Wonder Woman", 3, "Sangriento", "Josh")
    var serie4 = Serie("Aquaman", 3, "Sangriento", "Josh")
    var serie5 = Serie("Flash", 3, "Sangriento", "Josh")

    var juego1 = Videojuego("God of war", 10F, "R", "Santa Monica")
    var juego2 = Videojuego("God of war 2", 10F, "R", "Santa Monica")
    var juego3 = Videojuego("God of war 3", 10F, "R", "Santa Monica")
    var juego4 = Videojuego("God of war 4", 10F, "R", "Santa Monica")
    var juego5 = Videojuego("God of war 5", 10F, "R", "Santa Monica")

    var arreglo1 = arrayOf<Serie>()
    arreglo1 = arreglo1.plus(serie1)
    arreglo1 = arreglo1.plus(serie2)
    arreglo1 = arreglo1.plus(serie3)
    arreglo1 = arreglo1.plus(serie4)
    arreglo1 = arreglo1.plus(serie5)

    var arreglo2 = arrayOf<Videojuego>()
    arreglo2 = arreglo2.plus(juego1)
    arreglo2 = arreglo2.plus(juego2)
    arreglo2 = arreglo2.plus(juego3)
    arreglo2 = arreglo2.plus(juego4)
    arreglo2 = arreglo2.plus(juego5)

    for (i in arreglo1.indices){
        println(arreglo1[i].Titulo)
    }
    juego1.Entregar()
    juego2.Entregar()

    for (i in arreglo2.indices){
        println(arreglo2[i].Entregado)
    }


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}