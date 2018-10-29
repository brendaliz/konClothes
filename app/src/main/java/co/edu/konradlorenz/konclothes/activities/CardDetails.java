package co.edu.konradlorenz.konclothes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
            }
        });

        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CardDetails.this,Purchases.class);
                startActivity(intent);
            }
        });
    }
}
