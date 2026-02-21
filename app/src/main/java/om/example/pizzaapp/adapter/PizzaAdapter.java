package om.example.pizzaapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import om.example.pizzaapp.R;
import om.example.pizzaapp.model.Produit;
import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private Activity activity;
    private List<Produit> produits;

    public PizzaAdapter(Activity activity, List<Produit> produits) {
        this.activity = activity;
        this.produits = produits;
    }

    @Override
    public int getCount() { return produits.size(); }

    @Override
    public Object getItem(int position) { return produits.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_pizza, parent, false);
        }

        ImageView img = convertView.findViewById(R.id.imgPizza);
        TextView nom = convertView.findViewById(R.id.txtNom);
        TextView duree = convertView.findViewById(R.id.txtDuree);
        RatingBar ratingBar = convertView.findViewById(R.id.ratingBar);

        Produit p = produits.get(position);

        img.setImageResource(p.getImage());
        nom.setText(p.getNom());
        duree.setText(p.getDuree());
        ratingBar.setRating(p.getRating());

        return convertView;
    }
}