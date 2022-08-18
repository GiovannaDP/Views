package com.example.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.views.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //Referencia para a classe de viewBinding
    private ActivityMainBinding activityMainBinding;
    private Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.salvarBt.setOnClickListener(view -> {
            pessoa = new Pessoa(
                    activityMainBinding.nomeEt.getText().toString(),
                    activityMainBinding.sobrenomeEt.getText().toString(),
                    activityMainBinding.emailEt.getText().toString(),
                    activityMainBinding.estadoCivilSp.getSelectedItem().toString(),
                    //((TextView) activityMainBinding.estadoCivilSp.getSelectedView()).getText().toString(),
                    //activityMainBinding.femininoRb.isChecked()? "Feminino" : "Masculino"
                    //activityMainBinding.femininoRb.isChecked()? activityMainBinding.femininoRb.getText().toString() : activityMainBinding.masculinoRb.getText().toString()
                    activityMainBinding.femininoRb.isChecked()? getString(R.string.feminino) : getString(R.string.masculino)
            );
        });

        activityMainBinding.limparBt.setOnClickListener(view -> {
            activityMainBinding.nomeEt.setText("");
            activityMainBinding.sobrenomeEt.setText("");
            activityMainBinding.emailEt.setText("");
            activityMainBinding.estadoCivilSp.setSelection(0);
            activityMainBinding.femininoRb.setChecked(true);
        });
    }
    
    public void onClickBotao(View botao){
        if (botao.getId() == R.id.salvarBt){
            Toast.makeText(this, "clicou no salvar", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "clicou no limpar", Toast.LENGTH_SHORT).show();
        }

    }
}