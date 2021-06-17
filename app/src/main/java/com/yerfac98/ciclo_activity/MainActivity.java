package com.yerfac98.ciclo_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnSCreate", Toast.LENGTH_SHORT).show();
        //se crea la actividad
    }
    //Ciclo de vida de un activity
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        //La actividad casi  visible
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        //La actividad se ha vuelto visible
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        //Esta actividad esta a punto de ser detenida
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        //La actividad ya no esta visible
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"OnDestroy", Toast.LENGTH_SHORT).show();
        //La actividad se destruye
    }

}
