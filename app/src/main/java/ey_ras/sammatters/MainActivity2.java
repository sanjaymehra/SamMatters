package ey_ras.sammatters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity2 extends AppCompatActivity {
    ImageButton buttonImage;
    ImageView imageview;
    Button SamNews,SamAwarenees,EYAtom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        buttonImage = (ImageButton) findViewById(R.id.imageButton);
        SamNews = (Button) findViewById(R.id.SamNews);
        SamAwarenees = (Button) findViewById(R.id.SamAwarenees);
        EYAtom = (Button) findViewById(R.id.EYAtom);
        imageview = (ImageView) findViewById(R.id.imageView);
        buttonImage.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               // TODO Auto-generated method stub

                                               Intent transfer = new Intent(MainActivity2.this, MainActivity1.class);
                                               transfer.putExtra("menu", false);
                                               startActivity(transfer);
                                               finish();
                                           }
                                       });
                SamNews.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent transfer = new Intent(MainActivity2.this, SamNewsActivity.class);
                        transfer.putExtra("menu", false);
                        startActivity(transfer);
                        finish();

                    }
                });
                SamAwarenees.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent transfer = new Intent(MainActivity2.this, SamAwarneesActivity.class);
                        transfer.putExtra("menu", false);
                        startActivity(transfer);
                        finish();

                    }
                });

                EYAtom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent transfer = new Intent(MainActivity2.this, EYAtomActivity.class);
                        transfer.putExtra("menu", false);
                        startActivity(transfer);
                        finish();

                    }
                });


    }}














