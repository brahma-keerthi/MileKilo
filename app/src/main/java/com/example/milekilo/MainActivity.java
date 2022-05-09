package com.example.milekilo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView4);
        editText = findViewById(R.id.editTextNumberDecimal);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Thanks for using", Toast.LENGTH_SHORT).show();
                double mile = Double.parseDouble(editText.getText().toString());
                double km = mile * 1.609;
                km = (double) (Math.round(km *100.0)/100.0);
                textView.setText(mile + " mile = " + km + " km");
            }
        });
    }
}