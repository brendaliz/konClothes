package co.edu.konradlorenz.konclothes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.konradlorenz.konclothes.R;
import co.edu.konradlorenz.konclothes.adapters.CartClothesAdapter;
import co.edu.konradlorenz.konclothes.entities.CartClothesEntity;

public class PurchaseDetails extends AppCompatActivity {

    private CartClothesAdapter adaptador;


    private ImageView americanExpress;
    private ImageView mastercard;
    private ImageView paypal;
    private ImageView visa;
    private Button btnRegresarCarrito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_details);

        ListView lvItems = (ListView) findViewById(R.id.lvPurchaseItems);
        btnRegresarCarrito = (Button) findViewById(R.id.btnVolverCarrito);
        americanExpress = (ImageView) findViewById(R.id.american_express);
        mastercard = (ImageView) findViewById(R.id.master_card);
        paypal = (ImageView) findViewById(R.id.pay_pal);
        visa = (ImageView) findViewById(R.id.visa);

        adaptador = new CartClothesAdapter(this,GetArrayItems());
        lvItems.setAdapter(adaptador);

        btnRegresarCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PurchaseDetails.this, CartClothesActivity.class);
                startActivity(intent);
            }
        });

        americanExpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PurchaseDetails.this, CardDetails.class);
                startActivity(intent);
            }
        });

        mastercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PurchaseDetails.this, CardDetails.class);
                startActivity(intent);
            }
        });

        paypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PurchaseDetails.this, CardDetails.class);
                startActivity(intent);
            }
        });

        visa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PurchaseDetails.this, CardDetails.class);
                startActivity(intent);
            }
        });
    }

    private ArrayList<CartClothesEntity> GetArrayItems(){
        ArrayList<CartClothesEntity> listItems = new ArrayList<>();
        listItems.add(new CartClothesEntity(R.drawable.cart_ex_1, "Camiseta Roja de Nylon", "Camiseta de Nylon talla L.\n Alta dureza. Para hombre", "$40.000"));
        listItems.add(new CartClothesEntity(R.drawable.cart_ex_2, "Jean azul marca Denim", "Jean Azul de marca Denim, talla M,\n de cuero. Para Mujer", "$65.000"));
        return listItems;
    }
}
