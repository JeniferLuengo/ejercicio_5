package com.example.ejercicio_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ejercicio_5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(view.getRoot());

        view.textoEmail.setText("jenifersusana0505@gmail.com");
        view.textoPassword.setText("Magdalena");
        view.bottonEjercicio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name = view.textonombre.getText().toString();
                String LastName = view.textoLastname.getText().toString();
                Toast.makeText(MainActivity.this, " Hola " + Name + " " + LastName,
                        Toast.LENGTH_SHORT).show();
                pase2(Name, LastName);
            }
        });


    }

    private Void pase2(String Name, String LastName){
        Intent pase2 = new Intent(MainActivity.this, SegundaActividad.class);
        pase2.putExtra("name", Name);
        pase2.putExtra("LastName", LastName);
    }




}
