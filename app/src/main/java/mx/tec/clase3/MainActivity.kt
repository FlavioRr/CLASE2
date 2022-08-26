package mx.tec.clase3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTxtNombre = findViewById<EditText>(R.id.editTextTextPersonName)
        val myNumEdad = findViewById<EditText>(R.id.editTextTextPersonName2)
        val myButtonSubmit = findViewById<Button>(R.id.button)

        myButtonSubmit.setOnClickListener {
            var elNombre: String = myTxtNombre.text.toString()
            var edad: Int = parseInt(myNumEdad.text.toString())

            val myIntent = Intent(this, TargetActivity::class.java)

            myIntent.putExtra("keyNombre", elNombre)
            myIntent.putExtra("keyEdad", edad)

            startActivity(myIntent)

        }

        Log.d("E2", "Fin de la ejecucion de onCreate de MainActivity")
    }
}