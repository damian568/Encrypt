package com.example.crypto.algorithms

import com.example.crypto.encryption.charToBinaryMap

object AlgorithmsOperations {

    fun binaryOperationsW1(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 8) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        val a1 = binaryPlain[0]
        val a2 = binaryPlain[1]
        val x1 = AlgorithmsBinaryAndDec.binaryToDecimal("$a1$a2")
        val b1 = binaryKey[0]
        val b2 = binaryKey[1]
        val z1 = AlgorithmsBinaryAndDec.binaryToDecimal("$b1$b2")
        val w1 = binaryOperationsMultiply(x1, z1)

        return w1
    }

    private fun binaryOperationsMultiply(x: String, z: String): String {
        val w = x.toLong() * z.toLong()
        return w.toString()
    }

    private fun binaryOperationsSum(x: String, z: String): String {
        val w = x.toLong() + z.toLong()
        return w.toString()
    }

    private fun binaryOperationsXOR(x: String, z: String): String {
        val w = x.toLong() xor z.toLong()
        return w.toString()
    }
}