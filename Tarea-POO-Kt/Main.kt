fun main() {
    val animales = listOf(Perro(), Gato())
    for (animal in animales) {
        animal.hacerSonido()
    }
}