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
public class avgtemp {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        //IN
        System.out.println("Zadejte teplotu v 6");
        double temp6 = sc.nextDouble();
        System.out.println("Zadejte teplotu v 12");
        double temp12 = sc.nextDouble();
        System.out.println("Zadejte teplotu v 18");
        double temp18 = sc.nextDouble();
        
        //COUNT
        double avg = (temp6 + temp12 + (2 * temp18)) / 4;
        
        //OUT
        System.out.println("Průměrná denní teplota je " + avg);
        
    }
}
