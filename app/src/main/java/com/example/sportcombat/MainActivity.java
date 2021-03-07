package com.example.sportcombat;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView value;
   /* private TextView date;
    private TextView affil;
    private TextView carac;*/

    private String date;
    private String affil;
    private String carac;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        value = findViewById(R.id.textWing);

        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void Wing(View v)
    {
        date = getResources().getString(R.string.Wing_date);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_dateW", date);

        affil = getResources().getString(R.string.Wing_affil);
        intent.putExtra("message_affilW", affil);

        carac = getResources().getString(R.string.Wing_carac);
        intent.putExtra("message_caracW", carac);

        startActivity(intent);
    }

    public void Taichi(View v)
    {
        date = getResources().getString(R.string.Taichi_date);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_dateW", date);

        affil = getResources().getString(R.string.Taichi_affil);
        intent.putExtra("message_affilW", affil);

        carac = getResources().getString(R.string.Taichi_carac);
        intent.putExtra("message_caracW", carac);

        startActivity(intent);
    }

    public void Hung(View v)
    {
        date = getResources().getString(R.string.Hung_date);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_dateW", date);

        affil = getResources().getString(R.string.Hung_affil);
        intent.putExtra("message_affilW", affil);

        carac = getResources().getString(R.string.Hung_carac);
        intent.putExtra("message_caracW", carac);

        startActivity(intent);
    }

    public void Bagua(View v)
    {
        date = getResources().getString(R.string.Bagua_date);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_dateW", date);

        affil = getResources().getString(R.string.Bagua_affil);
        intent.putExtra("message_affilW", affil);

        carac = getResources().getString(R.string.Bagua_carac);
        intent.putExtra("message_caracW", carac);

        startActivity(intent);
    }

    public void Calcio(View v)
    {
        date = getResources().getString(R.string.Calcio_date);
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_dateW", date);

        affil = getResources().getString(R.string.Calcio_affil);
        intent.putExtra("message_affilW", affil);

        carac = getResources().getString(R.string.Calcio_carac);
        intent.putExtra("message_caracW", carac);

        startActivity(intent);
    }
}