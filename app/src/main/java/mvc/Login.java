package mvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import startprogramy.studio.com.startprogramy.R;

public class Login extends AppCompatActivity {



    Button btnCadastrar;
    private EditText usuarioLogin;
    private EditText senhaLogin;



    RelativeLayout activity_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        usuarioLogin = (EditText) findViewById(R.id.id_usuarioLogin);
        senhaLogin = (EditText) findViewById(R.id.id_senhaLogin);



    }
}
