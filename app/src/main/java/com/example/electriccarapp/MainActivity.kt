package com.example.electriccarapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var kwhPrice: EditText
    lateinit var btnCalculate: Button
    lateinit var kmDone: EditText
    lateinit var calcResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets

        }
        fun setupView() {
            kwhPrice = findViewById(R.id.et_autonomy_calc)
            btnCalculate = findViewById(R.id.btn_calculate)
            kmDone = findViewById(R.id.et_kwh_done)
            calcResult = findViewById(R.id.tv_calc_result)
        }
        fun setupListeners() {
            btnCalculate.setOnClickListener {
               calculate()
            }
        }
        fun calculate() {
            val userKwhPrice = kwhPrice.text.toString().toDouble()
            val userKmDone = kmDone.text.toString().toDouble()
            val result = userKwhPrice / userKmDone
            calcResult.text = result.toString()
        }
    }
//}
