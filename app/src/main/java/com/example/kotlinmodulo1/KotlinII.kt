package com.example.kotlinmodulo1

import com.example.kotlinmodulo1.Kotlin2.Car
import com.example.kotlinmodulo1.Kotlin2.Person

class Kotlin2 {
    // 1. Declaración y uso de funciones básicas
    fun greet(name: String) {
        println("Hola, $name")
    }

    fun add(a: Int, b: Int): Int {
        val sum = a + b
        return sum
    }

    // 2. Funciones inline y de una sola expresión
    inline fun multiply(a: Int, b: Int) = a * b

    fun square(n: Int) = n * n

    // 3. Introducción a lambdas y funciones de orden superior
    fun lambdaExample() {
        val numbers = listOf(1, 2, 3, 4, 5)
        val doubledNumbers = numbers.map { it * 2 }
        println("Numeros duplicados: $doubledNumbers")
        val evenNumbers = numbers.filter { it % 2 == 0 }
        println("Numeros pares: $doubledNumbers")
    }

    // 4. Clases y objetos
    class Person(private val name: String, private var age: Int) {

        fun presentation(name: String, age: Int){
            println("Soy $name y tengo $age años")
        }
    }

    // 5. Constructores y datos encapsulados
    class Car(val brand: String, val model: String, val year: Int) {
        init {
            println("Auto creado: $brand $model del año $year")
        }
    }

}
fun main() {
    // Llamar a las funciones de prueba
    Kotlin2().greet("Gaston")
    println("Suma: ${Kotlin2().add(3, 5)}")
    println("Multiplicación: ${Kotlin2().multiply(4, 2)}")
    println("Cuadrado: ${Kotlin2().square(6)}")
    Kotlin2().lambdaExample()

    // Creación de objetos y uso de clases
    val person = Person("Juan", 30)
    person.presentation("Juan", 30)

    val car = Car("Toyota", "Corolla", 2022)
}