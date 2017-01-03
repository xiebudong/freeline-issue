package com.gaogao.liba;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class LibaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liba);

        // 去掉这一行注释，再次运行freeline就会报错
//        Toast.makeText(this, "hello", Toast.LENGTH_LONG).show();
    }
}
