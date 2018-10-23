package co.edu.konradlorenz.konclothes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.konradlorenz.konclothes.adapters.CartClothesAdapter;
import co.edu.konradlorenz.konclothes.entities.CartClothesEntity;

public class CartClothesActivity extends AppCompatActivity {
    private CartClothesAdapter adaptador;

    private Button btnRealizarCompra;
    private Button btnVolverCatalogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_clothes);

        ListView lvItems = (ListView) findViewById(R.id.lvCardItems);
        btnRealizarCompra = (Button) findViewById(R.id.btnRealizarCompra);
        btnVolverCatalogo = (Button) findViewById(R.id.btnVolverCatalogo);
        adaptador = new CartClothesAdapter(this,GetArrayItems());
        lvItems.setAdapter(adaptador);

        btnRealizarCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CartClothesActivity.this, PurchaseDetails.class);
                startActivity(intent);
            }
        });

        btnVolverCatalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CartClothesActivity.this, MainActivity.class);
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
