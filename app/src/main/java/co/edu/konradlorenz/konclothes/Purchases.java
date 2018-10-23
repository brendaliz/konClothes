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

public class Purchases extends AppCompatActivity {
    private CartClothesAdapter adaptador;

    private Button btnVolverCatalogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchases);

        ListView lvItems = (ListView) findViewById(R.id.lvPurchasesIntItems);
        btnVolverCatalogo = (Button) findViewById(R.id.btnVolverCatalogoP);
        adaptador = new CartClothesAdapter(this,GetArrayItems());
        lvItems.setAdapter(adaptador);


        btnVolverCatalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Purchases.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private ArrayList<CartClothesEntity> GetArrayItems(){
        ArrayList<CartClothesEntity> listItems = new ArrayList<>();
        listItems.add(new CartClothesEntity(R.drawable.cart_ex_1, getString(R.string.ex_1_cloth_name), getString(R.string.ex_1_cloth_description), getString(R.string.ex_1_price)));
        listItems.add(new CartClothesEntity(R.drawable.cart_ex_2, getString(R.string.ex_2_cloth_name), getString(R.string.ex_2_cloth_description), getString(R.string.ex_2_price)));
        listItems.add(new CartClothesEntity(R.drawable.cart_ex_3, getString(R.string.ex_3_cloth_name), getString(R.string.ex_3_cloth_description), getString(R.string.ex_3_price)));
        return listItems;
    }
}
