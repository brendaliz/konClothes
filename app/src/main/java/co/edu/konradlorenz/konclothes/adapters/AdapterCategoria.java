package co.edu.konradlorenz.konclothes.adapters;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

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

        convertView = LayoutInflater.from(context).inflate(R.layout.card_clothes_item,null);

        ImageView imagen = (ImageView) convertView.findViewById(R.id.img_foto_ropa);
        TextView descripcion = (TextView) convertView.findViewById(R.id.nombre_ropa);

        imagen.setImageResource(item.getImagen());
        descripcion.setText(item.getNombre());

        return convertView;
    }
}
