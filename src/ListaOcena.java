import java.util.Arrays;

public class ListaOcena {
    int[] ocene;

    public ListaOcena(int[] ocene) {
        this.ocene = ocene;
    }

    public int[] getOcene() {
        return ocene;
    }

    public int brojOcena(){
        return ocene.length;
    }

    public void setOcene(int[] ocene) {
        this.ocene = ocene;
    }

    private float sum(){
        float s = 0;
        for(int x : ocene){
            s += x;
        }
        return s;
    }

    @Override
    public String toString() {
        return String.format("%.2f", sum() / brojOcena());
    }
}
