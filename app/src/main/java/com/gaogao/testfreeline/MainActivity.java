package com.gaogao.testfreeline;

import android.app.Activity;
import android.os.Bundle;

import com.gaogao.liba.TestLibaUtil;

import junit.framework.Test;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestLibaUtil.hello(R.string.test_liba_string);
    }
}
