package startprogramy.studio.com.startprogramy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Opening4 extends AppCompatActivity {


    TextView opening4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening4);

        opening4 = (TextView) findViewById(R.id.pular_instrucoes4);
        opening4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Opening4.this,MainActivity.class);
                startActivity(it);
            }
        });
    }
}
