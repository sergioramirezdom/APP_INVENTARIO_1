package com.example.sergio.app_inventario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sergio on 6/12/16.
 */

public class Login extends Activity {

    private Button btnLogin;
    private EditText inputUser;
    private EditText inputPass;
    private TextView loginErrorMsg;

    @Override public void onCreate(Bundle saveInstanceState){

        super.onCreate(saveInstanceState);
        setContentView(R.layout.login);

        inputUser = (EditText) findViewById(R.id.usuario);
        inputPass = (EditText) findViewById(R.id.contrasena);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        loginErrorMsg = (TextView) findViewById(R.id.login_error);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String usuario = inputUser.getText().toString();
                String contrasena = inputPass.getText().toString();

                if (usuario.equals("7001") && contrasena.equals("1234")){

                    Intent item = new Intent(Login.this, MainActivity.class);
                    startActivity(item);


                }else {

                    Toast toast = Toast.makeText(getApplicationContext(), "Usuario y/o contraseña incorrectos.", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.show();

                }

                /* Usuario usuario = new Usuario();

                usuario.setOnLoginUsuario(new OnLoginUsuario() {
                    @Override
                    public void onLoginWrong(String msg) {loginErrorMsg.setText(msg);}
                    @Override
                    public void onLoginCorrect(JSONObject json, String msg) {
                        loginErrorMsg.setText("");
                        Intent itemintent = new Intent(Login.this, ActivityPrincipal.class);
                        Login.this.startActivity(itemintent);
                    }
                });
                usuario.login(Login.this, email, password); */
            }
        });

    }

}

/*    private TextView lblGotoRegister;
    private Button btnLogin;
    private EditText inputEmail;
    private EditText inputPassword;
    private TextView loginErrorMsg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        inputEmail = (EditText) findViewById(R.id.txtEmail);
        inputPassword = (EditText) findViewById(R.id.txtPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        loginErrorMsg = (TextView) findViewById(R.id.login_error);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String email = inputEmail.getText().toString();
                String password = inputPassword.getText().toString();

                Usuario usuario = new Usuario();

                usuario.setOnLoginUsuario(new OnLoginUsuario() {
                    @Override
                    public void onLoginWrong(String msg) {loginErrorMsg.setText(msg);}
                    @Override
                    public void onLoginCorrect(JSONObject json, String msg) {
                        loginErrorMsg.setText("");
                        Intent itemintent = new Intent(Login.this, ActivityPrincipal.class);
                        Login.this.startActivity(itemintent);
                    }
                });
                usuario.login(Login.this, email, password);
            }
        });

        lblGotoRegister = (TextView) findViewById(R.id.link_to_register);
        lblGotoRegister.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Login.this, Register.class);
                Login.this.startActivity(itemintent);
            }
        });
    }

}
*/