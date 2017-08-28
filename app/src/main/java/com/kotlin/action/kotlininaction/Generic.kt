package com.kotlin.action.kotlininaction

/**
 * Created by abdellahselassi on 8/28/17.
 */

var letters = ('a'..'z').toList()

fun main(args: Array<String>) {
    println(letters.slice<Char>(0..2)) // the method type parameter is declared explicitly
    println(letters.slice(3..6)) // the method type parameter is infered
}