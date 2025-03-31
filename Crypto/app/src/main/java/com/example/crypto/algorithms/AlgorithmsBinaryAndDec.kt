package com.example.crypto.algorithms

object AlgorithmsBinaryAndDec {

    fun binaryToDecimal(binary: String): String {
        return binary.toInt(2).toString()
    }

    fun decimalToBinary(decimal: Int): String {
        if (decimal == 0) return "0"  // Handle edge case

        var num = decimal
        val binary = StringBuilder()

        while (num > 0) {
            binary.append(num % 2)  // Get remainder (0 or 1)
            num /= 2  // Divide by 2
        }

        return binary.reverse().toString()  // Reverse the collected remainders
    }
}