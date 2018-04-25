package startprogramy.studio.com.startprogramy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LogoAnimation extends AppCompatActivity {

    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_animation);

        logo = (ImageView) findViewById(R.id.logoWhite);
        Animation animacao = AnimationUtils.loadAnimation(this, R.anim.teste);
        logo.startAnimation(animacao);
        animacao.setDuration(3000);

        final Intent prox = new Intent(this,Start.class);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch (InterruptedException e ){
                    e.printStackTrace();
                }
                finally {
                    startActivity(prox);
                    finish();
                }
            }
        };
        timer.start();
    }
}
