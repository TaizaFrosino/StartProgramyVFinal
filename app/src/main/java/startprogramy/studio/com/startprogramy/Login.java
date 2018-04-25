package startprogramy.studio.com.startprogramy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText usuarioLogin;
    private EditText senhaLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuarioLogin = (EditText) findViewById(R.id.id_usuarioLogin);
        senhaLogin = (EditText) findViewById(R.id.id_senhaLogin);



    }
}
