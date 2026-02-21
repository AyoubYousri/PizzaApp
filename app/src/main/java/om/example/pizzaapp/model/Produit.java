package om.example.pizzaapp.model;

public class Produit {

    private String nom;
    private int image;
    private String duree;
    private String description;
    private String ingredients;
    private String prix;
    private float rating;

    public Produit(String nom, int image, String duree,
                   String description, String ingredients,
                   String prix, float rating) {
        this.nom = nom;
        this.image = image;
        this.duree = duree;
        this.description = description;
        this.ingredients = ingredients;
        this.prix = prix;
        this.rating = rating;
    }

    public String getNom() { return nom; }
    public int getImage() { return image; }
    public String getDuree() { return duree; }
    public String getDescription() { return description; }
    public String getIngredients() { return ingredients; }
    public String getPrix() { return prix; }
    public float getRating() { return rating; }
}