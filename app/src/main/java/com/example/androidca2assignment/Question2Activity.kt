package com.example.androidca2assignment

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Question2Activity : AppCompatActivity() {

    lateinit var checkBox: CheckBox
    lateinit var radioButton: RadioButton
    lateinit var editText: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        checkBox = findViewById<CheckBox>(R.id.cb_checkBox)
        radioButton = findViewById<RadioButton>(R.id.rb_radioButton)
        editText = findViewById<EditText>(R.id.et_editText)
        button = findViewById<Button>(R.id.btn_button)

        checkBox.setOnClickListener {
            if (checkBox.isChecked) {
                Toast.makeText(this, "${checkBox.text} selected !!", Toast.LENGTH_LONG).show()
            }
        }

        radioButton.setOnClickListener {
            Toast.makeText(this, "${radioButton.text} selected !!", Toast.LENGTH_LONG).show()
        }

        button.setOnClickListener {
            if (editText.text.trim().toString().isNotEmpty()) {
                Toast.makeText(
                    this,
                    "${editText.text.trim().toString()} typed by user",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    }
}