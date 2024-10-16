/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv3_zadani;

import java.util.Scanner;

/**
 *
 * @author Tandler-D-0f5f
 */
public class dividers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = 1;
        do {
            System.out.println("Zadejte číslo:");
            int num = sc.nextInt();
            boolean has_div = isPrime(num);
            if (has_div == true){
                System.out.println("Má dělitele");
            }
            else{
                System.out.println("Nemá dělitele");
            }
            System.out.println("Pokud chcete ukončit program zadejte 0, pokud ne, zadejte libovolné číslo");
            end = sc.nextInt();
        }
        while (end != 0);
    }
    
    /**
     * returns whether the specified number is prime 
     * @param a
     * @return has_div
     */
    public static boolean isPrime(int a){
        boolean has_div = false;
        for (int i = 2;i<(Math.round(Math.sqrt(a)));i++)
            if ((a % i) == 0){
                has_div = true;
                break;
            }
        return has_div;
    }
}