package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcerteView {
    public Scanner scanner=new Scanner(System.in);
    public ConcerteService concerteService=new ConcerteService();
     public void meniu(){
         System.out.println("1->Arata toate concertele");
         System.out.println("2->Concertul cu cele mai putine bilete");
         System.out.println("3->Cumpara Bilete");
         System.out.println("4->Cauta dupa artist");
         System.out.println("5->Afisare alfabetic dupa artist");
     }
     public void play(){
         this.concerteService.load();
         boolean run=true;
         while (run){
             this.meniu();
             int alegere=scanner.nextInt();
             switch (alegere){
                 case 1:
                     concerteService.afiseazaConcerte();
                     break;
                 case 2:
                     afisareConcertCuCeleMaiPutineBilete();
                     break;
                 case 3:
                     afisareCumparareBilete();
                     break;
                 case 4:
                     afisareConcertDupaNume();
                     break;
                 case 5:
                     afisareConcerteAlfabetic();
                     break;
             }

         }
     }

     public void afisareConcertCuCeleMaiPutineBilete(){
         Concerte concert=concerteService.celeMaiPutineBilete();
         System.out.println("CONCERTUL CU CELE MAI PUTINE BILETE ESTE:");
         System.out.println("Concertul sustinut de "+concert.artist+" din orasul "+ concert.oras+" acesta avand doar "+concert.bileteDisponibile+" bilete disponibile");
     }

    public void afisareCumparareBilete() {
         scanner.nextLine();
        System.out.println("La ce artist vrei sa cumperi bilet?");
        String artist = scanner.nextLine();
        System.out.println("Cate bilete vrei sa cumperi?");
        int nrBilete = scanner.nextInt();
        Concerte concerte=concerteService.cumparaBilet(nrBilete, artist);
        if (concerte==null) {
            System.out.println("Acest concert nu exista");
            return;
        }
        System.out.println("Ati cumparat "+nrBilete+" bilete la concertul "+artist);
    }
    public void afisareConcertDupaNume(){
         scanner.nextLine();
        System.out.println("La ce artist cautati concert?");
         String artist=scanner.nextLine();
         List<Concerte>concerteList=concerteService.cautaConcerteDupaNume(artist);
        System.out.println("Concertele sustinute de: "+ artist+ " sunt");
        if(concerteList!=null) {
            for (int i = 0; i < concerteList.size(); i++) {
                System.out.println(concerteList.get(i).descriere());
            }
        }
        else{
            System.out.println("inexistente");
        }

    }
    public void afisareConcerteAlfabetic(){
         List<Concerte>concerte=concerteService.afisareConcerteDeLaAPanaLaZ();
         for(int i=0;i<concerte.size();i++){
             System.out.println(concerte.get(i).descriere());
         }
    }
}
