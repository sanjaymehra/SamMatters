package ey_ras.sammatters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText ed1,ed2;
    Button but3,but4;
    ImageButton imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        but3 = (Button)findViewById(R.id.button3);

        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText);



        but4 = (Button)findViewById(R.id.button4);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Welcome to EY...", Toast.LENGTH_SHORT).show();
                    Intent transfer = new Intent(MainActivity3.this, MainActivity2.class);
                    transfer.putExtra("menu", false);
                    startActivity(transfer);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Login allowed to EY Emp",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent transfer = new Intent(MainActivity3.this, MainActivity1.class);
                transfer.putExtra("menu", false);
                startActivity(transfer);
                finish();

            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent transfer = new Intent(MainActivity3.this, ActivitySignup.class);
                transfer.putExtra("menu", false);
                startActivity(transfer);
                finish();
            }
        });
    }}

