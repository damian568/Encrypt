package com.example.crypto.encryption

import com.example.crypto.R

object EncryptToBinary {

    fun encryptToBinary(input: String): String {
        if (input.length > 8) {
            return R.string.encrypt_text.toString()
        }

        val result = StringBuilder()

        for (char in input) {
            val binary = charToBinaryMap[char]
            if (binary != null) {
                result.append(binary).append(" ")
            } else {
                result.append("? ").append(R.string.encrypt_return.toString())
            }
        }

        return result.toString().trim()
    }

    fun encryptToBinaryKey(input: String): String {
        if (input.length > 16) {
            return R.string.encrypt_key.toString()
        }

        val result = StringBuilder()

        for (char in input) {
            val binary = charToBinaryMap[char]
            if (binary != null) {
                result.append(binary).append(" ")
            } else {
                result.append("? ").append(R.string.encrypt_return.toString())
            }
        }

        return result.toString().trim()
    }
}