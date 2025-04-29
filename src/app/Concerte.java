package app;

public class Concerte {
    private String dataConcert;
    private String artist;
    private String oras;
    private int pretBilet;
    int bileteDisponibile;

    public Concerte(String dataConcert, String artist, String oras, int pretBilet, int bileteDisponibile) {
        this.dataConcert = dataConcert;
        this.artist = artist;
        this.oras = oras;
        this.pretBilet = pretBilet;
        this.bileteDisponibile = bileteDisponibile;
    }

    public String getDataConcert() {
        return dataConcert;
    }

    public void setDataConcert(String dataConcert) {
        this.dataConcert = dataConcert;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public int getPretBilet() {
        return pretBilet;
    }

    public void setPretBilet(int pretBilet) {
        this.pretBilet = pretBilet;
    }

    public int getBileteDisponibile() {
        return bileteDisponibile;
    }

    public void setBileteDisponibile(int bileteDisponibile) {
        this.bileteDisponibile = bileteDisponibile;
    }

    public Concerte(String text) {
        String[] prop = text.split(",");
        this.dataConcert = prop[0];
        this.artist = prop[1];
        this.oras = prop[2];
        this.pretBilet = Integer.parseInt(prop[3]);
        this.bileteDisponibile = Integer.parseInt(prop[4]);
    }

    public String descriere(){
        String text="";
        text+="Artist "+this.artist+" \n";
        text+="Data "+this.dataConcert+" \n";
        text+="Oras "+this.oras+" \n";
        text+="Pret "+this.pretBilet+" \n";
        text+="Bilete Disponibile "+this.bileteDisponibile+" \n";

        return text;
    }
    public String proprietati(){
        return dataConcert+","+artist+","+oras+","+pretBilet+","+bileteDisponibile;
    }

}
