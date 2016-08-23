package ideeestudioimac.asynchronized;

import android.util.Log;

/**
 * Created by ideeestudioimac on 16/8/23.
 */
public class Synchronized {

    final static private String TAG = "ideee";

    public static void method0() {
        int i = 0;
        while (i++ < 3) {
            Log.d(TAG, Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    synchronized public void method1() {
        method0();
    }

    synchronized public static void method2() {
        method0();
    }

    public void method3() {
        Log.d(TAG, "Start method3");

        synchronized (this) {
            method0();
        }

        Log.d(TAG, "End method3");
    }

}
