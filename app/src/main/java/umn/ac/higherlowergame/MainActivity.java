package umn.ac.higherlowergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void guess(View view){
        EditText guessEditText = (EditText) findViewById(R.id.editTextNumber);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if(guessInt > randomNumber){
            Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_SHORT).show();
        }else if(guessInt < randomNumber){
            Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "That is right!", Toast.LENGTH_SHORT).show();

            Random rand = new Random();

            randomNumber = rand.nextInt(20)+1;
        }

        Toast.makeText(MainActivity.this, guessEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
    }
}