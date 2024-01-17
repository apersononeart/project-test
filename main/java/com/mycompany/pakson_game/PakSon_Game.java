/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pakson_game;
import java.util.Random;
import java.util.Scanner;

public class PakSon_Game {
    public static void main(String[] args) {
        //Membuat objek
        //NamaClass NamaObj = new NamaClass();  
        PakSon_Player hero = new PakSon_Player();
        PakSon_Player villain = new PakSon_Player();
        
        //NamaObj.NamaAttribute = Value;
        hero.name = "Aqilah";
        hero.point = 10;
        
        villain.name = "Computer";
        villain.point = 0;
        
        while (hero.point >= 0) {
            
            hero.intro();
            villain.intro();
            hero.attack();
            
            if (hero.attackTrue()) {
                System.out.println("");
                System.out.println("YOU WIN!!!!");
                System.out.println("COMPUTER LOST :(");
                System.exit(0);
            }
            else if (hero.rangeInvalid()) {
                System.out.println("Invalid Input");
                continue;
            }
            
            
            if (villain.point > 9) {
                System.out.println("");
                System.out.println("Computer: woops! I'm near to winning");
                System.out.println("Computer: I am a good system, here's math quest, solve it, i'll give you 1 chances");
                hero.questDefense();
                
                if (hero.guessQuest == hero.result) {
                    hero.point += 1;
                    
                    hero.intro();
                    villain.intro();
                    hero.attack();
                    hero.end();
                }
                else if (hero.guessQuest != hero.result) {
                    hero.end();
                } 
            }
            
            villain.point += 1;
            hero.point -= 1;
        }
    }
}
