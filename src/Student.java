public class Student {
    String ime, prezime;

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public int hashCode() {
        return 13*ime.hashCode() + 17*prezime.hashCode();
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
