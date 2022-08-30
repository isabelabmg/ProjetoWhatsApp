package com.example.projetowhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    private TextInputLayout inputLayoutTelefone;
    private TextInputLayout inputLayoutTexto;

    private TextInputEditText inputTextTelefone;
    private TextInputEditText inputTextTexto;

    private Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLayoutTelefone = findViewById(R.id.input_layout_telefone);
        inputLayoutTexto = findViewById(R.id.input_layout_texto);

        inputTextTelefone = findViewById(R.id.input_text_telefone);
        inputTextTexto = findViewById(R.id.input_text_texto);

        buttonOk = findViewById(R.id.buttonOk);

        buttonOk.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String number = inputTextTelefone.getText().toString();
                        String text = inputTextTexto.getText().toString();
                        Uri webpage = Uri.parse("https://wa.me/"+number+"/?text="+text);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                        startActivity(webIntent);
                    }
                }
        );

    }
}