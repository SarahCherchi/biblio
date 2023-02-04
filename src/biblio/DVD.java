package biblio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DVD extends Ouvrage{
    private String code;
    private String dureeTotale;
    private int nbreBonus;
    private List<String> autresLangues = new ArrayList<>();
    private List<String> sousTitres = new ArrayList<>();

    public DVD(String titre, int ageMin, String dateParution, String typeOuvrage, double prixLocation, String langue, String genre, String code, String dureeTotale, int nbreBonus, List<String> autresLangues, List<String> sousTitres) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.code = code;
        this.dureeTotale = dureeTotale;
        this.nbreBonus = nbreBonus;
        this.autresLangues = autresLangues;
        this.sousTitres = sousTitres;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDureeTotale() {
        return dureeTotale;
    }

    public void setDureeTotale(String dureeTotale) {
        this.dureeTotale = dureeTotale;
    }

    public int getNbreBonus() {
        return nbreBonus;
    }

    public void setNbreBonus(int nbreBonus) {
        this.nbreBonus = nbreBonus;
    }

    public List<String> getAutresLangues() {
        return autresLangues;
    }

    public void setAutresLangues(List<String> autresLangues) {
        this.autresLangues = autresLangues;
    }

    public List<String> getSousTitres() {
        return sousTitres;
    }

    public void setSousTitres(List<String> sousTitres) {
        this.sousTitres = sousTitres;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "code='" + code + '\'' +
                ", dureeTotale='" + dureeTotale + '\'' +
                ", nbreBonus=" + nbreBonus +
                ", autresLangues=" + autresLangues +
                ", sousTitres=" + sousTitres +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DVD dvd = (DVD) o;
        return Objects.equals(code, dvd.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
