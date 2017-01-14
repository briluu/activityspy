package edu.washington.briluu.activityspy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    // Log options (least to most) : error, warn, info, debug, verbose.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate event fired.");
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "onStart event fired.");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "OnRestart event fired.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "OnResume event fired.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "OnPause event fired.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "OnStop event fired.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "OnDestroy event fired.");
        Log.e(TAG, "We’re going down, Captain!");
    }
}
