package biblio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rayon {
   private String codeRayon;
   private String genre;
   private List<Exemplaire> lexp = new ArrayList<>();

   public Rayon(String codeRayon, String genre) {
      this.codeRayon = codeRayon;
      this.genre = genre;
   }

   public String getCodeRayon() {
      return codeRayon;
   }

   public void setCodeRayon(String codeRayon) {
      this.codeRayon = codeRayon;
   }

   public String getGenre() {
      return genre;
   }

   public void setGenre(String genre) {
      this.genre = genre;
   }

   public List<Exemplaire> getLexp() {
      return lexp;
   }

   public void setLexp(List<Exemplaire> lexp) {
      this.lexp = lexp;
   }

   @Override
   public String toString() {
      return "Rayon{" +
              "codeRayon='" + codeRayon + '\'' +
              ", genre='" + genre + '\'' +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Rayon rayon = (Rayon) o;
      return Objects.equals(codeRayon, rayon.codeRayon);
   }

   @Override
   public int hashCode() {
      return Objects.hash(codeRayon);
   }

   public void addExplaire(){
      //TODO coder ajout explaire à un rayon
   }

   public void listerExemplaires(){
      //TODO coder affichage explaires
   }
}
