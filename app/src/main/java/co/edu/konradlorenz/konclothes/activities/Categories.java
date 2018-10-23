package co.edu.konradlorenz.konclothes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.konradlorenz.konclothes.R;
import co.edu.konradlorenz.konclothes.adapters.AdapterCategoria;
import co.edu.konradlorenz.konclothes.adapters.CartClothesAdapter;
import co.edu.konradlorenz.konclothes.entities.Categoria;

public class Categories extends AppCompatActivity {

    private ListView items;
    private AdapterCategoria adaptador;
    private  Button btnVolverCatalogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        items = (ListView) findViewById(R.id.listaCategoria);
        adaptador = new AdapterCategoria(this, GetArrayItems());

        items.setAdapter(adaptador);

        btnVolverCatalogo = (Button) findViewById(R.id.btnVolverCatalogo2);

        btnVolverCatalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categories.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private ArrayList<Categoria> GetArrayItems() {
        ArrayList<Categoria> listItems = new ArrayList<>();
        listItems.add(new Categoria(R.string.women_shirts,R.drawable.ic_shirt2, "holi"));
        listItems.add(new Categoria(R.string.men_shirts,R.drawable.ic_shirt, "holi"));
        listItems.add(new Categoria(R.string.men_pants,R.drawable.ic_pants, "holi"));
        listItems.add(new Categoria(R.string.women_pants,R.drawable.ic_pants2, "holi"));
        listItems.add(new Categoria(R.string.men_dresses,R.drawable.ic_dress2, "holi"));
        listItems.add(new Categoria(R.string.women_dresses,R.drawable.ic_dress, "holi"));
        listItems.add(new Categoria(R.string.skirts,R.drawable.ic_skirt, "holi"));
        listItems.add(new Categoria(R.string.socks,R.drawable.ic_socks, "holi"));
        listItems.add(new Categoria(R.string.scarves,R.drawable.ic_scarf, "holi"));
        return listItems;
    }
}
