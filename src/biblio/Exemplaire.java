package biblio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exemplaire {
    private String matricule;
    private String descriptionEtat;
    private Ouvrage ouvrage;
    private Rayon rayon;
    private List<Location> lloc = new ArrayList<>();

    public Exemplaire(String matricule, String descriptionEtat,Ouvrage ouvrage) {
        this.matricule = matricule;
        this.descriptionEtat=descriptionEtat;
        this.ouvrage = ouvrage;
        this.ouvrage.getLexpl().add(this);
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getDescriptionEtat() {
        return descriptionEtat;
    }

    public void setDescriptionEtat(String descriptionEtat) {
        this.descriptionEtat = descriptionEtat;
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    public Rayon getRayon() {
        return rayon;
    }

    public void setRayon(Rayon rayon) {
        if(this.rayon!=null) this.rayon.getLexp().remove(this);
        this.rayon=rayon;
        this.rayon.getLexp().add(this);
    }

    public List<Location> getLloc() {
        return lloc;
    }

    public void setLloc(List<Location> lloc) {
        this.lloc = lloc;
    }

    @Override
    public String toString() {
        return "Exemplaire{" +
                "matricule='" + matricule + '\'' +
                ", descriptionEtat='" + descriptionEtat + '\'' +
                ", ouvrage=" + ouvrage +
                ", rayon=" + rayon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exemplaire that = (Exemplaire) o;
        return Objects.equals(matricule, that.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule);
    }

    public void modifierEtat(String etat){
        //TODO coder modif de l'état de exemplaire
    }

    public Lecteur lecteurActuel(){
        //TODO coder qui est le lecteur ect de l'exemplaire
        return null;
    }

    public List<Lecteur> lecteurs(){
        //TODO listes de tous les lecteurs
        return null;
    }

    public void envoiMailLecteurActuel(Mail mail){
        //TODO coder envoie mail lect act
    }
    public void envoiMailLecteurs(Mail mail){
        //TODO coder envoie mail tous lect
    }

    public boolean enRetard(){
        //TODO coder si en retard ou pas
        return false;
    }

    public int joursRetard(){
        //TODO coder nbr jours de retard
        return 0;
    }

    public boolean enLocation(){
        //TODO coder si en loc ou pas
        return false;
    }
}
