package com.example.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbCoorporativo;
    private RadioButton rbParticular;
    private View contenedorParticular;
    private View contenedorCoorporativo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbCoorporativo = (RadioButton) findViewById(R.id.rb_coorporativo);
        rbParticular = (RadioButton) findViewById(R.id.rb_particular);
        contenedorCoorporativo = (View) findViewById(R.id.ll_contenedor_coorporativo);
        contenedorParticular = (View) findViewById(R.id.contenedor_particular);

        rbParticular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contenedorCoorporativo.setVisibility(View.GONE);
                contenedorParticular.setVisibility(View.VISIBLE);
            }
        });

        rbCoorporativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contenedorCoorporativo.setVisibility(View.VISIBLE);
                contenedorParticular.setVisibility(View.GONE);
            }
        });
    }
}
