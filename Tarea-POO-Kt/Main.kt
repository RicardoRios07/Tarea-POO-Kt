fun main() {
    val vehiculos = listOf(Coche(), Bicicleta())
    for (vehiculo in vehiculos) {
        vehiculo.acelerar()
    }

    val formas = listOf(Circulo(25.0), Cuadrado(16.0))
    for (forma in formas) {
        forma.dibujar()
    }
}
