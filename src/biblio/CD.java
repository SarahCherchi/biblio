package biblio;

import java.util.Objects;

public class CD extends Ouvrage{
    private String code;
    private int nbrePlages;
    private String dureeTotale;

    public CD(String titre, int ageMin, String dateParution, String typeOuvrage, double prixLocation, String langue, String genre, String code, int nbrePlages, String dureeTotale) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.code = code;
        this.nbrePlages = nbrePlages;
        this.dureeTotale = dureeTotale;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNbrePlages() {
        return nbrePlages;
    }

    public void setNbrePlages(int nbrePlages) {
        this.nbrePlages = nbrePlages;
    }

    public String getDureeTotale() {
        return dureeTotale;
    }

    public void setDureeTotale(String dureeTotale) {
        this.dureeTotale = dureeTotale;
    }

    @Override
    public String toString() {
        return "CD{" +
                "code='" + code + '\'' +
                ", nbrePlages=" + nbrePlages +
                ", dureeTotale='" + dureeTotale + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD cd = (CD) o;
        return Objects.equals(code, cd.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
