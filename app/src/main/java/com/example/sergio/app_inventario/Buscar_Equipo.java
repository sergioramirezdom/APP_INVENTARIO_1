package com.example.sergio.app_inventario;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Sergio on 14/7/16.
 */

public class Buscar_Equipo extends Activity {

    EditText inputEquipo;
    EditText inputNSerie;
    EditText inputModelo;
    EditText inputNProducto;
    EditText inputPersona;


    @Override
    public void onCreate(Bundle saveInstanceState){

        super.onCreate(saveInstanceState);
        setContentView(R.layout.buscar_equipo);

        //EditText
        inputEquipo = (EditText) findViewById(R.id.input_equipo_b);
        inputNSerie = (EditText) findViewById(R.id.input_n_serie_b);
        inputNProducto = (EditText) findViewById(R.id.input_n_producto_b);
        inputModelo = (EditText) findViewById(R.id.input_modelo_b);
        inputPersona = (EditText) findViewById(R.id.input_persona_b);

        //Creamos boton, capturamos los datos que introducimos
        Button btnBuscar = (Button) findViewById(R.id.boton_buscar);

        //Creamos un evento OnClick para el boton, cada vez que se pulse, en caso de que al menos
        //un campo este relleno, llamará al método BuscarEquipo

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputEquipo.getText().toString().equals("") && inputNSerie.getText().toString().equals("")
                        && inputModelo.getText().toString().equals("") && inputNProducto.getText().toString().equals("")
                        && inputPersona.getText().toString().equals("")) {

                    Toast toast = Toast.makeText(getApplicationContext(), "Debe rellenar al menos un campo para buscar", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.show();
                }
                else {
                    String variable = inputEquipo.getText().toString();
                    Toast toast = Toast.makeText(getApplicationContext(), "El numero de equipo es el siguiente: " + variable,
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.show();

                }
            }
        });

    }

}
