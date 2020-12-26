package com.example.ejercicio_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.ejercicio_5.databinding.ActivityMainBinding;
import com.example.ejercicio_5.databinding.ActivitySegundaActividadBinding;

public class SegundaActividad extends AppCompatActivity {
    private ActivitySegundaActividadBinding view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view= ActivitySegundaActividadBinding.inflate( getLayoutInflater());
        setContentView(view.getRoot());
        Intent intent=getIntent();
        if(intent!= null){
            view.textView.setText(intent.getStringExtra("Name"));
            view.textView2.setText(intent.getStringExtra("LastName"));
        }



    }
}