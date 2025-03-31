package com.example.crypto.algorithms

object AlgorithmsMod {

    //Mod65537
    fun multiplyMod7(a: Int, b: Int): Int {
        val result = (a.toLong() * b.toLong()) % 65537
        return if (result == 65536L) 0 else result.toInt()
    }

    //Mod65536
    fun multiplyMod6(a: Int, b: Int): Int {
        return (a * b) and 0xFFFF
    }
}