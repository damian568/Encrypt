package com.example.crypto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
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
        }
    }
}