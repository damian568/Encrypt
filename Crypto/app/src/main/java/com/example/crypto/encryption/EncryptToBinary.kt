package com.example.crypto.encryption

object EncryptToBinary {

    fun encryptToBinary(input: String): String {
        if (input.length > 8) {
            return "Input must be 8 characters or less"
        }

        val result = StringBuilder()

        for (char in input) {
            val binary = charToBinaryMap[char]
            if (binary != null) {
                result.append(binary).append(" ")
            } else {
                result.append("? ").append("(unknown character) ")
            }
        }

        return result.toString().trim()
    }

    fun encryptToBinaryKey(input: String): String {
        if (input.length > 16) {
            return "Input must be 16 characters or less"
        }

        val result = StringBuilder()

        for (char in input) {
            val binary = charToBinaryMap[char]
            if (binary != null) {
                result.append(binary).append(" ")
            } else {
                result.append("? ").append("(unknown character) ")
            }
        }

        return result.toString().trim()
    }
}