package com.IMIE.architecture;

public class CreateCompteMenu implements Menu {

    public void showMenu(){
        System.out.println("###########################################################");
        System.out.println("###            MENU DE CREATION D UN COMPTE             ###");
        System.out.println("###          Merci de choisir un type de compte         ###");
        System.out.println("###          tapez S pour créer un compte simple        ###");
        System.out.println("###          tapez E pour créer un compte epargne       ###");
        System.out.println("###          tapez P pour créer un compte payant        ###");
        System.out.println("###                                                     ###");
        System.out.println("###########################################################");
    }


    public Menu handleInput(String imput) {
        switch (imput) {
            case "S": return creerCompteSimple();
            case "E": return creerCompteEpargne();
            case "P": return creerComptePayant();
            default: return showBadInput();
        }
    }

    private Menu creerCompteSimple() {
        System.out.println("TODO Créer le compte simple après avoir obtenu le montant du découvert autorisé à passer au constructeur");
        return new CreateCompteMenu();
    }

    private Menu creerComptePayant() {
        System.out.println("TODO Créer le compte payant après avoir obtenu le taux des frais à passer au constructeur");
        return new CreateCompteMenu();
    }

    private Menu creerCompteEpargne() {
        System.out.println("TODO Créer le compte Epargne après avoir obtenu le taux d'interets à passer au constructeur");
        return new CreateCompteMenu();
    }

    private Menu showBadInput() {
        System.out.println("Cette option n'est pas prevue dans le menu en cours");
        return this;
    }
}
