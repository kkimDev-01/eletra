package com.practice.javaone.hw3;

import java.util.*;

public class Battleship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Battleship!");

        System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.\n");
        String[][] playerShips1 = playerShip(scanner);

        printBoard(playerShips1);


        System.out.println("PLAYER 2, ENTER YOUR SHIPS’ COORDINATES.\n");
        String[][] playerShips2 = playerShip(scanner);

        printBoard(playerShips2);

        int round = 0;
        int playerNum;

        do {
            round += 1;
            playerNum = round % 2 == 1? 1 : 2;
            String[][] whichToHit = playerNum == 1 ? playerShips2 : playerShips1;
            System.out.printf("Player %d, enter hit row/column:\n", playerNum);
            String input = scanner.nextLine();
            try {
                if (playerNum == 1) {
                    hit(input, whichToHit);
                }
            }
            catch (Exception e){
                round -= 1;
                continue;
            }
            if (gameOver(whichToHit)){
                break;
            }

        }
        while (true);


    }

    //TODO
    private static boolean gameOver(String[][] whichToHit) {
        return true;
    }

    //TODO
    private static void hit(String input, String[][] whichToHit) {
    }

    private static void printBoard(String[][] ships) {

        System.out.println("  0 1 2 3 4");

        for (int i = 0; i < ships.length; i++) {
            String strRow = ""+i;
            for (int j = 0; j < ships[0].length; j++) {
                strRow += " " + ships[i][j];
            }
            System.out.println(strRow);
        }

    }

    private static String[][] playerShip(Scanner scanner) {

        String[][] ships = new String[5][5];
        for (String[] row : ships){
            Arrays.fill(row, "-");
        }

        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        do {
            System.out.println(String.format("Enter ship %f location:", rows.size() + 1));
            String input = scanner.nextLine();
            try{
                String[] locations = input.split(" ");
                int row = Integer.parseInt(locations[0]);
                int col = Integer.parseInt(locations[1]);

                if (row >= 0 && row <=4 && !(rows.contains(row)) &&
                    col >= 0 && col <=4 && !(cols.contains(col))){
                    rows.add(row);
                    cols.add(col);
                }
                else{
                    throw new IllegalArgumentException();
                }

            }
            catch (Exception e){
                System.out.println("Invalid coordinates. Choose different coordinates.");
            }

        }
        while (rows.size() <= 5);

        for (int i = 0; i<5; i++){
            ships[rows.get(i)][cols.get(i)] = "@";
        }

        return ships;
    }

    // Use this method to print game boards to the console.
    private static void printBattleShip(char[][] player) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(player[row][column] + " ");
                }
            }
            System.out.println("");
        }
    }

}