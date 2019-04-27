package com.example.kotlin_xox

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun btn (view: View){

        var selectedBtn = view as Button

        var btnId = 0

        when (selectedBtn.id){

            R.id.button  -> btnId = 1
            R.id.button2 -> btnId = 2
            R.id.button3 -> btnId = 3
            R.id.button4 -> btnId = 4
            R.id.button5 -> btnId = 5
            R.id.button6 -> btnId = 6
            R.id.button7 -> btnId = 7
            R.id.button8 -> btnId = 8
            R.id.button9 -> btnId = 9

        }

       // Toast.makeText(this,"selected button no: " + btnId,Toast.LENGTH_SHORT).show()

        play(btnId,selectedBtn)
    }


    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1


    fun play (btnId: Int, selectedBtn: Button){

        if (activePlayer == 1){


            selectedBtn.setBackgroundColor(Color.BLUE)
            player1.add(btnId)
            activePlayer = 2

        } else {


            selectedBtn.setBackgroundColor(Color.YELLOW)
            player2.add(btnId)
            activePlayer = 1
        }

        selectedBtn.isEnabled = false

        findWinner()
    }




    fun findWinner(){

        var winner = -1


        //horizontal

        if(player1.contains(1) && player1.contains(2) && player1.contains(3))
            winner = 1
        if(player2.contains(1) && player2.contains(2) && player2.contains(3))
            winner = 2

        if(player1.contains(4) && player1.contains(5) && player1.contains(6))
            winner = 1
        if(player2.contains(1) && player2.contains(2) && player2.contains(3))
            winner = 2

        if(player1.contains(7) && player1.contains(8) && player1.contains(9))
            winner = 1
        if(player2.contains(1) && player2.contains(2) && player2.contains(3))
            winner = 1



        //vertical

        if(player1.contains(1) && player1.contains(4) && player1.contains(7))
            winner = 1
        if(player2.contains(1) && player2.contains(4) && player2.contains(7))
            winner = 2

        if(player1.contains(2) && player1.contains(5) && player1.contains(8))
            winner = 1
        if(player2.contains(2) && player2.contains(5) && player2.contains(8))
            winner = 2

        if(player1.contains(3) && player1.contains(6) && player1.contains(9))
            winner = 1
        if(player2.contains(3) && player2.contains(6) && player2.contains(9))
            winner = 1


        //cross

        if(player1.contains(1) && player1.contains(5) && player1.contains(9))
            winner = 1
        if(player2.contains(1) && player2.contains(5) && player2.contains(9))
            winner = 2

        if(player1.contains(3) && player1.contains(5) && player1.contains(7))
            winner = 1
        if(player2.contains(3) && player2.contains(5) && player2.contains(7))
            winner = 2




        if (winner != -1){

            if (winner == 1)
                Toast.makeText(this,"player1 win",Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this,"player2 win",Toast.LENGTH_LONG).show()

        }

    }





}
