package co.edu.konradlorenz.konclothes.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.konradlorenz.konclothes.R;
import co.edu.konradlorenz.konclothes.adapters.CartClothesAdapter;
import co.edu.konradlorenz.konclothes.entities.CartClothesEntity;

public class Purchases extends AppCompatActivity {
    private CartClothesAdapter adaptador;
    ListView lvItems;
    private Button btnVolverCatalogo;
    Button btnShowPurchases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchases);

        lvItems = (ListView) findViewById(R.id.lvPurchasesIntItems);
        btnVolverCatalogo = (Button) findViewById(R.id.btnVolverCatalogoP);
        btnShowPurchases = (Button) findViewById(R.id.btnShowPurchases);
        adaptador = new CartClothesAdapter(this,GetArrayItems());
        lvItems.setAdapter(adaptador);


        btnVolverCatalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Purchases.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        btnShowPurchases.setOnClickListener(new View.OnClickListener() {
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
        listItems.add(new CartClothesEntity(R.drawable.cart_ex_1, getString(R.string.ex_1_cloth_name), getString(R.string.ex_1_cloth_description), getString(R.string.ex_1_price)));
        listItems.add(new CartClothesEntity(R.drawable.cart_ex_2, getString(R.string.ex_2_cloth_name), getString(R.string.ex_2_cloth_description), getString(R.string.ex_2_price)));
        listItems.add(new CartClothesEntity(R.drawable.cart_ex_3, getString(R.string.ex_3_cloth_name), getString(R.string.ex_3_cloth_description), getString(R.string.ex_3_price)));
        return listItems;
    }
}
