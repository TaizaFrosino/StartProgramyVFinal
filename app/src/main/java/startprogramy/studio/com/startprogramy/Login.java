package startprogramy.studio.com.startprogramy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class Login extends AppCompatActivity {



    Button btnLogin;
    private EditText usuarioLogin;
    private EditText senhaLogin;

    RelativeLayout activity_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnLogin = (Button) findViewById(R.id.button);
        usuarioLogin = (EditText) findViewById(R.id.id_usuarioLogin);
        senhaLogin = (EditText) findViewById(R.id.id_senhaLogin);



    }
}
