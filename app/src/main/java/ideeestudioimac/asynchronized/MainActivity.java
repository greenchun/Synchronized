package ideeestudioimac.asynchronized;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


//https://www.ptt.cc/bbs/AndroidDev/M.1390316957.A.0D4.html

public class MainActivity extends AppCompatActivity {

    final static private String TAG = "ideee";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Synchronized mSynchronized = new Synchronized();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //mSynchronized.method0();
                mSynchronized.method1();
                //new Synchronized().method1();
                // new Synchronized().method2();
                 //mSynchronized.method1();
            }
        },"A");


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //mSynchronized.method0();
                //mSynchronized.method1();
                //new Synchronized().method1();
                // new Synchronized().method2();
                 mSynchronized.method3();
            }
        }, "B");

        Log.d(TAG, "Start Thread!");
        thread1.start();
        thread2.start();
    }
}
