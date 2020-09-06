package com.example.ass5_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import com.example.ass5intent.Employee
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showResult(v: View){
        val intent = Intent(this,SecondActivity :: class.java)
        val selectID: Int = radioGroup.checkedRadioButtonId
        var gender = ""
        try {
            var radioButtonChecked: RadioButton = findViewById(selectID)
            gender = radioButtonChecked.text as String
        } catch (t: Throwable) {
            gender = ""
        }
        intent.putExtra( "employee", Employee(edit_name.text.toString(),gender,edit_email.text.toString(),
                edit_salary.text.toString().toInt()))
        startActivity(intent)
    }
    fun reset(v: View){
        edit_name.text.clear()
        edit_email.text.clear()
        radioGroup.clearCheck()
        edit_salary.text.clear()

    }
}