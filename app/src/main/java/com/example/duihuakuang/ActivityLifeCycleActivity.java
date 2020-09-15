package com.example.duihuakuang;

import android.os.Bundle;
import android.util.Log;

public class ActivityLifeCycleActivity extends MainActivity {
    private static String TAG = "LIFTCYCLE";
    @Override  //完全生命周期开始时被调用，初始化MainActivity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "(1) onCreate()");
    }

    @Override  //可视生命周期开始时被调用，对用户界面进行必要的更改
    public void onStart() {
        super.onStart();
        Log.i(TAG, "(2) onStart()");
    }


}
