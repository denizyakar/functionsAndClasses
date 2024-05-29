package com.example.functionsandclasses

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var myTextView: TextView
    lateinit var myButton : Button
    lateinit var mynameText: EditText
    lateinit var myageText: EditText
    lateinit var myjobText: EditText
    var name = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        myButton = findViewById(R.id.button)
        myTextView = findViewById(R.id.textView)
        mynameText = findViewById(R.id.nameText)
        myageText = findViewById(R.id.ageText)
        myjobText = findViewById(R.id.jobText)
/*
        myButton.setOnClickListener{
            myTextView.text = "button clicked listener"
        }

 */
    testFun()
    sumFunc(10,20)
    multFunc(10,2)
    val result=multFunc(10,3)


    //Class

    val homer = Simpson("Homer",50,"Nuclear")
       println("homer age: ${homer.age}")
        println("homer job: ${homer.job}")


    var myInt: Int




    }


    fun testFun(){
        println("test function initialized")}

    fun sumFunc(a: Int, b: Int){
        myTextView.text = "Result: ${a+b}"}

    fun multFunc(a:Int, b: Int): Int{
        println(a*b)
        return (a*b)
    }

    fun buttonClicked(view : View) {
        name = mynameText.text.toString()
        val age = myageText.text.toString().toIntOrNull()
        val job = myjobText.text.toString()
        if (age != null) {
            val Fatih = Simpson(name, age, job)
            myTextView.text =
                " simpson name: ${Fatih.name}\n  simpson age: ${Fatih.age}\n  simpson job: ${Fatih.job}\n"
        } else {
            myTextView.text = "Enter valid age!"
        }


    }
}