
open class Persona(val nombre: String, private val anioNacimiento: Int) {
    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío." }
        require(anioNacimiento in 1900..2024) { "El año de nacimiento debe ser válido." }
    }

    var edad: Int = 0
        private set
        get() = anio - anioNacimiento

    open fun actividad() {
        println("$nombre está realizando una actividad.")
    }

    fun cumple() {
        anio += 1
        println("¡Feliz cumpleaños, $nombre! Ahora tienes $edad años.")
    }

    override fun toString(): String {
        return "Persona(nombre = $nombre, edad = $edad)"
    }

    companion object{
        var anio: Int = 2024
    }
}