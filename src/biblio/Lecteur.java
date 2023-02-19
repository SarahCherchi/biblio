package biblio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lecteur {
    private int numLecteur;
    private String nom;
    private String prenom;
    private LocalDate dn;
    private String mail;
    private String adresse;
    private String tel;
    private List<Location> lloc = new ArrayList<>();

    public Lecteur(int numLecteur, String nom, String prenom, LocalDate dn, String mail, String adresse, String tel) {
        this.numLecteur = numLecteur;
        this.nom = nom;
        this.prenom = prenom;
        this.dn = dn;
        this.mail = mail;
        this.adresse = adresse;
        this.tel = tel;
    }

    public int getNumLecteur() {
        return numLecteur;
    }

    public void setNumLecteur(int numLecteur) {
        this.numLecteur = numLecteur;
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

    public LocalDate getDn() {
        return dn;
    }

    public void setDn(LocalDate dn) {
        this.dn = dn;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Location> getLloc() {
        return lloc;
    }

    public void setLloc(List<Location> lloc) {
        this.lloc = lloc;
    }

    @Override
    public String toString() {
        return "Lecteur{" +
                "numLecteur='" + numLecteur + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dn='" + dn + '\'' +
                ", mail='" + mail + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecteur lecteur = (Lecteur) o;
        return Objects.equals(numLecteur, lecteur.numLecteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numLecteur);
    }

    public List<Exemplaire> listerExemplairesEnLocation(){
        //TODO coder la liste expl en loc
        return null;
    }

    public List<Exemplaire> listerExemplairesLoues(){
        //TODO code la liste empl loues
        return null;
    }
}
