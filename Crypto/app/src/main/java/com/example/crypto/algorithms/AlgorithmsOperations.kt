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
        val mergingX1 = "$a1$a2"
        val x1 = AlgorithmsBinaryAndDec.binaryToDecimal("$a1$a2")

        val b1 = binaryKey[0]
        val b2 = binaryKey[1]
        val mergingZ1 = "$b1$b2"
        val z1 = AlgorithmsBinaryAndDec.binaryToDecimal("$b1$b2")

        val multi1 = binaryOperationsMultiply(x1.toLong(), z1.toLong()).toString()
        val w1 = AlgorithmsMod.multiplyMod7(multi1)
        val bin1 = AlgorithmsBinaryAndDec.decimalToBinary(w1)

        return "W1 = X1 * Z1 = $mergingX1 * $mergingZ1 = $x1 * $z1 = $multi1 mod65537 = $w1 = $bin1"
    }

    fun binaryOperationsW2(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 8) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        val a3 = binaryPlain[2]
        val a4 = binaryPlain[3]
        val mergingX2 = "$a3$a4"
        val x2 = AlgorithmsBinaryAndDec.binaryToDecimal("$a3$a4")

        val b3 = binaryKey[2]
        val b4 = binaryKey[3]
        val mergingZ2 = "$b3$b4"
        val z2 = AlgorithmsBinaryAndDec.binaryToDecimal("$b3$b4")

        val multi2 = binaryOperationsSum(x2, z2).toString()
        val w2 = AlgorithmsMod.multiplyMod6(multi2).toString()
        val bin2 = AlgorithmsBinaryAndDec.decimalToBinary(w2.toInt())

        return "W2 = X2 + Z2 = $mergingX2 + $mergingZ2 = $x2 + $z2 = $multi2 mod65536 = $w2 = $bin2"
    }

    fun binaryOperationsW3(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 8) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        val a5 = binaryPlain[4]
        val a6 = binaryPlain[5]
        val mergingX3 = "$a5$a6"
        val x3 = AlgorithmsBinaryAndDec.binaryToDecimal("$a5$a6")

        val b5 = binaryKey[4]
        val b6 = binaryKey[5]
        val mergingZ3 = "$b5$b6"
        val z3 = AlgorithmsBinaryAndDec.binaryToDecimal("$b5$b6")

        val multi3 = binaryOperationsSum(x3, z3).toString()
        val w3 = AlgorithmsMod.multiplyMod6(multi3).toString()
        val bin3 = AlgorithmsBinaryAndDec.decimalToBinary(w3.toInt())

        return "W3 = X3 + Z3 = $mergingX3 + $mergingZ3 = $x3 + $z3 = $multi3 mod65536 = $w3 = $bin3"
    }

    fun binaryOperationsW4(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 8) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        val a7 = binaryPlain[6]
        val a8 = binaryPlain[7]
        val mergingX4 = "$a7$a8"
        val x4 = AlgorithmsBinaryAndDec.binaryToDecimal("$a7$a8")

        val b7 = binaryKey[6]
        val b8 = binaryKey[7]
        val mergingZ4 = "$b7$b8"
        val z4 = AlgorithmsBinaryAndDec.binaryToDecimal("$b7$b8")

        val multi4 = binaryOperationsMultiply(x4.toLong(), z4.toLong()).toString()
        val w4 = AlgorithmsMod.multiplyMod7(multi4).toString()
        val bin4 = AlgorithmsBinaryAndDec.decimalToBinary(w4.toInt())

        return "W4 = X4 * Z4 = $mergingX4 * $mergingZ4 = $x4 * $z4 = $multi4 mod65537 = $w4 = $bin4"
    }

    fun binaryOperationsW5(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 8) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        //W1
        val a1 = binaryPlain[0]
        val a2 = binaryPlain[1]
        val x1 = AlgorithmsBinaryAndDec.binaryToDecimal("$a1$a2")

        val b1 = binaryKey[0]
        val b2 = binaryKey[1]
        val z1 = AlgorithmsBinaryAndDec.binaryToDecimal("$b1$b2")

        val multi1 = binaryOperationsMultiply(x1.toLong(), z1.toLong()).toString()
        val w1 = AlgorithmsMod.multiplyMod7(multi1).toString()
        val bin1 = AlgorithmsBinaryAndDec.decimalToBinary(w1.toInt())

        //W3
        val a5 = binaryPlain[4]
        val a6 = binaryPlain[5]
        val x3 = AlgorithmsBinaryAndDec.binaryToDecimal("$a5$a6")

        val b5 = binaryKey[4]
        val b6 = binaryKey[5]
        val z3 = AlgorithmsBinaryAndDec.binaryToDecimal("$b5$b6")

        val multi3 = binaryOperationsSum(x3, z3).toString()
        val w3 = AlgorithmsMod.multiplyMod6(multi3).toString()
        val bin3 = AlgorithmsBinaryAndDec.decimalToBinary(w3.toInt())

        //W5
        val w5 = binaryOperationsXOR(bin1, bin3)
        val dec1 = AlgorithmsBinaryAndDec.binaryToDecimal(w5)

        return "W5 = W1 XOR W3 = $bin1 XOR $bin3 = $w5 = $dec1"
    }

    fun binaryOperationsW6(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 8) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        //W2
        val a3 = binaryPlain[2]
        val a4 = binaryPlain[3]
        val x2 = AlgorithmsBinaryAndDec.binaryToDecimal("$a3$a4")

        val b3 = binaryKey[2]
        val b4 = binaryKey[3]
        val z2 = AlgorithmsBinaryAndDec.binaryToDecimal("$b3$b4")

        val multi2 = binaryOperationsSum(x2, z2).toString()
        val w2 = AlgorithmsMod.multiplyMod6(multi2).toString()
        val bin2 = AlgorithmsBinaryAndDec.decimalToBinary(w2.toInt())

        //W4
        val a7 = binaryPlain[6]
        val a8 = binaryPlain[7]
        val x4 = AlgorithmsBinaryAndDec.binaryToDecimal("$a7$a8")

        val b7 = binaryKey[6]
        val b8 = binaryKey[7]
        val z4 = AlgorithmsBinaryAndDec.binaryToDecimal("$b7$b8")

        val multi4 = binaryOperationsMultiply(x4.toLong(), z4.toLong()).toString()
        val w4 = AlgorithmsMod.multiplyMod7(multi4)
        val bin4 = AlgorithmsBinaryAndDec.decimalToBinary(w4)

        //W6
        val w6 = binaryOperationsXOR(bin2, bin4)
        val dec2 = AlgorithmsBinaryAndDec.binaryToDecimal(w6)

        return "W6 = W2 XOR W4 = $bin2 XOR $bin4 = $w6 = $dec2"
    }

    fun binaryOperationsW7(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 10) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        //W1
        val a1 = binaryPlain[0]
        val a2 = binaryPlain[1]
        val x1 = AlgorithmsBinaryAndDec.binaryToDecimal("$a1$a2")

        val b1 = binaryKey[0]
        val b2 = binaryKey[1]
        val z1 = AlgorithmsBinaryAndDec.binaryToDecimal("$b1$b2")

        val multi1 = binaryOperationsMultiply(x1.toLong(), z1.toLong()).toString()
        val w1 = AlgorithmsMod.multiplyMod7(multi1).toString()
        val bin1 = AlgorithmsBinaryAndDec.decimalToBinary(w1.toInt())

        //W3
        val a5 = binaryPlain[4]
        val a6 = binaryPlain[5]
        val x3 = AlgorithmsBinaryAndDec.binaryToDecimal("$a5$a6")

        val b5 = binaryKey[4]
        val b6 = binaryKey[5]
        val z3 = AlgorithmsBinaryAndDec.binaryToDecimal("$b5$b6")

        val multi3 = binaryOperationsSum(x3, z3).toString()
        val w3 = AlgorithmsMod.multiplyMod6(multi3).toString()
        val bin3 = AlgorithmsBinaryAndDec.decimalToBinary(w3.toInt())

        //W5
        val w5 = binaryOperationsXOR(bin1, bin3)
        val dec1 = AlgorithmsBinaryAndDec.binaryToDecimal(w5)

        //Z5
        val b9 = binaryKey[8]
        val b10 = binaryKey[9]
        val mergingZ1 = "$b9$b10"
        val z5 = AlgorithmsBinaryAndDec.binaryToDecimal("$b9$b10")

        //W7
        val multi5 = binaryOperationsMultiply(dec1.toLong(), z5.toLong()).toString()
        val w7 = AlgorithmsMod.multiplyMod7(multi5)

        return "W7 = W5 * Z5 = $w5 * $mergingZ1 = $dec1 * $z5 = $multi5 mod65537 = $w7"
    }

    fun binaryOperationsW8(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 10) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        //W1
        val a1 = binaryPlain[0]
        val a2 = binaryPlain[1]
        val x1 = AlgorithmsBinaryAndDec.binaryToDecimal("$a1$a2")

        val b1 = binaryKey[0]
        val b2 = binaryKey[1]
        val z1 = AlgorithmsBinaryAndDec.binaryToDecimal("$b1$b2")

        val multi1 = binaryOperationsMultiply(x1.toLong(), z1.toLong()).toString()
        val w1 = AlgorithmsMod.multiplyMod7(multi1).toString()
        val bin1 = AlgorithmsBinaryAndDec.decimalToBinary(w1.toInt())

        //W3
        val a5 = binaryPlain[4]
        val a6 = binaryPlain[5]
        val x3 = AlgorithmsBinaryAndDec.binaryToDecimal("$a5$a6")

        val b5 = binaryKey[4]
        val b6 = binaryKey[5]
        val z3 = AlgorithmsBinaryAndDec.binaryToDecimal("$b5$b6")

        val multi3 = binaryOperationsSum(x3, z3).toString()
        val w3 = AlgorithmsMod.multiplyMod6(multi3).toString()
        val bin3 = AlgorithmsBinaryAndDec.decimalToBinary(w3.toInt())

        //W5
        val w5 = binaryOperationsXOR(bin1, bin3)
        val dec1 = AlgorithmsBinaryAndDec.binaryToDecimal(w5)

        //Z5
        val b9 = binaryKey[8]
        val b10 = binaryKey[9]
        val z5 = AlgorithmsBinaryAndDec.binaryToDecimal("$b9$b10")

        //W7
        val multi5 = binaryOperationsMultiply(dec1.toLong(), z5.toLong()).toString()
        val w7 = AlgorithmsMod.multiplyMod7(multi5)

        //W2
        val a3 = binaryPlain[2]
        val a4 = binaryPlain[3]
        val x2 = AlgorithmsBinaryAndDec.binaryToDecimal("$a3$a4")

        val b3 = binaryKey[2]
        val b4 = binaryKey[3]
        val z2 = AlgorithmsBinaryAndDec.binaryToDecimal("$b3$b4")

        val multi2 = binaryOperationsSum(x2, z2).toString()
        val w2 = AlgorithmsMod.multiplyMod6(multi2).toString()
        val bin2 = AlgorithmsBinaryAndDec.decimalToBinary(w2.toInt())

        //W4
        val a7 = binaryPlain[6]
        val a8 = binaryPlain[7]
        val x4 = AlgorithmsBinaryAndDec.binaryToDecimal("$a7$a8")

        val b7 = binaryKey[6]
        val b8 = binaryKey[7]
        val z4 = AlgorithmsBinaryAndDec.binaryToDecimal("$b7$b8")

        val multi4 = binaryOperationsMultiply(x4.toLong(), z4.toLong()).toString()
        val w4 = AlgorithmsMod.multiplyMod7(multi4)
        val bin4 = AlgorithmsBinaryAndDec.decimalToBinary(w4)

        //W6
        val w6 = binaryOperationsXOR(bin2, bin4)
        val dec2 = AlgorithmsBinaryAndDec.binaryToDecimal(w6)

        //W8
        val multi6 = binaryOperationsSum(w7, dec2).toString()
        val w8 = AlgorithmsMod.multiplyMod6(multi6)

        return "W8 = W7 + W6 = $w7 + $dec2 = $multi6 mod65536 = $w8"
    }

    fun binaryOperationsW9(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 12) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        //W1
        val a1 = binaryPlain[0]
        val a2 = binaryPlain[1]
        val x1 = AlgorithmsBinaryAndDec.binaryToDecimal("$a1$a2")

        val b1 = binaryKey[0]
        val b2 = binaryKey[1]
        val z1 = AlgorithmsBinaryAndDec.binaryToDecimal("$b1$b2")

        val multi1 = binaryOperationsMultiply(x1.toLong(), z1.toLong()).toString()
        val w1 = AlgorithmsMod.multiplyMod7(multi1).toString()
        val bin1 = AlgorithmsBinaryAndDec.decimalToBinary(w1.toInt())

        //W3
        val a5 = binaryPlain[4]
        val a6 = binaryPlain[5]
        val x3 = AlgorithmsBinaryAndDec.binaryToDecimal("$a5$a6")

        val b5 = binaryKey[4]
        val b6 = binaryKey[5]
        val z3 = AlgorithmsBinaryAndDec.binaryToDecimal("$b5$b6")

        val multi3 = binaryOperationsSum(x3, z3).toString()
        val w3 = AlgorithmsMod.multiplyMod6(multi3).toString()
        val bin3 = AlgorithmsBinaryAndDec.decimalToBinary(w3.toInt())

        //W5
        val w5 = binaryOperationsXOR(bin1, bin3)
        val dec1 = AlgorithmsBinaryAndDec.binaryToDecimal(w5)

        //Z5
        val b9 = binaryKey[8]
        val b10 = binaryKey[9]
        val z5 = AlgorithmsBinaryAndDec.binaryToDecimal("$b9$b10")

        //W7
        val multi5 = binaryOperationsMultiply(dec1.toLong(), z5.toLong()).toString()
        val w7 = AlgorithmsMod.multiplyMod7(multi5)

        //W2
        val a3 = binaryPlain[2]
        val a4 = binaryPlain[3]
        val x2 = AlgorithmsBinaryAndDec.binaryToDecimal("$a3$a4")

        val b3 = binaryKey[2]
        val b4 = binaryKey[3]
        val z2 = AlgorithmsBinaryAndDec.binaryToDecimal("$b3$b4")

        val multi2 = binaryOperationsSum(x2, z2).toString()
        val w2 = AlgorithmsMod.multiplyMod6(multi2).toString()
        val bin2 = AlgorithmsBinaryAndDec.decimalToBinary(w2.toInt())

        //W4
        val a7 = binaryPlain[6]
        val a8 = binaryPlain[7]
        val x4 = AlgorithmsBinaryAndDec.binaryToDecimal("$a7$a8")

        val b7 = binaryKey[6]
        val b8 = binaryKey[7]
        val z4 = AlgorithmsBinaryAndDec.binaryToDecimal("$b7$b8")

        val multi4 = binaryOperationsMultiply(x4.toLong(), z4.toLong()).toString()
        val w4 = AlgorithmsMod.multiplyMod7(multi4)
        val bin4 = AlgorithmsBinaryAndDec.decimalToBinary(w4)

        //W6
        val w6 = binaryOperationsXOR(bin2, bin4)
        val dec2 = AlgorithmsBinaryAndDec.binaryToDecimal(w6)

        //W8
        val multi6 = binaryOperationsSum(w7, dec2).toString()
        val w8 = AlgorithmsMod.multiplyMod6(multi6)

        //Z6
        val b11 = binaryKey[10]
        val b12 = binaryKey[11]
        val z6 = AlgorithmsBinaryAndDec.binaryToDecimal("$b11$b12")

        //W9
        val multi7 = binaryOperationsMultiply(w8.toLong(), z6.toLong()).toString()
        val w9 = AlgorithmsMod.multiplyMod7(multi7)
        val bin9 = AlgorithmsBinaryAndDec.decimalToBinary(w9)

        return "W9 = W8 * Z6 = $w8 * $z6 = $multi7 mod65537 = $w9 = $bin9"
    }

    fun binaryOperationsW10(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 12) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        //W1
        val a1 = binaryPlain[0]
        val a2 = binaryPlain[1]
        val x1 = AlgorithmsBinaryAndDec.binaryToDecimal("$a1$a2")

        val b1 = binaryKey[0]
        val b2 = binaryKey[1]
        val z1 = AlgorithmsBinaryAndDec.binaryToDecimal("$b1$b2")

        val multi1 = binaryOperationsMultiply(x1.toLong(), z1.toLong()).toString()
        val w1 = AlgorithmsMod.multiplyMod7(multi1).toString()
        val bin1 = AlgorithmsBinaryAndDec.decimalToBinary(w1.toInt())

        //W3
        val a5 = binaryPlain[4]
        val a6 = binaryPlain[5]
        val x3 = AlgorithmsBinaryAndDec.binaryToDecimal("$a5$a6")

        val b5 = binaryKey[4]
        val b6 = binaryKey[5]
        val z3 = AlgorithmsBinaryAndDec.binaryToDecimal("$b5$b6")

        val multi3 = binaryOperationsSum(x3, z3).toString()
        val w3 = AlgorithmsMod.multiplyMod6(multi3).toString()
        val bin3 = AlgorithmsBinaryAndDec.decimalToBinary(w3.toInt())

        //W5
        val w5 = binaryOperationsXOR(bin1, bin3)
        val dec1 = AlgorithmsBinaryAndDec.binaryToDecimal(w5)

        //Z5
        val b9 = binaryKey[8]
        val b10 = binaryKey[9]
        val z5 = AlgorithmsBinaryAndDec.binaryToDecimal("$b9$b10")

        //W7
        val multi5 = binaryOperationsMultiply(dec1.toLong(), z5.toLong()).toString()
        val w7 = AlgorithmsMod.multiplyMod7(multi5)

        //W2
        val a3 = binaryPlain[2]
        val a4 = binaryPlain[3]
        val x2 = AlgorithmsBinaryAndDec.binaryToDecimal("$a3$a4")

        val b3 = binaryKey[2]
        val b4 = binaryKey[3]
        val z2 = AlgorithmsBinaryAndDec.binaryToDecimal("$b3$b4")

        val multi2 = binaryOperationsSum(x2, z2).toString()
        val w2 = AlgorithmsMod.multiplyMod6(multi2).toString()
        val bin2 = AlgorithmsBinaryAndDec.decimalToBinary(w2.toInt())

        //W4
        val a7 = binaryPlain[6]
        val a8 = binaryPlain[7]
        val x4 = AlgorithmsBinaryAndDec.binaryToDecimal("$a7$a8")

        val b7 = binaryKey[6]
        val b8 = binaryKey[7]
        val z4 = AlgorithmsBinaryAndDec.binaryToDecimal("$b7$b8")

        val multi4 = binaryOperationsMultiply(x4.toLong(), z4.toLong()).toString()
        val w4 = AlgorithmsMod.multiplyMod7(multi4)
        val bin4 = AlgorithmsBinaryAndDec.decimalToBinary(w4)

        //W6
        val w6 = binaryOperationsXOR(bin2, bin4)
        val dec2 = AlgorithmsBinaryAndDec.binaryToDecimal(w6)

        //W8
        val multi6 = binaryOperationsSum(w7, dec2).toString()
        val w8 = AlgorithmsMod.multiplyMod6(multi6)

        //Z6
        val b11 = binaryKey[10]
        val b12 = binaryKey[11]
        val z6 = AlgorithmsBinaryAndDec.binaryToDecimal("$b11$b12")

        //W9
        val multi7 = binaryOperationsMultiply(w8.toLong(), z6.toLong()).toString()
        val w9 = AlgorithmsMod.multiplyMod7(multi7)

        //W10
        val multi8 = binaryOperationsSum(w7, w9).toString()
        val w10 = AlgorithmsMod.multiplyMod6(multi8)
        val bin10 = AlgorithmsBinaryAndDec.decimalToBinary(w10)

        return "W10 = W7 + Z9 = $w7 + $w9 = $multi8 mod65536 = $w10 = $bin10"
    }

    fun binaryOperationsW11(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 12) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        //W1
        val a1 = binaryPlain[0]
        val a2 = binaryPlain[1]
        val x1 = AlgorithmsBinaryAndDec.binaryToDecimal("$a1$a2")

        val b1 = binaryKey[0]
        val b2 = binaryKey[1]
        val z1 = AlgorithmsBinaryAndDec.binaryToDecimal("$b1$b2")

        val multi1 = binaryOperationsMultiply(x1.toLong(), z1.toLong()).toString()
        val w1 = AlgorithmsMod.multiplyMod7(multi1).toString()
        val bin1 = AlgorithmsBinaryAndDec.decimalToBinary(w1.toInt())

        //W3
        val a5 = binaryPlain[4]
        val a6 = binaryPlain[5]
        val x3 = AlgorithmsBinaryAndDec.binaryToDecimal("$a5$a6")

        val b5 = binaryKey[4]
        val b6 = binaryKey[5]
        val z3 = AlgorithmsBinaryAndDec.binaryToDecimal("$b5$b6")

        val multi3 = binaryOperationsSum(x3, z3).toString()
        val w3 = AlgorithmsMod.multiplyMod6(multi3).toString()
        val bin3 = AlgorithmsBinaryAndDec.decimalToBinary(w3.toInt())

        //W5
        val w5 = binaryOperationsXOR(bin1, bin3)
        val dec1 = AlgorithmsBinaryAndDec.binaryToDecimal(w5)

        //Z5
        val b9 = binaryKey[8]
        val b10 = binaryKey[9]
        val z5 = AlgorithmsBinaryAndDec.binaryToDecimal("$b9$b10")

        //W7
        val multi5 = binaryOperationsMultiply(dec1.toLong(), z5.toLong()).toString()
        val w7 = AlgorithmsMod.multiplyMod7(multi5)

        //W2
        val a3 = binaryPlain[2]
        val a4 = binaryPlain[3]
        val x2 = AlgorithmsBinaryAndDec.binaryToDecimal("$a3$a4")

        val b3 = binaryKey[2]
        val b4 = binaryKey[3]
        val z2 = AlgorithmsBinaryAndDec.binaryToDecimal("$b3$b4")

        val multi2 = binaryOperationsSum(x2, z2).toString()
        val w2 = AlgorithmsMod.multiplyMod6(multi2).toString()
        val bin2 = AlgorithmsBinaryAndDec.decimalToBinary(w2.toInt())

        //W4
        val a7 = binaryPlain[6]
        val a8 = binaryPlain[7]
        val x4 = AlgorithmsBinaryAndDec.binaryToDecimal("$a7$a8")

        val b7 = binaryKey[6]
        val b8 = binaryKey[7]
        val z4 = AlgorithmsBinaryAndDec.binaryToDecimal("$b7$b8")

        val multi4 = binaryOperationsMultiply(x4.toLong(), z4.toLong()).toString()
        val w4 = AlgorithmsMod.multiplyMod7(multi4)
        val bin4 = AlgorithmsBinaryAndDec.decimalToBinary(w4)

        //W6
        val w6 = binaryOperationsXOR(bin2, bin4)
        val dec2 = AlgorithmsBinaryAndDec.binaryToDecimal(w6)

        //W8
        val multi6 = binaryOperationsSum(w7, dec2).toString()
        val w8 = AlgorithmsMod.multiplyMod6(multi6)

        //Z6
        val b11 = binaryKey[10]
        val b12 = binaryKey[11]
        val z6 = AlgorithmsBinaryAndDec.binaryToDecimal("$b11$b12")

        //W9
        val multi7 = binaryOperationsMultiply(w8.toLong(), z6.toLong()).toString()
        val w9 = AlgorithmsMod.multiplyMod7(multi7)
        val bin9 = AlgorithmsBinaryAndDec.decimalToBinary(w9)

        //W11
        val w11 = binaryOperationsXOR(bin1, bin9)

        return "W11 = W1 XOR W9 = $bin1 XOR $bin9 = $w11"
    }

    fun binaryOperationsW12(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 12) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        //W1
        val a1 = binaryPlain[0]
        val a2 = binaryPlain[1]
        val x1 = AlgorithmsBinaryAndDec.binaryToDecimal("$a1$a2")

        val b1 = binaryKey[0]
        val b2 = binaryKey[1]
        val z1 = AlgorithmsBinaryAndDec.binaryToDecimal("$b1$b2")

        val multi1 = binaryOperationsMultiply(x1.toLong(), z1.toLong()).toString()
        val w1 = AlgorithmsMod.multiplyMod7(multi1).toString()
        val bin1 = AlgorithmsBinaryAndDec.decimalToBinary(w1.toInt())

        //W3
        val a5 = binaryPlain[4]
        val a6 = binaryPlain[5]
        val x3 = AlgorithmsBinaryAndDec.binaryToDecimal("$a5$a6")

        val b5 = binaryKey[4]
        val b6 = binaryKey[5]
        val z3 = AlgorithmsBinaryAndDec.binaryToDecimal("$b5$b6")

        val multi3 = binaryOperationsSum(x3, z3).toString()
        val w3 = AlgorithmsMod.multiplyMod6(multi3).toString()
        val bin3 = AlgorithmsBinaryAndDec.decimalToBinary(w3.toInt())

        //W5
        val w5 = binaryOperationsXOR(bin1, bin3)
        val dec1 = AlgorithmsBinaryAndDec.binaryToDecimal(w5)

        //Z5
        val b9 = binaryKey[8]
        val b10 = binaryKey[9]
        val z5 = AlgorithmsBinaryAndDec.binaryToDecimal("$b9$b10")

        //W7
        val multi5 = binaryOperationsMultiply(dec1.toLong(), z5.toLong()).toString()
        val w7 = AlgorithmsMod.multiplyMod7(multi5)

        //W2
        val a3 = binaryPlain[2]
        val a4 = binaryPlain[3]
        val x2 = AlgorithmsBinaryAndDec.binaryToDecimal("$a3$a4")

        val b3 = binaryKey[2]
        val b4 = binaryKey[3]
        val z2 = AlgorithmsBinaryAndDec.binaryToDecimal("$b3$b4")

        val multi2 = binaryOperationsSum(x2, z2).toString()
        val w2 = AlgorithmsMod.multiplyMod6(multi2).toString()
        val bin2 = AlgorithmsBinaryAndDec.decimalToBinary(w2.toInt())

        //W4
        val a7 = binaryPlain[6]
        val a8 = binaryPlain[7]
        val x4 = AlgorithmsBinaryAndDec.binaryToDecimal("$a7$a8")

        val b7 = binaryKey[6]
        val b8 = binaryKey[7]
        val z4 = AlgorithmsBinaryAndDec.binaryToDecimal("$b7$b8")

        val multi4 = binaryOperationsMultiply(x4.toLong(), z4.toLong()).toString()
        val w4 = AlgorithmsMod.multiplyMod7(multi4)
        val bin4 = AlgorithmsBinaryAndDec.decimalToBinary(w4)

        //W6
        val w6 = binaryOperationsXOR(bin2, bin4)
        val dec2 = AlgorithmsBinaryAndDec.binaryToDecimal(w6)

        //W8
        val multi6 = binaryOperationsSum(w7, dec2).toString()
        val w8 = AlgorithmsMod.multiplyMod6(multi6)

        //Z6
        val b11 = binaryKey[10]
        val b12 = binaryKey[11]
        val z6 = AlgorithmsBinaryAndDec.binaryToDecimal("$b11$b12")

        //W9
        val multi7 = binaryOperationsMultiply(w8.toLong(), z6.toLong()).toString()
        val w9 = AlgorithmsMod.multiplyMod7(multi7)
        val bin9 = AlgorithmsBinaryAndDec.decimalToBinary(w9)

        //W12
        val w12 = binaryOperationsXOR(bin3, bin9)

        return "W12 = W3 XOR W9 = $bin3 XOR $bin9 = $w12"
    }

    fun binaryOperationsW13(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 12) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        //W1
        val a1 = binaryPlain[0]
        val a2 = binaryPlain[1]
        val x1 = AlgorithmsBinaryAndDec.binaryToDecimal("$a1$a2")

        val b1 = binaryKey[0]
        val b2 = binaryKey[1]
        val z1 = AlgorithmsBinaryAndDec.binaryToDecimal("$b1$b2")

        val multi1 = binaryOperationsMultiply(x1.toLong(), z1.toLong()).toString()
        val w1 = AlgorithmsMod.multiplyMod7(multi1).toString()
        val bin1 = AlgorithmsBinaryAndDec.decimalToBinary(w1.toInt())

        //W3
        val a5 = binaryPlain[4]
        val a6 = binaryPlain[5]
        val x3 = AlgorithmsBinaryAndDec.binaryToDecimal("$a5$a6")

        val b5 = binaryKey[4]
        val b6 = binaryKey[5]
        val z3 = AlgorithmsBinaryAndDec.binaryToDecimal("$b5$b6")

        val multi3 = binaryOperationsSum(x3, z3).toString()
        val w3 = AlgorithmsMod.multiplyMod6(multi3).toString()
        val bin3 = AlgorithmsBinaryAndDec.decimalToBinary(w3.toInt())

        //W5
        val w5 = binaryOperationsXOR(bin1, bin3)
        val dec1 = AlgorithmsBinaryAndDec.binaryToDecimal(w5)

        //Z5
        val b9 = binaryKey[8]
        val b10 = binaryKey[9]
        val z5 = AlgorithmsBinaryAndDec.binaryToDecimal("$b9$b10")

        //W7
        val multi5 = binaryOperationsMultiply(dec1.toLong(), z5.toLong()).toString()
        val w7 = AlgorithmsMod.multiplyMod7(multi5)

        //W2
        val a3 = binaryPlain[2]
        val a4 = binaryPlain[3]
        val x2 = AlgorithmsBinaryAndDec.binaryToDecimal("$a3$a4")

        val b3 = binaryKey[2]
        val b4 = binaryKey[3]
        val z2 = AlgorithmsBinaryAndDec.binaryToDecimal("$b3$b4")

        val multi2 = binaryOperationsSum(x2, z2).toString()
        val w2 = AlgorithmsMod.multiplyMod6(multi2).toString()
        val bin2 = AlgorithmsBinaryAndDec.decimalToBinary(w2.toInt())

        //W4
        val a7 = binaryPlain[6]
        val a8 = binaryPlain[7]
        val x4 = AlgorithmsBinaryAndDec.binaryToDecimal("$a7$a8")

        val b7 = binaryKey[6]
        val b8 = binaryKey[7]
        val z4 = AlgorithmsBinaryAndDec.binaryToDecimal("$b7$b8")

        val multi4 = binaryOperationsMultiply(x4.toLong(), z4.toLong()).toString()
        val w4 = AlgorithmsMod.multiplyMod7(multi4)
        val bin4 = AlgorithmsBinaryAndDec.decimalToBinary(w4)

        //W6
        val w6 = binaryOperationsXOR(bin2, bin4)
        val dec2 = AlgorithmsBinaryAndDec.binaryToDecimal(w6)

        //W8
        val multi6 = binaryOperationsSum(w7, dec2).toString()
        val w8 = AlgorithmsMod.multiplyMod6(multi6)

        //Z6
        val b11 = binaryKey[10]
        val b12 = binaryKey[11]
        val z6 = AlgorithmsBinaryAndDec.binaryToDecimal("$b11$b12")

        //W9
        val multi7 = binaryOperationsMultiply(w8.toLong(), z6.toLong()).toString()
        val w9 = AlgorithmsMod.multiplyMod7(multi7)

        //W10
        val multi8 = binaryOperationsSum(w7, w9).toString()
        val w10 = AlgorithmsMod.multiplyMod6(multi8)
        val bin10 = AlgorithmsBinaryAndDec.decimalToBinary(w10)

        //W13
        val w13 = binaryOperationsXOR(bin2, bin10)

        return "W13 = W2 XOR W10 = $bin2 XOR $bin10 = $w13"
    }

    fun binaryOperationsW14(plainText: String, keyText: String): String {
        if (plainText.length < 8 || keyText.length < 12) {
            return "Both inputs must have at least 8 characters"
        }

        val binaryPlain = plainText.map { charToBinaryMap[it] ?: "?" }
        val binaryKey = keyText.map { charToBinaryMap[it] ?: "?" }

        //W1
        val a1 = binaryPlain[0]
        val a2 = binaryPlain[1]
        val x1 = AlgorithmsBinaryAndDec.binaryToDecimal("$a1$a2")

        val b1 = binaryKey[0]
        val b2 = binaryKey[1]
        val z1 = AlgorithmsBinaryAndDec.binaryToDecimal("$b1$b2")

        val multi1 = binaryOperationsMultiply(x1.toLong(), z1.toLong()).toString()
        val w1 = AlgorithmsMod.multiplyMod7(multi1).toString()
        val bin1 = AlgorithmsBinaryAndDec.decimalToBinary(w1.toInt())

        //W3
        val a5 = binaryPlain[4]
        val a6 = binaryPlain[5]
        val x3 = AlgorithmsBinaryAndDec.binaryToDecimal("$a5$a6")

        val b5 = binaryKey[4]
        val b6 = binaryKey[5]
        val z3 = AlgorithmsBinaryAndDec.binaryToDecimal("$b5$b6")

        val multi3 = binaryOperationsSum(x3, z3).toString()
        val w3 = AlgorithmsMod.multiplyMod6(multi3).toString()
        val bin3 = AlgorithmsBinaryAndDec.decimalToBinary(w3.toInt())

        //W5
        val w5 = binaryOperationsXOR(bin1, bin3)
        val dec1 = AlgorithmsBinaryAndDec.binaryToDecimal(w5)

        //Z5
        val b9 = binaryKey[8]
        val b10 = binaryKey[9]
        val z5 = AlgorithmsBinaryAndDec.binaryToDecimal("$b9$b10")

        //W7
        val multi5 = binaryOperationsMultiply(dec1.toLong(), z5.toLong()).toString()
        val w7 = AlgorithmsMod.multiplyMod7(multi5)

        //W2
        val a3 = binaryPlain[2]
        val a4 = binaryPlain[3]
        val x2 = AlgorithmsBinaryAndDec.binaryToDecimal("$a3$a4")

        val b3 = binaryKey[2]
        val b4 = binaryKey[3]
        val z2 = AlgorithmsBinaryAndDec.binaryToDecimal("$b3$b4")

        val multi2 = binaryOperationsSum(x2, z2).toString()
        val w2 = AlgorithmsMod.multiplyMod6(multi2).toString()
        val bin2 = AlgorithmsBinaryAndDec.decimalToBinary(w2.toInt())

        //W4
        val a7 = binaryPlain[6]
        val a8 = binaryPlain[7]
        val x4 = AlgorithmsBinaryAndDec.binaryToDecimal("$a7$a8")

        val b7 = binaryKey[6]
        val b8 = binaryKey[7]
        val z4 = AlgorithmsBinaryAndDec.binaryToDecimal("$b7$b8")

        val multi4 = binaryOperationsMultiply(x4.toLong(), z4.toLong()).toString()
        val w4 = AlgorithmsMod.multiplyMod7(multi4)
        val bin4 = AlgorithmsBinaryAndDec.decimalToBinary(w4)

        //W6
        val w6 = binaryOperationsXOR(bin2, bin4)
        val dec2 = AlgorithmsBinaryAndDec.binaryToDecimal(w6)

        //W8
        val multi6 = binaryOperationsSum(w7, dec2).toString()
        val w8 = AlgorithmsMod.multiplyMod6(multi6)

        //Z6
        val b11 = binaryKey[10]
        val b12 = binaryKey[11]
        val z6 = AlgorithmsBinaryAndDec.binaryToDecimal("$b11$b12")

        //W9
        val multi7 = binaryOperationsMultiply(w8.toLong(), z6.toLong()).toString()
        val w9 = AlgorithmsMod.multiplyMod7(multi7)

        //W10
        val multi8 = binaryOperationsSum(w7, w9).toString()
        val w10 = AlgorithmsMod.multiplyMod6(multi8)
        val bin10 = AlgorithmsBinaryAndDec.decimalToBinary(w10)

        //W14
        val w14 = binaryOperationsXOR(bin4, bin10)

        return "W14 = W4 XOR W10 = $bin4 XOR $bin10 = $w14"
    }

    private fun binaryOperationsMultiply(x: Long, z: Long): Long {
        return x * z
    }

    private fun binaryOperationsSum(x: Int, z: Int): Int {
        return x + z
    }

    private fun binaryOperationsXOR(bin1: String, bin2: String): String {
        // Ensure both binary strings are exactly 16 bits
        val x = bin1.padStart(16, '0')
        val z = bin2.padStart(16, '0')

        // Perform XOR bit by bit
        val result = x.zip(z) { bit1, bit2 ->
            if (bit1 == bit2) '0' else '1'
        }.joinToString("")

        return result
    }

}