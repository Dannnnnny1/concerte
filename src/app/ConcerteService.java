package app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcerteService {
    public List<Concerte> concerte;
    Scanner scanner;

    public ConcerteService() {
        this.concerte = new ArrayList<>();
        load();
    }

    public void load() {
        File file = new File("C:\\mycode\\probleme\\Concerte\\src\\app\\concerte");
        try {
             scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                this.concerte.add(new Concerte(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void add(Concerte concert) {
        this.concerte.add(concert);
    }
    public String toSave() {
        String text = "";
        for (int i = 0; i < this.concerte.size() - 1; i++) {
            text += this.concerte.get(i).proprietati() + "\n";
        }
        text += this.concerte.get(concerte.size() - 1).proprietati();
        return text.trim();
    }


    public void save(){
        File file=new File("C:\\mycode\\probleme\\Concerte\\src\\app\\concerte");
        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(fileWriter);
            printWriter.print(this.toSave());
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


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
            if (this.concerte.get(i).getBileteDisponibile() < bileteMinim) {
                bileteMinim = this.concerte.get(i).getBileteDisponibile();
            }
        }
        for (int i = 0; i < this.concerte.size(); i++) {
            if (this.concerte.get(i).getBileteDisponibile() == bileteMinim) {
                return this.concerte.get(i);
            }
        }
        return null;
    }
    //todo:Sistem de rezervare bilete cu stocare și actualizare

    public Concerte cumparaBilet(int nrBilete, String numeArtist) {
        for (Concerte concert:this.concerte) {
            if (concert.getArtist().trim().equalsIgnoreCase(numeArtist.trim())) {
                if (concert.getBileteDisponibile() > nrBilete) {
                    concert.setBileteDisponibile(concert.getBileteDisponibile() - nrBilete);
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
            if(this.concerte.get(i).getArtist().equalsIgnoreCase(artist)){
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
                if(primaLitera(this.concerte.get(j).getArtist())>primaLitera(this.concerte.get(j + 1).getArtist())){
                    Concerte temp=this.concerte.get(j);
                    concerte.set(j,this.concerte.get(j+1));
                    concerte.set(j+1,temp);

                }

            }
        }
        return this.concerte;

    }




}
