/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv4;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Tandler-D-0f5f
 */
public class U38_GuessTheNumber {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static int min = 1;
    public static int max = 100;
    public static void main(String[] args) {
        boolean end = false;
        int answer;
        do {
            displayMenu();
            answer = sc.nextInt();
            switch(answer){
                case 1 -> changeRange();
                case 2 -> pcPlays();
                case 3 -> userPlays();
                case 0 -> {
                    end = true; System.out.println("Konec");
                }
                default -> System.out.println("Spatna volba");
            }
            
        }
        while(!end);
    }
    public static void displayMenu(){
        System.out.println("Vyber možnost");
        System.out.println("1. Změň rozsah");
        System.out.println("2. Počítač hádá");
        System.out.println("3. Uživatel hádá");
        System.out.println("0. Konec");
    }
    public static void changeRange(){
        int new_min = sc.nextInt();
        min = new_min;
        int new_max = sc.nextInt();
        max = new_max;
    }
    public static void pcPlays(){
        int hidden_num = sc.nextInt();
        int loc_min = min;
        int loc_max = max;
        
        int avg = (loc_min + loc_max) / 2;
        
        if(hidden_num > avg){
            loc_min = avg;
        }
        else if(hidden_num < avg){
            loc_max = avg;
        }
        else if(hidden_num == avg){
            
        }
        
    }
    
    public static void userPlays(){
        int secret_number = rand.nextInt(min, min);
    }
}
