package om.example.pizzaapp.service;

import om.example.pizzaapp.R;
import om.example.pizzaapp.model.Produit;
import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private List<Produit> produits = new ArrayList<>();

    public ProduitService() {
        seed();
    }

    @Override
    public void create(Produit o) {
        produits.add(o);
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }

    private void seed() {

        create(new Produit("Pizza 1", R.drawable.pizza1, "30 min",
                "Delicious pizza", "Cheese, Tomato",
                "50 DH", 4));

        create(new Produit("Pizza 2", R.drawable.pizza2, "25 min",
                "Delicious pizza", "Cheese, Chicken",
                "60 DH", 3.5f));

        create(new Produit("Pizza 3", R.drawable.pizza3, "35 min",
                "Delicious pizza", "Cheese, Meat",
                "70 DH", 5));

        create(new Produit("Pizza 4", R.drawable.pizza4, "40 min",
                "Delicious pizza", "Cheese, Tuna",
                "65 DH", 4));

        create(new Produit("Pizza 5", R.drawable.pizza5, "20 min",
                "Delicious pizza", "Cheese, Olive",
                "55 DH", 3));

        create(new Produit("Pizza 6", R.drawable.pizza6, "30 min",
                "Delicious pizza", "Cheese, Beef",
                "75 DH", 4.5f));

        create(new Produit("Pizza 7", R.drawable.pizza7, "28 min",
                "Delicious pizza", "Cheese, Mushroom",
                "58 DH", 4));

        create(new Produit("Pizza 8", R.drawable.pizza8, "32 min",
                "Delicious pizza", "Cheese, Pepper",
                "62 DH", 3.5f));

        create(new Produit("Pizza 9", R.drawable.pizza9, "26 min",
                "Delicious pizza", "Cheese, Shrimp",
                "80 DH", 5));

        create(new Produit("Pizza 10", R.drawable.pizza10, "22 min",
                "Delicious pizza", "Cheese, BBQ",
                "68 DH", 4));
    }
}