package co.edu.konradlorenz.konclothes.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import co.edu.konradlorenz.konclothes.R;
import co.edu.konradlorenz.konclothes.entities.CartClothesEntity;

public class CartClothesAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<CartClothesEntity> listItems;

    public CartClothesAdapter(Context context, ArrayList<CartClothesEntity> listItems) {
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
        CartClothesEntity item = (CartClothesEntity) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.card_clothes_item,null);

        ImageView imgRopa = convertView.findViewById(R.id.img_foto_ropa);
        TextView nombreRopa = convertView.findViewById(R.id.nombre_ropa);
        TextView descripcionRopa = convertView.findViewById(R.id.descripcion);
        TextView precioRopa = convertView.findViewById(R.id.precio);

        imgRopa.setImageResource(item.getImgFoto());
        nombreRopa.setText(item.getNombre());
        descripcionRopa.setText(item.getDescripcion());
        precioRopa.setText(item.getPrecio());

        return convertView;
    }
}
