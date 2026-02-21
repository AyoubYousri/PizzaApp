package om.example.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import om.example.pizzaapp.adapter.PizzaAdapter;
import om.example.pizzaapp.model.Produit;
import om.example.pizzaapp.service.ProduitService;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        ProduitService service = new ProduitService();
        List<Produit> produits = service.findAll();

        PizzaAdapter adapter = new PizzaAdapter(this, produits);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Produit p = produits.get(position);

            Intent i = new Intent(this, DetailActivity.class);
            i.putExtra("nom", p.getNom());
            i.putExtra("image", p.getImage());
            i.putExtra("duree", p.getDuree());
            i.putExtra("description", p.getDescription());
            i.putExtra("ingredients", p.getIngredients());
            i.putExtra("prix", p.getPrix());
            i.putExtra("rating", p.getRating());

            startActivity(i);
        });
    }
}
