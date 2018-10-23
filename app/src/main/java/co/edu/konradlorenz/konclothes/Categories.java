package co.edu.konradlorenz.konclothes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.konradlorenz.konclothes.adapters.AdapterCategoria;
import co.edu.konradlorenz.konclothes.entities.Categoria;

public class Categories extends AppCompatActivity {

    private ListView items;
    private AdapterCategoria adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        items = (ListView) findViewById(R.id.listaCategoria);
        adaptador = new AdapterCategoria(this, GetArrayItems());

        items.setAdapter(adaptador);
    }

    private ArrayList<Categoria> GetArrayItems() {
        ArrayList<Categoria> listItems = new ArrayList<>();
        listItems.add(new Categoria(R.string.women_shirts,R.drawable.ic_skirt, "holi"));
        return listItems;
    }
}
