package om.example.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView img = findViewById(R.id.detailImage);
        TextView nom = findViewById(R.id.detailNom);
        TextView duree = findViewById(R.id.detailDuree);
        TextView desc = findViewById(R.id.detailDescription);
        TextView ing = findViewById(R.id.detailIngredients);
        TextView prix = findViewById(R.id.detailPrix);
        RatingBar rating = findViewById(R.id.detailRating);
        ImageButton btnShare = findViewById(R.id.btn_share);

        // Get data from intent
        int imageRes = getIntent().getIntExtra("image", 0);
        String nomPizza = getIntent().getStringExtra("nom");
        String dureePizza = getIntent().getStringExtra("duree");
        String descPizza = getIntent().getStringExtra("description");
        String ingPizza = getIntent().getStringExtra("ingredients");
        String prixPizza = getIntent().getStringExtra("prix");
        float ratingPizza = getIntent().getFloatExtra("rating", 0);

        // Set data to views
        img.setImageResource(imageRes);
        nom.setText(nomPizza);
        duree.setText(dureePizza);
        desc.setText(descPizza);
        ing.setText(ingPizza);
        prix.setText(prixPizza);
        rating.setRating(ratingPizza);

        // Share button listener
        btnShare.setOnClickListener(v -> {
            String shareText = "Découvrez cette délicieuse pizza : " + nomPizza + "\n" +
                    "Ingrédients : " + ingPizza + "\n" +
                    "Prix : " + prixPizza;

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

            startActivity(Intent.createChooser(shareIntent, "Partager via"));
        });
    }
}