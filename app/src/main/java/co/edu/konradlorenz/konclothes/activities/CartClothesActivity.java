package co.edu.konradlorenz.konclothes.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.konradlorenz.konclothes.R;
import co.edu.konradlorenz.konclothes.adapters.CartClothesAdapter;
import co.edu.konradlorenz.konclothes.entities.CartClothesEntity;

public class CartClothesActivity extends AppCompatActivity {
    private CartClothesAdapter adaptador;

    private Button btnRealizarCompra;
    private Button btnVolverCatalogo;
    Button btnShowObjCart;
    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_clothes);

        lvItems = (ListView) findViewById(R.id.lvCardItems);
        btnRealizarCompra = (Button) findViewById(R.id.btnRealizarCompra);
        btnVolverCatalogo = (Button) findViewById(R.id.btnVolverCatalogo);
        btnShowObjCart = (Button) findViewById(R.id.btnShowObjCart);
        adaptador = new CartClothesAdapter(this,GetArrayItems());
        lvItems.setAdapter(adaptador);

        btnRealizarCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CartClothesActivity.this, PurchaseDetails.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        btnVolverCatalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CartClothesActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        btnShowObjCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnShowPurchases(v);
            }
        });
    }

    public void btnShowPurchases(View view){
        int cx = (lvItems.getLeft() + lvItems.getRight())/2;
        int cy = (lvItems.getTop())/2;

        float radius = Math.max(lvItems.getWidth(),lvItems.getHeight()) * 2.0f;

        if (lvItems.getVisibility() == View.INVISIBLE){
            lvItems.setVisibility(View.VISIBLE);
            ViewAnimationUtils.createCircularReveal(lvItems,cx,cy,0,radius).start();
        }else {
            Animator reveal = ViewAnimationUtils.createCircularReveal(lvItems,cx,cy,radius,0);
            reveal.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    lvItems.setVisibility(View.INVISIBLE);
                }
            });
            reveal.start();
        }
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private ArrayList<CartClothesEntity> GetArrayItems(){
        ArrayList<CartClothesEntity> listItems = new ArrayList<>();
        listItems.add(new CartClothesEntity(R.drawable.cart_ex_1, "Camiseta Roja de Nylon", "Camiseta de Nylon talla L.\n Alta dureza. Para hombre", "$40.000"));
        listItems.add(new CartClothesEntity(R.drawable.cart_ex_2, "Jean azul marca Denim", "Jean Azul de marca Denim, talla M,\n de cuero. Para Mujer", "$65.000"));
        return listItems;
    }
}
