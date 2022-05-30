public class Autor {

    private String nom;

    private String nacionalitat;

    private String dataNaixament;

    public Autor(String nom, String nacionalitat, String dataNaixament) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.dataNaixament = dataNaixament;
    }

    public String getNom() {
        return nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public String getDataNaixament() {
        return dataNaixament;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public void setDataNaixament(String dataNaixament) {
        this.dataNaixament = dataNaixament;
    }
    
    
}

 