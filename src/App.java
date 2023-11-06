/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 * 
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.   
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.   
 */

import java.util.Scanner;

public class App {

    

    public static void main(String[] args) {
        Procedimientos tennisGame = new Procedimientos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Tablero del Juego de Tenis ***");

        while (true) {
            System.out.println("Ingresar el jugador que anotó (P1/P2) " + tennisGame.getScore());

            String input = scanner.nextLine();

            if (input.equals("P1") || input.equals("P2")) {
                tennisGame.playerScores(input);
            } else {
                System.out.println("Entrada inválida. Debes ingresar P1 o P2");
                continue;
            }

            if (tennisGame.isGameWon()) {
                System.out.println("Ha ganado el Jugador " + (tennisGame.getScoreP1() > tennisGame.getScoreP2() ? 1 : 2));
                break;
            }
        }

        scanner.close();
    }
}

