public class Llibre {

    private String nom;

    private Arraylist tipus;

    private String editorial;

    private int any;

    private String autor;

    private String codi;

    private int estat;

    public Llibre(String nom, Arraylist tipus, String editorial, int any, String autor, String codi, int estat) {
        this.nom = nom;
        this.tipus = tipus;
        this.editorial = editorial;
        this.any = any;
        this.autor = autor;
        this.codi = codi;
        this.estat = estat;
    }

    public String getNom() {
        return nom;
    }

    public Arraylist getTipus() {
        return tipus;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAny() {
        return any;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodi() {
        return codi;
    }

    public int getEstat() {
        return estat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTipus(Arraylist tipus) {
        this.tipus = tipus;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public void setEstat(int estat) {
        this.estat = estat;
    }
    
    
}
