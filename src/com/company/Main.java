package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static ArrayList<String> players = new ArrayList<>();
    static int weerwolves = 2;
    static Random random = new Random();
    static int index;

    public static void main(String[] args) {
        assignPlayerPool();
        int[] toRemoveIndex = new int[weerwolves];
        int index = -1;
        for(int i = 0; i < weerwolves; i++){
            assignRole("Weerwolf");
        }
        assignRole("Ziener");
        assignRole("Cupido");
        assignRole("Heks");

        for(String player: players){
            System.out.println(player + ": Burger");
        }
    }

    /***
     * Use this to add players to arraylist.
     */
    public static void assignPlayerPool(){
        players.add("Plauer 1");

    }

    public static void assignRole(String role){
        index = random.nextInt(players.size());
        System.out.println(players.get(index) + ": " + role);
        players.remove(index);
    }
}
