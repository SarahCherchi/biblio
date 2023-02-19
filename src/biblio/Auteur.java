package biblio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Auteur {
    private String nom;
    private String prenom;
    private String nationalite;
    private List<Ouvrage> louv = new ArrayList<>();

    public Auteur(String nom, String prenom, String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public List<Ouvrage> getLouv() {
        return louv;
    }

    public void setLouv(List<Ouvrage> louv) {
        this.louv = louv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auteur auteur = (Auteur) o;
        return Objects.equals(nom, auteur.nom) && Objects.equals(prenom, auteur.prenom) && Objects.equals(nationalite, auteur.nationalite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, nationalite);
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nationalite='" + nationalite + '\'' +
                '}';
    }

    /*public void ajoutOuvrage(Ouvrage ouvrage) {
        this.louv.add(ouvrage);
    }
    public void suppOuvrage(Ouvrage ouvrage){
        this.louv.remove(ouvrage);
    }*/

    public void addOuvrage(Ouvrage o) {
        louv.add(o);
        o.getLaut().add(this);
    }

    public List<Ouvrage> listerOuvrage(){
        // TODO coder affichage ouvrage
        return null;
    }

    public List<Ouvrage> listerOuvrage(TypeOuvrage to, TypeLivre tl){
        //TODO coder aff ouvrage avec type
        return null;
    }

    public List<Ouvrage> listerOuvrage(String genre){
        // TODO coder affichage ouvrage avec genre
        return null;
    }
}
