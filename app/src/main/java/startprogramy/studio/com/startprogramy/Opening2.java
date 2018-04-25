package startprogramy.studio.com.startprogramy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Opening2 extends AppCompatActivity {

    TextView opening2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening2);

        opening2 = (TextView) findViewById(R.id.pular_instrucoes2);
        opening2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Opening2.this, MainActivity.class);
                startActivity(it);
            }
        });


    }

    public void startActivityOp3(View view) {
        Intent activityOp3 = new Intent(this, Opening3.class);
        startActivity(activityOp3);
    }
}
