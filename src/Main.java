import Proxy.*;
import Bridge.*;
import others.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Afficher le menu principal
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Appliquer le patron Proxy");
            System.out.println("2. Appliquer le patron Adapter");
            System.out.println("3. Appliquer le patron Bridge");
            System.out.println("4. Quitter");

            // Demander à l'utilisateur de faire un choix
            System.out.print("Choisissez une option : ");
            int choice = scanner.nextInt();

            // Effectuer l'opération en fonction du choix de l'utilisateur
            switch (choice) {
                case 1:
                    appliquerProxy();
                    break;
                case 2:
                    appliquerAdapter();
                    break;
                case 3:
                    appliquerBridge();
                    break;
                case 4:
                    System.out.println("Au revoir!");
                    running = false; // Quitter le programme
                    break;
                default:
                    System.out.println("Option invalide. Essayez à nouveau.");
            }
        }

        scanner.close();
    }

    // Méthode pour appliquer le patron Proxy
    private static void appliquerProxy() {
        System.out.println("\n--- Proxy ---");
        System.out.println("***************1.Création du prototype et lancement ***************\n");
        Prototype prototype=new Prototype(new Flow());
        PrototypeProxy prototypeProxy=new PrototypeProxy(prototype);
        prototypeProxy.run();
        System.out.println("***************2.changer la tabulation pour que le proxy la detecte et detruit le prototype pour liberer de l'espace***************\n");
        prototypeProxy.release();
        System.out.println("3.Fin proxy !\n");
        retourMenu();
    }

    // Méthode pour appliquer le patron Adapter
    private static void appliquerAdapter() {
        System.out.println("\n--- Appliquer le patron Adapter ---");
        // Ajoutez ici vos opérations spécifiques pour le patron Adapter
        System.out.println("Opération Adapter effectuée !");
        retourMenu();
    }

    // Méthode pour appliquer le patron Bridge
    private static void appliquerBridge() {
        System.out.println("\n--- Appliquer le patron Bridge ---");
        // Ajoutez ici vos opérations spécifiques pour le patron Bridge
        System.out.println("Opération Bridge effectuée !");
        retourMenu();
    }

    // Méthode pour retourner au menu principal
    private static void retourMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAppuyez sur 'Entrée' pour retourner au menu principal...");
        scanner.nextLine();  // Attendre que l'utilisateur appuie sur "Entrée"
    }
}