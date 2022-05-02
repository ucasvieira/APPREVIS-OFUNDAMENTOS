package com.example.apprevisofundamentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{validation()}
    }

    private fun validation() {
        val number1: EditText = findViewById(R.id.txtNumber1)
        val number2: EditText = findViewById(R.id.txtNumber2)

        if(number1.text.isNotEmpty() && number2.text.isNotEmpty()){

            if (Integer.parseInt(number1.text.toString()) > Integer.parseInt(number2.text.toString()))
                Toast.makeText(this, "O campo 1 é maior que o campo 2!", Toast.LENGTH_SHORT).show()

            else if (Integer.parseInt(number1.text.toString()) < Integer.parseInt(number2.text.toString()))
                Toast.makeText(this, "O campo 2 é maior que o campo 1!", Toast.LENGTH_SHORT).show()

            else
                Toast.makeText(this, "Os dois campos são iguais!", Toast.LENGTH_SHORT).show()
        }

    }
}