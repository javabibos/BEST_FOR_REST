package com.example.sasha.best_for_rest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPhilippines = (Button) findViewById(R.id.buttonPhilippines);
        Button btnTailand = (Button) findViewById(R.id.buttonTailand);
        Button btnCambodia = (Button) findViewById(R.id.buttonCambodia);
        Button btnCostaRica = (Button) findViewById(R.id.buttonCostaRica);
        Button btnBelize = (Button) findViewById(R.id.buttonBelize);
        btnPhilippines.setOnClickListener(this);
        btnTailand.setOnClickListener(this);
        btnCambodia.setOnClickListener(this);
        btnCostaRica.setOnClickListener(this);
        btnBelize.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonPhilippines:
                Intent intentPhilippines = new Intent(this, PhilippinesActivity.class);
                startActivity(intentPhilippines);
                break;
            case R.id.buttonTailand:
                Intent intentTailand = new Intent(this, TailandActivity.class);
                startActivity(intentTailand);
                break;
            case R.id.buttonCambodia:
                Intent intentCambodia = new Intent(this, CambodiaActivity.class);
                startActivity(intentCambodia);
                break;
            case R.id.buttonCostaRica:
                Intent intentCostaRica = new Intent(this, CostaRikaActivity.class);
                startActivity(intentCostaRica);
                break;
            case R.id.buttonBelize:
                Intent intentBelize = new Intent(this, BelizActivity.class);
                startActivity(intentBelize);
                break;
            default:
                break;

        }

    }
}
