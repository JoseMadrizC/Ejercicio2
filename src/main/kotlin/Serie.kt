class Serie : Entregable {

    var Titulo : String = ""
    var NumTemporadas : Int = 3
    var Entregado : Boolean = false
    var Genero : String = ""
    var Creador : String = ""

    constructor()
    constructor(Titulo: String, Creador: String) {
        this.Titulo = Titulo
        this.Creador = Creador
    }

    constructor(Titulo: String, NumTemporadas: Int, Genero: String, Creador: String) {
        this.Titulo = Titulo
        this.NumTemporadas = NumTemporadas
        this.Genero = Genero
        this.Creador = Creador
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