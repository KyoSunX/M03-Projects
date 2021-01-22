package com.company;

import java.util.Scanner;

public class NBA {
    public static void main(String[] args) {
        final String BLACK = "\033[30m";
        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String YELLOW = "\033[33m";
        final String BLUE = "\033[34m";
        final String PURPLE = "\033[35m";
        final String CYAN = "\033[36m";
        final String WHITE = "\033[37m";
        final String RESET = "\u001B[0m";

        final String menu = BLUE+"1-Introduïr jugador\n2-Mostrar Noms\n3-Mostrar taula sencera\n4-Buscar jugador\n5-Sortir";
        final String logoLakers =
                "                \"         ===///    , ,-. ,-   .-, , , ,-  ,_  ,  ,_ ,-\\n\" +\n" +
                        "                \"         --///    /_ |_/ _)  /\\\"\\\"|/|/ |_] /=_ /_ /=_ _)\\n\" +\n" +
                        "                \"       ___///    __    __  __  ______  ____    ___\\n\" +\n" +
                        "                \"         ///  --/||  --// .'   //  \\\"/ _//  )) (|  \\\"/\\n\" +\n" +
                        "                \"     ---///   /' ||  _//.;  __//_.    //_=\\\"'  _\\\\\\\\ \\n\" +\n" +
                        "                \"     --///- -/---||  //'||   //  ', _//  ;|     \\\\\\\\     ;\\n\" +\n" +
                        "                \"______/// __/_  _||_/<  `||_//__\\\"/ _// --|\\\\ /-._//    /\\n\" +\n" +
                        "                \"    _///      ,                        ---\\\\\\\\\\\\       .'\\n\" +\n" +
                        "                \" ___///_____\\\"/                              `;=__.-'";

        Scanner llegir = new Scanner(System.in);
        String[][] matriuJugadors; // declarem matriu
        String[] headerTaula = new String[6]; // Vector simple capçalera
        String nomJugadorBuscar;
        boolean trobat = false, sortir = false;
        int opcioMenu, opcioSubMenu;

        String hola;

        // Inicialitzo vector capçalera de la matriu
        headerTaula[0] = "Nom";
        headerTaula[1] = "Alçada";
        headerTaula[2] = "Pes";
        headerTaula[3] = "Posició";
        headerTaula[4] = "%2";
        headerTaula[5] = "%3";

        int numJugadors, punterJugador = 3;

        System.out.println("Benvingut al nostre programa");
        System.out.println(logoLakers);

        System.out.println("Quants jugadors vols que tingui la teva BBDD? (>=3)");
        numJugadors= llegir.nextInt();
        llegir.nextLine();

        matriuJugadors = new String[numJugadors][6];
        // Inicialització dades demo a la matriu
        matriuJugadors[0][0] = "LeBron James";
        matriuJugadors[0][1] = "103";
        matriuJugadors[0][2] = "100";
        matriuJugadors[0][3] = "Ala-pívot";
        matriuJugadors[0][4] = "50";
        matriuJugadors[0][5] = "34";

        matriuJugadors[1][0] = "Bam Adebayo";
        matriuJugadors[1][1] = "107";
        matriuJugadors[1][2] = "102";
        matriuJugadors[1][3] = "Ala-pívot/Pívot";
        matriuJugadors[1][4] = "65";
        matriuJugadors[1][5] = "18";

        matriuJugadors[2][0] = "Giannis Antetokoumpo";
        matriuJugadors[2][1] = "110";
        matriuJugadors[2][2] = "97";
        matriuJugadors[2][3] = "Ala-pívot";
        matriuJugadors[2][4] = "63";
        matriuJugadors[2][5] = "24";

        do { // MENÚ PRINCIPAL
            System.out.println(menu);
            opcioMenu = llegir.nextInt();
            llegir.nextLine();

            switch (opcioMenu) {
                case 1: // Intro jugadors
                    System.out.println(CYAN+"Escull quin dels següents jugadors vols inserir:\n1-Michael Jordan\n2-Kobe Bryant\n3-Personalitzat\n4-Tornar enrere");
                    opcioSubMenu = llegir.nextInt();
                    llegir.nextLine();

                    switch(opcioSubMenu){ // SubMenú
                        case 1: // Michael Jordan
                            matriuJugadors[punterJugador][0] = "Michael Jordan";
                            matriuJugadors[punterJugador][1] = "110";
                            matriuJugadors[punterJugador][2] = "97";
                            matriuJugadors[punterJugador][3] = "Ala-pívot";
                            matriuJugadors[punterJugador][4] = "63";
                            matriuJugadors[punterJugador][5] = "24";

                            punterJugador++;
                            break;
                        case 2: // Kobe Bryant
                            matriuJugadors[punterJugador][0] = "Kobe Bryant";
                            matriuJugadors[punterJugador][1] = "110";
                            matriuJugadors[punterJugador][2] = "97";
                            matriuJugadors[punterJugador][3] = "Ala-pívot";
                            matriuJugadors[punterJugador][4] = "63";
                            matriuJugadors[punterJugador][5] = "24";

                            punterJugador++;
                            break;
                        case 3:
                            String nom, alc, pes, pos, perc2, perc3;
                            System.out.print("Escriu el nom del jugador: ");
                            nom = llegir.nextLine();

                            System.out.print("Escriu el alçada del jugador (cms): ");
                            alc = llegir.next();
                            llegir.nextLine();

                            System.out.print("Escriu el pes del jugador (kgs): ");
                            pes = llegir.next();
                            llegir.nextLine();

                            System.out.print("Escriu el pos del jugador: ");
                            pos = llegir.next();
                            llegir.nextLine();

                            System.out.print("Escriu el perc2 del jugador: ");
                            perc2 = llegir.next();
                            llegir.nextLine();

                            System.out.print("Escriu el perc3 del jugador: ");
                            perc3 = llegir.next();
                            llegir.nextLine();

                            // Comprovo si el nom del jugador ja existeix:
                            trobat = false;
                            nomJugadorBuscar = nom;

                            for (int i = 0; i < numJugadors; i++) {
                                if (matriuJugadors[i][0] != null) {
                                    if (matriuJugadors[i][0].equalsIgnoreCase(nomJugadorBuscar)) {
                                        trobat = true;
                                        System.out.println(RED+"Aquest jugador existeix i es troba a la fila " + i+ " i no s'inserirà.");
                                        break;
                                    }
                                }
                            }

                            if (trobat == false){
                                matriuJugadors[punterJugador][0] = nom;
                                matriuJugadors[punterJugador][1] = alc;
                                matriuJugadors[punterJugador][2] = pes;
                                matriuJugadors[punterJugador][3] = pos;
                                matriuJugadors[punterJugador][4] = perc2;
                                matriuJugadors[punterJugador][5] = perc3;

                                punterJugador++;
                            }

                            break;
                        case 4: // Tornar enrere
                            System.out.println("Tornant enrere... ");
                            break;
                        default:
                            break;
                    }
                    break;
                case 2: //Mostrar els noms matriu
                    for (int i = 0; i < numJugadors; i++) { //files
                        System.out.println(GREEN+matriuJugadors[i][0]);
                    }
                    break;
                case 3: // Mostrar taula sencera
                    for (int i = 0; i < matriuJugadors.length; i++) {
                        if (matriuJugadors[i][0] != null) {
                            for (int j = 0; j < matriuJugadors[i].length; j++) {

                                System.out.print(GREEN + matriuJugadors[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 4: // Buscar jugador
                    trobat = false;
                    System.out.println("Escriu un nom de jugador a buscar");
                    nomJugadorBuscar = llegir.nextLine();

                    for (int i = 0; i < numJugadors; i++) {
                        if (matriuJugadors[i][0] != null) {
                            if (matriuJugadors[i][0].equalsIgnoreCase(nomJugadorBuscar)) {
                                trobat = true;
                                System.out.println(GREEN+"Aquest jugador existeix i es troba a la fila " + i);
                                break;
                            }
                        }
                    }

                    if (trobat == false){
                        System.out.println(GREEN+"El nom de jugador buscat, no es troba a la taula");
                    }

                    break;
                case 5: // sortir
                    System.out.println("Sortint del programa... ");
                    sortir = true;
                    break;
                default:
                    break;
            }
        }while(sortir == false);
    }
}