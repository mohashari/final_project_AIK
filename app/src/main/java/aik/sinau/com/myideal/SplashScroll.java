package aik.sinau.com.myideal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by root on 11/28/16.
 */
public class SplashScroll extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread threadTime = new Thread() {
            public void run(){
            try {
                sleep(3000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                Intent intent= new Intent(SplashScroll.this, MainActivity.class);
                startActivity(intent);
            }
            }
        };
        threadTime.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
