package com.zzl.solibrarycreate;

import android.os.Bundle;

import com.wzc.ns.NsUtils;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NsUtils nsUtils = new NsUtils();
        nsUtils.useNs().setNsConfig(8000, 2).prepareNs();
//        Log.d(TAG, "onCreate:aa "+helloFromNative());

    }

}
