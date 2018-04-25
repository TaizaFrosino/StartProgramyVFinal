package startprogramy.studio.com.startprogramy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Start extends AppCompatActivity {
    private TextView tvLogin;
    private TextView tvCadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city);

        tvLogin = (TextView) findViewById(R.id.tv_login);
        tvCadastrar = (TextView) findViewById(R.id.tv_cadastrar);

        Button btPlay = (Button) findViewById(R.id.button);
        btPlay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent (Start.this, Opening1.class);
                startActivity(it);
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent (Start.this, Login.class);
                startActivity(it);
            }
        });

        tvCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent (Start.this, Cadastro.class);
                startActivity(it);
            }
        });

    }
}