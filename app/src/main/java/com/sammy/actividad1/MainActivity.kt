package com.sammy.actividad1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    var editText: EditText?= null
    var radio1: RadioButton?= null
    var radio2: RadioButton?= null
    var check1: CheckBox?= null
    var check2: CheckBox?= null
    var toggleButton: ToggleButton?= null
    var switch: Switch?= null
    var imageButton: ImageButton?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editText = findViewById<EditText>(R.id.idEditText);
        radio1 = findViewById<RadioButton>(R.id.radio1);
        radio2 = findViewById<RadioButton>(R.id.radio2);
        check1 = findViewById<CheckBox>(R.id.checkBox1);
        check2 = findViewById<CheckBox>(R.id.checkBox2);
        toggleButton = findViewById<ToggleButton>(R.id.botonToggle);
        switch = findViewById<Switch>(R.id.Switch);



        var btnValidar: Button = findViewById(R.id.btn)
        btnValidar.setOnClickListener { validar() }


    }

    private fun validar () {

        var cad:String="Seleccionado: \n"


        cad += "${editText?.text.toString()} \n"


        if (radio1?.isChecked==true){
            cad += "${radio1?.text.toString()} \n"
        }

        if (radio2?.isChecked==true){
            cad += "${radio2?.text.toString()} \n"
        }

        if (check1?.isChecked==true){
            cad += "${check1?.text.toString()} \n"
        }

        if (check2?.isChecked==true){
            cad += "${check2?.text.toString()} \n"
        }

        if (toggleButton?.isChecked==true){
            cad += "${toggleButton?.text.toString()} \n"
        }

        if (switch?.isChecked==true){
            cad += "${switch?.text.toString()} switch on\n"
        }else{
            cad += "${switch?.text.toString()} switch off\n"
        }



        Toast.makeText(this, "${cad}", Toast.LENGTH_SHORT).show();

    }

}

