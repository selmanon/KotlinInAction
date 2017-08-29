package com.kotlin.action.kotlininaction

/**
 * Created by abdellahselassi on 8/28/17.
 */

/*
 Generic functions
  */
var letters = ('a'..'z').toList()

fun main(args: Array<String>) {
    println(letters.slice<Char>(0..2)) // the method type parameter is declared explicitly
    println(letters.slice(3..6)) // the method type parameter is infered
}

/*
Declaring generic classes
 */

interface List<T> {
    operator fun get(index: Int): T
}

// A class can even refer to itself as a type argument.

interface Comparable<T> {
    fun compareTo(other: T): Int
}

/*
class String : Comparable<String> {
    override fun compareTo(other: String): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
*/

/*
Type parameter constraints
 */

fun typeArgumentExtendNumber() {
    println(listOf(1, 2, 3).sum()) // println(listOf("1","2", "3").sum()) compiler will complain about the arguments supplied "1","2","3"
}

/*
Making type parameters non-null
 */
class Processor<T : Any> {
    fun process(value: T) {

    }
}

