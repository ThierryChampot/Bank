package com.IMIE.architecture;

public class MainMenu implements Menu {

    public void showMenu() {
        System.out.println("Bienvenue sur votre interface de gestion bancaire !");
        System.out.println("##########################################");
        System.out.println("###                MENU                ###");
        System.out.println("###  tapez A pour acceder aux agences  ###");
        System.out.println("###  tapez C pour acceder aux comptes  ###");
        System.out.println("###                                    ###");
        System.out.println("##########################################");
    }

    public Menu handleInput(String imput) {
        switch (imput) {
            case "A": return showAgencesMenu();
            case "C": return showComptesMenu();
            default: return showBadInput();
        }
    }

    private static Menu showAgencesMenu() {
        System.out.println("##########################################################");
        System.out.println("###                CRUD DES AGENCES                    ###");
        System.out.println("###          tapez L pour lister les agences           ###");
        System.out.println("###          tapez C pour ajouter une agence           ###");
        System.out.println("###          tapez R pour voir une agence              ###");
        System.out.println("###          tapez U pour modifier une agence          ###");
        System.out.println("###          tapez D pour supprimer une agence         ###");
        System.out.println("###                                                    ###");
        System.out.println("##########################################################");
        return new MainMenu();
    }

    private static Menu showComptesMenu() {
        return new ComptesMenu();
    }

    private static Menu showBadInput() {
        System.out.println("Oups ! Cette option n'est pas aceessible depuis ce menu ");
        return new MainMenu();
    }

}
