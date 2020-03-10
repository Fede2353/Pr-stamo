package br.com.uniftec.pres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class infoprestamo extends AppCompatActivity {


    private TextView tvresultado2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoprestamo);
        tvresultado2=(TextView)findViewById(R.id.tvresultado2);
        Intent recibirdatos = getIntent();// creamos un objeto intent para declarar la intecnión de recibir datos y comenzar la acción
        Bundle bundle= recibirdatos.getExtras();/*obtiene el paquete, recibe esos datos* y los pega, el paquete*/ //quedando en la variable bundle//
        tvresultado2.setText(bundle.getString("info")); //entonces setea el valor del txt,obtiene el texto que viene del paquete de otra pantalla en este caso llamadao notas // y con setea el contenido del txt con eso


    }
}
