package co.edu.konradlorenz.konclothes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import co.edu.konradlorenz.konclothes.R;

public class CardDetails extends AppCompatActivity {

    private Button btnRegresarDetCompra;
    private Button btnComprar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_details);

        btnRegresarDetCompra = (Button) findViewById(R.id.btnRegresarDetCompra);
        btnComprar = (Button) findViewById(R.id.btnComprar);

        btnRegresarDetCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CardDetails.this,PurchaseDetails.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CardDetails.this,Purchases.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                Toast.makeText(getApplicationContext(), getString(R.string.purchaseMade), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
