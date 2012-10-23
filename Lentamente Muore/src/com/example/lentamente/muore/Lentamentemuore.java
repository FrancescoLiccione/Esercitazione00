package com.example.lentamente.muore;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Lentamentemuore extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lentamente_muore);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.lentamente_muore, menu);
        return true;
    }
}
