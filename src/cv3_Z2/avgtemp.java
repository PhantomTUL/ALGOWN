/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv3_Z2;

import java.util.Scanner;

/**
 *
 * @author Tandler-D-0f5f
 */
public class avgtemp {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        //IN
        System.out.println("Zadejte teplotu v 6");
        final double TEMP6 = sc.nextDouble();
        System.out.println("Zadejte teplotu v 12");
        final double TEMP12 = sc.nextDouble();
        System.out.println("Zadejte teplotu v 18");
        final double TEMP18 = sc.nextDouble();
        
        //COUNT
        final double AVG = (TEMP6 + TEMP12 + (2 * TEMP18)) / 4;
        
        //OUT
        System.out.println("Průměrná denní teplota je " + AVG);
        
    }
}
