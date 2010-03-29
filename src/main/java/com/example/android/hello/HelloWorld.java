package com.example.android.hello;

import android.app.Activity;
import android.os.Bundle;

public class HelloWorld extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
