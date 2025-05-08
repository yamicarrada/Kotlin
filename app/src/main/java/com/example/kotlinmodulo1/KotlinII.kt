package com.example.kotlinmodulo1

//Funciones Basicas
//Escribí una función que reciba dos números y retorne su suma.
fun suma(a: Int, b: Int): Int {
    return a + b
}

//Creá una función que tenga parámetros opcionales.
fun saludar(nombre: String = "Juan", edad: Int? = null) {
    if (edad != null) {
        println("Hola, me llamo $nombre y tengo $edad años.")
    } else {
        println("Hola, me llamo $nombre.")
    }
}

//función inline
inline fun saludarInLine(nombre: String = "Juan") {
    println("Hola, $nombre")
}

//función de una sola expresion
fun resta(a: Int, b: Int) = a - b


//Lambdas y funciones de orden superior
//Definí una función lambda que reciba un número y retorne su cuadrado.
val cuadrado: (Int) -> Int = { num -> num * num }

//Usá map y filter para transformar una lista de números.
val numeros = listOf(1,2,3,4)
val numerosImpares = numeros.filter { it % 2 != 0 }
val numerosCuadrados = numeros.map { it * it }

//Creá una función de orden superior que reciba otra función como parámetro.
fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

//Clases y objetos
//Declarar una clase Persona con propiedades nombre y edad.
//Agregale un metodo que imprima esa información.
internal class Persona(
    //constructor primario
    val nombre: String,
    var edad: Int,
){
    private var numTelefono: Long = 0

    //constructor secundario
    constructor(nombre: String, edad: Int, numTelPersona: Long) : this(nombre, edad){
        numTelefono = numTelPersona
    }
    //Usá un bloque init para inicializar valores.
    init {
        numTelefono = 2651798754
    }

    fun imprimirInfo(nombre: String, edad: Int){
        println("Nombre: $nombre, Edad: $edad")
    }

    protected fun obtenerTelefonoComoString(): String {
        return numTelefono.toString()
    }
    fun obtenerTelefono(nombre: String){
        println("Numero de telefono de $nombre: ${obtenerTelefonoComoString()}")
    }

}

fun main() {
    val resultado = suma(5, 3)
    println("Resultado de la suma: $resultado")

    saludar("Martin", 30)

    saludarInLine("Mariana")

    val resultadoResta = resta(10, 7)
    println("Resultado de la resta: $resultadoResta")

    println("Cuadrado de un numero: " + cuadrado(3))

    println("Numeros impares: $numerosImpares")
    println("Numeros al cuadrado: $numerosCuadrados")

    val multiplicar = operar(5, 3) { a, b -> a * b }
    println("Funcion orden superior, multiplicar: $multiplicar")

    //Instanciá objetos de esa clase y mostralos.
    val persona1 = Persona("Mariana", 26)
    persona1.imprimirInfo(persona1.nombre, persona1.edad)

    val persona2 = Persona("Martin", 30)
    persona2.imprimirInfo(persona2.nombre, persona2.edad)

    val persona3 = Persona("Martin", 30, 2651798754)
    persona3.imprimirInfo(persona3.nombre, persona3.edad)

    persona3.obtenerTelefono(persona3.nombre)
}