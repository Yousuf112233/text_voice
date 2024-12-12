package com.example.text_tovoice;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextText;
    Button button;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editTextText=findViewById(R.id.editTextText);
        button=findViewById(R.id.button);

        textToSpeech=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



              textToSpeech.speak(" "+editTextText.getText().toString(),TextToSpeech.QUEUE_FLUSH,null,null);

            }
        });





    }
}