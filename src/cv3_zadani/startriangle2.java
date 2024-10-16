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
public class startriangle2 {
            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte výšku trojúhelníku");
        int line_star_count = sc.nextInt();
        
        for (int i=0;i <= line_star_count;i++){
            for (int j=i;j>0;j--){
                for (int k=line_star_count;k<0;k--){
                    System.out.print(" ");
                }
            System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
