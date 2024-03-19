package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var etNumber1 : EditText? = null  // on the screen activity etNum1
    private var etNumber2 : EditText? = null
    private var tvDisp : TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById<EditText>(R.id.etNum1)
        etNumber2 = findViewById<EditText>(R.id.etNum2)
        tvDisp = findViewById<TextView>(R.id.tvDisplay)

        val btnADD = findViewById<Button>(R.id.btnAdd)
        btnADD.setOnClickListener{
            addnumber()
        }
        val btnSUB = findViewById<Button>(R.id.btnSub)
        btnSUB.setOnClickListener{
            subnumber()
        }
        val btnMUL = findViewById<Button>(R.id.btnMul)
        btnMUL.setOnClickListener{
            mulnumber()
        }
        val btnDIV = findViewById<Button>(R.id.btnDiv)
        btnDIV.setOnClickListener{
            divnumber()
        }


    }
    private fun addnumber(){
        var intAns: Int = 0
        var intNumber1: Int = 0
        var intNumber2: Int = 0

        val intNumber1 = etNumber1?.text. toString().toInt()
        val intNumber2 = etNumber2?.text. toString().toInt()
        intAns = (intNumber1 + intNumber2)
        tvDisp?.text = "The answer is" + intAns
        //printIn("The answer is" + tvDisp) wrong

    }
    private fun subnumber(){
        var intAns: Int = 0
        var intNumber1: Int = 0
        var intNumber2: Int = 0

        val intNumber1 = etNumber1?.text. toString().toInt()
        val intNumber2 = etNumber2?.text. toString().toInt()
        intAns = (intNumber1 - intNumber2)
        tvDisp?.text = "The answer is" + intAns


    }
    private fun mulnumber(){
        var intAns: Int = 0
        var intNumber1: Int = 0
        var intNumber2: Int = 0

        val intNumber1 = etNumber1?.text. toString().toInt()
        val intNumber2 = etNumber2?.text. toString().toInt()
        intAns = (intNumber1 * intNumber2)
        tvDisp?.text = "The answer is" + intAns


    }
    private fun divnumber(){
        var intAns: Int = 0
        var intNumber1: Int = 0
        var intNumber2: Int = 0

        val intNumber1 = etNumber1?.text. toString().toInt()
        val intNumber2 = etNumber2?.text. toString().toInt()
        intAns = (intNumber1 / intNumber2)
        tvDisp?.text = "The answer is" + intAns


    }

}

