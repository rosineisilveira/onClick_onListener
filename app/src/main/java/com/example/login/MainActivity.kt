package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var textoResult :TextView
    lateinit var textoEmail:  TextView
    lateinit var texto:       TextView

    lateinit var vermelho:    CheckBox
    lateinit var verde:       CheckBox
    lateinit var branco:      CheckBox

    lateinit var masculino:   RadioButton
    lateinit var feminino:    RadioButton
    lateinit var radioGroup:  RadioGroup


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         textoResult  = findViewById(R.id.resultado)
         textoEmail   = findViewById(R.id.email)
         texto        = findViewById(R.id.nome)

         vermelho     = findViewById(R.id.checkVermelho)
         verde        = findViewById(R.id.checkVerde)
         branco       = findViewById(R.id.checkBranco)

         masculino    = findViewById(R.id.radioM)
         feminino     = findViewById(R.id.radioF)

         radioGroup   = findViewById(R.id.radioGroupSexo)

        radioButton()

    }
    /*fun  checkbox(){

        if (vermelho.isChecked){
            textoResult.text = "vermelho selecionado -"
        }
        if (verde.isChecked){
            textoResult.text = "verde selecionado -"
        }
        if (branco.isChecked){
            textoResult.text = "branco selecionado -"
        }

    }*/

    fun radioButton(){
        radioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{
                group, checkedId ->

            if(checkedId == R.id.radioM){
                textoResult.text = "masculino"

            }else if (checkedId == R.id.radioF){
                textoResult.text = "feminino"
            }
        })


      /*  if (masculino.isChecked){
            textoResult.text = "masculino"
        }else if (feminino.isChecked){
            textoResult.text = "feminino"
        }*/
    }

    fun enviar(view: android.view.View) {

        //radioButton()

        //checkbox()

        //textoResult.text = "" + texto.text +"/"+textoEmail.text
    }

    fun limpar(view: android.view.View) {

        //textoResult.text  = ""
        //textoEmail.text = ""
        // texto.text = ""

    }
}




