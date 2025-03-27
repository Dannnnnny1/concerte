package app;

public class Concerte {
    public String dataConcert;
    public String artist;
    public String oras;
    public int pretBilet;
    public int bileteDisponibile;

    public String descriere(){
        String text="";
        text+="Artist "+this.artist+" \n";
        text+="Data "+this.dataConcert+" \n";
        text+="Oras "+this.oras+" \n";
        text+="Pret "+this.pretBilet+" \n";
        text+="Bilete Disponibile "+this.bileteDisponibile+" \n";

        return text;
    }

}
