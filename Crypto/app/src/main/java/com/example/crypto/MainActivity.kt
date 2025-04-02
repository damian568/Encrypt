package com.example.crypto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.crypto.algorithms.AlgorithmsOperations
import com.example.crypto.databinding.ActivityMainBinding
import com.example.crypto.encryption.EncryptToBinary

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.encryptButton.setOnClickListener {
            val inputText = binding.inputText.text.toString()
            val inputTextKey = binding.inputTextKey.text.toString()
            val encryptedText = EncryptToBinary.encryptToBinary(inputText)
            val encryptedTexKey = EncryptToBinary.encryptToBinaryKey(inputTextKey)
            binding.resultTextView.text = "P= $encryptedText"
            binding.resultTextViewKey.text = "K= $encryptedTexKey"

            binding.schemeImg.setImageResource(R.drawable.scheme)

            binding.textW1.text =
                AlgorithmsOperations.binaryOperationsW1(inputText, inputTextKey)
            binding.textW2.text =
                AlgorithmsOperations.binaryOperationsW2(inputText, inputTextKey)
            binding.textW3.text =
                AlgorithmsOperations.binaryOperationsW3(inputText, inputTextKey)
            binding.textW4.text =
                AlgorithmsOperations.binaryOperationsW4(inputText, inputTextKey)
            binding.textW5.text =
                AlgorithmsOperations.binaryOperationsW5(inputText, inputTextKey)
            binding.textW6.text =
                AlgorithmsOperations.binaryOperationsW6(inputText, inputTextKey)
            binding.textW7.text =
                AlgorithmsOperations.binaryOperationsW7(inputText, inputTextKey)
            binding.textW8.text =
                AlgorithmsOperations.binaryOperationsW8(inputText, inputTextKey)
            binding.textW9.text =
                AlgorithmsOperations.binaryOperationsW9(inputText, inputTextKey)
            binding.textW10.text =
                AlgorithmsOperations.binaryOperationsW10(inputText, inputTextKey)
            binding.textW11.text =
                AlgorithmsOperations.binaryOperationsW11(inputText, inputTextKey)
            binding.textW12.text =
                AlgorithmsOperations.binaryOperationsW12(inputText, inputTextKey)
            binding.textW13.text =
                AlgorithmsOperations.binaryOperationsW13(inputText, inputTextKey)
            binding.textW14.text =
                AlgorithmsOperations.binaryOperationsW14(inputText, inputTextKey)
        }
    }
}