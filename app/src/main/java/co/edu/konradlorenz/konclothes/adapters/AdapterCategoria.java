package co.edu.konradlorenz.konclothes.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import co.edu.konradlorenz.konclothes.R;
import co.edu.konradlorenz.konclothes.entities.Categoria;

public class AdapterCategoria extends BaseAdapter {

    private Context context;
    private ArrayList<Categoria> listItems;

    public AdapterCategoria(Context context, ArrayList<Categoria> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Categoria item = (Categoria) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.adapter_categoria,null);

        ImageView imagen = (ImageView) convertView.findViewById(R.id.imageView2);
        TextView descripcion = (TextView) convertView.findViewById(R.id.textView2);
        CardView card = (CardView) convertView.findViewById(R.id.carta);
        card.setCardBackgroundColor(getRandomColorCode());
        imagen.setImageResource(item.getImagen());
        descripcion.setText(item.getNombre());

        return convertView;
    }



    public int getRandomColorCode(){
        Random random = new Random();
        return Color.argb(255, random.nextInt(256), random.nextInt(256),     random.nextInt(256));

    }
}
