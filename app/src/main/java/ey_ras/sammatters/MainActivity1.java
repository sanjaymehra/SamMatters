package ey_ras.sammatters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity1 extends AppCompatActivity {
    Button button2;
    Button button7;
    ImageView imageview7;
    ImageView imageview8;
    ImageView imageview9;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview7=(ImageView)findViewById(R.id.imageView7);
        imageview7.setImageResource(R.drawable.ic_luncher);


        button2=(Button)findViewById(R.id.button2);
        button7=(Button)findViewById(R.id.button7);

        
        button2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent transfer= new Intent(MainActivity1.this,MainActivity2.class);
                transfer.putExtra("menu", false);
                startActivity(transfer);
                finish();
            }

        });




        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent transfer= new Intent(MainActivity1.this,MainActivity3.class);
                transfer.putExtra("menu", false);
                startActivity(transfer);
                finish();

            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

