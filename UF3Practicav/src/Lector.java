public class Lector {

    private String dni;

    private Arraylist llibresPossesio;

    private String nom;

    private int limitLlibres;
    
    


    public Lector(String dni, Arraylist llibresPossesio, String nom, int limitLlibres) {
        this.dni = dni;
        this.llibresPossesio = llibresPossesio;
        this.nom = nom;
        this.limitLlibres = limitLlibres;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setLlibresPossesio(Arraylist llibresPossesio) {
        this.llibresPossesio = llibresPossesio;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLimitLlibres(int limitLlibres) {
        this.limitLlibres = limitLlibres;
    }

    public Arraylist getLlibresPossesio() {
        return llibresPossesio;
    }

    public String getLimitLlibres() {
        return nom;
    }
        public String getdni() {
        return dni;
    }
    
}
