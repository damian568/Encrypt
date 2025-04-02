package com.example.crypto.algorithms

object AlgorithmsBinaryAndDec {

    fun binaryToDecimal(binary: String): Int {
        return binary.toInt(2)
    }

    fun decimalToBinary(decimal: Int): String {
        return String.format("%16s", Integer.toBinaryString(decimal)).replace(' ', '0')
    }
}