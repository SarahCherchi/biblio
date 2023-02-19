package biblio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Ouvrage {
    protected String titre;
    protected int ageMin;
    protected LocalDate dateParution;
    protected TypeOuvrage to;
    protected double prixLocation;
    protected String langue;
    protected String genre;
    protected List<Exemplaire> lexpl = new ArrayList<>();
    protected List<Auteur> laut = new ArrayList<>();

    public Ouvrage(String titre, int ageMin, LocalDate dateParution, TypeOuvrage to, double prixLocation, String langue, String genre) {
        this.titre = titre;
        this.ageMin = ageMin;
        this.dateParution = dateParution;
        this.to = to;
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

    public LocalDate getDateParution() {
        return dateParution;
    }

    public void setDateParution(LocalDate dateParution) {
        this.dateParution = dateParution;
    }

    public TypeOuvrage getTo() {
        return to;
    }

    public void setTo(TypeOuvrage to) {
        this.to = to;
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
                ", typeOuvrage='" + to + '\'' +
                ", prixLocation=" + prixLocation +
                ", langue='" + langue + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
    public List<Exemplaire> listerExemplaires(){
        //TODO coder la liste des expl
        return null;
    }

    public List<Exemplaire> listerExemplaires(boolean enLocation){
        //TODO coder la liste des expl
        return null;
    }

    public double amendeRetard(int njour){
        //TODO code l'amende par nbr jour retard
        return 0;
    }

}
