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
public class polomer {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        //IN
        System.out.println("Zadejte poloměr:");
        final float R = sc.nextInt();
        //COUNT
        final double S = Math.PI * (Math.pow(R,2)) ;
        final double O = 2 * Math.PI * R;
        //OUT
        System.out.printf("Obsah je: %.2f \nObvod je: %.2f\n",S,O);
    }
}
