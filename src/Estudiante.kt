
class Estudiante(nombre: String, anioNacimiento: Int, private val carrera: String) : Persona(nombre, anioNacimiento) {
    override fun actividad() {
        println("$nombre está estudiando $carrera.")
    }

    override fun toString(): String {
        return super.toString() + ", carrera = $carrera"
    }
}
