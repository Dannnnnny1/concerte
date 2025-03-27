package app;

import java.util.ArrayList;
import java.util.List;

public class ConcerteService {
    public List<Concerte> concerte = new ArrayList<>();

    public void load() {
        Concerte concert1 = new Concerte();
        concert1.artist = "Queen";
        concert1.dataConcert = "10-01-2025";
        concert1.pretBilet = 120;
        concert1.oras = "Sibiu";
        concert1.bileteDisponibile = 984;

        Concerte concert2 = new Concerte();
        concert2.artist = "Metallica";
        concert2.dataConcert = "15-03-2025";
        concert2.pretBilet = 250;
        concert2.oras = "București";
        concert2.bileteDisponibile = 212;

        Concerte concert3 = new Concerte();
        concert3.artist = "Coldplay";
        concert3.dataConcert = "20-06-2025";
        concert3.pretBilet = 300;
        concert3.oras = "Cluj-Napoca";
        concert3.bileteDisponibile = 543;

        Concerte concert4 = new Concerte();
        concert4.artist = "Ed Sheeran";
        concert4.dataConcert = "05-09-2025";
        concert4.pretBilet = 180;
        concert4.oras = "Iași";
        concert4.bileteDisponibile = 612;

        Concerte concert5 = new Concerte();
        concert5.artist = "Imagine Dragons";
        concert5.dataConcert = "12-12-2025";
        concert5.pretBilet = 200;
        concert5.oras = "Timișoara";
        concert5.bileteDisponibile = 1789;

        Concerte concert6 = new Concerte();
        concert6.artist = "The Weeknd";
        concert6.dataConcert = "25-01-2025";
        concert6.pretBilet = 220;
        concert6.oras = "Brașov";
        concert6.bileteDisponibile = 750;

        Concerte concert7 = new Concerte();
        concert7.artist = "Beyoncé";
        concert7.dataConcert = "10-02-2025";
        concert7.pretBilet = 320;
        concert7.oras = "Constanța";
        concert7.bileteDisponibile = 410;

        Concerte concert8 = new Concerte();
        concert8.artist = "Adele";
        concert8.dataConcert = "22-02-2025";
        concert8.pretBilet = 280;
        concert8.oras = "Oradea";
        concert8.bileteDisponibile = 550;

        Concerte concert9 = new Concerte();
        concert9.artist = "Shawn Mendes";
        concert9.dataConcert = "08-03-2025";
        concert9.pretBilet = 170;
        concert9.oras = "Arad";
        concert9.bileteDisponibile = 620;

        Concerte concert10 = new Concerte();
        concert10.artist = "Taylor Swift";
        concert10.dataConcert = "18-04-2025";
        concert10.pretBilet = 350;
        concert10.oras = "Sibiu";
        concert10.bileteDisponibile = 300;

        Concerte concert11 = new Concerte();
        concert11.artist = "Eminem";
        concert11.dataConcert = "28-04-2025";
        concert11.pretBilet = 290;
        concert11.oras = "București";
        concert11.bileteDisponibile = 500;

        Concerte concert12 = new Concerte();
        concert12.artist = "Drake";
        concert12.dataConcert = "10-05-2025";
        concert12.pretBilet = 260;
        concert12.oras = "Cluj-Napoca";
        concert12.bileteDisponibile = 400;

        Concerte concert13 = new Concerte();
        concert13.artist = "Rihanna";
        concert13.dataConcert = "24-05-2025";
        concert13.pretBilet = 310;
        concert13.oras = "Iași";
        concert13.bileteDisponibile = 380;

        Concerte concert14 = new Concerte();
        concert14.artist = "Bruno Mars";
        concert14.dataConcert = "07-06-2025";
        concert14.pretBilet = 270;
        concert14.oras = "Timișoara";
        concert14.bileteDisponibile = 600;

        Concerte concert15 = new Concerte();
        concert15.artist = "U2";
        concert15.dataConcert = "19-06-2025";
        concert15.pretBilet = 320;
        concert15.oras = "Brașov";
        concert15.bileteDisponibile = 450;

        Concerte concert16 = new Concerte();
        concert16.artist = "The Rolling Stones";
        concert16.dataConcert = "30-06-2025";
        concert16.pretBilet = 340;
        concert16.oras = "Constanța";
        concert16.bileteDisponibile = 290;

        Concerte concert17 = new Concerte();
        concert17.artist = "Red Hot Chili Peppers";
        concert17.dataConcert = "12-07-2025";
        concert17.pretBilet = 290;
        concert17.oras = "Oradea";
        concert17.bileteDisponibile = 380;

        Concerte concert18 = new Concerte();
        concert18.artist = "Gorillaz";
        concert18.dataConcert = "25-07-2025";
        concert18.pretBilet = 260;
        concert18.oras = "Arad";
        concert18.bileteDisponibile = 500;

        Concerte concert19 = new Concerte();
        concert19.artist = "Linkin Park";
        concert19.dataConcert = "08-08-2025";
        concert19.pretBilet = 270;
        concert19.oras = "Sibiu";
        concert19.bileteDisponibile = 550;

        Concerte concert20 = new Concerte();
        concert20.artist = "Evanescence";
        concert20.dataConcert = "20-08-2025";
        concert20.pretBilet = 240;
        concert20.oras = "București";
        concert20.bileteDisponibile = 420;

        concerte.add(concert1);
        concerte.add(concert2);
        concerte.add(concert3);
        concerte.add(concert4);
        concerte.add(concert5);
        concerte.add(concert6);
        concerte.add(concert7);
        concerte.add(concert8);
        concerte.add(concert9);
        concerte.add(concert10);
        concerte.add(concert11);
        concerte.add(concert12);
        concerte.add(concert13);
        concerte.add(concert14);
        concerte.add(concert15);
        concerte.add(concert16);
        concerte.add(concert17);
        concerte.add(concert18);
        concerte.add(concert19);
        concerte.add(concert20);


    }

