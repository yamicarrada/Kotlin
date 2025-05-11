package com.example.kotlinmodulo1

import com.example.kotlinmodulo1.Kotlin3.Dog

class Kotlin3 {

    // 1. Herencia y polimorfismo básicos
    open class Animal(val name: String) {
        open fun makeSound() {
            println("El animal hace un sonido")
        }
    }

    class Dog(name: String) : Animal(name) {
        override fun makeSound() {
            println("$name ladra")
        }
    }

    // 2. Colecciones en Kotlin
    fun collectionOperations() {
        val numbers = mutableListOf(1, 2, 3, 4, 5)
        println("Numeros: $numbers")
        // TODO: Agregar el número 6 a la lista
        numbers.add(6)
        // TODO: Remover el número 2 de la lista
        numbers.remove(2)
        println("Numeros actualizados: $numbers")
        // TODO: Usar map para duplicar los valores
        val doubleNumbers = numbers.map { num -> num * 2 }
        println("Numeros duplicados: $doubleNumbers")
        // TODO: Usar filter para obtener solo los números impares
        val oddNumbers = numbers.filter {num -> num % 2 != 0}
        println("Numeros impares: $oddNumbers")
    }

    // 3. Clases de datos y destructuración
    data class Person(val name: String, val age: Int)

    fun dataClassExample() {
        val person1 = Person("Juan", 30)
        println("Persona 1: $person1")
        // TODO: Crear una copia de person1 con otro nombre
        val person2 = person1.copy("Maria")
        println("Persona 2: $person2")
        // TODO: Comparar person1 con su copia
        val compare = person1 == person2
        println("Son iguales? $compare")
        // TODO: Usar destructuración para obtener name y age
        val (name, age) = person1
        println("Nombre: $name, Edad: $age")
    }

}
fun main(){
    // Herencia y polimorfismo
    val dog = Dog("Firulais")
    dog.makeSound()

    // Colecciones
    Kotlin3().collectionOperations()

    // Clases de datos y destructuración
    Kotlin3().dataClassExample()
}