package mx.tec.clase3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        val myTxtNombre = findViewById<TextView>(R.id.textView4)
        val myNumEdad = findViewById<TextView>(R.id.textView6)
        val botonRegresar = findViewById<Button>(R.id.button2)

        var myExtras : Bundle? = intent.extras
        var nombreRecibido : String = myExtras?.getString("keyNombre")?:"NoName"
        var edadRecibida : Int = myExtras?.getInt("keyEdad")?:-1

        myTxtNombre.text = nombreRecibido
        myNumEdad.text = edadRecibida.toString()

        botonRegresar.setOnClickListener{
            val myIntent: Intent = Intent(this, TargetActivity::class.java)
            startActivity(myIntent)
        }

        Log.d("E2", "Fin de la ejecucion de onCreate de TargetActivity")
    }
}