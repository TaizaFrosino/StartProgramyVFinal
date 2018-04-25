package startprogramy.studio.com.startprogramy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Opening3 extends AppCompatActivity {

    TextView opening3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening3);

        opening3 = (TextView) findViewById(R.id.pular_instrucoes3);
        opening3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Opening3.this, MainActivity.class);
                startActivity(it);
            }
        });
    }

    public void startActivityOp4(View view) {
        Intent activityOp4 = new Intent(this, Opening4.class);
        startActivity(activityOp4);
    }

}
