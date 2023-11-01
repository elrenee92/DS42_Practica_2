package mx.edu.uthermosillo.apps.renecastro.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val caras = findViewById<TextView>(R.id.numcaras)
        val tirar = findViewById<Button>(R.id.tirar)
        val resultado = findViewById<TextView>(R.id.resultado)
        val dados = findViewById<TextView>(R.id.numdados)

        tirar.setOnClickListener {

            val NumeroDeCaras = caras.text.toString()
            val TextCaras = NumeroDeCaras.toInt()
            val dadosText = dados.text.toString()
            val numdados = dadosText.toInt()

            if (numdados >=1){

                val Multiplicacion = numdados * TextCaras
                val dadoaleatoreo = ( numdados .. Multiplicacion).random()
                resultado.text = dadoaleatoreo.toString()
            }
            else
            {
                Toast.makeText(this, "El número de dados debe ser mayor a 0", Toast.LENGTH_SHORT).show()
            }

        }
    }
}