package ey_ras.sammatters;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class Activity5 extends AppCompatActivity {

    ImageButton imageButton4;

//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        imageButton4 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent transfer = new Intent(Activity5.this, MainActivity3.class);
                transfer.putExtra("menu", false);
                startActivity(transfer);
                finish();
            }


        });
    }


}



