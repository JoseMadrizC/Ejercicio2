class Videojuego : Entregable{
    var Titulo : String = ""
    var HoraEstimada : Float = 10F
    var Entregado : Boolean = false
    var Genero : String = ""
    var Compania : String = ""

    constructor()
    constructor(Titulo: String, HoraEstimada: Float) {
        this.Titulo = Titulo
        this.HoraEstimada = HoraEstimada
    }

    constructor(Titulo: String, HoraEstimada: Float, Genero: String, Compania: String) {
        this.Titulo = Titulo
        this.HoraEstimada = HoraEstimada
        this.Genero = Genero
        this.Compania = Compania
    }

    override fun Entregar() {
        Entregado = true
    }

    override fun Devolver() {
        Entregado = true
    }

    override fun EsEntregado() : Boolean {
        return Entregado
    }


}