    public void afiseazaConcerte() {
        for (int i = 0; i < this.concerte.size(); i++) {
            System.out.println(concerte.get(i).descriere());
        }
    }
    //todo:Găsirea concertului cu cele mai puține bilete disponibile

    public Concerte celeMaiPutineBilete() {
        int bileteMinim = 99999999;
        for (int i = 0; i < this.concerte.size(); i++) {
            if (this.concerte.get(i).bileteDisponibile < bileteMinim) {
                bileteMinim = this.concerte.get(i).bileteDisponibile;
            }
        }
        for (int i = 0; i < this.concerte.size(); i++) {
            if (this.concerte.get(i).bileteDisponibile == bileteMinim) {
                return this.concerte.get(i);
            }
        }
        return null;
    }
    //todo:Sistem de rezervare bilete cu stocare și actualizare

    public Concerte cumparaBilet(int nrBilete, String numeArtist) {
        for (Concerte concert:this.concerte) {
            if (concert.artist.trim().equalsIgnoreCase(numeArtist.trim())) {
                if (concert.bileteDisponibile> nrBilete) {
                    concert.bileteDisponibile-=nrBilete;
                    return concert;
                } else {
                    return null;
                }
            }
        }
        return null;
    }
    //todo:CautaConcertDupaNume

    public List<Concerte>cautaConcerteDupaNume(String artist){
        List<Concerte>concerte=new ArrayList<>();
        for(int i=0;i<this.concerte.size();i++){
            if(this.concerte.get(i).artist.equalsIgnoreCase(artist)){
                concerte.add(this.concerte.get(i));
            }
        }
        return concerte;
    }
    //todo:functie care returneaza prima litera a unui cuvant
    public char primaLitera(String cuvant){
        return cuvant.charAt(0);
    }
    public List<Concerte> afisareConcerteDeLaAPanaLaZ(){
        for(int i=0;i<this.concerte.size();i++){
            for(int j=0;j<this.concerte.size()-i-1;j++){
                if(primaLitera(this.concerte.get(j).artist)>primaLitera(this.concerte.get(j+1).artist)){
                    Concerte temp=this.concerte.get(j);
                    concerte.set(j,this.concerte.get(j+1));
                    concerte.set(j+1,temp);

                }

            }
        }
        return this.concerte;

    }




}
