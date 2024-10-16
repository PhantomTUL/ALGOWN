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
public class starmatrix {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte počet * na řádku");
        int line_star_count = sc.nextInt();
        System.out.println("Zadejte počet sloupců");
        int column_star_count = sc.nextInt();
        
        for (int i=column_star_count;i>0;i--){
            for (int j=line_star_count;j>0;j--){
            System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
