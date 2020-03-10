package br.com.uniftec.pres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbdiez,cbveinte,cbcincuenta,cbcien;
    private Button  btnuno,btnseis,btndoce,btnprocesarinfo;
    private TextView tvresultado2;
    double pesos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     cbdiez=(CheckBox)findViewById(R.id.cbdiezmil);
     cbveinte=(CheckBox)findViewById(R.id.cbveintemil);
     cbcincuenta=(CheckBox)findViewById(R.id.cbcincuentamil);
     cbcien=(CheckBox)findViewById(R.id.cbcienmil);
     btnuno=(Button)findViewById(R.id.btnuna);
     btnseis=(Button)findViewById(R.id.btnseis);
     btndoce=(Button)findViewById(R.id.btndoce);
     btnprocesarinfo=(Button)findViewById(R.id.btnobtenerinfo);

     tvresultado2=(TextView)findViewById(R.id.tvresultado2);

        cbdiez.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
           double resultado;
              if(cbdiez.isChecked()){
                 pesos = 10000;
              cbveinte.isChecked();
              }
         }
     });

     cbveinte.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             double resultado;
              if(cbveinte.isChecked()){
                 pesos = 20000;
              }
         }
     });

     cbcincuenta.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             double resultado;
             if(cbcincuenta.isChecked()){
                 pesos = 50000;
             }
         }
     });

     cbcien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado;
                if(cbcien.isChecked()){
                    pesos = 100000;
                }
            }
        });

     btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado;
                resultado=((pesos*0.025) + pesos) /1;
                tvresultado2.setText( "1 cuota de " + resultado);
                if (pesos == 0){
                    tvresultado2.setText( "no solicitó ningún importe" );
                }
            }
        });
     btnseis.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             double resultado;
             resultado=((pesos*0.05) + pesos) /6;
             tvresultado2.setText( "6 cuotas de " + resultado);
             if (pesos == 0){
                 tvresultado2.setText( "no solicitó ningún importe" );
             }
         }
     });
     btndoce.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             double resultado;
             resultado=((pesos*0.10) + pesos) /12;
             tvresultado2.setText( "12 cuotas de " + resultado);
             if (pesos == 0){
                 tvresultado2.setText( "no solicitó ningún importe" );
             }
         }
     });

     btnprocesarinfo.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             Intent enviardatos = new Intent(MainActivity.this,infoprestamo.class);
               String datos="no solicitó ningún importe";
             if (cbdiez.isChecked()){
                 datos = "$10000 en: " + tvresultado2.getText().toString();
             } else if (cbveinte.isChecked()){
                 datos = "$20000 en: " + tvresultado2.getText().toString();
             } else if (cbcincuenta.isChecked()){
                 datos = "$50000 en: " + tvresultado2.getText().toString();
             } else if (cbcien.isChecked()){
                 datos = "$100000 en: " + tvresultado2.getText().toString();
             }
             Bundle caja = new Bundle(); //utilizo un objeto de la clase bundle para mandar los datos recolectados a la otra pantalla// es el medio que nos permite mandar los datos de una pantalla a otra//
             caja.putString("info",datos); // colocar los datos a enviar con su referencia de nombre en el bundle y darle un nombre para la cuando lo va a recibir primero//
             enviardatos.putExtras(caja);//antes de abrir va a mandar el bundle, efectiviza el envio de datos de arriba
             startActivity(enviardatos);//comando que indica que se va a abrir la próxima pantalla (Activity) con la intención, que es todo lo anterior top↑ //
             /*Luego pasar a la tela (pantalla) que va a recibir*/


         }
     });



    }



}




