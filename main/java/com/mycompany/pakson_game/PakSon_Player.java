/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pakson_game;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author abdulkodir
 */
public class PakSon_Player {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    
    //attributes
    String name;
    int point;
    int guess;
    int guessQuest;
    int random = rand.nextInt(16);
    int number1 = rand.nextInt(16);
    int number2 = rand.nextInt(11);
    int result = number1 * number2;
    
    //methods
    void attack() {
        System.out.println("Use Your Luck, Win The Game");
        System.out.println("===========================");
        System.out.print("Guess the number range from 0 to 15: ");
        guess = input.nextInt();
    }
    
    void intro() {
        System.out.println("");
        System.out.println("==============PLAYER=============");
        System.out.println("Name            : " + name);
        System.out.println("Points        : " + point);
        System.out.println(" ");
    }
    
    boolean rangeInvalid() {
        if (guess < 0 || guess > 15) return true;
        return false;
    }
    
    boolean attackTrue() {
        if (guess == random) return true;
        return false;
    }
    
    void questDefense() {
        System.out.print(number1 + " * " + number2 + " = ");
        guessQuest = input.nextInt();
    }
    
    boolean questDefenseTrue() {
        if (guessQuest == result) {
            return true;
        } return false;
    }
    
    void end() {
        System.out.println("COMPUTER WON!!!");
        System.out.println("BETTER LUCK NEXT TIME ^-^");
        System.exit(0);
    }
}
