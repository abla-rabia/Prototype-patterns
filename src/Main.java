import Proxy.*;
import Bridge.*;
import others.*;

import java.util.Scanner;

import static Bridge.MouseTriggers.*;

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
    private static void appliquerAdapter() {
        System.out.println("\n--- Adapter ---");

        System.out.println("Opération Adapter effectuée !");
        retourMenu();
    }
    private static void appliquerBridge() {
        System.out.println("\n--- Bridge ---");
        System.out.println("1. Création d'une interaction de navigation causé par l'evennement du clic d'un boutton vers la page de contact.");
        Action action=new NavigateAction();
        Interaction interaction=new MouseInteraction(action);
        ((MouseInteraction) interaction).setInteractionName(OnClick);
        interaction.runInteraction(interaction,action);
        System.out.println("2. Création d'une interaction de scroll causé par l'evennement du survole sur un boutton.");
        Action action2=new ScrollAction();
        Interaction interaction2=new MouseInteraction(action2);
        ((MouseInteraction) interaction2).setInteractionName(WhileHovering);
        interaction2.runInteraction(interaction2,action2);
        System.out.println("Fin Bridge !");
        retourMenu();
    }

    // Méthode pour retourner au menu principal
    private static void retourMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAppuyez sur 'Entrée' pour retourner au menu principal...");
        scanner.nextLine();  // Attendre que l'utilisateur appuie sur "Entrée"
    }
}