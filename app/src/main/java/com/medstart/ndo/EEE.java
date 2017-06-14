package com.medstart.ndo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EEE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);
    }

    public void btn_e(View v) {
        Intent intent = new Intent(EEE.this, MainActivity.class);
        startActivity(intent);
}
}
