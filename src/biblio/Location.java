package biblio;

public class Location {
    private String dateLoc;
    private String dateRestitution;
    private double amende;
    private Lecteur lec;
    private Exemplaire expl;

    public Location(String dateLoc, String dateRestitution, double amende) {
        this.dateLoc = dateLoc;
        this.dateRestitution = dateRestitution;
        this.amende = amende;
    }

    public String getDateLoc() {
        return dateLoc;
    }

    public void setDateLoc(String dateLoc) {
        this.dateLoc = dateLoc;
    }

    public String getDateRestitution() {
        return dateRestitution;
    }

    public void setDateRestitution(String dateRestitution) {
        this.dateRestitution = dateRestitution;
    }

    public double getAmende() {
        return amende;
    }

    public void setAmende(double amende) {
        this.amende = amende;
    }

    public Lecteur getLec() {
        return lec;
    }

    public void setLec(Lecteur lec) {
        this.lec = lec;
    }

    public Exemplaire getExpl() {
        return expl;
    }

    public void setExpl(Exemplaire expl) {
        this.expl = expl;
    }

    @Override
    public String toString() {
        return "Location{" +
                "dateLoc='" + dateLoc + '\'' +
                ", dateRestitution='" + dateRestitution + '\'' +
                ", amende=" + amende +
                '}';
    }


}
