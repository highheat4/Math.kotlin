package com.example.mathkotlin

import android.app.Notification.EXTRA_TEXT
import android.content.Intent
import android.content.Intent.EXTRA_TEXT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_problems_page.*
//import java.lang.Math
import kotlin.random.Random.Default.nextInt

class ProblemsPage : AppCompatActivity() {
    var listOfSolutions = mutableListOf<Int>(0,0,0,0,0,0,0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problems_page)

        var listOfProblemsTxt = mutableListOf(problem1txt, problem2txt,problem3txt,
            problem4txt,problem5txt,problem6txt,problem7txt)



        var intent = getIntent();
        var opType = intent.getStringExtra(MainActivity.EXTRA_TEXT)
        println(opType)
        when (opType) {
            "Add" -> for(problem in listOfProblemsTxt.indices) {
                var int1 = (1..100).shuffled().first()
                var int2 = (1..100).shuffled().last()
                listOfProblemsTxt[problem].setText(""+ int1 + " + " + int2)
                listOfSolutions[problem] = int1 + int2
            }

            "Subtract" -> for(problem in listOfProblemsTxt.indices) {
                var int1 = (1..100).shuffled().first()
                var int2 = (1..100).shuffled().last()
                listOfProblemsTxt[problem].setText(""+ int1 + " - " + int2)
                listOfSolutions[problem] = int1 - int2
            }
            "Divide" -> for(problem in listOfProblemsTxt.indices) {
                var int1 = (1..20).shuffled().first()
                var int2 = (1..20).shuffled().last()
                listOfProblemsTxt[problem].setText(""+ int1 + " / " + int2)
                listOfSolutions[problem] = int1 / int2
            }
            "Multiply" -> for(problem in listOfProblemsTxt.indices) {
                var int1 = (1..20).shuffled().first()
                var int2 = (1..20).shuffled().last()
                listOfProblemsTxt[problem].setText(""+ int1 + " x " + int2)
                listOfSolutions[problem] = int1 * int2
            }
            "Mix" -> for(problem in listOfProblemsTxt.indices) {
                var int1 = (1..30).shuffled().first()
                var int2 = (1..30).shuffled().last()
                var operation = mutableListOf("+","-","/","*").shuffled().first()
                when (operation) {
                    "+" -> {listOfProblemsTxt[problem].setText(""+ int1 + " + " + int2)
                    listOfSolutions[problem] = int1 + int2}
                    "-" -> {listOfProblemsTxt[problem].setText(""+ int1 + " - " + int2)
                        listOfSolutions[problem] = int1 - int2}
                    "/" -> {listOfProblemsTxt[problem].setText(""+ int1 + " / " + int2)
                        listOfSolutions[problem] = int1 / int2}
                    "*" -> {listOfProblemsTxt[problem].setText(""+ int1 + " x " + int2)
                        listOfSolutions[problem] = int1 * int2}
                }

            }
        }

        Submit.setOnClickListener {
            var correct = true
            val listOfAnswers = listOf(problem1.text.toString(), problem2.text.toString(),
                problem3.text.toString(), problem4.text.toString(), problem5.text.toString(),
                problem6.text.toString(), problem7.text.toString())
            for (solution in listOfSolutions.indices) {
                if (listOfSolutions[solution].toString() != listOfAnswers[solution]) {
                    correct = false
                    break
                }
            }
            if (correct) {
                val intent: Intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            }
        }


    }

}
