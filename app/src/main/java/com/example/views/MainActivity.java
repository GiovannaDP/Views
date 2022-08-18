package com.example.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.views.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //Referencia para a classe de viewBinding
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
    }
    
    public void onClickSalvar(View botao){
        Toast.makeText(this, "clicou no salvar", Toast.LENGTH_SHORT).show();
    }
}