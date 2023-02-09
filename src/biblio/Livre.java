package biblio;

import java.time.LocalDate;
import java.util.Objects;

public class Livre extends Ouvrage{
    private String isbn;
    private int nombrePages;
    private TypeLivre tl;
    private String resume;

    public Livre(String titre, int ageMin, LocalDate dateParution, double prixLocation, String langue, String genre, String isbn, int nombrePages, TypeLivre tl, String resume) {
        super(titre, ageMin, dateParution, TypeOuvrage.LIVRE, prixLocation, langue, genre);
        this.isbn = isbn;
        this.nombrePages = nombrePages;
        this.tl=tl;
        this.resume = resume;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    public TypeLivre getTl() {
        return tl;
    }

    public void setTl(TypeLivre tl) {
        this.tl = tl;
    }
    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return super.toString()+ "Livre{" +
                "isbn='" + isbn + '\'' +
                ", nbrePages=" + nombrePages +
                ", tl=" + tl +
                ", resume='" + resume + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return Objects.equals(isbn, livre.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
