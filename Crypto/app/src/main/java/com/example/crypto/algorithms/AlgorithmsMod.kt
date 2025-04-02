package com.example.crypto.algorithms

object AlgorithmsMod {

    //Mod65537
    fun multiplyMod7(a: String): Int {
        val result = a.toLong() % 65537
        return if (result == 65536L) 0 else result.toInt()
    }

    //Mod65536
    fun multiplyMod6(a: String): Int {
        return a.toInt() and 0xFFFF
    }
}