package biblio;

import java.util.ArrayList;
import java.util.List;

public abstract class Ouvrage {
    protected String titre;
    protected int ageMin;
    protected String dateParution;
    protected String typeOuvrage;
    protected double prixLocation;
    protected String langue;
    protected String genre;
    protected List<Exemplaire> lexpl = new ArrayList<>();
    protected List<Auteur> laut = new ArrayList<>();

    public Ouvrage(String titre, int ageMin, String dateParution, String typeOuvrage, double prixLocation, String langue, String genre) {
        this.titre = titre;
        this.ageMin = ageMin;
        this.dateParution = dateParution;
        this.typeOuvrage = typeOuvrage;
        this.prixLocation = prixLocation;
        this.langue = langue;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public String getDateParution() {
        return dateParution;
    }

    public void setDateParution(String dateParution) {
        this.dateParution = dateParution;
    }

    public String getTypeOuvrage() {
        return typeOuvrage;
    }

    public void setTypeOuvrage(String typeOuvrage) {
        this.typeOuvrage = typeOuvrage;
    }

    public double getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(double prixLocation) {
        this.prixLocation = prixLocation;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Exemplaire> getLexpl() {
        return lexpl;
    }

    public void setLexpl(List<Exemplaire> lexpl) {
        this.lexpl = lexpl;
    }

    public List<Auteur> getLaut() {
        return laut;
    }

    public void setLaut(List<Auteur> laut) {
        this.laut = laut;
    }

    @Override
    public String toString() {
        return "Ouvrage{" +
                "titre='" + titre + '\'' +
                ", ageMin=" + ageMin +
                ", dateParution='" + dateParution + '\'' +
                ", typeOuvrage='" + typeOuvrage + '\'' +
                ", prixLocation=" + prixLocation +
                ", langue='" + langue + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }


}
