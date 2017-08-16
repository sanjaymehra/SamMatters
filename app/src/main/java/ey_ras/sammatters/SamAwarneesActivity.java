package ey_ras.sammatters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SamAwarneesActivity extends AppCompatActivity {
    ImageButton imageButton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sam_awarnees);

        imageButton7=(ImageButton)findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent transfer = new Intent(SamAwarneesActivity.this, MainActivity2.class);
                transfer.putExtra("menu", false);
                startActivity(transfer);
                finish();

            }
        });

    }
}
