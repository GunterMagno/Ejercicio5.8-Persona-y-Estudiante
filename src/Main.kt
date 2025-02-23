
fun main() {

    val persona = Persona("Lucía", 2000)
    val estudiante = Estudiante("Carlos", 2003, "Ingeniería")

    println(persona)
    println("Persona(nombre = ${persona.nombre} edad = ${persona.edad})")
    persona.actividad()
    persona.cumple()
    println("Persona(nombre = ${persona.nombre} edad = ${persona.edad})")

    println(estudiante)
    estudiante.actividad()

    try {
        val personaInvalida = Persona("", 2025)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
    try {
        val personaInvalida = Persona("a", 2025)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}