package com.IMIE.architecture;

public class ComptesMenu implements Menu {

    public void showMenu(){
        System.out.println("###########################################################");
        System.out.println("###                 CRUD DES COMPTES                    ###");
        System.out.println("###          tapez L pour lister les comptes            ###");
        System.out.println("###          tapez C pour ajouter un compte             ###");
        System.out.println("###          tapez R pour voir un compte                ###");
        System.out.println("###          tapez U pour modifier un compte            ###");
        System.out.println("###          tapez D pour supprimer un compte           ###");
        System.out.println("###                                                     ###");
        System.out.println("###########################################################");
    }

    public Menu handleInput(String imput) {
        switch (imput) {
            case "A": return listeComptes();
            case "C": return createCompte();
            case "R": return readCompte();
            case "U": return updateCompte();
            case "D": return deleteCompte();
            default: return showBadInput();
        }
    }

    private Menu listeComptes() {
        return new ComptesMenu();
    }

    private Menu createCompte() {
        return new CreateCompteMenu();
    }

    private Menu readCompte() {
        System.out.println("TODO Demander l'id du compte puis afficher ses details.");
        return new ComptesMenu();
    }

    private Menu updateCompte() {
        System.out.println("TODO Demander l'id du compte puis les modifications à faire, puis les appliquer (sous menu à envisager).");
        return new ComptesMenu();    }

    private Menu deleteCompte() {
        System.out.println("TODO Demander l'id du compte puis le supprimer.");
        return new ComptesMenu();    }

    private Menu showBadInput() {
        System.out.println("Cette option n'est pas prevue dans le menu en cours");
        return this;
    }
}
