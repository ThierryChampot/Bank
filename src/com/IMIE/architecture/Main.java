package com.IMIE.architecture;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner( System.in);
    private List<Agence> Agences;
    private List<Compte> Comptes;

    public static void main(String[] args) {
        showMenu( new MainMenu() );
        listenToUserInput(new MainMenu());
    }

    private static void showMenu(Menu menu) {
        menu.showMenu();
        listenToUserInput(menu);
    }

    private static void listenToUserInput(Menu menu) {
        String input = sc.nextLine();
        Menu next = menu.handleInput(input);
        showMenu(next);
    }
}
