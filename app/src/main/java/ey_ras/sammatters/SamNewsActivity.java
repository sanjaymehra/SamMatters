package ey_ras.sammatters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SamNewsActivity extends AppCompatActivity {
    ImageButton imageButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sam_news);



        imageButton6=(ImageButton)findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent transfer = new Intent(SamNewsActivity.this, MainActivity2.class);
                transfer.putExtra("menu", false);
                startActivity(transfer);
                finish();

            }
        });



    }
}
