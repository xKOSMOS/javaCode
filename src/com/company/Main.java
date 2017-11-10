package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ListeDesCadres listeDesCadres = new ListeDesCadres();
    public static void main(String[] args) {

        //List<Cadre> myList = new ArrayList<>();

/*
        myList.add(new Cadre("smi1234", "luffy", "monkey", 21, "east blue n55", 4, "captain"));
        myList.add(new Cadre("sma4563", "zoro", "roronoa", 23, "east blue n40", 4, "vice captain"));
        myList.add(new Cadre("eco1234", "sanji", "vinsmoke", 22, "north blue n55", 4, "black leg"));
        myList.add(new Cadre("eco1234", "brook", "kamanja", 80, "east blue n20", 3, "musician"));


        ListeDesCadres listeDesCadres = new ListeDesCadres(myList);
        listeDesCadres.displayList();
        Cadre newCadre = new Cadre("smp1234", "ussop", "sogeking", 21, "east blue n10", 4, "liar");
        System.out.println("--------------Info-------------------");
        newCadre.increment();// increment ancien et l'age
        System.out.println("\tName and Prenom : " + newCadre.getInfo());// affiche info nom et prenom de cadre

        listeDesCadres.add(newCadre);
        System.out.println("--------------Added------------------");
        listeDesCadres.displayList();
        listeDesCadres.deleteByCin("sma4563");
        System.out.println("--------------Deleted----------------");
        listeDesCadres.displayList();


        System.out.println("--------------Search By Cin----------");
        String cinSearched = "smi1234";
        if (listeDesCadres.searchByCin(cinSearched)) {
            System.out.println("\tthis " + cinSearched +" found");
        } else {
            System.out.println("\tthis " + cinSearched + " not found");
        }

        System.out.println("--------------list trier-------------");

        listeDesCadres.trier();
        listeDesCadres.displayList();

        */

        //make a menu to handle this different methods



        menu();





    }


    public static void menu() {
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t |Gestion des Cadres|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ------------------");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 1.add a Cadre.");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 2.show all Cadres.");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 3.delete Cadre By cin.");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 4.search cadre by cin.");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 5.trier cadres.");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 6.close");
        System.out.println();
        System.out.println();
        System.out.println();


        int choice;
        System.out.println("enter votre choix ici : ");
        choice = sc.nextInt();

        switch(choice) {
            case 1 :
                add();
                break;
            case 2 :
                displayAll();
                break;
            case 3 :
                deleteByCIN();
                break;
            case 4 :
                searchByCIN();
                break;
            case 5 :
                tri();
                break;
            case 6 :
                System.out.println("see ya");
                System.exit(0);
                break;
            default:
                System.out.println("please choose a valid number from the menu");
                break;
        }
        try {
            Runtime.getRuntime().exec("clear");
        } catch (IOException e) {
            e.printStackTrace();
        }
        menu();

    }


    public static void add() {
        System.out.println("Entrer votre Cadre infos :");
                System.out.println("cin : ");
        String cin = sc.next();
                sc.nextLine();
                System.out.println("nom :");
        String nom = sc.next();
                sc.nextLine();
                System.out.println("prenom :");
        String prenom = sc.next();
                sc.nextLine();
                System.out.println("age :");
        int age = sc.nextInt();
                sc.nextLine();
                System.out.println("adress : ");
        String addr = sc.next();
                sc.nextLine();
                System.out.println("ancienne :");
        int anc = sc.nextInt();
                sc.nextLine();
                System.out.println("function :");
        String function = sc.next();
                sc.nextLine();

        listeDesCadres.add(new Cadre(cin, nom, prenom, age, addr, anc, function));
    }

    public static void displayAll() {
        listeDesCadres.displayList();
    }

    public static void deleteByCIN() {
        System.out.println("entrer le cin de cadre qu vous voulez supprimer : ");
        String cinSupp = sc.next();
        sc.nextLine();
        listeDesCadres.deleteByCin(cinSupp);
        System.out.println("Deleted");
    }

    public static void searchByCIN() {
        System.out.println("entrer le cin que vous chercher : ");
        String cin = sc.next();
        sc.nextLine();
        if (listeDesCadres.searchByCin(cin)) {
            System.out.println("\tthis " + cin +" found");
        } else {
            System.out.println("\tthis " + cin + " not found");
        }

    }


    public static void tri() {
        System.out.println(" la liste trier ");
        listeDesCadres.trier();
        listeDesCadres.displayList();
    }


}
