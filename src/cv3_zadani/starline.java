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
public class starline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte celé číslo");
        int num = sc.nextInt();
        
        for (int i=num;i>0;i--){
            System.out.print("* ");
        }
    }
}
